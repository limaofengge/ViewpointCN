package viewpointcn;

import me.zed_0xff.zombie_buddy.Patch;

/**
 * Viewpoint 整体汉化补丁(最终版)。
 *
 * 关键教训(console/反编译逐次定位):
 * - 设置项在游戏加载过程中陆续注册(尸体/世界/内存池等进档后才注册),
 *   所以翻译必须【每帧增量】做,不能只做一次。
 * - 着色器包选择器的 "Vivid, by Viewpoint"、描述是渲染时直接读
 *   ShaderPack.name/description/author 字段,不走 Setting,需单独翻译字段。
 * - imgui 的 text/textUnformatted/button 是 native,ZB 拦不了。
 * - 状态用 System property(补丁内联后不能访问本类私有字段)。
 */
public final class Patches {

    @Patch(className = "viewpoint.platform.ImGuiFrame", methodName = "create", warmUp = true)
    public static class MarkPending {
        @Patch.OnEnter
        public static void enter() {
            System.setProperty("viewpointcn.cjkPending", "true");
        }
    }

    @Patch(className = "imgui.ImGui", methodName = "setCurrentContext", warmUp = true)
    public static class InjectCjkFont {
        @Patch.OnExit
        public static void exit(@Patch.Argument(0) imgui.internal.ImGuiContext ctx) {
            try {
                if (ctx == null) return;
                if (!"true".equals(System.getProperty("viewpointcn.cjkPending"))) return;
                System.clearProperty("viewpointcn.cjkPending");
                if ("true".equals(System.getProperty("viewpointcn.fontDone"))) return;
                injectFont(true);
                System.setProperty("viewpointcn.fontDone", "true");
            } catch (Throwable t) {
                System.out.println("[viewpointcn] CJK 字体注入异常: " + t);
            }
        }
    }

    /**
     * 0.1.6 关键:Theme.fonts() 会 imFontAtlas.clear() 清空图集再加载
     * Roboto,且用 fonts[] 数组按字号 push 字体(12.5/15/18/26/40 五档)。
     * 只加一个 16px CJK 并 setFontDefault 不够——push 到其他字号时
     * 用的还是 Roboto(无中文) → ??。
     * 修法:对每个字号注入对应大小的 CJK 字体并替换 fonts[i]。
     * 2026-10-11 用户反馈字体太细:改用黑体(随包 simhei.ttf → 系统
     * simhei.ttf),字号 17px(20px 用户嫌大,17px 比原版 16px 略大且黑体更粗)。
     * 容量红线:全 CJK 约 2.1 万字形,图集 4096²=16.7M 纹素。
     * oversample 必须 1x1,17px@1x ≈ 7M ✓。
     */
    @Patch(className = "viewpoint.platform.Theme", methodName = "fonts", warmUp = true)
    public static class ThemeFonts {
        @Patch.OnExit
        public static void exit() {
            try {
                if (imgui.ImGui.getCurrentContext() == null) return;
                imgui.ImGuiIO io = imgui.ImGui.getIO();
                if (io == null) return;
                imgui.ImFontAtlas atlas = io.getFonts();
                if (atlas == null) return;
                String fontPath = null;
                try {
                    java.net.URL self = viewpointcn.Patches.class.getProtectionDomain().getCodeSource().getLocation();
                    java.io.File jarFile = new java.io.File(self.toURI());
                    java.io.File bundled = new java.io.File(jarFile.getParentFile(), "simhei.ttf");
                    if (bundled.exists()) fontPath = bundled.getAbsolutePath();
                } catch (Throwable ignored) {}
                if (fontPath == null) {
                    java.io.File sys = new java.io.File("C:/Windows/Fonts/simhei.ttf");
                    if (sys.exists()) fontPath = sys.getAbsolutePath();
                }
                if (fontPath == null) {
                    java.io.File sys = new java.io.File("C:/Windows/Fonts/NotoSansSC-VF.ttf");
                    if (sys.exists()) fontPath = sys.getAbsolutePath();
                }
                if (fontPath == null) {
                    System.out.println("[viewpointcn] CJK 字体未找到");
                    return;
                }
                // 关键:全 CJK × 5 字号 = 10 万字形,超出 ImGui 图集上限,
                // 字形被全部丢弃 → 所有中文 ?(2026-10-11 Arthas 实测根因)。
                // 只注入【一个】17px 全 CJK 字体,五档都指向它;
                // Theme.push() 用 setScale 做字号缩放,单字体完全够用。
                imgui.ImFontConfig cfg = new imgui.ImFontConfig();
                cfg.setGlyphRanges(atlas.getGlyphRangesChineseFull());
                cfg.setOversampleH(1);
                cfg.setOversampleV(1);
                imgui.ImFont cjkFont = atlas.addFontFromFileTTF(fontPath, 16.0f, cfg);
                if (cjkFont == null) {
                    System.out.println("[viewpointcn] CJK 字体注入失败");
                    return;
                }
                // 替换 Theme.fonts[] 数组:五档全部指向同一个 CJK 字体
                Class<?> theme = Class.forName("viewpoint.platform.Theme");
                java.lang.reflect.Field fontsF = theme.getDeclaredField("fonts");
                fontsF.setAccessible(true);
                Object arr = fontsF.get(null);
                if (arr instanceof imgui.ImFont[]) {
                    imgui.ImFont[] fonts = (imgui.ImFont[]) arr;
                    for (int i = 0; i < fonts.length; i++) {
                        fonts[i] = cjkFont;
                    }
                }
                io.setFontDefault(cjkFont);
                try {
                    atlas.build();
                    atlas.setTexID(0);
                } catch (Throwable bt) {
                    System.out.println("[viewpointcn] 图集重建失败: " + bt);
                }
                System.out.println("[viewpointcn] CJK 字体注入: 黑体 17px 五档共享完成 (" + fontPath + ")");
            } catch (Throwable t) {
                System.out.println("[viewpointcn] CJK 字体注入异常: " + t);
            }
        }
    }

    /** public:补丁内联进目标类后需跨类访问,private 会 IllegalAccessError。 */
    public static void injectFont(boolean log) {
        try {
            if (imgui.ImGui.getCurrentContext() == null) return;
            imgui.ImGuiIO io = imgui.ImGui.getIO();
            if (io == null) return;
            imgui.ImFontAtlas atlas = io.getFonts();
            if (atlas == null) return;
            String fontPath = null;
            try {
                java.net.URL self = viewpointcn.Patches.class.getProtectionDomain().getCodeSource().getLocation();
                java.io.File jarFile = new java.io.File(self.toURI());
                java.io.File modDir = jarFile.getParentFile();
                java.io.File bundled = new java.io.File(modDir, "simhei.ttf");
                if (bundled.exists()) fontPath = bundled.getAbsolutePath();
            } catch (Throwable ignored) {}
            if (fontPath == null) {
                java.io.File sys = new java.io.File("C:/Windows/Fonts/simhei.ttf");
                if (sys.exists()) fontPath = sys.getAbsolutePath();
            }
            if (fontPath == null) {
                java.io.File sys = new java.io.File("C:/Windows/Fonts/NotoSansSC-VF.ttf");
                if (sys.exists()) fontPath = sys.getAbsolutePath();
            }
            if (fontPath == null) {
                if (log) System.out.println("[viewpointcn] CJK 字体未找到");
                return;
            }
            imgui.ImFontConfig cfg = new imgui.ImFontConfig();
            cfg.setGlyphRanges(atlas.getGlyphRangesChineseFull());
            imgui.ImFont f = atlas.addFontFromFileTTF(fontPath, 16.0f, cfg);
            if (f != null) {
                io.setFontDefault(f);
                try {
                    atlas.build();
                    atlas.setTexID(0);
                } catch (Throwable bt) {
                    if (log) System.out.println("[viewpointcn] 图集重建失败: " + bt);
                }
                if (log) System.out.println("[viewpointcn] CJK 字体注入并设为默认: 成功 (" + fontPath + ")");
            }
        } catch (Throwable t) {
            if (log) System.out.println("[viewpointcn] CJK 字体注入异常: " + t);
        }
    }

    /**
     * 每帧增量翻译:遍历当前全部 Setting,把没翻译过的翻掉。
     * 用 "viewpointcn.done.<key>" 记录已完成的对象,避免重复反射;
     * 新注册的对象下帧自然补上。
     */
    /** 设置窗口每次渲染时尝试注入一次字体;成功后置 flag,失败下帧再试。 */
    public static void tryInject() {
        if ("true".equals(System.getProperty("viewpointcn.fontDone"))) return;
        try {
            if (imgui.ImGui.getCurrentContext() == null) return;
            imgui.ImGuiIO io = imgui.ImGui.getIO();
            if (io == null || io.getFonts() == null) return;
        } catch (Throwable t) {
            return;
        }
        injectFont(true);
        System.setProperty("viewpointcn.fontDone", "true");
    }

    @Patch(className = "viewpoint.platform.SettingsWindow", methodName = "render", warmUp = true)
    public static class TranslateEveryFrame {
        @Patch.OnEnter
        public static void enter() {
            try {
                Class<?> base = Class.forName("viewpoint.platform.LiveSettings$Setting");
                Class<?> ls = Class.forName("viewpoint.platform.LiveSettings");
                java.lang.reflect.Method all = ls.getDeclaredMethod("all");
                all.setAccessible(true);
                Object list = all.invoke(null);
                if (!(list instanceof java.util.List)) return;
                java.lang.reflect.Field labelF = base.getDeclaredField("label");
                java.lang.reflect.Field sectionF = base.getDeclaredField("section");
                java.lang.reflect.Field tooltipF = base.getDeclaredField("tooltip");
                java.lang.reflect.Field keyF = base.getDeclaredField("key");
                labelF.setAccessible(true);
                sectionF.setAccessible(true);
                tooltipF.setAccessible(true);
                keyF.setAccessible(true);
                int n = 0;
                for (Object o : (java.util.List<?>) list) {
                    if (!base.isInstance(o)) continue;
                    Object k = keyF.get(o);
                    String doneKey = "viewpointcn.done." + k;
                    if (Boolean.getBoolean(doneKey)) continue;
                    Object l = labelF.get(o);
                    if (l instanceof String) {
                        String cn = Tr.t((String) l);
                        if (!cn.equals(l)) { labelF.set(o, cn); n++; }
                    }
                    // 关键:section 绝不能翻译!0.1.6 的 PadBinds.look() 靠
                    // section 英文名("Controller/Look" 等)过滤设置,
                    // 翻译成中文后过滤失效 → findLook 抛异常 → 面板崩溃。
                    // 分组显示名由 SettingsWindow.group()/SettingsPages 负责,
                    // 不需要动这里的 section 字段(2026-10-11 实测血泪)。
                    Object tp = tooltipF.get(o);
                    if (tp instanceof String) {
                        String cn = Tr.t((String) tp);
                        if (!cn.equals(tp)) { tooltipF.set(o, cn); n++; }
                    }
                    System.setProperty(doneKey, "true");
                try {
                    String unl = (l instanceof String && ((String) l).equals(Tr.t((String) l))) ? (String) l : null;
                    String unt = (tp instanceof String && ((String) tp).equals(Tr.t((String) tp))) ? (String) tp : null;
                    if (unl != null || unt != null) {
                        java.io.File f = new java.io.File(System.getProperty("user.home") + "/Zomboid/viewpoint-untranslated.txt");
                        try (java.io.PrintWriter w = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(f, true), "UTF-8"))) {
                            w.println("KEY=" + k);
                            if (unl != null) w.println("  LABEL=" + unl);
                            if (unt != null) w.println("  TIP=" + unt);
                        }
                    }
                } catch (Throwable ignored) {}
                }
                if (n > 0) {
                    System.out.println("[viewpointcn] 翻译新设置项 " + n + " 处");
                }
                // 按钮翻译:Show the setup / Teleport / Apply / Rescan 走 SettingsWindow.buttons,
                // 不在 LiveSettings 列表里(此前遗漏,英文原样显示)。只翻 label/tooltip,
                // 绝不碰 place(它是 ImGui 元素 ID 和面板归属键,改了会破坏状态)。
                translateButtons();
                // 着色器包字段翻译:内置包和 Minecraft 包的名字/作者/描述
                translateShaderPacks();
            } catch (Throwable t) {
                System.out.println("[viewpointcn] 翻译异常: " + t);
            }
        }

        /** public:补丁内联进目标类后需跨类访问,private 会 IllegalAccessError。 */
        public static void translateButtons() {
            try {
                Class<?> sw = Class.forName("viewpoint.platform.SettingsWindow");
                java.lang.reflect.Field buttonsF = sw.getDeclaredField("buttons");
                buttonsF.setAccessible(true);
                Object blist = buttonsF.get(null);
                if (!(blist instanceof java.util.List)) return;
                Class<?> btnCls = Class.forName("viewpoint.platform.SettingsWindow$Button");
                java.lang.reflect.Field labelF = btnCls.getDeclaredField("label");
                java.lang.reflect.Field tooltipF = btnCls.getDeclaredField("tooltip");
                labelF.setAccessible(true);
                tooltipF.setAccessible(true);
                int n = 0;
                for (Object b : (java.util.List<?>) blist) {
                    Object l = labelF.get(b);
                    if (l instanceof String) {
                        String cn = Tr.t((String) l);
                        if (!cn.equals(l)) { labelF.set(b, cn); n++; }
                    }
                    Object tp = tooltipF.get(b);
                    if (tp instanceof String) {
                        String cn = Tr.t((String) tp);
                        if (!cn.equals(tp)) { tooltipF.set(b, cn); n++; }
                    }
                }
                if (n > 0) {
                    System.out.println("[viewpointcn] 翻译按钮文本 " + n + " 处");
                }
            } catch (Throwable t) {
                System.out.println("[viewpointcn] 按钮翻译异常: " + t);
            }
        }

        /** public:补丁内联进目标类后需跨类访问,private 会 IllegalAccessError。 */
        public static void translateShaderPacks() {
            try {
                Class<?> sp = Class.forName("viewpoint.platform.ShaderPacks");
                java.lang.reflect.Method all = sp.getDeclaredMethod("all");
                all.setAccessible(true);
                Object list = all.invoke(null);
                if (!(list instanceof java.util.List)) return;
                Class<?> shaderPack = Class.forName("viewpoint.platform.ShaderPack");
                java.lang.reflect.Field nameF = shaderPack.getDeclaredField("name");
                java.lang.reflect.Field authorF = shaderPack.getDeclaredField("author");
                java.lang.reflect.Field descF = shaderPack.getDeclaredField("description");
                nameF.setAccessible(true);
                authorF.setAccessible(true);
                descF.setAccessible(true);
                int n = 0;
                for (Object p : (java.util.List<?>) list) {
                    Object nm = nameF.get(p);
                    if (nm instanceof String) {
                        String cn = Tr.t((String) nm);
                        if (!cn.equals(nm)) { nameF.set(p, cn); n++; }
                    }
                    Object au = authorF.get(p);
                    if (au instanceof String) {
                        String cn = Tr.t((String) au);
                        if (!cn.equals(au)) { authorF.set(p, cn); n++; }
                    }
                    Object de = descF.get(p);
                    if (de instanceof String) {
                        String cn = Tr.t((String) de);
                        if (!cn.equals(de)) { descF.set(p, cn); n++; }
                    }
                }
                if (n > 0) {
                    System.out.println("[viewpointcn] 翻译着色器包字段 " + n + " 处");
                }
            } catch (Throwable t) {
                System.out.println("[viewpointcn] 着色器包翻译异常: " + t);
            }
        }
    }

    /*
     * 血泪教训(2026-10-11 Arthas 实测):绝不能翻译 tab()/group()/leaf()!
     * 它们返回 section 路径段,是 byTab() 分组 map 的键和内部数据键:
     * - tab() 被翻成中文后,byTab() 顶层键变成"操控/按键/手柄",
     *   而 body()/subtabs() 用英文常量 "Controls"/"Keys" 查 map,
     *   永远查空 → 整页显示 "has no settings in this version"。
     * - leaf() 被翻后,subtabs() 里英文组名(如 "Mouse")匹配不上
     *   linkedHashMap 的中文键 → Input/Camera 等子标签全部被丢弃。
     * - group() 还被 OnboardingKeys 当分组 map 的键用。
     * 显示名路径:侧栏走 Page.name()(rendering 标记翻译),
     * 卡片标题/子标签走 Widgets.caption/pages(单独补丁)。
     */
    /*
     * 0.1.6 作者 bug:PadBinds.look() 依赖 PadsLua / PadLook / AimAssist
     * 三个类的静态初始化(它们各自注册自己的 look 设置到 LiveSettings),
     * 但 Lua 调用 padSync 时这三个类可能还没初始化,导致 findLook 抛异常。
     * 修法:look() 入口先强制初始化全部三个类。
     */
    @Patch(className = "viewpoint.platform.PadBinds", methodName = "look", warmUp = true)
    public static class PadBindsLook {
        @Patch.OnEnter
        public static void enter() {
            try {
                Class.forName("viewpoint.PadsLua");
                Class.forName("viewpoint.input.PadLook");
                Class.forName("viewpoint.input.AimAssist");
            } catch (Throwable t) {
                System.out.println("[viewpointcn] PadsLua 初始化异常: " + t);
            }
        }
    }

    /** 按钮状态行翻译(RESCAN 的 "N Minecraft shader packs" 等动态文本)。 */
    @Patch(className = "viewpoint.platform.SettingsWindow$Button", methodName = "status", warmUp = true)
    public static class ButtonStatus {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            if (s == null) return;
            String r = Tr.t(s);
            if (!r.equals(s)) { s = r; return; }
            // 动态拼接:数字 + 固定后缀
            if (s.endsWith(" Minecraft shader packs")) {
                s = s.substring(0, s.length() - " Minecraft shader packs".length()) + " 个 Minecraft 着色器包";
            }
        }
    }

    /*
     * 0.1.6 新设置窗口(General/Shader Options/Apply/Discard 等)的文本
     * 全部经过 viewpoint.platform.Widgets 的这几个 helper。
     * 拦 helper 翻译 String 参数,一处覆盖全部新 UI。
     * 注意 beginCard 第一个参数是卡片 ID(Widgets.heights map 的键,
     * 会被 "none "+string、keyBindings 等复用),绝不能翻译!
     * 只有第二个参数 caption 是显示文本。
     */
    @Patch(className = "viewpoint.platform.Widgets", methodName = "beginCard", warmUp = true)
    public static class WidgetsBeginCard {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 1, readOnly = false) String caption) {
            caption = Tr.t(caption);
        }
    }

    @Patch(className = "viewpoint.platform.Widgets", methodName = "accentButton", warmUp = true)
    public static class WidgetsAccentButton {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    @Patch(className = "viewpoint.platform.Widgets", methodName = "caption", warmUp = true)
    public static class WidgetsCaption {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    /*
     * pages() 的子标签名数组:ZB 对 String[] 参数的写回不生效
     * (2026-10-11 watch 实测数组内容仍是英文),改为 ThreadLocal
     * 缓存数组引用,OnExit 里逐个元素改。elements 是引用,直接改。
     * 注意 pages() 每帧被调用,数组是 PAGES/CONTROLS_SUBTABS 等
     * static final 常量,改元素是幂等的(已翻译的再翻还是原值)。
     * 另外 GraphicsPage.PAGES 数组第一段是 "graphics" 页的子标签,
     * 走同一条路。
     */
    @Patch(className = "viewpoint.platform.Widgets", methodName = "pages", warmUp = true)
    public static class WidgetsPages {
        public static final ThreadLocal<String[]> lastPages = new ThreadLocal<>();
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s,
                                 @Patch.Argument(value = 1, readOnly = false) String[] pages) {
            s = Tr.t(s);
            lastPages.set(pages);
        }
        @Patch.OnExit
        public static void exit() {
            String[] pages = lastPages.get();
            lastPages.set(null);
            if (pages == null) return;
            for (int i = 0; i < pages.length; i++) {
                String cn = Tr.t(pages[i]);
                if (!cn.equals(pages[i])) {
                    pages[i] = cn;
                }
            }
        }
    }

    @Patch(className = "viewpoint.platform.Widgets", methodName = "slider", warmUp = true)
    public static class WidgetsSlider {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    /*
     * 0.1.6 侧栏标签 = Page record 的 name 字段(final,反射改不动)。
     * 方案:拦 name() 访问器的 OnExit 翻译返回值。
     * name() 是渲染用的显示名;equals/hashCode 用原始字段,
     * 所以 equals("Graphics") 这类内部判断不受影响。
     * 但注意:SettingsPages 内部也有 page.name().equals("Graphics")
     * 的调用会拿到翻译后的值——所以只在显示路径翻译。
     * 更稳:拦 entry() 里 addText 前的 name 使用太碎,改为
     * 拦 header()(页标题)和 entry()(侧栏条目)的 OnEnter,
     * 用 ThreadLocal 标记"渲染中",name() OnExit 只在渲染中翻译。
     */
    /*
     * keyBindings() 卡内的分组标题走 ImGui.textUnformatted(leaf(section)),
     * textUnformatted 是 native 拦不了,但 leaf() 本身可拦。
     * 不过 leaf() 在 subtabs()/cards() 里是数据键(subtab 组名匹配靠它),
     * 只能在这一个显示路径翻译:ThreadLocal 标记,与 Page.name() 同理。
     */
    /** public:补丁内联进目标类后需跨类访问,private 会 IllegalAccessError。 */
    public static final ThreadLocal<Boolean> inKeyBindings = new ThreadLocal<>();

    @Patch(className = "viewpoint.platform.SettingsPages", methodName = "keyBindings", warmUp = true)
    public static class SettingsPagesKeyBindings {
        @Patch.OnEnter
        public static void enter() {
            inKeyBindings.set(Boolean.TRUE);
        }
        @Patch.OnExit
        public static void exit() {
            inKeyBindings.set(null);
        }
    }

    @Patch(className = "viewpoint.platform.SettingsWindow", methodName = "leaf", warmUp = true)
    public static class SettingsWindowLeaf {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            if (Boolean.TRUE.equals(inKeyBindings.get())) {
                ret = Tr.t(ret);
            }
        }
    }

    /*
     * 数据层翻译(2026-10-11 用户报告"常规设置里面的选项都没汉化"):
     * 行标签(Resolution scaling/Shadows/...) 是 OnboardingRows.Row/Level
     * record 字段,经 ImGui.selectable/textUnformatted 等 native 方法渲染。
     * native 方法没有 Java 字节码,ZB advice 拦不到(trArg 方案实测零命中
     * 已废弃);但 record 访问器 label()/brief()/description()/levels()
     * 是普通 Java 方法,可以拦。
     * 方案:Row/Level 的 label() 返回值翻译。levels() 返回 List 无法
     * 逐元素改,改拦 Level.label() 覆盖所有级别值(Off/Medium/...)。
     * 注意:label 同时也被 changes() 拿来做比较(rows.changes 里
     * row.label().equals(string)),这里 OnboardingRows 内部新创建的
     * Row 和比较用的 String 都经过同一个 Tr.t,翻译后仍然相等,不影响。
     */
    @Patch(className = "viewpoint.platform.OnboardingRows$Row", methodName = "label", warmUp = true)
    public static class OnboardingRowLabel {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            ret = Tr.t(ret);
        }
    }

    @Patch(className = "viewpoint.platform.OnboardingRows$Row", methodName = "brief", warmUp = true)
    public static class OnboardingRowBrief {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            ret = Tr.t(ret);
        }
    }

    @Patch(className = "viewpoint.platform.OnboardingRows$Row", methodName = "description", warmUp = true)
    public static class OnboardingRowDescription {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            ret = Tr.t(ret);
        }
    }

    @Patch(className = "viewpoint.platform.OnboardingRows$Level", methodName = "label", warmUp = true)
    public static class OnboardingLevelLabel {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            ret = Tr.t(ret);
        }
    }

    /*
     * 档位提示面板(pointed row):textUnformatted 是 native 拦不到,
     * 但参数来自 row.label()/row.brief()——已被上面的访问器翻译。
     * GraphicsRows 的 "Modern only"/"Setting"/"Value"/"Graphics mode"
     * 是内联常量,走 GraphicsRows.name() 参数(String 重绑定生效)。
     */
    @Patch(className = "viewpoint.platform.GraphicsRows", methodName = "name", warmUp = true)
    public static class GraphicsRowsName {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 1, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    @Patch(className = "viewpoint.platform.GraphicsRows", methodName = "mode", warmUp = true)
    public static class GraphicsRowsMode {
        @Patch.OnEnter
        public static void enter() {
            // "Graphics mode" 是内联常量,这里拦 mode() 后通过 name() 的
            // 参数翻译覆盖不了它(直接 textUnformatted),改为反射改常量表。
            // 见 Tr.java:Graphics mode 的翻译由 ImGui 显示层不可达,
            // 但 mode() 里的 radioButton 参数 VANILLA/MODERN 是 static
            // final String,Tr.t 已在词表里,此处无需处理。
        }
    }

    /*
     * 引导页(Onboarding)标题:Group 补丁删除后,OnboardingKeys.group()
     * 传进来的 SettingsWindow.group() 结果是英文。title() 的参数
     * 全部是纯显示文本(已核实所有调用点),直接翻译安全。
     */
    @Patch(className = "viewpoint.platform.OnboardingWindow", methodName = "title", warmUp = true)
    public static class OnboardingWindowTitle {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    /*
     * About 页的 link/line/dim 参数都是纯显示文本。
     * credits() 里的 "developed by "、"Check out our " 等是内联常量,
     * 无法拦截,About 页只翻能翻的部分。
     */
    @Patch(className = "viewpoint.platform.AboutPage", methodName = "link", warmUp = true)
    public static class AboutPageLink {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    @Patch(className = "viewpoint.platform.AboutPage", methodName = "line", warmUp = true)
    public static class AboutPageLine {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    @Patch(className = "viewpoint.platform.AboutPage", methodName = "dim", warmUp = true)
    public static class AboutPageDim {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    /** public:补丁内联进目标类后需跨类访问,private 会 IllegalAccessError。 */
    public static final ThreadLocal<Boolean> rendering = new ThreadLocal<>();

    @Patch(className = "viewpoint.platform.SettingsPages", methodName = "entry", warmUp = true)
    public static class SettingsPagesEntry {
        @Patch.OnEnter
        public static void enter() {
            rendering.set(Boolean.TRUE);
        }
        @Patch.OnExit
        public static void exit() {
            rendering.set(null);
        }
    }

    @Patch(className = "viewpoint.platform.SettingsPages", methodName = "header", warmUp = true)
    public static class SettingsPagesHeader {
        @Patch.OnEnter
        public static void enter() {
            rendering.set(Boolean.TRUE);
        }
        @Patch.OnExit
        public static void exit() {
            rendering.set(null);
        }
    }

    @Patch(className = "viewpoint.platform.SettingsPages$Page", methodName = "name", warmUp = true)
    public static class SettingsPagesPageName {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            if (Boolean.TRUE.equals(rendering.get())) {
                ret = Tr.t(ret);
            }
        }
    }

    /** 0.1.7:页面副标题走 Page.line(),之前只patch了 name。 */
    @Patch(className = "viewpoint.platform.SettingsPages$Page", methodName = "line", warmUp = true)
    public static class SettingsPagesPageLine {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            if (Boolean.TRUE.equals(rendering.get())) {
                ret = Tr.t(ret);
            }
        }
    }

    /**
     * 负载面板的四个分项标题(Processor (CPU) / Memory (RAM) / Graphics card (GPU) / Video memory (VRAM))
     * 是 LoadModel$Part 枚举的构造参数。javap 证实该类只有 Part(String) 构造器,
     * 所以只能拦 <init> 的 Argument(0)(枚举名不受影响)。
     */
    @Patch(className = "viewpoint.platform.LoadModel$Part", methodName = "<init>", warmUp = true)
    public static class LoadModelPartInit {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    /** 子页签(Input / Gunplay / Third person / Impact...)是 Subtab 的构造参数 0。 */
    @Patch(className = "viewpoint.platform.SettingsPages$Subtab", methodName = "<init>", warmUp = true)
    public static class SubtabInit {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 0, readOnly = false) String s) {
            s = Tr.t(s);
        }
    }

    /** Choice.text():选项值最终显示在这个只读字符串上。 */
    @Patch(className = "viewpoint.platform.LiveSettings$Choice", methodName = "text", warmUp = true)
    public static class ChoiceText {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            ret = Tr.t(ret);
        }
    }

    /** pages(title, String[] labels, selected):页签文字在数组里,就地改元素即可。 */
    @Patch(className = "viewpoint.platform.Widgets", methodName = "pages", warmUp = true)
    public static class WidgetsPagesArray {
        @Patch.OnEnter
        public static void enter(@Patch.Argument(value = 1) String[] labels) {
            if (labels == null) return;
            for (int i = 0; i < labels.length; i++) {
                if (labels[i] != null) labels[i] = Tr.t(labels[i]);
            }
        }
    }

    /** Choice.labels() 返回选项值数组(Character / White / Purple...),就地翻译。 */
    @Patch(className = "viewpoint.platform.LiveSettings$Choice", methodName = "labels", warmUp = true)
    public static class ChoiceLabels {
        @Patch.OnExit
        public static void exit(@Patch.Return String[] ret) {
            if (ret == null) return;
            for (int i = 0; i < ret.length; i++) {
                if (ret[i] != null) ret[i] = Tr.t(ret[i]);
            }
        }
    }

    /** 0.1.7:选项值(Vanilla/Modern/Medium...)由 Choice.shownAs() 提供,不走 label。 */
    @Patch(className = "viewpoint.platform.LiveSettings$Choice", methodName = "shownAs", warmUp = true)
    public static class ChoiceShownAs {
        @Patch.OnExit
        public static void exit(@Patch.Return(readOnly = false) String ret) {
            ret = Tr.t(ret);
        }
    }

    }
