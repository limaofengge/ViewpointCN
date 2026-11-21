package viewpointcn;

import java.util.HashMap;
import java.util.Map;

/** 翻译表:Viewpoint 设置窗口(Delete 键)全部可见文本。 */
public final class Tr {
    public static final Map<String, String> MAP = new HashMap<>();

    static {
        // ===== 键位 =====
        MAP.put("First person on or off", "开关第一人称");
        MAP.put("First or third person", "第一/第三人称切换");
        MAP.put("Viewpoint settings window", "Viewpoint 设置窗口");
        MAP.put("Viewpoint screenshot", "Viewpoint 截图");
        MAP.put("Loot menu: take or do", "拾取菜单:拾取/执行");
        MAP.put("Loot menu: take all", "拾取菜单:全部拾取");
        MAP.put("Loot menu: open the loot window", "拾取菜单:打开战利品窗口");
        MAP.put("Free camera on or off", "开关自由相机");
        MAP.put("Physical free camera on or off", "开关物理自由相机");
        MAP.put("Free camera: forward", "自由相机:前进");
        MAP.put("Free camera: back", "自由相机:后退");
        MAP.put("Free camera: left", "自由相机:左移");
        MAP.put("Free camera: right", "自由相机:右移");
        MAP.put("Free camera: up", "自由相机:上升");
        MAP.put("Free camera: down", "自由相机:下降");
        MAP.put("Free camera: four times as fast", "自由相机:四倍速");
        MAP.put("Free camera: back to the player", "自由相机:回到玩家");
        MAP.put("Level-of-detail view", "LOD 层级视图");
        MAP.put("Next debug view", "下一调试视图");
        MAP.put("Next effect off", "逐个关闭特效");
        MAP.put("Rooms' culling", "房间剔除");
        MAP.put("Performance overlay", "性能覆盖层");
        MAP.put("Record the mesher", "录制网格器");
        MAP.put("Check the mesher", "校验网格器");

        // ===== 键位提示 =====
        MAP.put("The first-person view on or off.", "第一人称视角开关。");
        MAP.put("While the view is on: the camera over the shoulder, or back to the eyes.", "视角开启时:切换越肩镜头或回到第一人称。");
        MAP.put("Shows or hides this window.", "显示或隐藏此窗口。");
        MAP.put("Saves the view to Zomboid/viewpoint-shots.", "将画面保存到 Zomboid/viewpoint-shots。");
        MAP.put("Takes the item selected in the loot menu, or does the action selected; the wheel selects. The game's Interact stays the game's.", "拾取菜单中选中的物品,或执行选中的动作;用滚轮切换选项。游戏自带的互动键不受影响。");
        MAP.put("Takes everything the loot menu shows.", "拾取菜单显示的全部物品。");
        MAP.put("Opens the game's own loot window on what the loot menu shows, with the cursor free; again to close it.", "打开游戏自带的战利品窗口并释放光标;再按一次关闭。");
        MAP.put("While the view is on: a camera flying anywhere, the world still round the player.", "视角开启时:自由飞行的相机,世界仍围绕玩家。");
        MAP.put("A free camera the world is centred on: what is drawn, its detail and the sound follow it.", "以世界为中心的自由相机:画面、细节与声音都跟随它。");
        MAP.put("The free camera back at the player's eyes.", "自由相机回到玩家眼前。");
        MAP.put("Every surface tinted by its level of detail (Debug, Views).", "每个表面按其细节层级着色(调试用)。");
        MAP.put("Normal, the art only, the light only, the volumetric light, the bounce light, the lamps' shadows, the sun's maps.", "依次为:正常、仅美术、仅光照、仅体积光、仅反弹光、仅灯影、仅日光贴图。");
        MAP.put("The renderer's effects off one at a time.", "逐个关闭渲染特效。");
        MAP.put("The culling of the rooms no one can see: on, frozen, off.", "不可见房间的剔除:开启、冻结、关闭。");
        MAP.put("The overlay's next mode: full, compact, the graph alone, off.", "覆盖层的下一模式:完整、紧凑、仅图表、关闭。");
        MAP.put("Records the mesher round the player (TESTING.md).", "录制玩家周围的网格数据(TESTING.md)。");
        MAP.put("Checks the meshes round the player against the newest recording (TESTING.md).", "用最新录制数据校验玩家周围的网格(TESTING.md)。");

        // ===== 设置窗口内部分组/选项卡(全量,来自 jar 常量池穷举) =====
        MAP.put("Keys/Views", "键位/视角");
        MAP.put("Keys/Loot menu", "键位/拾取菜单");
        MAP.put("Keys/Free camera", "键位/自由相机");
        MAP.put("Keys/Debug", "键位/调试");
        MAP.put("Game/Loot menu", "游戏/拾取菜单");
        MAP.put("Game/Fixes", "游戏/修复项");
        MAP.put("Graphics/Shader options", "图形/着色器选项");
        MAP.put("Graphics/Shaders", "图形/着色器");
        MAP.put("Graphics/Preset", "图形/预设");
        MAP.put("World/Far world", "世界/远景世界");
        MAP.put("World/Levels of detail", "世界/细节层级");
        MAP.put("World/Texture filtering", "世界/纹理过滤");
        MAP.put("World/Floor preview", "世界/地板预览");
        MAP.put("World/Model packs", "世界/模型包");
        MAP.put("World/Chunks", "世界/区块");
        MAP.put("World/Floors", "世界/地板");
        MAP.put("World/Glass", "世界/玻璃");
        MAP.put("World/Memory", "世界/内存");
        MAP.put("World/Plants", "世界/植物");
        MAP.put("Controls/Mouse", "操控/鼠标");
        MAP.put("Controls/View", "操控/视角");
        MAP.put("Controls/Camera", "操控/相机");
        MAP.put("Controls/Movement", "操控/移动");
        MAP.put("Debug/Seated eye", "调试/坐姿视角");
        MAP.put("Debug/Free camera", "调试/自由相机");
        MAP.put("Debug/Corpses", "调试/尸体");
        MAP.put("Debug/Profiling", "调试/性能剖析");
        MAP.put("Debug/Setup", "调试/设置向导");
        MAP.put("Debug/Views", "调试/视图");

        // ===== 标签页单段名(曾用于 tab() 翻译,现为兜底保留。
        // 注意:tab() 返回值是 byTab() 分组 map 的内部键,已被补丁层禁止翻译;
        // 这些词条仅供 Widgets.caption/pages 显示子标签等显示路径使用) =====
        MAP.put("Game", "游戏");
        MAP.put("Graphics", "图形");
        MAP.put("Controls", "操控");
        MAP.put("World", "世界");
        MAP.put("Debug", "调试");

        // ===== 预设/选项值(下拉框里的词) =====
        MAP.put("Potato", "极低");
        MAP.put("Low", "低");
        MAP.put("Default", "默认");
        MAP.put("High", "高");
        MAP.put("Ultra", "超高");
        MAP.put("Vanilla", "原版");
        MAP.put("Modern", "现代");
        MAP.put("Custom", "自定义");
        MAP.put("Nearest", "最近邻");
        MAP.put("Trilinear", "三线性");
        MAP.put("Anisotropic", "各向异性");
        MAP.put("Lanczos", "Lanczos");
        MAP.put("true", "开");
        MAP.put("false", "关");

        // ===== 视角/操控设置 =====
        MAP.put("Field of view", "视野(FOV)");
        MAP.put("Field of view in third person", "第三人称视野");
        MAP.put("How tall the first-person view is, in degrees from the screen's bottom to its top.", "第一人称视野高度(屏幕底部到顶部的角度)。");
        MAP.put("How tall the third-person view is, in degrees from the screen's bottom to its top.", "第三人称视野高度(屏幕底部到顶部的角度)。");
        MAP.put("Backpedal speed (of the walk's)", "后退速度(相对行走)");
        MAP.put("Body turn smoothing (s)", "身体转向平滑(秒)");
        MAP.put("Direction smoothing (s)", "方向平滑(秒)");
        MAP.put("Head movement", "头部晃动");
        MAP.put("Turn to move", "转向移动");
        MAP.put("Invert vertical look", "反转垂直视角");
        MAP.put("Read the mouse just before drawing", "绘制前读取鼠标");
        MAP.put("Eye up or down", "视角上调或下调");
        MAP.put("Save for this vehicle", "为此车辆保存");

        // ===== 图形/着色器设置 =====
        MAP.put("Preset", "预设");
        MAP.put("Shaders", "着色器");
        MAP.put("Shader options", "着色器选项");
        MAP.put("Shader pack", "着色器包");
        MAP.put("Shader mode", "着色器模式");
        MAP.put("Anti-aliasing (TAA)", "抗锯齿(TAA)");
        MAP.put("Motion blur", "动态模糊");
        MAP.put("Depth of field", "景深");
        MAP.put("Bounce light", "反弹光");
        MAP.put("Volumetric light", "体积光");
        MAP.put("View distance", "视距");
        MAP.put("Floor detail", "地板细节");
        MAP.put("Far world detail", "远景世界细节");
        MAP.put("Modern only", "仅现代画质");
        MAP.put("Nearest, mipmapped", "最近邻,mipmap");
        MAP.put("Walls and objects", "墙壁和物体");
        MAP.put("Wireframe only (untextured)", "仅线框(无纹理)");
        MAP.put("Minecraft shaders", "Minecraft 着色器");
        MAP.put("Changed: Apply to see it", "已修改:点击应用生效");
        MAP.put("3D corpses", "3D 尸体");
        MAP.put("3D models", "3D 模型");

        // ===== 尸体/模型设置 =====
        MAP.put("Corpses as 3D models", "尸体作为 3D 模型");
        MAP.put("Corpses cast shadows", "尸体投射阴影");
        MAP.put("Corpses posed a frame", "每帧摆姿态的尸体数");
        MAP.put("Most 3D corpses", "最多 3D 尸体");
        MAP.put("Fade band (squares)", "淡出带(格)");
        MAP.put("Swap dissolve (seconds)", "溶解切换(秒)");
        MAP.put("Pick's randomness (0: the nearest first)", "选择随机性(0:最近优先)");
        MAP.put("Tint by form: models green, dissolving yellow, cards untinted", "按形态着色:模型绿色、溶解中黄色、卡片不着色");
        MAP.put("Model packs' models within (chunks)", "模型包模型范围(区块)");
        MAP.put("Grass and bushes", "草地和灌木");
        MAP.put("One card facing you", "单卡片面向你");
        MAP.put("Three crossed planes", "三交叉平面");
        MAP.put("Two crossed planes", "双交叉平面");

        // ===== 远景世界/性能设置 =====
        MAP.put("Full shell up to (blocks)", "完整外壳最远(格)");
        MAP.put("Shell blocks built at once", "一次构建的外壳格数");
        MAP.put("Far world up to (blocks)", "远景世界最远(格)");
        MAP.put("Cells read at once", "一次读取的区块");
        MAP.put("Main thread budget (ms)", "主线程预算(毫秒)");
        MAP.put("Worker threads", "工作线程");
        MAP.put("Boxes of 1 square up to (blocks)", "1 格盒子最远(格)");
        MAP.put("Boxes of 2 squares up to (blocks)", "2 格盒子最远(格)");
        MAP.put("Boxes of 4 squares up to (blocks)", "4 格盒子最远(格)");
        MAP.put("Viewpoint far world", "Viewpoint 远景世界");
        MAP.put("Build budget (ms)", "构建预算(毫秒)");
        MAP.put("Build budget at most (ms)", "构建预算上限(毫秒)");
        MAP.put("Mesher worker threads", "网格工作线程");
        MAP.put("Viewpoint mesher", "Viewpoint 网格器");
        MAP.put("Rebuilt at once (chunks around)", "立即重建(周围区块)");
        MAP.put("Floors baked", "已烘焙地板");
        MAP.put("Bake budget (ms)", "烘焙预算(毫秒)");
        MAP.put("Near floors within (chunks)", "近处地板范围(区块)");
        MAP.put("No floor in view yet.", "视野内还没有地板。");
        MAP.put("Colour by level of detail", "按细节层级着色");
        MAP.put("Capture profile", "捕获性能剖析");
        MAP.put("Capture length (s)", "捕获时长(秒)");
        MAP.put("Performance overlay", "性能覆盖层");
        MAP.put("Graph only", "仅图表");
        MAP.put("Overlay statistics over (s)", "统计覆盖时长(秒)");
        MAP.put("Viewpoint screenshot", "Viewpoint 截图");
        MAP.put("Record light", "录制光照");
        MAP.put("Glass opaque from (squares)", "玻璃不透明起始(格)");
        MAP.put("Glass starts turning opaque at (squares)", "玻璃开始变为不透明(格)");
        MAP.put("Viewpoint rooms", "Viewpoint 房间");
        MAP.put("Viewpoint light", "Viewpoint 光照");
        MAP.put("Teleport to the free camera", "传送到自由相机");
        MAP.put("Outline blue", "轮廓蓝色");
        MAP.put("Outline green", "轮廓绿色");
        MAP.put("Outline red", "轮廓红色");
        MAP.put("Outline opacity", "轮廓不透明度");
        MAP.put("Outline width (pixels at 1080p)", "轮廓宽度(1080p 下像素)");

        // ===== 着色器包选项(default 包) =====
        MAP.put("Sun shadows", "太阳阴影");
        MAP.put("Shadow resolution", "阴影分辨率");
        MAP.put("Shadow cascades", "阴影级联");
        MAP.put("Flashlight shadows", "手电筒阴影");
        MAP.put("Lamp shadows (nearest lamps)", "灯光阴影(最近的灯)");
        MAP.put("Lamp shadow resolution", "灯光阴影分辨率");
        MAP.put("Far world shadows", "远景世界阴影");
        MAP.put("Far lamps", "远景灯光");
        MAP.put("God rays", "体积光束");
        MAP.put("Clouds", "云");
        MAP.put("Cloud resolution", "云分辨率");
        MAP.put("Cloud samples", "云采样数");
        MAP.put("Bloom", "泛光");
        MAP.put("Puddles", "水洼");
        MAP.put("Rain density", "雨密度");
        MAP.put("Face shading", "面部阴影");
        MAP.put("Shadows under characters", "角色脚下阴影");

        // ===== 着色器包选项(vivid 包) =====
        MAP.put("Exposure", "曝光");
        MAP.put("Contrast", "对比度");
        MAP.put("Saturation", "饱和度");
        MAP.put("Vibrance", "鲜艳度");
        MAP.put("Shadow samples", "阴影采样数");
        MAP.put("Volumetric quality (steps)", "体积光质量(步数)");
        MAP.put("Cloud style", "云风格");
        MAP.put("Nebula", "星云");
        MAP.put("Aurora", "极光");
        MAP.put("Lens flare", "镜头眩光");
        MAP.put("Lens flare strength", "镜头眩光强度");
        MAP.put("Depth of field strength", "景深强度");
        MAP.put("Depth of field samples", "景深采样数");
        MAP.put("Focus time", "对焦时间");
        MAP.put("Motion blur strength", "动态模糊强度");
        MAP.put("Motion blur samples", "动态模糊采样数");

        // ===== 着色器选项值 =====
        MAP.put("soft", "柔和");
        MAP.put("layered", "层状");

        // ===== 着色器包选择器 =====
        MAP.put("Rescan", "重新扫描");
        MAP.put("Quality", "质量");
        MAP.put("Mode", "模式");

        // ===== 着色器包 tooltip(差集补齐 39 条) =====
        MAP.put("A faint band of coloured cloud across the night sky.", "夜空中一条淡淡的彩色云带。");
        MAP.put("A soft dark patch on the ground under each character and animal.", "每个角色和动物脚下的一块柔和暗斑。");
        MAP.put("Blur along the motion on screen as the view turns and as things move, as a camera's shutter", "视角转动和物体移动时沿屏幕运动方向的模糊,像相机快门一样:");
        MAP.put("Bright lights glow over what is around them.", "亮光在周围物体上泛起光晕。");
        MAP.put("Curtains of green light in the northern night sky.", "北方的夜空中垂下的绿色光幕。");
        MAP.put("Ghosts, a halo and a starburst where the sun and the brightest lights shine into the view, as", "太阳和最亮的光源进入视野时产生的鬼影、光晕和星芒,如同相机镜头:");
        MAP.put("How bright the flare is.", "眩光的亮度。");
        MAP.put("How bright the image is before the tone curve.", "色调曲线之前的画面亮度。");
        MAP.put("How finely the clouds are drawn, as a share of the screen's resolution: sharper clouds for more time.", "云的绘制精细度(按屏幕分辨率的比例):更精细的云需要更多性能。");
        MAP.put("How long the shutter stays open, as a share of a frame: longer streaks.", "快门开启时长(按一帧的比例):时间越长拖影越长。");
        MAP.put("How many of the nearest lamps cast shadows: what stands in a street light's or a lamp's", "多少盏最近的灯投射阴影:站在路灯或灯光下的物体:");
        MAP.put("How many raindrops, snowflakes and splashes are drawn, against the default. How hard it rains is the game's.", "雨滴、雪花和飞溅的绘制数量(相对默认)。雨的大小仍由游戏决定。");
        MAP.put("How much darker the sides and undersides are than the tops (1: Minecraft's, 0: none).", "侧面和底面比顶面暗多少(1:与 Minecraft 相同,0:无差异)。");
        MAP.put("How much the dull colours are strengthened, leaving the strong ones as they are.", "对灰暗色彩的增强程度,鲜艳的颜色保持不变。");
        MAP.put("How steep the tone curve is: deeper shadows and brighter highlights.", "色调曲线的陡峭程度:更高的对比带来更深的阴影和更亮的高光。");
        MAP.put("How strong every colour is (1: as lit).", "所有色彩的强度(1:保持原样)。");
        MAP.put("How wide the lens is open: a stronger blur, and a shallower sharp zone.", "镜头光圈大小:光圈越大模糊越强、清晰区域越浅。");
        MAP.put("Light bounced off what is on screen, and the shade in corners (screen-space indirect light).", "屏幕内物体的反射光,以及角落的阴影(屏幕空间间接光)。");
        MAP.put("Light in the air: haze over distance, lamp halos, the flashlight's beam, dust indoors.", "空气中的光:远方的雾霭、灯光光晕、手电光束、室内的尘埃。");
        MAP.put("Samples along each view ray through the clouds towards the horizon, half as many", "每条视线穿过云层向地平线的采样次数,头顶方向减半:");
        MAP.put("Seconds the focus takes to settle on a new distance (about two thirds of the way).", "焦点稳定到新距离所需的秒数(约为三分之二处)。");
        MAP.put("Soft: volumetric clouds. Layered: a thin layer of blocks. Either shades the ground.", "柔和:体积云。层状:一层薄薄的云块。两者都会给地面投下阴影。");
        MAP.put("Steps along each ray through the air: smoother light for more time.", "每条光线穿过空气的步数:步数越多光线越平滑,但更耗性能。");
        MAP.put("Street lights and outdoor lamps past the loaded chunks shine as small glowing points at night.", "已加载区块之外的路灯和户外灯在夜晚呈现为小的发光点。");
        MAP.put("Sun shadows out to 22 squares with one cascade, 64 with two, the end of the fog with three.", "太阳阴影范围:1 级联 22 格,2 级联 64 格,3 级联覆盖到雾的尽头。");
        MAP.put("Taps along each streak: smoother streaks for more time.", "每条拖影的采样次数:采样越多拖影越平滑,但更耗性能。");
        MAP.put("Taps in each blurred pixel: a smoother blur for more time.", "每个模糊像素的采样次数:采样越多模糊越平滑,但更耗性能。");
        MAP.put("Taps per point in the sun's shadow filter: softer, smoother shadow edges for more time.", "太阳阴影滤波器中每个点的采样次数:采样越多阴影边缘越柔和,但更耗性能。");
        MAP.put("Temporal anti-aliasing: smooth edges, and the dissolves' dither averaged out.", "时间抗锯齿:平滑边缘,并将溶解过渡的抖动平均化。");
        MAP.put("Texels a side of each face of a lamp's shadow cube: sharper lamp shadows for more", "灯光阴影立方体每个面的分辨率:更高的分辨率带来更清晰的灯光阴影:");
        MAP.put("Texels a side of each sun cascade: sharper shadows for more video memory and time.", "每级太阳阴影级联的分辨率:更清晰的阴影需要更多显存和时间。");
        MAP.put("The sun's and the moon's shadows from the near world.", "近处世界中太阳和月亮的阴影。");
        MAP.put("The sun's shadows past the loaded chunks, out to the fog: the far world's buildings and trees,", "太阳阴影延伸出已加载区块、直到雾的尽头:远景世界的建筑和树木:");
        MAP.put("The sun's shafts through the volumetric light, cut by what stands in them.", "太阳光穿过体积光形成的光柱,会被其中的物体遮挡。");
        MAP.put("Volumetric clouds in the sky.", "天空中的体积云。");
        MAP.put("Wet ground and puddles in the rain.", "雨中的湿地和水洼。");
        MAP.put("What lies past the surface under the crosshair blurs, more the nearer that surface is, as a", "准星所指向表面之后的东西会变模糊,该表面越近模糊越强,如同镜头对焦:");
        MAP.put("What the flashlight's beam falls on casts a shadow (a shadow map of its own).", "手电筒光束照射到的物体会投射阴影(使用独立阴影贴图)。");

        // ===== 分组叶子名(group() 返回值,窗口分组标题用) =====
        MAP.put("Chunks", "区块");
        MAP.put("Floors", "地板");
        MAP.put("Memory", "内存");
        MAP.put("Glass", "玻璃");
        MAP.put("Plants", "植物");
        MAP.put("Mouse", "鼠标");
        MAP.put("Camera", "相机");
        MAP.put("Movement", "移动");
        MAP.put("View", "视角");
        MAP.put("Corpses", "尸体");
        MAP.put("Profiling", "性能剖析");
        MAP.put("Setup", "设置向导");
        MAP.put("Fixes", "修复项");
        MAP.put("Shaders", "着色器");
        MAP.put("Free camera", "自由相机");
        MAP.put("Views", "视图");
        MAP.put("Loot menu", "拾取菜单");
        MAP.put("Seated eye", "坐姿视角");
        MAP.put("Far world", "远景世界");
        MAP.put("Levels of detail", "细节层级");
        MAP.put("Texture filtering", "纹理过滤");
        MAP.put("Floor preview", "地板预览");
        MAP.put("Model packs", "模型包");

        // ===== 值/状态词 =====
        MAP.put("None", "无");
        MAP.put("Medium", "中");
        MAP.put("Normal", "普通");
        MAP.put("Strafe", "侧移");
        MAP.put("Apply", "应用");
        MAP.put("Graph", "图表");
        MAP.put("Linking", "链接中");
        MAP.put("Link", "链接");
        MAP.put("Sensitivity", "灵敏度");

        // ===== 着色器包描述(选择器里显示的) =====
        MAP.put("The full look, warmer and bolder: sunlight in the sun's colour over shade cooled by the sky, lights that", "完整画质,更温暖更鲜明:阳光洒在天空冷却的阴影上,灯光柔和交融:");
        MAP.put("The full look: sun shadows through up to three cascades, per-pixel lamps with shadows from the", "完整画质:太阳阴影最多三级级联,逐像素灯光带阴影:");
        MAP.put("combine softly, faces shaded by their direction, a sky that burns orange where the sun sets and glares about the", "面部按朝向着色,日落处天空燃起橙色并围绕日月产生眩光:");
        MAP.put("sun and moon, a thicker fog in the sky's own colour, clouds that shade the ground, light shafts at their strongest at", "更浓的天色雾霭,云影投在地面,日落时光束最强:");

        // ===== 最后一批长 tooltip =====
        MAP.put("A Java Flight Recorder recording of every thread and our frames (its length above), saved to Zomboid/viewpoint-captures. Start moving first.", "对所有线程和每帧画面的 JFR 性能记录(时长见上),保存到 Zomboid/viewpoint-captures。请先动起来。");
        MAP.put("At most this many corpses are 3D models, and no more than the posed corpses' pool holds (Cap: posed corpses, below; about 1.2 MiB a corpse). With fewer, the models thin out along the whole cone rather than stopping short of its distance.", "最多有多少尸体作为 3D 模型,且不超过尸体姿态池上限(见下方\"姿态池上限\",每具约 1.2 MiB)。数量更少时,模型会沿整个视锥均匀稀疏,而不是在远处截断。");
        MAP.put("Blurs the picture as you turn and as things move.", "视角转动和物体移动时画面产生模糊。");
        MAP.put("Blurs what lies well behind the surface you look at, as a camera's lens does.", "注视表面后方远处的物体变模糊,如同相机镜头。");
        MAP.put("Bright lights glow over what is round them.", "亮光在周围物体上泛起光晕。");
        MAP.put("Every corpse within reach in 3D (no count limit)", "范围内每具尸体都是 3D(无数量限制)");
        MAP.put("For a strong PC: every corpse in the cone, within the distance above, is a 3D model, however many lie there, in place of Most 3D corpses. The posed corpses' pool still bounds them, about 1.2 MiB a corpse: raise its cap (below) for a big pile.", "强配置电脑:视锥内、距离内的每具尸体都是 3D 模型,不限数量,取代\"最多 3D 尸体\"。仍受尸体姿态池约束(每具约 1.2 MiB):调高下方上限可容纳大堆尸体。");
        MAP.put("How far ahead a corpse may be a 3D model: the length of the cone that starts at the player and runs ahead, as wide as the screen. The chance of a corpse being a model falls along it from the player's feet, and over its last squares (Fade band) the models dissolve to the flat pictures. At most 40: the ring of chunks the models are drawn in.", "尸体成为 3D 模型的最远距离:从玩家开始向前延伸、与屏幕同宽的视锥长度。成为模型的概率从玩家脚下向外递减,在最后几格(淡出带)模型溶解为平面贴图。最远 40:模型绘制所在的区块环。");
        MAP.put("On, a corpse is considered for a 3D model only while it lies in the cone that starts at the player and runs ahead as wide as the screen (with a small margin), and is on screen: any other keeps its picture with nothing done for it each frame, and one posed lately takes its pose back as it comes into the cone. Off, to compare: every corpse within the distance, all round the player.", "开启时,尸体只有位于玩家前方屏幕宽的视锥内(含少量余量)且在屏幕上时,才作为 3D 模型考虑:其余保持贴图、每帧零开销,进入视锥时恢复姿态。关闭时对比:距离内、玩家四周的每具尸体都参与。");
        MAP.put("The most the posed corpses hold, about 1.2 MiB a corpse: it bounds how many corpses are 3D models. Raised or lowered, it takes effect at once.", "尸体姿态池容量(每具约 1.2 MiB):它限制 3D 尸体数量。调高调低立即生效。");
        MAP.put("3D corpses only in the cone ahead", "3D 尸体仅在正前方视锥内");
        MAP.put("3D corpses' distance (squares ahead, at most 40)", "3D 尸体距离(前方格数,最多 40)");
        MAP.put("Characters animated every frame, the nearest", "每帧都播放动画的角色(最近的)");
        MAP.put("Zombies drawn in each new pose without a fresh snapshot", "僵尸每次新姿势直接绘制,不重取快照");
        MAP.put("Zombies without a target updated less often from 12 squares", "12 格外无目标的僵尸更新频率降低");
        MAP.put("Characters seen lately found at once (line of sight)", "最近看见的角色即时定位(视线)");
        MAP.put("Animals' animations loaded with the game", "随游戏加载动物的动画");
        MAP.put("Frees about 16 MB of video memory, and as much of the system's commit, a chunk the isometric view has drawn; that view draws them again when it comes back.", "释放约 16 MB 显存及等量的系统提交内存(等距视角已绘制的区块);回到等距视角时会重新绘制。");
        MAP.put("Isometric chunk textures let go in first person", "第一人称下释放等距区块贴图");
        MAP.put("The game's light check 10 times a second", "游戏光照检测每秒 10 次");
        MAP.put("Light switches' power asked 4 times a second", "灯光开关供电每秒查询 4 次");
        MAP.put("Measuring only: in first person, the game's whole light check at most every 0.1 s. Switches flipped and shots' flashes reach the lamps (and the zombies' sight) up to that late.", "仅测量:第一人称下整个光照检测最多每 0.1 秒一次。开关切换和枪口闪光到达灯光(和僵尸视线)最多延迟这么久。");
        MAP.put("In first person, the game's light check asks each lamp's switch whether power reaches it every frame; with the grid off that searches round every lamp. Kept for a quarter of a second, power turning on or off reaches the lamps that much later.", "第一人称下,游戏光照检测每帧查询每盏灯的开关是否有电;电网关闭时这会绕每盏灯搜索。保留四分之一秒,电源开关状态到达灯光会延迟这么久。");
        MAP.put("You stand where the free camera is, on the first floor at or below it; with none loaded there, on the ground.", "你站在自由相机所在处,位于其所在层或之下的第一层;若那里没有加载任何楼层,则站在地面。");
        MAP.put("How fast the body walks facing the view off forward (backwards with Turn to move, any way but forwards with Strafe), as a share of walking forwards: its steps play faster to keep pace. Never slower than the game's own strafe; aiming keeps the game's.", "身体面朝视角偏离正前方时的行走速度(转向移动时为后退,侧移时为除向前外的任何方向),以向前行走的比例表示:脚步会加快以跟上节奏。不会慢于游戏自身的侧移;瞄准时保持游戏原值。");
        MAP.put("How long the body takes to turn to where it should face: 0 turns it at once. Aiming always turns it at once.", "身体转向应朝方向所需时间:0 表示立即转向。瞄准时总是立即转向。");
        MAP.put("How long the walking direction takes to follow the keys, sweeping between them as a controller's stick does: 0 jumps at once. Turning back the other way is always at once.", "行走方向跟随按键所需时间,像手柄摇杆一样在方向间平滑过渡:0 表示立即切换。转身反向总是立即。");
        MAP.put("How much the view moves with the head as you stand, walk and turn: 0 keeps it steady (the height still follows a crouch), 1 follows the head's every step and sway.", "站立、行走和转身时画面跟随头部晃动的程度:0 保持稳定(高度仍随下蹲变化),1 跟随头部的每一步和摇摆。");
        MAP.put("How far the view turns for a move of the mouse: 1 is the mod's own speed.", "鼠标移动对应的视角转动幅度:1 是本 mod 自带的速度。");
        MAP.put("Moving the mouse forward looks down, and back looks up.", "鼠标向前移动时向下看,向后移动时向上看。");
        MAP.put("Seated in first person, how far the view is moved up (or down) from your head. Sitting in a vehicle sets it to the height saved for that kind of vehicle, or to 0.", "第一人称坐姿下,视角从头部上移(或下移)的距离。坐进车辆时设为该车型保存的高度,否则为 0。");
        MAP.put("Viewpoint's seated eye: scene units up from the head, by vehicle script (Debug, Seated eye)", "Viewpoint 坐姿视角:按车辆脚本从头部上移的场景单位(调试,坐姿视角)");
        MAP.put("Keeps the height above for the kind of vehicle you sit in: you sit at it whenever you get into one again.", "为你所坐的车型保存上方高度:下次坐进同型车时自动应用。");
        MAP.put("Middle mouse button: toggle between controlling the cursor/camera", "鼠标中键:在控制光标/相机之间切换");
        MAP.put("Modern draws the Vivid look: sun, lamp and flashlight shadows, clouds, light in the air, bloom and the effects below. Vanilla is a plain look close to the game's own, light on any graphics card.", "现代画质呈现 Vivid 效果:太阳、灯光和手电阴影,云,空气中的光,泛光及下方各项特效。原版画质接近游戏原生风格,任何显卡都能轻松运行。");
        MAP.put("Sun, moon, lamp and flashlight shadows: how sharp, how far, and how many lamps cast them.", "太阳、月亮、灯光和手电的阴影:清晰度、距离以及投射阴影的灯数。");
        MAP.put("The dead bodies within 40 squares as the game's own 3D models rather than flat pictures, as many as the level allows, with about a megabyte of memory for each. Ultra sets no count, and makes models of the bodies all round you, not only of those ahead.", "40 格内的尸体用游戏原生 3D 模型呈现而非平面贴图,数量随画质档位而定,每具约占 1 MB 内存。超高档不限数量,且四周的尸体都建模,不只是前方的。");
        MAP.put("How far past the loaded area the world is drawn, as simpler buildings, boxes and trees out to the fog. The costliest setting for the processor and memory.", "已加载区域之外世界绘制的距离:简化的建筑、盒子和树一直延伸到雾中。这是对 CPU 和内存最贵的设置。");
        MAP.put("How many of the distant trees are drawn, and how far out they reach before they fade.", "远处树木的绘制数量,以及它们延伸到多远才淡出。");
        MAP.put("How much of the distant world is drawn as real buildings rather than boxes, and how fine its ground is. More detail fills more video memory.", "远处世界有多少按真实建筑绘制而非盒子,以及地面精细度。细节越多占用显存越多。");
        MAP.put("How sharp the baked floors and ground are, and how far round you the sharp ones reach.", "烘焙地板和地面的清晰度,以及清晰的区域延伸到多远。");
        MAP.put("Smooths jagged edges and shimmer by blending each frame with the last.", "通过相邻帧混合平滑锯齿边缘和闪烁。");
        MAP.put("Glare, a halo and ghosts where the sun or a bright light shines into the view.", "太阳或强光进入视野时产生眩光、光晕和鬼影。");
        MAP.put("The built-in packs, and those in Zomboid/viewpoint-shaderpacks: Viewpoint's (a folder with a pack.properties) and shader packs made for Minecraft (minecraft-).", "内置着色器包,以及 Zomboid/viewpoint-shaderpacks 里的:Viewpoint 自制的(带 pack.properties 的文件夹)和为 Minecraft 制作的着色器包(minecraft-)。");
        MAP.put("It cannot be drawn; Viewpoint's default pack draws meanwhile:", "无法绘制该着色器包;期间由 Viewpoint 默认包绘制:");
        MAP.put("Finds the packs dropped into Zomboid/viewpoint-shaderpacks since the game started.", "查找游戏启动后放入 Zomboid/viewpoint-shaderpacks 的着色器包。");
        MAP.put("Sets the mode and the settings that trade the world's detail for speed together; changing any of them makes it Custom. The shader pack's options have their own presets.", "同时设置画质模式和各项以细节换性能的选项;修改任意一项会变为自定义。着色器包的选项有它们自己的预设。");
        MAP.put("The most this pool holds; lowered, it takes full effect after a restart.", "该内存池的容量上限;调低后重启游戏完全生效。");
        MAP.put("The pack's own presets of its options; changing any of them makes it Custom.", "着色器包自带的选项预设;修改任意一项会变为自定义。");
        MAP.put("The frame times, how busy each thread and the GPU are, and the renderer's share of each frame, top right: in full, one line, the graph alone, or off.", "右上角显示帧时间、各线程和 GPU 的忙碌程度以及渲染器的每帧占比:完整、单行、仅图表或关闭。");
        MAP.put("The engine's light around you, with everything it was given, saved to Zomboid/viewpoint-recordings to fit the light model. Look around first: the engine lights only what you see.", "引擎在你周围的光照(含全部输入参数)保存到 Zomboid/viewpoint-recordings 以拟合光照模型。先环顾四周:引擎只照亮你看到的部分。");
        MAP.put("Compare the far trees with the chunks' (console, once)", "与区块数据对比远景树木(控制台,一次)");
        MAP.put("How many chunks round you draw the model packs' authored models; further out, the sprites' art. 0 draws none.", "你周围多少区块内绘制模型包作者的模型;更远处用原版贴图。0 表示不绘制。");
        MAP.put("Trees kept past the full shell (share)", "完整外壳之外保留的树木(比例)");
        MAP.put("Furniture in buildings across the grid's edge", "网格边缘建筑内的家具");
        MAP.put("Light shell up to (blocks)", "轻量外壳最远(格)");
        MAP.put("Light shell ground, texels per tile (0: none)", "轻量外壳地面,每格纹素数(0:无)");
        MAP.put("Full shell ground, texels per tile", "完整外壳地面,每格纹素数");
        MAP.put("Shell ground baked", "外壳地面已烘焙");
        MAP.put("Switch \"Shell ground baked\" and compare: the G-buffer holds the shell's band, the shadow maps the far shadow map; the ground bake runs in the floors pass.", "切换\"外壳地面已烘焙\"对比:G 缓冲保存外壳带,阴影贴图保存远景阴影图;地面烘焙在地板通道中运行。");
        MAP.put("Ground bake budget (ms)", "地面烘焙预算(毫秒)");
        MAP.put("Ground pages baked a frame", "每帧烘焙的地面页");
        MAP.put("Far cells uploaded a frame (MB)", "每帧上传的远景区块(MB)");
        MAP.put("Shell uploaded a frame (MB)", "每帧上传的外壳(MB)");
        MAP.put("Far trees fade out from (blocks)", "远景树木淡出起始(格)");
        MAP.put("Far trees gone at (blocks)", "远景树木消失于(格)");
        MAP.put("Distant pages baked a frame", "每帧烘焙的远处页面");
        MAP.put("Near pages baked a frame", "每帧烘焙的近处页面");
        MAP.put("Near texels per tile", "近处每格纹素数");
        MAP.put("No floor baked in view yet.", "视野内还没有烘焙的地板。");
        MAP.put("Floors baked", "已烘焙地板");
        MAP.put("More per level waiting (ms)", "每层更多等待(毫秒)");
        MAP.put("Level builds", "层级构建");
        MAP.put("Levels cooking at once, at most", "同时烘焙的最大层级数");
        MAP.put("Glass opaque far away, hiding the rooms behind it", "远处玻璃不透明,隐藏其后房间");
        MAP.put("Glass opaque from storeys above or below", "玻璃从上层或下层看时不透明");
        MAP.put("Light bounced off what is on screen, and shade in corners. Costly.", "屏幕内物体的反射光与角落阴影。性能开销大。");
        MAP.put("Light in the air: haze, lamp halos, the flashlight's beam and the sun's shafts.", "空气中的光:雾霭、灯光光晕、手电光束和太阳光柱。");
        MAP.put("Links the shader pack again with the options as they are now: it takes seconds.", "用当前选项重新链接着色器包:需要几秒。");
        MAP.put("Chunk cache (ms)", "区块缓存(毫秒)");
        MAP.put("Far world (ms)", "远景世界(毫秒)");
        MAP.put("Frame (ms)", "帧(毫秒)");
        MAP.put("Snapshot (ms)", "快照(毫秒)");
        MAP.put("Ours (ms)", "本 mod(毫秒)");
        MAP.put("Draw calls", "绘制调用");
        MAP.put("Floor bakes", "地板烘焙");
        MAP.put("Sky and light", "天空与光照");
        MAP.put("Post and TAA", "后期与 TAA");

        // ===== 着色器包名称/作者/完整描述(字段翻译用,含续行拼接后的完整版) =====
        MAP.put("Vivid", "鲜艳");
        MAP.put("Normal", "普通");
        MAP.put("Viewpoint", "Viewpoint");
        MAP.put("Rescan", "重新扫描");
        MAP.put("Linking: a few seconds.", "链接中:需要几秒。");
        MAP.put("Left out:", "未加载:");
        MAP.put("finished", "已完成");
        MAP.put("Default", "默认");
        MAP.put("saved", "已保存");
        MAP.put("Profile", "配置档");
        MAP.put("Head movement", "头部晃动");
        MAP.put("The full look: sun shadows through up to three cascades, per-pixel lamps with shadows from the nearest, a shadowed flashlight, bounce light, volumetric light with god rays, clouds, rain and puddles, glowing far lamps, bloom and TAA.",
                "完整画质:太阳阴影最多三级级联,最近灯光逐像素阴影,带阴影的手电筒,反弹光,带体积光束的体积光,云,雨和水洼,发光的远景灯,泛光和 TAA。");
        MAP.put("The plain look, as vanilla Minecraft's: each square's light at its corners, smoothed across every face, with a fixed shade per side; a sky that only changes colour; a soft shadow under each character; glowing far lamps. No shadow maps, clouds, volumetric light, bounce light, bloom or puddles.",
                "朴素画质,与原版 Minecraft 相同:每个方块的光在角上、平滑过渡到每个面,每面固定明暗;天空只变色;每个角色脚下有柔和阴影;远景灯发光。没有阴影贴图、云、体积光、反弹光、泛光或水洼。");
        MAP.put("The full look, warmer and bolder: sunlight in the sun's colour over shade cooled by the sky, lights that combine softly, faces shaded by their direction, a sky that burns orange where the sun sets and glares about the sun and moon, a thicker fog in the sky's own colour, clouds that shade the ground, light shafts at their strongest at sunset, soft-edged shadows, bloom as a soft haze, a filmic tone curve with contrast, saturation and vibrance, a lens flare, depth of field and motion blur.",
                "完整画质,更温暖更鲜明:阳光暖色铺在天空冷却的阴影上,灯光柔和交融,面部按朝向着色,日落处天空燃起橙色并围绕日月产生眩光,更浓的天色雾霭,云影投在地面,日落时光束最强,柔和阴影边缘,泛光如薄雾,胶片感色调曲线带来对比度、饱和度和鲜艳度,镜头眩光、景深和动态模糊。");
        MAP.put("0.00", "0.00");

        // ===== 内存池 Cap 标签 =====
        MAP.put("Cap: near meshes (MiB)", "容量:近处网格(MiB)");
        MAP.put("Cap: light grids (MiB)", "容量:光照网格(MiB)");
        MAP.put("Cap: shell (MiB)", "容量:外壳(MiB)");
        MAP.put("Cap: far cells (MiB)", "容量:远景区块(MiB)");
        MAP.put("Cap: model meshes (MiB)", "容量:模型网格(MiB)");
        MAP.put("Cap: cpu caches (MiB)", "容量:CPU 缓存(MiB)");
        MAP.put("Cap: floor pages (MiB)", "容量:地板页面(MiB)");
        MAP.put("Cap: model packs (MiB)", "容量:模型包(MiB)");
        MAP.put("Cap: Minecraft shaders (MiB)", "容量:Minecraft 着色器(MiB)");
        MAP.put("Cap: posed corpses (MiB)", "容量:尸体姿态(MiB)");

        // ===== 差集比对补齐:新 jar(2026-10-10 更新)完整 tooltip,含字面 \n 续行 =====
        // 注意:pack.properties 的 \n 续行在运行时可能是真实换行也可能是字面反斜杠n,
        // 两种形态都入表,保证命中。
        MAP.put("How finely the clouds are drawn, as a share of the screen's resolution: sharper \n  clouds for more time.",
                "云的绘制精细度(按屏幕分辨率的比例):\n  更精细的云需要更多性能。");
        MAP.put("How finely the clouds are drawn, as a share of the screen's resolution: sharper \\n  clouds for more time.",
                "云的绘制精细度(按屏幕分辨率的比例):\n  更精细的云需要更多性能。");
        MAP.put("How many raindrops, snowflakes and splashes are drawn, against the default. How hard it \n  rains is the game's.",
                "雨滴、雪花和飞溅的绘制数量(相对默认)。雨的大小仍由游戏决定。");
        MAP.put("How many raindrops, snowflakes and splashes are drawn, against the default. How hard it \\n  rains is the game's.",
                "雨滴、雪花和飞溅的绘制数量(相对默认)。雨的大小仍由游戏决定。");
        MAP.put("Samples along each view ray through the clouds towards the horizon, half as many \n  overhead: smoother, finer clouds for more time.",
                "每条视线穿过云层向地平线的采样次数,头顶方向减半:采样越多云越平滑细腻,但更耗性能。");
        MAP.put("Samples along each view ray through the clouds towards the horizon, half as many \\n  overhead: smoother, finer clouds for more time.",
                "每条视线穿过云层向地平线的采样次数,头顶方向减半:采样越多云越平滑细腻,但更耗性能。");
        MAP.put("Blur along the motion on screen as the view turns and as things move, as a camera's shutter would: moving things streak over what is still behind them.",
                "视角转动和物体移动时沿屏幕运动方向产生模糊,如相机快门:移动的物体在静止背景上拖出残影。");
        MAP.put("Ghosts, a halo and a starburst where the sun and the brightest lights shine into the view, as a camera's lens makes them.",
                "太阳和最亮光源进入视野时产生鬼影、光晕和星芒,如同相机镜头所现。");
        MAP.put("How many of the nearest lamps cast shadows: what stands in a street light's or a lamp's light (people, cars, furniture, fences) darkens what lies behind it. Each is a cube of shadow maps. Lamps standing together (a crossing's) cast as a group, so their shadows do not jump from lamp to lamp as you walk.",
                "多少盏最近的灯投射阴影:站在路灯或灯光下的人、车、家具、围栏会在身后投下暗影。每盏是一组立方体阴影贴图。相邻的灯(如路口)作为一组投射,所以你走过时阴影不会在灯之间跳变。");
        MAP.put("Texels a side of each face of a lamp's shadow cube: sharper lamp shadows for more video memory and time.",
                "灯光阴影立方体每个面的纹素数:更高的分辨率带来更清晰的灯光阴影,但更耗显存和时间。");
        MAP.put("The sun's shadows past the loaded chunks, out to the fog: the far world's buildings and trees, and the near world's, cast onto each other.",
                "太阳阴影延伸出已加载区块、直到雾的尽头:远景世界的建筑和树木与近处世界互相投射阴影。");
        MAP.put("What lies past the surface under the crosshair blurs, more the nearer that surface is, as a lens focuses. Nearer things, your own hands among them, stay sharp.",
                "准星所指向表面之后的东西会变模糊,该表面越近模糊越强,如同镜头对焦。更近的物体(包括你自己的手)保持清晰。");

        // ===== Viewpoint 0.1.6 新增(着色器进阶设置) =====
        MAP.put("Ambient occlusion", "环境光遮蔽");
        MAP.put("Ambient occlusion quality", "环境光遮蔽质量");
        MAP.put("Ambient occlusion radius", "环境光遮蔽半径");
        MAP.put("Ambient occlusion strength", "环境光遮蔽强度");
        MAP.put("Anti-aliasing", "抗锯齿");
        MAP.put("Clouds in reflections", "反射中的云");
        MAP.put("Flashlight and muzzle flash shadows", "手电筒与枪口火光阴影");
        MAP.put("Flashlight global illumination strength", "手电筒全局光照强度");
        MAP.put("Global illumination", "全局光照");
        MAP.put("Global illumination reach (squares)", "全局光照范围(格)");
        MAP.put("Global illumination strength", "全局光照强度");
        MAP.put("Ground materials", "地面材质");
        MAP.put("Headlight shadows (nearest cars)", "车灯阴影(最近的车辆)");
        MAP.put("High clouds", "高层云");
        MAP.put("Moving waves", "动态波浪");
        MAP.put("Night colour shift", "夜间色偏");
        MAP.put("Reflections", "反射");
        MAP.put("Render resolution", "渲染分辨率");
        MAP.put("Soft clouds", "柔和云层");
        MAP.put("Sun shafts", "太阳光柱");
        MAP.put("Tone curve", "色调曲线");
        MAP.put("Wall materials", "墙壁材质");
        MAP.put("Water shading reach", "水面着色范围");

        // ===== Viewpoint 0.1.6 新增 tooltip =====
        MAP.put("Directions and steps taken round each pixel, as XeGTAO's presets a step down: Medium",
                "每个像素周围采样的方向和步数,按 XeGTAO 预设降一档:中。");
        MAP.put("How far the night turns blue and grey as your eyes adapt to the dark, while lamps keep their",
                "夜晚随眼睛适应黑暗而转为蓝灰色的程度,灯光保持原有色彩。");
        MAP.put("How far the water has waves, reflections and depth. Loaded: only the area near you.",
                "水面波浪、反射和深度的程度。已加载:仅限你附近的区域。");
        MAP.put("How the scene's light becomes the screen's. Filmic: vivid's, with contrast. Neutral: Khronos PBR",
                "场景光照如何转为屏幕色彩。Filmic:Vivid 风格,带对比度。Neutral:Khronos PBR 中性。");
        MAP.put("Reflections show the clouds when they reflect the sky above the screen.",
                "反射天空时显示屏幕上方天空中的云。");
        MAP.put("Shows rays of sunlight that go past roofs, trees, poles, people and clouds in front of the sun.",
                "显示穿过太阳前方的屋顶、树木、电线杆、人物和云的太阳光线。");
        MAP.put("Smooths jagged edges. TAA+: each frame blended with the ones before, the steadiest and",
                "平滑锯齿边缘。TAA+:每帧与之前帧混合,最稳定。");
        MAP.put("The clouds above the low ones, as Horizon Forbidden West draws them: cirrus and veils high up,",
                "低云之上的高层云,如《地平线:西之绝境》所绘:高处的卷云和云纱。");
        MAP.put("The ground has the relief and the shine of what it is made of: grass and soil rough and",
                "地面呈现其材质应有的起伏和光泽:草地和泥土粗糙。");
        MAP.put("The light the lit floors round about bounce onto walls, ceilings and things, and the light",
                "周围被照亮的地面将光反射到墙壁、天花板和物体上。");
        MAP.put("The shade in corners, in creases and under things, where less of the light from all round",
                "角落、褶皱和物体下方的阴影,那里来自周围的光较少。");
        MAP.put("The walls have the relief and the shine of what they are made of: brick and stone rough",
                "墙壁呈现其材质应有的起伏和光泽:砖石粗糙。");
        MAP.put("The waves on rivers and lakes change each moment. Off: one pattern of waves moves across the water.",
                "河流和湖泊的波浪实时变化。关闭:水面只有一种移动的波浪图案。");
        MAP.put("Water, puddles and car paint show what is around them. Off: they show only the sky. Medium: from",
                "水面、水洼和车漆反射周围环境。关闭:只反射天空。中:从近处开始。");

        // ===== Viewpoint 0.1.6 新增键位 =====
        MAP.put("Cursor free or locked", "光标释放或锁定");
        MAP.put("Free look (hold)", "自由视角(按住)");
        MAP.put("Third person: camera behind", "第三人称:相机后置");
        MAP.put("Third person: swap shoulders", "第三人称:切换肩位");
        MAP.put("Record a camera trace", "录制相机轨迹");

        // ===== Viewpoint 0.1.6 新增键位 tooltip =====
        MAP.put("Held on foot: the view turns without turning the body, which keeps walking where it went; in first person within an angle (Controls, Camera). Let go, the view turns back.",
                "步行时按住:视角转动而身体不转向,角色继续朝原方向行走;第一人称下限于一定角度(操控/相机)。松开后视角转回。");
        MAP.put("While the view is on: frees the cursor to click on things, or locks it to look around again.",
                "视角开启时:释放光标以点击物品,或锁定光标以继续环顾四周。");
        MAP.put("In third person: the camera over the other shoulder.", "第三人称:相机移到另一侧肩膀上方。");
        MAP.put("In third person: the camera turns back behind the character.", "第三人称:相机转回角色身后。");
        MAP.put("Starts and stops recording the third-person camera's frames, for the offline checks (TESTING.md).",
                "开始或停止录制第三人称相机帧,用于离线检查(TESTING.md)。");

        // ===== Viewpoint 0.1.6 新增分组 =====
        MAP.put("Controller/Aim assist", "手柄/瞄准辅助");
        MAP.put("Controller/Loot menu", "手柄/拾取菜单");
        MAP.put("Controls/Loot menu", "操控/拾取菜单");
        MAP.put("Controls/Third person", "操控/第三人称");
        MAP.put("Debug/Camera profiles", "调试/相机配置");

        // ===== Viewpoint 0.1.6 新增设置项 =====
        MAP.put("Camera motion", "相机晃动");
        MAP.put("Frame generation", "帧生成");
        MAP.put("Texture resolution", "纹理分辨率");
        MAP.put("Vegetation detail", "植被细节");
        MAP.put("Distant detail", "远景细节");
        MAP.put("Hold first person for Texture compression", "纹理压缩下保持第一人称");
        MAP.put("Show the crash window", "显示崩溃窗口");
        MAP.put("Setup's edition finished", "设置引导已完成");

        // ===== Viewpoint 0.1.6 新增/更新 tooltip =====
        MAP.put("How much the camera moves by itself in third person: the sway of a camera held by hand, the bob of the steps and the lean into turns. Lower it if the motion makes you feel unwell.",
                "第三人称下相机自动晃动的程度:手持相机的摇摆、步伐起伏和转弯倾斜。如果晃动让你不适,请调低。");
        MAP.put("Makes one more frame between each two frames the game draws (AMD FSR 3), so the movement on the screen is smoother. Each frame the game draws comes a little later, so the mouse feels a little slower. It is best when the game is at 60 frames a second or more.",
                "在游戏绘制的每两帧之间生成一帧(AMD FSR 3),让画面运动更流畅。每帧稍有延迟,鼠标手感会略慢。游戏 60 帧以上时效果最佳。");
        MAP.put("How detailed the distant buildings and ground are.", "远处建筑和地面的精细程度。");
        MAP.put("How many distant trees are drawn, and how far.", "远处树木的绘制数量和距离。");
        MAP.put("How sharp the floors and the ground are.", "地板和地面的清晰程度。");
        MAP.put("Dead bodies near you as 3D models.", "附近的尸体以 3D 模型呈现。");
        MAP.put("Model pack mods' 3D models near you.", "你附近的模型包 mod 的 3D 模型。");
        MAP.put("The 3D models that model pack mods give the game's objects (furniture, cars, signs and more), drawn near you in place of the flat pictures. Off, every object is its flat picture again.",
                "模型包 mod 为游戏物体(家具、汽车、路牌等)提供的 3D 模型,在你附近替代平面贴图绘制。关闭后所有物体恢复为平面贴图。");
        MAP.put("How fine the game's own art is, which the walls, the objects and the floors are drawn from. Half loads the game's 1x art: a quarter of the texels, far less video memory and system memory, softer up close. The game takes it as it starts: quit and start it again after you change it.",
                "游戏自带美术资源(墙壁、物体、地板贴图来源)的精细度。半档加载游戏 1x 贴图:四分之一纹素,大幅节省显存和系统内存,近看更柔和。修改后需重启游戏生效。");
        MAP.put("How sharp the textures are, near you and at a slant.", "纹理的清晰程度,包括近处和斜视角。");
        MAP.put("How the textures of the floors, the walls and objects and the 3D models are drawn. Sharp keeps each texel crisp near you and smooth far off. Anisotropic keeps the surfaces sharp at a slant. Lanczos is sharper on the graphics card's time. Nearest shows each texel as a hard square. The World page sets each kind apart.",
                "地板、墙壁、物体和 3D 模型纹理的绘制方式。Sharp:近处纹素清晰、远处平滑。Anisotropic:斜视角表面保持锐利。Lanczos:更锐利但更耗显卡。Nearest:每个纹素显示为硬方块。世界页可分别设置各类。");
        MAP.put("The game shows your mouse movements sooner.", "游戏更及时地显示你的鼠标移动。");
        MAP.put("The game shows your mouse movements sooner. The processor does not prepare frames far ahead of the graphics card. When the graphics card is the slowest part, the frame rate can be a little lower.",
                "游戏更及时地显示你的鼠标移动。处理器不再提前准备大量帧。当显卡是瓶颈时,帧率可能略降。");
        MAP.put("These are Viewpoint's own keys; the game's are unchanged. Click a key to change it, then press the new one, with Shift, Ctrl or Alt held if you like; Esc keeps it as it was. A mouse button can be a key too, but not the left or the right one. The settings window and the game's Mod Options have them too.",
                "这些是 Viewpoint 自有的按键;游戏原版按键不变。点击按键即可修改,然后按下新按键(可搭配 Shift、Ctrl 或 Alt);按 Esc 保持原样。鼠标按键也可绑定,但左右键除外。设置窗口和游戏内模组选项里也都有这些设置。");
        MAP.put("The window a player sees when Viewpoint turns itself off after an error, with a test error in its report. First person stays on.",
                "Viewpoint 出错自动关闭时玩家看到的窗口,报告中含一个测试错误。第一人称保持开启。");
        MAP.put("a test from Debug, Setup", "来自调试/设置引导的测试");
        MAP.put("testing the crash window", "测试崩溃窗口");
        MAP.put("Press a key or a button...", "按下一个按键或手柄按钮...");
        MAP.put("Modern draws the Default look: sun, lamp and flashlight shadows, clouds, light in the air, bloom and the effects below. Vanilla is a plain look close to the game's own, light on any graphics card.",
                "现代画质呈现完整效果:太阳、灯光和手电阴影,云,空气中的光,泛光及下方各项特效。原版画质接近游戏原生风格,任何显卡都能轻松运行。");
        MAP.put("Modern: the full look. Vanilla: a plain look for all graphics cards.",
                "现代:完整画质。原版:适合所有显卡的朴素画质。");
        MAP.put("The dead bodies within 40 squares as the game's own 3D models rather than flat pictures, as many as the level allows, with about a megabyte of memory for each. Extreme sets no count, and makes models of the bodies all round you, not only of those ahead.",
                "40 格内的尸体用游戏原生 3D 模型呈现而非平面贴图,数量随画质档位而定,每具约占 1 MB 内存。极限档不限数量,且四周的尸体都建模,不只是前方的。");

        // ===== Viewpoint 0.1.6 新增手柄分组 =====
        MAP.put("Controller/Buttons", "手柄/按键");
        MAP.put("Controller/Look", "手柄/视角");
        MAP.put("Controller/Aim assist", "手柄/瞄准辅助");
        MAP.put("Controller/Switching", "手柄/切换");

        // ===== Viewpoint 0.1.6 手柄 tooltip =====
        MAP.put("Held, aims as the mouse's right button does, on foot in first and third person; the right stick still turns the view. The game does not see its button then: on LT, that is the game's Shove, which you move to another button in the game's own Options, Controller.",
                "按住时瞄准,效果同鼠标右键,步行时第一/第三人称均生效;右摇杆仍可转动视角。此时游戏看不到该按键:LT 默认是游戏原版的推搡,请到游戏自带选项的手柄页把它改到其他按键。");

        // ===== Viewpoint 0.1.6 手柄 UI 硬编码文本(Lua 里,Java 表兜底) =====
        MAP.put("First person", "第一人称");
        MAP.put("Third person", "第三人称");
        MAP.put("Isometric view", "等距视角");
        MAP.put("While aiming only", "仅瞄准时");
        MAP.put("Press a button of your pad for", "为以下功能按下手柄按钮");
        MAP.put("Default", "默认");
        MAP.put("Clear", "清除");

        // ===== Viewpoint 0.1.6 新设置窗口(标签页/按钮/状态) =====
        MAP.put("General", "常规");
        MAP.put("Shader Options", "着色器选项");
        MAP.put("Graphics mode", "图形模式");
        MAP.put("Estimated load", "预计负载");
        MAP.put("Quality", "质量");
        MAP.put("Preset", "预设");
        MAP.put("Changes", "更改");
        MAP.put("Apply changes?", "应用更改?");
        MAP.put("Changes held", "有未应用的更改");
        MAP.put("No changes held", "无未应用的更改");
        MAP.put("The graphics settings have changes that are not applied.",
                "图形设置有尚未应用的更改。");
        MAP.put("It shows once the hardware is checked, as a save loads.",
                "存档加载、硬件检测完成后显示。");
        MAP.put("Sets all the settings below. A change to one of them makes it Custom.",
                "设置下方全部选项。修改任意一项会变为自定义。");
        MAP.put("Settings the rows above do not show.",
                "上方各行未显示的设置。");
        MAP.put("A Minecraft shader pack has options of its own: see Shader Options.",
                "Minecraft 着色器包有它自己的选项:见着色器选项。");
        MAP.put("Advice", "建议");

        // ===== Viewpoint 0.1.6 新窗口的行标签/tooltip =====
        MAP.put("Modern only", "仅现代画质");
        MAP.put("Shader mode", "着色器模式");
        MAP.put("Too heavy", "负载过高");
        MAP.put("Resolution scaling", "分辨率缩放");
        MAP.put("Scaling mode", "缩放模式");
        MAP.put("Material textures", "材质纹理");
        MAP.put("An upscaler from AMD, Intel or NVIDIA.",
                "来自 AMD、Intel 或 NVIDIA 的升采样器。");
        MAP.put("Blurs the picture as you turn and as things move. A higher level makes the blur smoother.",
                "视角转动和物体移动时画面产生模糊。等级越高模糊越平滑。");
        MAP.put("Blurs the picture when you turn or things move.",
                "视角转动或物体移动时画面产生模糊。");
        MAP.put("Blurs what is far behind the point you look at.",
                "你注视点后方远处的物体变模糊。");
        MAP.put("Bright lights glow.",
                "亮光产生光晕。");
        MAP.put("Bumps and shine on the ground and the walls.",
                "地面和墙壁的凹凸与光泽。");
        MAP.put("Faster with fewer pixels, or sharper with more.",
                "像素少则更快,像素多则更清晰。");
        MAP.put("Gives the ground and the walls the bumps and the shine of what they are made of: rough grass, soil and brick, smooth tiles and concrete. Off, they show the game's flat art, which is faster.",
                "给地面和墙壁它们材质应有的凹凸和光泽:粗糙的草、泥土和砖,光滑的瓷砖和混凝土。关闭后显示游戏平面贴图,性能更好。");
        MAP.put("Glare from the sun and from bright lights.",
                "太阳和强光产生的眩光。");
        MAP.put("Shade in corners and under objects.",
                "角落和物体下方的阴影。");
        MAP.put("Shade in corners, in creases and under things. A higher level makes the shade smoother and more exact.",
                "角落、褶皱和物体下方的阴影。等级越高阴影越平滑精确。");
        MAP.put("Shadows from the sun, the moon, the lamps and the flashlight.",
                "太阳、月亮、灯光和手电的阴影。");
        MAP.put("Smooths jagged edges and shimmer.",
                "平滑锯齿边缘和闪烁。");
        MAP.put("Smooths jagged edges. TAA+ blends each frame with the ones before: the steadiest image. TAA uses fewer frames. FXAA and SMAA smooth each frame on its own: sharp, but edges can still shimmer. When resolution scaling is on, this setting is off: the upscaler smooths the edges.",
                "平滑锯齿边缘。TAA+ 与之前帧混合:最稳定。TAA 使用更少帧。FXAA 和 SMAA 各自平滑每帧:锐利但边缘可能仍有闪烁。开启分辨率缩放时此设置关闭:由升采样器平滑边缘。");
        MAP.put("The resolution the upscaler draws the world at before it fills the screen. Performance modes draw fewer pixels and are faster; Quality modes are sharper. Native AA and DLAA draw at the screen's resolution and only smooth the edges.",
                "升采样器在填充屏幕前绘制世界的分辨率。性能模式像素更少更快;质量模式更清晰。原生 AA 和 DLAA 按屏幕分辨率绘制,只平滑边缘。");
        MAP.put("Uses an upscaler from a graphics card maker in place of the anti-aliasing. The upscaler smooths edges and makes a lower render resolution fill the screen. FSR 3 is from AMD, XeSS is from Intel, DLSS is from NVIDIA (RTX cards only). Choose its mode below.",
                "用显卡厂商的升采样器替代抗锯齿。升采样器平滑边缘并让较低渲染分辨率填满屏幕。FSR 3 来自 AMD,XeSS 来自 Intel,DLSS 来自 NVIDIA(仅 RTX 显卡)。在下方选择模式。");
        MAP.put("Volumetric clouds, and how finely they are drawn.",
                "体积云,及其绘制精细度。");

        // ===== 0.1.6 精确比对第二批(值/状态/行标签) =====
        MAP.put("1 change held", "1 处更改待应用");
        MAP.put("Discard", "放弃");
        MAP.put("Balanced", "均衡");
        MAP.put("Extreme", "极致");
        MAP.put("Full", "完整");
        MAP.put("Half", "半档");
        MAP.put("Heavy", "沉重");
        MAP.put("Moderate", "适中");
        MAP.put("Native", "原生");
        MAP.put("Native AA", "原生 AA");
        MAP.put("Need", "需要");
        MAP.put("Performance", "性能");
        MAP.put("Shadows", "阴影");
        MAP.put("Sharp", "锐利");
        MAP.put("3D clouds, and their detail.", "3D 云,及其细节。");
        MAP.put("3D model packs", "3D 模型包");
        MAP.put("How far past the loaded area the world is drawn.",
                "世界绘制超出已加载区域的距离。");
        MAP.put("How fine the game's art is. It changes when the game starts again.",
                "游戏美术资源的精细度。修改后需重启游戏生效。");
        MAP.put("Smoother movement from frames made between the frames drawn.",
                "在绘制帧之间生成的帧让运动更流畅。");
        MAP.put("Sets every setting below at once, and changing any of them makes it Custom.",
                "同时设置下方全部选项,修改任意一项会变为自定义。");

        // ===== 0.1.6 侧栏标签(Page record name/line) =====
        MAP.put("Graphics", "图形");
        MAP.put("Look, quality and load", "外观、画质与负载");
        MAP.put("Mouse/Keyboard", "鼠标/键盘");
        MAP.put("Controls and keys", "操控与按键");
        MAP.put("Controller", "手柄");
        MAP.put("Buttons, look and aim assist", "按键、视角与瞄准辅助");
        MAP.put("About", "关于");
        MAP.put("Credits, build and licences", "致谢、版本与许可");
        MAP.put("World", "世界");
        MAP.put("Reach, detail and memory", "范围、细节与内存");
        MAP.put("Debug", "调试");
        MAP.put("Views and tools", "视图与工具");
        MAP.put("Options", "选项");
        MAP.put("Advanced", "高级");
        MAP.put("Keys", "按键");
        MAP.put("Key bindings", "按键绑定");

        // ===== 0.1.6 SettingsPages 子标签/分组(第三批精确比对) =====
        MAP.put("Camera profiles", "相机配置");
        MAP.put("Graphics/General", "图形/常规");
        MAP.put("Gunplay", "枪械手感");
        MAP.put("Impact", "冲击感");
        MAP.put("Input", "输入");
        MAP.put("Minimize", "最小化");
        MAP.put("Restore", "还原");
        MAP.put("Roofs", "屋顶");
        MAP.put("Surfaces", "表面");
        MAP.put("Detail", "细节");
        MAP.put("Buttons", "按键");
        MAP.put("Look", "视角");
        MAP.put("Aim assist", "瞄准辅助");
        MAP.put("Switching", "切换");
        MAP.put("Loading ahead", "加载前瞻");
        MAP.put("Project Viewpoint", "Project Viewpoint");

        // ===== 硬件检测/预设建议 =====
        MAP.put("Graphics card (GPU): %s, %s at %d x %d: %s", "显卡(GPU): %s, %s @ %d x %d: %s");
        MAP.put("Memory (RAM): %s, %s free; the game's heap %s: %s", "内存(RAM): %s, 空闲 %s;游戏堆 %s: %s");
        MAP.put("Processor (CPU): %d threads: %s", "处理器(CPU): %d 线程: %s");
        MAP.put("Video memory (VRAM): %s: %s", "显存(VRAM): %s: %s");

        // ===== 设置窗口静态文本 =====
        MAP.put("Press a key (Esc: as it was)", "按下一个按键(Esc 保持原样)");
        MAP.put("Another key for it, besides those it has.", "给它另外指定一个按键。");
        MAP.put("Back to its default: ", "恢复默认值: ");

        // ===== 引导流程(首次进游戏的设置向导) =====
        MAP.put("Welcome to Project Viewpoint", "欢迎使用 Project Viewpoint");
        MAP.put("You're all set!", "全部设置完成!");
        MAP.put("Before first person", "进入第一人称之前");
        MAP.put("Texture compression", "纹理压缩");
        MAP.put("Memory manager", "内存管理器");
        MAP.put("Resolution scaling and frame generation", "分辨率缩放与帧生成");
        MAP.put("Resolution scaling and frame generation use:", "分辨率缩放与帧生成使用:");
        MAP.put("NVIDIA DLSS and DLAA, through NVIDIA Streamline", "NVIDIA DLSS 与 DLAA(通过 NVIDIA Streamline)");
        MAP.put("AMD FidelityFX Super Resolution 3 (FSR 3) and its frame generation", "AMD FidelityFX Super Resolution 3(FSR 3)及其帧生成");
        MAP.put("Intel Xe Super Sampling (XeSS)", "Intel Xe Super Sampling(XeSS)");
        MAP.put("Press a pad button (click: as it was)", "按下一个手柄按键(点击:保持原样)");

        // ===== 0.1.6 Graphics 页(常规)行标签/级别/值 =====
        MAP.put("Graphics mode", "图形模式");
        MAP.put("Modern only", "仅现代模式");
        MAP.put("Setting", "设置");
        MAP.put("Value", "数值");
        MAP.put("Vanilla", "原版");
        MAP.put("Modern", "现代");
        MAP.put("Custom", "自定义");
        MAP.put("Frame generation", "帧生成");
        MAP.put("Low latency", "低延迟");
        MAP.put("Resolution scaling", "分辨率缩放");
        MAP.put("Scaling mode", "缩放模式");
        MAP.put("Native", "原生");
        MAP.put("Native AA", "原生抗锯齿");
        MAP.put("Ultra Performance", "极致性能");
        MAP.put("Ultra Quality", "极致质量");
        MAP.put("Ultra Quality Plus", "极致质量+");
        MAP.put("Balanced", "均衡");
        MAP.put("Performance", "性能");
        MAP.put("DLAA", "DLAA");
        MAP.put("Quality", "质量");
        MAP.put("Anti-aliasing", "抗锯齿");
        MAP.put("View distance", "视野距离");
        MAP.put("Shadows", "阴影");
        MAP.put("Volumetric light", "体积光");
        MAP.put("Global illumination", "全局光照");
        MAP.put("Ambient occlusion", "环境光遮蔽");
        MAP.put("Clouds", "云");
        MAP.put("3D corpses", "3D 尸体");
        MAP.put("3D model packs", "3D 模型包");
        MAP.put("Distant detail", "远景细节");
        MAP.put("Vegetation detail", "植被细节");
        MAP.put("Floor detail", "地面细节");
        MAP.put("Texture resolution", "纹理分辨率");
        MAP.put("Texture filtering", "纹理过滤");
        MAP.put("Full", "完整");
        MAP.put("Half", "减半");
        MAP.put("Extreme", "极致");
        MAP.put("Medium", "中");
        MAP.put("High", "高");
        MAP.put("Ultra", "超高");
        MAP.put("Low", "低");
        MAP.put("On", "开");
        MAP.put("Off", "关");
        MAP.put("Light", "轻");
        MAP.put("Moderate", "中");
        MAP.put("Heavy", "重");
        MAP.put("Too heavy", "过重");
        MAP.put("Preset", "预设");
        MAP.put("Settings the rows above do not show.", "上方列表未显示的设置。");
        MAP.put("Sets all the settings below. A change to one of them makes it Custom.", "一次设置下方全部选项;修改任意一项后变为自定义。");
        MAP.put("A Minecraft shader pack has options of its own: see Shader Options.", "Minecraft 着色器包有自己的选项:见着色器选项页。");
        MAP.put("It shows once the hardware is checked, as a save loads.", "存档加载并完成硬件检测后显示。");

        // ===== 崩溃窗口 =====
        MAP.put("Open our Discord server", "打开我们的 Discord 服务器");
        MAP.put("Close", "关闭");

        // ===== 2026-10-11 全量扫缺(显示层兜底用,键名/硬件检测/许可证名不翻) =====
        MAP.put("Action", "动作");
        MAP.put("Aim (hold)", "瞄准(按住)");
        MAP.put("Back to its default button.", "恢复默认按键。");
        MAP.put("Back to its default keys.", "恢复默认键位。");
        MAP.put("Build", "版本");
        MAP.put("Calls", "调用次数");
        MAP.put("Cap (MiB)", "上限(MiB)");
        MAP.put("Choose a Look", "选择视角");
        MAP.put("Circle", "圆形");
        MAP.put("Compact", "紧凑");
        MAP.put("Copy report", "复制报告");
        MAP.put("Cross", "十字");
        MAP.put("Development build", "开发版");
        MAP.put("Discard", "放弃");
        MAP.put("Discord community", "Discord 社区");
        MAP.put("Draw calls", "绘制调用");
        MAP.put("Element", "元素");
        MAP.put("G-buffer", "G-缓冲");
        MAP.put("GPU limits it", "受 GPU 限制");
        MAP.put("Guide", "指南");
        MAP.put("Half-resolution textures", "半分辨率纹理");
        MAP.put("Heap committed (MiB)", "堆已提交(MiB)");
        MAP.put("Heap used (MiB)", "堆已使用(MiB)");
        MAP.put("Held while the free camera flies.", "自由相机飞行期间按住。");
        MAP.put("How much you see, and how the view moves as you walk. All can be changed later in the settings window (",
                "你看到的范围和行走时的镜头运动。之后都可以在设置窗口调整(");
        MAP.put("Licences", "许可证");
        MAP.put("Light that bounces off lit surfaces.", "从被照亮表面反弹的光。");
        MAP.put("Light that bounces off the lit floors and walls onto what is round them, and off the place the flashlight lights. A higher level takes the bounced light farther.",
                "从被照亮的地板和墙壁反弹到周围物体的光,以及手电筒照亮处的反弹光。等级越高,反弹光传得越远。");
        MAP.put("Memory (RAM)", "内存(RAM)");
        MAP.put("Middle mouse", "鼠标中键");
        MAP.put("No button for it.", "没有绑定按键。");
        MAP.put("No key for it.", "没有绑定键位。");
        MAP.put("No changes held", "没有待应用的更改");
        MAP.put("Off the screen (hidden, or inside a hidden element)", "在屏幕外(被遮挡,或位于隐藏元素内)");
        MAP.put("Other programs", "其他程序");
        MAP.put("Outlines", "描边");
        MAP.put("Own time (ms)", "自身耗时(ms)");
        MAP.put("Ours (ms)", "本模组耗时(ms)");
        MAP.put("Phase", "阶段");
        MAP.put("Press a key", "按下一个键");
        MAP.put("Press a key or a button...", "按下一个键或按键...");
        MAP.put("Pretty", "好看");
        MAP.put("Previous", "上一步");
        MAP.put("Process committed (MiB)", "进程已提交(MiB)");
        MAP.put("Processor (CPU)", "处理器(CPU)");
        MAP.put("Recommended for your computer", "适合你电脑的推荐");
        MAP.put("Released", "已发布");
        MAP.put("Right", "右");
        MAP.put("Right button", "右键");
        MAP.put("Saving your game and closing it...", "正在保存游戏并关闭...");
        MAP.put("Shadow", "阴影");
        MAP.put("Share", "占比");
        MAP.put("Square", "方形");
        MAP.put("Start it again to play in first person.", "重新启动游戏即可进入第一人称。");
        MAP.put("Steam", "Steam");
        MAP.put("Steam Workshop page", "Steam 创意工坊页面");
        MAP.put("THE GAME WILL CLOSE. THIS IS NOT A CRASH.", "游戏即将关闭。这不是崩溃。");
        MAP.put("TURN IT ON AND CLOSE THE GAME", "开启它并关闭游戏");
        MAP.put("MAKE THE CHANGES AND CLOSE THE GAME", "应用更改并关闭游戏");
        MAP.put("SWITCH IT AND CLOSE THE GAME", "切换它并关闭游戏");
        MAP.put("The game goes on in its own view. To bring first person back, load the save again or restart the game.",
                "游戏回到原版视角运行。要恢复第一人称,请重新加载存档或重启游戏。");
        MAP.put("The graphics settings have changes that are not applied.", "图形设置有未应用的更改。");
        MAP.put("The setup players go through before first person, from its first step. Its Ok saves it as finished and turns first person on.",
                "玩家进入第一人称前要完成的设置向导,从第一步开始。点击 Ok 保存为已完成并开启第一人称。");
        MAP.put("The window a player sees when Viewpoint turns itself off after an error, with a test error in its report. First person stays on.",
                "Viewpoint 出错自动关闭时玩家看到的窗口,报告里带一个测试错误。第一人称保持开启。");
        MAP.put("Triangle", "三角形");
        MAP.put("Try again", "重试");
        MAP.put("Used (MiB)", "已使用(MiB)");
        MAP.put("Version", "版本");
        MAP.put("Video memory (MiB)", "显存(MiB)");
        MAP.put("Video memory evictions, since the driver loaded", "驱动加载以来的显存逐出次数");
        MAP.put("Video memory free (MiB)", "显存空闲(MiB)");
        MAP.put("Viewpoint crash report", "Viewpoint 崩溃报告");
        MAP.put("Viewpoint collector check", "Viewpoint 回收器检查");
        MAP.put("Viewpoint does not support Intel Arc graphics cards. There will be problems with the picture and with the game on this computer.",
                "Viewpoint 不支持 Intel Arc 显卡。这台电脑上画面和游戏都会出现问题。");
        MAP.put("Viewpoint does not support the graphics of macOS. There will be problems with the picture and with the game on this computer.",
                "Viewpoint 不支持 macOS 的图形环境。这台电脑上画面和游戏都会出现问题。");
        MAP.put("Viewpoint graphics memory", "Viewpoint 图形内存");
        MAP.put("Viewpoint icons", "Viewpoint 图标");
        MAP.put("Viewpoint main frame", "Viewpoint 主帧");
        MAP.put("Viewpoint memory", "Viewpoint 内存");
        MAP.put("Viewpoint overlay CPU", "Viewpoint CPU 覆盖层");
        MAP.put("Viewpoint overlay GPU", "Viewpoint GPU 覆盖层");
        MAP.put("Viewpoint pool", "Viewpoint 池");
        MAP.put("Viewpoint ran into an error and turned itself off.", "Viewpoint 遇到错误并自动关闭。");
        MAP.put("Viewpoint reload", "Viewpoint 重载");
        MAP.put("Viewpoint render frame", "Viewpoint 渲染帧");
        MAP.put("Viewpoint setup pictures", "Viewpoint 设置向导图片");
        MAP.put("Viewpoint shader watch", "Viewpoint 着色器监视");
        MAP.put("Viewpoint.GpuFrame", "Viewpoint.GPU帧");
        MAP.put("Viewpoint.MainFrame", "Viewpoint.主帧");
        MAP.put("Viewpoint.Memory", "Viewpoint.内存");
        MAP.put("Viewpoint.Pool", "Viewpoint.池");
        MAP.put("Viewpoint.RenderFrame", "Viewpoint.渲染帧");
        MAP.put("Viewpoint.UiTime", "Viewpoint.UI耗时");
        MAP.put("Weather", "天气");
        MAP.put("Wheel", "滚轮");
        MAP.put("While aiming", "瞄准时");
        MAP.put("Windows", "Windows");
        MAP.put("Your graphics card has %s.", "你的显卡有 %s。");
        MAP.put("Your graphics card has %s free.", "你的显卡有 %s 空闲。");
        MAP.put("Your preset uses the Vanilla mode, which draws neither look. The look you choose here shows when you turn on the Modern mode.",
                "你的预设使用原版模式,不绘制任何风格。你在这里选的风格会在开启现代模式后生效。");
        MAP.put("Choose in the loot menu while it shows", "拾取菜单显示时在其中选择");
        MAP.put("The game's own menu on what the cursor points at, with the cursor free",
                "光标自由时,游戏自带菜单作用于光标指向处");
        MAP.put("Welcome to Project Viewpoint###viewpoint-setup", "欢迎使用 Project Viewpoint###viewpoint-setup");
        MAP.put("Setup finished", "设置完成");
        MAP.put("Show the setup", "显示设置向导");
        MAP.put("That's it!", "完成了!");
        MAP.put("Enjoy, but remember: THIS IS HOW YOU DIED.", "好好享受,但请记住:这就是你死亡的开始。");
        MAP.put("Press Ok to save the setup and step into first person.", "按 Ok 保存设置并进入第一人称。");
        MAP.put("Next step", "下一步");
        MAP.put("CHECK AGAIN", "重新检测");
        MAP.put("CHECK MY HARDWARE", "检测我的硬件");
        MAP.put("Check your hardware first.", "请先检测你的硬件。");
        MAP.put("Check your hardware on the step before to see it.", "在上一步检测你的硬件即可看到。");
        MAP.put("Custom: your own settings.", "自定义:你的个人设置。");
        MAP.put("Estimated load:", "预计负载:");
        MAP.put("Estimated for %d x %d from our measurements on Ryzen 5 5600 / RTX 3060.", "根据我们在 Ryzen 5 5600 / RTX 3060 上的实测,估算于 %d x %d。");
        MAP.put("Graphics Quality", "图形质量");
        MAP.put("Graphics Settings", "图形设置");
        MAP.put("Modern only", "仅现代画质");
        MAP.put("Recommended preset: ", "推荐预设: ");
        MAP.put("Recommended: ", "推荐: ");
        MAP.put("Shader mode", "着色器模式");
        MAP.put("Quality presets set how far and how finely the world is drawn and which effects run. Click the button below to let us pick the better preset for your computer. Don't worry, you can then choose another if you want to.", "画质预设决定世界的渲染距离、精细度和启用的特效。点击下方按钮让我们为你的电脑选择最佳预设。别担心,之后你随时可以手动调整。");
        MAP.put("Viewpoint turns Project Zomboid into a true 3D game. You can experience the classic gameplay through your character's own eyes or over the shoulder, with the whole world drawn out to the horizon.", "Viewpoint 把 Project Zomboid 变成真正的 3D 游戏。你可以透过角色的双眼或越肩视角体验经典玩法,整个世界一直延伸到地平线。");
        MAP.put("Drawing that world asks much more of your computer than the game alone. So before your first step, this setup will check your hardware, pick the graphics settings that better suits it, and help you set up the keys. It only takes a minute, and everything can be changed later in the settings window ().", "渲染这个世界对电脑的要求远比游戏本身高。所以在开始之前,这个向导会检测你的硬件、挑选合适的图形设置,并帮你设置按键。只需一分钟,所有设置之后都可以在设置窗口()中更改。");
        MAP.put("Choose in the loot menu while it shows", "在拾取菜单显示时选择");
        MAP.put("Free the cursor to click on things, or look around again", "释放光标以点击物品,或再次环顾四周");
        MAP.put("Middle button", "中键");
        MAP.put("Right button", "右键");
        MAP.put("Press a key...", "按下一个按键...");
        MAP.put("The game's own menu on what the cursor points at, with the cursor free", "光标指向处弹出游戏自带的菜单,并释放光标");
        MAP.put("These are Viewpoint's own keys; the game's are unchanged. Click a key to change it, then press the new one, with Shift, Ctrl or Alt held if you like; Esc keeps it as it was. The settings window and the game's Mod Options have them too.", "这些是 Viewpoint 自有的按键;游戏原版按键不变。点击按键即可修改,然后按下新按键(可搭配 Shift、Ctrl 或 Alt);按 Esc 保持原样。设置窗口和游戏内模组选项里也都有这些设置。");
        MAP.put("How much you see, and how the view moves as you walk. Both can be changed later in the settings window (), under Controls.", "你的视野大小,以及行走时画面的晃动幅度。之后都可以在设置窗口()的「操控」页修改。");
        MAP.put("How tall the view is, in degrees from the bottom of the screen to its top. Wider shows more round you and makes things look farther away; narrower brings them closer.", "视野高度(屏幕底部到顶部的角度)。越大看到的周围越多、物体显得越远;越小物体越近。");
        MAP.put("How much the view moves with your character's head as they stand, walk and turn. Off keeps it steady; High follows every step and sway. Lower it if the motion makes you feel unwell.", "站立、行走和转身时画面跟随角色头部晃动的幅度。关闭保持稳定;高则跟随每一步和摇摆。如果晃动让你不适,请调低。");
        MAP.put("Field of view", "视野(FOV)");
        MAP.put("Head movement", "头部晃动");

        // ===== 图形/性能预设描述(引导页里的大段说明) =====
        MAP.put("The plain Vanilla look and the shortest view: integrated graphics and old cards.", "原版风格、最短视野:适合核显和老显卡。");
        MAP.put("Shaders with the lightest effects and a short view: a GTX 1050 Ti or RX 570, 2 to 3 GB of video memory.", "最轻特效着色器、短视野:GTX 1050 Ti 或 RX 570,2 到 3 GB 显存。");
        MAP.put("Shaders out to 1.5 km: a GTX 1650 or RX 580, 4 GB of video memory, 8 GB of memory.", "着色器渲染至 1.5 公里:GTX 1650 或 RX 580,4 GB 显存,8 GB 内存。");
        MAP.put("Shaders with sharper shadows, more effects, out to 3 km: an RTX 2060 to 3060, 6 GB of video memory and up.", "更清晰的阴影、更多特效、渲染至 3 公里:RTX 2060 至 3060,6 GB 显存及以上。");
        MAP.put("Everything, out to 4 km: an RTX 3070 or better, 10 GB of video memory and up.", "全特效、渲染至 4 公里:RTX 3070 或更好,10 GB 显存及以上。");
    }

    /** 归一化:把任意连续空白(含 \n、字面 \\n)折叠成单个空格。 */
    private static String norm(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean lastSpace = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\\' && i + 1 < s.length() && s.charAt(i + 1) == 'n') {
                i++; // 字面 \n 视为空白
                if (!lastSpace) sb.append(' ');
                lastSpace = true;
                continue;
            }
            if (Character.isWhitespace(c)) {
                if (!lastSpace) sb.append(' ');
                lastSpace = true;
                continue;
            }
            sb.append(c);
            lastSpace = false;
        }
        return sb.toString().trim();
    }

    /** 归一化索引:懒构建。 */
    private static volatile java.util.Map<String, String> NORM = null;

    private static java.util.Map<String, String> normIndex() {
        java.util.Map<String, String> m = NORM;
        if (m == null) {
            m = new HashMap<>();
            for (java.util.Map.Entry<String, String> e : MAP.entrySet()) {
                m.put(norm(e.getKey()), e.getValue());
            }
            NORM = m;
        }
        return m;
    }

    public static String t(String s) {
        if (s == null) return null;
        String r = MAP.get(s);
        if (r != null) return r;
        // 空白形态兜底(续行/双空格差异)
        r = normIndex().get(norm(s));
        return r != null ? r : s;
    }

    /** 模糊翻译:去掉 "##..." 的 ImGui 元素 ID 后缀后查表,保留后缀。 */
    public static String tf(String s) {
        if (s == null) return null;
        int hash = s.indexOf("##");
        if (hash < 0) return t(s);
        String head = s.substring(0, hash);
        String tail = s.substring(hash);
        String r = MAP.get(head);
        if (r == null) r = normIndex().get(norm(head));
        return r != null ? r + tail : s;
    }

    static {
        // Viewpoint 0.1.7 补充:UI 页 / 侧边栏 / 页面名
        MAP.put("UI", "界面");
        MAP.put("Sound", "声音");
        MAP.put("Addons", "附加组件");
        MAP.put("Customize your views", "自定义你的视角");
        MAP.put("Inventory screen", "背包界面");
        MAP.put("Inventory, loot, HUD, fishing", "背包、拾取、HUD、钓鱼");
        MAP.put("Mods and customization", "模组与自定义");
        MAP.put("Output, latency, 3D sound", "输出、延迟、3D 音效");
        MAP.put("Vanilla UI", "原版界面");
        MAP.put("has no settings in this version.", "此版本没有设置项。");
        MAP.put("Viewpoint UI", "Viewpoint 界面");
        MAP.put("Accent colour", "强调色");
        MAP.put("Books and maps", "书籍与地图");
        MAP.put("Border items by condition", "按状态给物品描边");
        MAP.put("Close while using an item", "使用物品时关闭");
        MAP.put("Colour items by type", "按类型给物品着色");
        MAP.put("Columns as tall as their items", "列高随物品");
        MAP.put("Food and drink", "食物与饮料");
        MAP.put("Inventory as a list", "背包以列表显示");
        MAP.put("Inventory keys open vanilla UI", "背包键打开原版界面");
        MAP.put("Items listed by", "物品排序方式");
        MAP.put("Junk items", "杂物");
        MAP.put("Keep searches between openings", "保留搜索内容");
        MAP.put("Last tab", "上次的标签页");
        MAP.put("Opens on", "默认打开标签");
        MAP.put("Panel opacity", "面板不透明度");
        MAP.put("Reopen after a cancelled use", "取消使用后重新打开");
        MAP.put("Show the 3D character", "显示 3D 角色");
        MAP.put("Show the chosen container alone", "只显示选中的容器");
        MAP.put("Show the mouse controls", "显示鼠标操作提示");
        MAP.put("World darkening", "世界变暗");
        MAP.put("Item tile size (times)", "物品格大小（倍率）");
        MAP.put("Type colour strength", "类型颜色强度");
        MAP.put("Weapons colour", "武器颜色");
        MAP.put("Ammunition colour", "弹药颜色");
        MAP.put("Equipment colour", "装备颜色");
        MAP.put("Medical colour", "医疗颜色");
        MAP.put("Food and drink colour", "食物与饮料颜色");
        MAP.put("Vicinity as a list", "周围以列表显示");
        MAP.put("How large the item tiles in Vicinity and your inventory are, against the size the game's font gives them. The columns, the equipment and the hands keep their size.", "周围区域与背包里物品格的大小（相对游戏字体给出的尺寸）。列、装备与手持保持原尺寸。");
        MAP.put("How much the world behind the screen darkens while it is open. 0 leaves it as it is.", "界面打开时背后世界的变暗程度。0 表示不改变。");
        MAP.put("How strongly the type colours fill the tiles. Lower keeps them a hint behind the icons.", "类型颜色的填充强度。越低，颜色越只是图标后的暗示。");
        MAP.put("Keeps what you typed in each column's search when the screen closes and opens again.", "关闭再打开时，保留各列搜索框中输入的内容。");
        MAP.put("Lists your inventory as rows, with each item's name, category and weight. Off: a grid of tiles. The two buttons beside its search switch it too.", "把你的背包按行列出（名称、类别、重量）。关闭：使用格子视图。搜索框旁的两个按钮也能切换。");
        MAP.put("Lists what is around you as rows, with each item's name, category and weight, as the game's own inventory list does. Off: a grid of tiles. The two buttons beside its search switch it too.", "把周围物品按行列出（名称、类别、重量），与游戏自带背包列表一致。关闭：使用格子视图。搜索框旁的两个按钮也能切换。");
        MAP.put("Puts Vicinity, what is around you, on the right of the screen and your equipment and inventory on the left. Off: Vicinity on the left, as DayZ has it.", "把周围物品放屏幕右侧、装备与背包放左侧。关闭：周围在左侧（像 DayZ 那样）。");
        MAP.put("Colours the border of an item's tile by its condition, here and in the loot menu: green while whole, turning yellow, orange and then red as it wears down to ruined. Weapons and clothing always show it, anything else once it is damaged. Off: every border alike.", "按物品状态给格子描边（背包与拾取菜单中都生效）：完好为绿，磨损过程依次转黄、橙、红直到报废。武器和衣物始终显示，其他物品损坏后才显示。关闭：所有描边一致。");
        MAP.put("The colour of what is chosen and marked: the selection, the Take All buttons, the container items go across to, the split's slider.", "选中与标记部分的颜色：选中项、“全部拿取”按钮、物品要转移到的容器、拆分滑块。");
        MAP.put("Animation recorder", "动画录制器");
        MAP.put("Debug menu", "调试菜单");
        MAP.put("Furniture mode's modes, and the furniture tool's while it is out.", "家具模式的各档位，以及家具工具激活时的档位。");
        MAP.put("Held items", "手持物品");
        MAP.put("Hide sidebar automatically", "自动隐藏侧边栏");
        MAP.put("Opens the game's build window.", "打开游戏的建造窗口。");
        MAP.put("Opens the game's crafting window.", "打开游戏的合成窗口。");
        MAP.put("Opens the game's map, and its mini map from the button's popup.", "打开游戏地图，长按按钮可开小地图。");
        MAP.put("Opens the game's search mode window.", "打开游戏的搜寻模式窗口。");
        MAP.put("Opens the inventory screen on its Health tab.", "在背包界面打开“健康”标签页。");
        MAP.put("Opens the inventory screen.", "打开背包界面。");
        MAP.put("Search mode", "搜寻模式");
        MAP.put("The game's animation recorder, in debug mode alone.", "游戏自带的动画录制器，仅调试模式可用。");
        MAP.put("The game's debug menu, in debug mode alone.", "游戏自带的调试菜单，仅调试模式可用。");
        MAP.put("The designated zones the game keeps, for animals among others.", "游戏标定的区域（动物等）。");
        MAP.put("The two circles showing what each hand holds, on which items dropped are held.", "显示双手各持何物的两个圆圈，掉落的物品会放在上面。");
        MAP.put("Look, quality and load", "画面、画质与负载");
        MAP.put("Controls and keys", "操控与按键");
        MAP.put("Buttons, look and aim assist", "按键、视角与瞄准辅助");
        MAP.put("Reach, detail and memory", "视野范围、细节与内存");
        MAP.put("Credits, build and licenses", "鸣谢、构建与许可");
        MAP.put("Graphics mode", "图形模式");
        MAP.put("Terrain relief", "地形起伏");
        MAP.put("Upscaler sharpening", "升采样锐化");
        MAP.put("Resource Packs", "资源包");
        MAP.put("Shaderpacks", "着色器包");
        MAP.put("Apply", "应用");
        MAP.put("Discard", "放弃");
        MAP.put("No changes held", "无未保存的更改");
        MAP.put("Options", "选项");
        MAP.put("Snow", "雪");
        MAP.put("Medium", "中");
        MAP.put("Subtle", "轻微");
        MAP.put("Light", "轻");
        MAP.put("Processor (CPU)", "处理器 (CPU)");
        MAP.put("Memory (RAM)", "内存 (RAM)");
        MAP.put("Video memory (VRAM)", "显存 (VRAM)");
        MAP.put("Sets all the settings below. A change to one of them makes it Custom.", "设置下面所有选项。改动其中任意一项就会变成“自定义”。");
        MAP.put("Preset", "预设");
        MAP.put("Effects", "特效");
        MAP.put("Default", "默认");
        MAP.put("Vanilla look", "原版观感");
        MAP.put("No changes held", "无未保存的更改");
        MAP.put("Discard", "放弃");
        MAP.put("Keep", "保留");
        MAP.put("3D corpses only on screen", "3D 尸体仅在屏内渲染");
        MAP.put("3D corpses' distance (squares, at most 40)", "3D 尸体距离（格，最多 40）");
        MAP.put("3D sound", "3D 音效");
        MAP.put("ADS control", "ADS 操控");
        MAP.put("ADS from third person switches to first person", "第三人称 ADS 自动切第一人称");
        MAP.put("ADS mouse sensitivity", "ADS 鼠标灵敏度");
        MAP.put("ADS transition speed", "ADS 过渡速度");
        MAP.put("Aim ring opacity", "瞄准环不透明度");
        MAP.put("Aim sensitivity", "瞄准灵敏度");
        MAP.put("Aiming a firearm: distance", "持枪瞄准:距离");
        MAP.put("Aiming a firearm: field of view", "持枪瞄准:视野");
        MAP.put("Aiming a firearm: from the left", "持枪瞄准:左侧偏移");
        MAP.put("Aiming a firearm: from the top", "持枪瞄准:上方偏移");
        MAP.put("Aiming a melee weapon: distance", "近战瞄准:距离");
        MAP.put("Aiming a melee weapon: field of view", "近战瞄准:视野");
        MAP.put("Aiming a melee weapon: from the left", "近战瞄准:左侧偏移");
        MAP.put("Aiming a melee weapon: from the top", "近战瞄准:上方偏移");
        MAP.put("Aiming from a vehicle: distance", "载具内瞄准:距离");
        MAP.put("Aiming from a vehicle: field of view", "载具内瞄准:视野");
        MAP.put("Aiming from a vehicle: from the left", "载具内瞄准:左侧偏移");
        MAP.put("Aiming from a vehicle: from the top", "载具内瞄准:上方偏移");
        MAP.put("Aiming takes priority over menus", "瞄准优先于菜单");
        MAP.put("Ambient occlusion method", "环境光遮蔽方式");
        MAP.put("Atlas pages picked in the shader (D35)", "着色器中选取的图集页 (D35)");
        MAP.put("Automatic shoulder swap", "自动换肩");
        MAP.put("Bank slope, at most (rise over run)", "堤岸坡度上限（高/水平）");
        MAP.put("Beam aim (degrees down)", "光束瞄准（下倾角度）");
        MAP.put("Beam width (degrees each side)", "光柱宽度（每侧角度）");
        MAP.put("Beams in the air", "空中的光柱");
        MAP.put("Black level", "黑位");
        MAP.put("Blade arcs (share of lanes)", "刀光弧（占车道比例）");
        MAP.put("Blade arcs last (s)", "刀光弧持续（秒）");
        MAP.put("Blade arcs' chance a pass", "刀光弧每次挥击的概率");
        MAP.put("Blade arcs' length (deg)", "刀光弧长度（度）");
        MAP.put("Blade arcs' width (mm)", "刀光弧宽度（毫米）");
        MAP.put("Blade height", "刃高");
        MAP.put("Blade width", "刃宽");
        MAP.put("Blades a square", "每格刀片数");
        MAP.put("Books and maps colour", "书籍与地图颜色");
        MAP.put("Brightness", "亮度");
        MAP.put("Build budget while the world is behind (ms)", "背后世界构建预算（毫秒）");
        MAP.put("Build chunks out of view too", "也构建视野外的区块");
        MAP.put("Building", "建筑");
        MAP.put("Camera distance", "相机距离");
        MAP.put("Camera height", "相机高度");
        MAP.put("Camera height aiming", "瞄准时相机高度");
        MAP.put("Camera recoil", "相机后坐");
        MAP.put("Camera shake", "相机晃动");
        MAP.put("Camera side offset", "相机侧向偏移");
        MAP.put("Camera side offset aiming", "瞄准时相机侧向偏移");
        MAP.put("Cap: addon data (MiB)", "上限:附加组件数据 (MiB)");
        MAP.put("Cap: baked poses (MiB)", "上限:烘焙姿势 (MiB)");
        MAP.put("Cap: far world on disk (MiB)", "上限:磁盘上的远景世界 (MiB)");
        MAP.put("Cap: grass (MiB)", "上限:草地 (MiB)");
        MAP.put("Cap: layered looks (MiB)", "上限:分层外观 (MiB)");
        MAP.put("Cap: live poses (MiB)", "上限:实时姿势 (MiB)");
        MAP.put("Cap: looks on disk (MiB)", "上限:磁盘上的外观 (MiB)");
        MAP.put("Cap: particles (MiB)", "上限:粒子 (MiB)");
        MAP.put("Cap: profiler (MiB)", "上限:性能分析 (MiB)");
        MAP.put("Cap: shader programs on disk (MiB)", "上限:磁盘上的着色器程序 (MiB)");
        MAP.put("Cap: simulation tables (MiB)", "上限:模拟表 (MiB)");
        MAP.put("Cap: snow trails (MiB)", "上限:雪地足迹 (MiB)");
        MAP.put("Cap: sound files (MiB)", "上限:音效文件 (MiB)");
        MAP.put("Cap: terrain relief (MiB)", "上限:地形起伏 (MiB)");
        MAP.put("Cap: tile textures (MiB)", "上限:地格贴图 (MiB)");
        MAP.put("Cap: tile textures on disk (MiB)", "上限:磁盘上的地格贴图 (MiB)");
        MAP.put("Cap: wall faces (MiB)", "上限:墙面 (MiB)");
        MAP.put("Cast ring colour", "投射环颜色");
        MAP.put("Cast ring opacity", "投射环不透明度");
        MAP.put("Cast ring thickness (pixels at 1080p)", "投射环粗细（1080p 像素）");
        MAP.put("Cel shading", "卡通渲染");
        MAP.put("Character looks where you look", "角色随视角转头");
        MAP.put("Characters' animations loaded with the game", "角色动画随游戏一起加载");
        MAP.put("Chromatic aberration", "色差");
        MAP.put("Chunks ahead taken in first, within (degrees)", "优先加载前方区块（角度范围）");
        MAP.put("Climbing: distance", "攀爬:距离");
        MAP.put("Climbing: field of view", "攀爬:视野");
        MAP.put("Climbing: from the left", "攀爬:左侧偏移");
        MAP.put("Climbing: from the top", "攀爬:上方偏移");
        MAP.put("Collision smoothing", "碰撞平滑");
        MAP.put("Collision start distance (cm)", "碰撞起始距离（厘米）");
        MAP.put("Colour by relief", "按起伏着色");
        MAP.put("Colour in the dark", "暗处着色");
        MAP.put("Compressed pose strength", "压缩姿势强度");
        MAP.put("Contact shadows", "接触阴影");
        MAP.put("Corpses' detail: the error allowed on screen (pixels)", "尸体细节:屏幕允许误差（像素）");
        MAP.put("Crafting", "合成");
        MAP.put("Creek fall, at most (%)", "小溪落差上限（%）");
        MAP.put("Crosshair dot", "准星中心点");
        MAP.put("Crouching: distance", "蹲伏:距离");
        MAP.put("Crouching: field of view", "蹲伏:视野");
        MAP.put("Crouching: from the left", "蹲伏:左侧偏移");
        MAP.put("Crouching: from the top", "蹲伏:上方偏移");
        MAP.put("Day follows the game's clock", "昼夜跟随游戏时钟");
        MAP.put("Day/night cycle follows iso time", "昼夜循环跟随等距时间");
        MAP.put("Dead zone", "死区");
        MAP.put("Debug weapon collision (needs developer mode)", "调试武器碰撞（需开发者模式）");
        MAP.put("Defaults' edition taken", "采用默认版的设置");
        MAP.put("Deploy bipods automatically", "自动展开两脚架");
        MAP.put("Depths taken on the ray", "射线上的深度层数");
        MAP.put("Developer / calibration mode", "开发者/校准模式");
        MAP.put("Doppler effect", "多普勒效应");
        MAP.put("Dragged drop keeps its way (s)", "拖拽液滴保持轨迹（秒）");
        MAP.put("Dragged drop stays put after (s)", "拖拽液滴停留（秒）");
        MAP.put("Drawn blobs reach (radii)", "绘制水珠半径范围");
        MAP.put("Drawn together at (cm/s)", "合并绘制速度（厘米/秒）");
        MAP.put("Drawn together within (radii)", "合并绘制半径");
        MAP.put("Driveway grade, at most (%)", "车道坡度上限（%）");
        MAP.put("Drop ahead of the rubber (radii)", "雨刷前的水滴半径");
        MAP.put("Drops join within (radii)", "水滴合并半径");
        MAP.put("Dump the ceilings round the player (file, once)", "导出玩家周围天花板（文件，一次）");
        MAP.put("Dump the roofs round the player (console, once)", "导出玩家周围屋顶（控制台，一次）");
        MAP.put("Dump the walls round the player (file, once)", "导出玩家周围墙壁（文件，一次）");
        MAP.put("Edge threshold (share)", "边缘阈值（比例）");
        MAP.put("Edges cast none", "边缘不投射");
        MAP.put("Fade from (squares)", "淡出起始（格）");
        MAP.put("Falling: distance", "坠落:距离");
        MAP.put("Falling: field of view", "坠落:视野");
        MAP.put("Falling: from the left", "坠落:左侧偏移");
        MAP.put("Falling: from the top", "坠落:上方偏移");
        MAP.put("Far colours at full size up to (blocks)", "远景原尺寸色块上限（块）");
        MAP.put("Far colours at half size up to (blocks)", "远景半尺寸色块上限（块）");
        MAP.put("Far world hidden behind the near one left out", "被近景遮挡的远景不绘制");
        MAP.put("Far world kept on disk between sessions (D59)", "远景跨会话保留在磁盘 (D59)");
        MAP.put("Far world left out where no opening shows it", "无开口可见处不绘制远景");
        MAP.put("Far zombies drawn from baked clips, their skeletons not evaluated", "远景丧尸用烘焙动画，不计算骨骼");
        MAP.put("Field of view effects", "视野特效");
        MAP.put("Film grain", "胶片颗粒");
        MAP.put("Fine beads back after a wipe (s)", "擦拭后细水珠重现（秒）");
        MAP.put("Fine beads on it (share)", "细水珠占比");
        MAP.put("Fine beads' size on it (times)", "细水珠大小倍率");
        MAP.put("Fine rain gathered (times)", "细雨聚集倍率");
        MAP.put("First person prepared as a save loads", "读档时预载第一人称");
        MAP.put("Fishing: distance", "钓鱼:距离");
        MAP.put("Fishing: field of view", "钓鱼:视野");
        MAP.put("Fishing: from the left", "钓鱼:左侧偏移");
        MAP.put("Fishing: from the top", "钓鱼:上方偏移");
        MAP.put("Flashlight bounce light", "手电反弹光");
        MAP.put("Foundation margin (squares)", "地基边距（格）");
        MAP.put("Foundation over water, at least (m)", "水面地基最小高度（米）");
        MAP.put("Frames drawn between the game's own (D57)", "游戏自身帧之间补绘的帧数 (D57)");
        MAP.put("Free look's angle (degrees)", "自由观察角度（度）");
        MAP.put("Full density out to (squares)", "完整密度范围（格）");
        MAP.put("Furniture", "家具");
        MAP.put("Furniture mode: next mode", "家具模式:下一个模式");
        MAP.put("Game memory (GB)", "游戏内存 (GB)");
        MAP.put("Gathers rain up to (mm)", "积水上限（毫米）");
        MAP.put("Gone at (squares)", "消失距离（格）");
        MAP.put("Grabbed or bitten: distance", "被抓咬时:距离");
        MAP.put("Grabbed or bitten: field of view", "被抓咬时:视野");
        MAP.put("Grabbed or bitten: from the left", "被抓咬时:左侧偏移");
        MAP.put("Grabbed or bitten: from the top", "被抓咬时:上方偏移");
        MAP.put("Grade strength", "坡度强度");
        MAP.put("Grass", "草地");
        MAP.put("Grass casts and takes them", "草地投/受阴影");
        MAP.put("Grass style", "草地样式");
        MAP.put("Ground mode on or off", "地面模式 开/关");
        MAP.put("Grow the blades only where the view reaches", "仅在视野内生成草叶");
        MAP.put("Gunplay Rework (0.1.6)", "枪械手感重做 (0.1.6)");
        MAP.put("Gunshot tracers", "枪弹曳光");
        MAP.put("Gutters and barge boards", "檐沟与封檐板");
        MAP.put("Head lamps apart (squares)", "车头灯间距（格）");
        MAP.put("Head lamps forward (squares)", "车头灯前移（格）");
        MAP.put("Head lamps up (squares)", "车头灯上移（格）");
        MAP.put("Head lamps' brightness", "车头灯亮度");
        MAP.put("Health", "健康");
        MAP.put("Height (times its own)", "高度（自身倍数）");
        MAP.put("Hide a door's menu when it only opens or closes", "门仅开/关时隐藏菜单");
        MAP.put("Hide Viewpoint's crosshair while aiming down sights", "开镜时隐藏准星");
        MAP.put("Hip-fire spread", "腰射散布");
        MAP.put("Horizontal offset", "水平偏移");
        MAP.put("Illuminated reticle colour", "发光准星颜色");
        MAP.put("In multiplayer, a chunk waits at most (ms)", "联机区块等待上限（毫秒）");
        MAP.put("Indoor light brightness", "室内灯光亮度");
        MAP.put("Info box beside the actions", "动作旁信息框");
        MAP.put("Info box in furniture mode", "家具模式信息框");
        MAP.put("Ink colour", "墨色");
        MAP.put("Ink in the fog", "雾中墨色");
        MAP.put("Ink lines", "墨线");
        MAP.put("Ink strength", "墨线强度");
        MAP.put("Ink width", "墨线宽度");
        MAP.put("Inventory", "背包");
        MAP.put("Iron sight / red dot distance (long guns)", "机械瞄具/红点距离（长枪）");
        MAP.put("Iron sight / red dot zoom while steadying", "稳定时机械瞄具/红点倍率");
        MAP.put("Its building a frame (ms)", "其单帧构建耗时（毫秒）");
        MAP.put("Its dissolve between the pictures (s)", "其画面间溶解（秒）");
        MAP.put("Its hold then (times)", "其保持倍率");
        MAP.put("Its narrowest field of view (degrees)", "其最窄视野（度）");
        MAP.put("Junk colour", "杂物颜色");
        MAP.put("Lamps on the model's glass", "模型玻璃上的车灯");
        MAP.put("Landings a second a free drop", "自由落下每秒落地数");
        MAP.put("Largest drop (mm)", "最大水滴（毫米）");
        MAP.put("Latency", "延迟");
        MAP.put("Left wiper parked (deg)", "左雨刷停放角（度）");
        MAP.put("Left wiper's pivot", "左雨刷支点");
        MAP.put("Left wiper's reach", "左雨刷长度");
        MAP.put("Left wiper's sweep end (deg)", "左雨刷扫掠终点（度）");
        MAP.put("Level of detail error, at most (pixels)", "LOD 允许误差（像素）");
        MAP.put("Light beams in rooms", "室内的光束");
        MAP.put("Loot menu: place", "拾取菜单:放置");
        MAP.put("Loot menu: select down", "拾取菜单:下移选择");
        MAP.put("Loot menu: select up", "拾取菜单:上移选择");
        MAP.put("Loot menu: use or equip", "拾取菜单:使用/装备");
        MAP.put("Loot rolled over frames", "战利品跨帧生成");
        MAP.put("Low ready amount", "低姿持枪幅度");
        MAP.put("Low ready when not aiming (first person)", "未瞄准时低姿（第一人称）");
        MAP.put("Lua's input and UI events", "Lua 的输入与界面事件");
        MAP.put("Magnified scope sensitivity", "倍镜灵敏度");
        MAP.put("Map", "地图");
        MAP.put("Mark blades lit by the open sky", "标记天空照射的刀片");
        MAP.put("Mark the square under the preview", "标记预览下的格子");
        MAP.put("Mark the vehicles' lamps", "标记载具车灯");
        MAP.put("Materials colour", "材质颜色");
        MAP.put("Melee hit pause", "近战命中停顿");
        MAP.put("Melee impact", "近战冲击");
        MAP.put("Model shaders without waiting", "无需等待的模型着色器");
        MAP.put("Models hidden behind the near world left out", "被近景遮挡的模型不绘制");
        MAP.put("Models near the camera dissolve", "相机附近模型溶解");
        MAP.put("Models of what is near loaded ahead", "近处模型预载");
        MAP.put("More per chunk waiting (ms)", "每区块额外等待（毫秒）");
        MAP.put("Mouse wheel changes scope zoom", "滚轮改变倍镜缩放");
        MAP.put("Moves with a bigger one (share)", "被大水珠合并的比例");
        MAP.put("Moving things drawn between the last states (D57)", "运动物体在上一状态间补绘 (D57)");
        MAP.put("Near floor texels (times the art's own)", "近处地面纹素倍率");
        MAP.put("Near zombies posed on the graphics card (D57)", "近景丧尸在显卡上摆姿势 (D57)");
        MAP.put("New drop's least radius (mm)", "新水滴最小半径（毫米）");
        MAP.put("New drop's most radius (mm)", "新水滴最大半径（毫米）");
        MAP.put("No depth-of-field blur while aiming down sights", "开镜时无景深模糊");
        MAP.put("On the ground: distance", "卧地时:距离");
        MAP.put("On the ground: field of view", "卧地时:视野");
        MAP.put("On the ground: from the left", "卧地时:左侧偏移");
        MAP.put("On the ground: from the top", "卧地时:上方偏移");
        MAP.put("One roof per building, over all its levels", "每栋建筑一个屋顶（覆盖各层）");
        MAP.put("Other players' guns collide too", "其他玩家的枪也参与碰撞");
        MAP.put("Outline in ground mode", "地面模式描边");
        MAP.put("Outline what you aim at", "描边瞄准目标");
        MAP.put("Output", "输出");
        MAP.put("Overlays stand up", "叠加层立起");
        MAP.put("Panini projection", "Panini 投影");
        MAP.put("Panini strength", "Panini 强度");
        MAP.put("Parking lot, at least (squares)", "停车场最小面积（格）");
        MAP.put("Physical weapon collision", "武器物理碰撞");
        MAP.put("Picture-in-picture quality", "画中画质量");
        MAP.put("Picture-in-picture scopes and sights", "画中画倍镜与瞄具");
        MAP.put("Plants and trees dissolve too", "植物与树木也溶解");
        MAP.put("Probe a wall", "探测墙体");
        MAP.put("Profiler", "性能分析");
        MAP.put("Profiler's local server", "性能分析本地服务");
        MAP.put("Profiler's local server's port", "性能分析本地端口");
        MAP.put("Rain glow around lights", "灯光周围雨光");
        MAP.put("Raindrops on glass and walls", "玻璃与墙上的雨滴");
        MAP.put("Raindrops' flow on glass", "玻璃上雨滴流动");
        MAP.put("Reach", "触及距离");
        MAP.put("Reach (times the game's)", "触及距离（游戏倍数）");
        MAP.put("Realistic lights", "真实灯光");
        MAP.put("Recoil amount", "后坐力");
        MAP.put("Response curve", "响应曲线");
        MAP.put("Reticle brightness", "准星亮度");
        MAP.put("Right wiper parked (deg)", "右雨刷停放角（度）");
        MAP.put("Right wiper's pivot", "右雨刷支点");
        MAP.put("Right wiper's reach", "右雨刷长度");
        MAP.put("Right wiper's sweep end (deg)", "右雨刷扫掠终点（度）");
        MAP.put("Rivulets (share of lanes)", "细水流（占车道比例）");
        MAP.put("Rivulets apart (cm)", "细水流间距（厘米）");
        MAP.put("Rivulets on the rear window", "后窗细水流");
        MAP.put("Rivulets on the windscreen", "前挡细水流");
        MAP.put("Rivulets' length (times)", "细水流长度倍率");
        MAP.put("Rivulets' speed (share of car's)", "细水流速度（相对车速）");
        MAP.put("Rivulets' speed at most (m/s)", "细水流速度上限（米/秒）");
        MAP.put("Rivulets' width (mm)", "细水流宽度（毫米）");
        MAP.put("Road cross slope, at most (%)", "路面横坡上限（%）");
        MAP.put("Road grade change, at most (% each 8 squares)", "路面坡度变化上限（每 8 格 %）");
        MAP.put("Road grade, at most (%)", "路面坡度上限（%）");
        MAP.put("Roofs built from their tiles", "屋顶由地格拼合");
        MAP.put("Running: distance", "奔跑:距离");
        MAP.put("Running: field of view", "奔跑:视野");
        MAP.put("Running: from the left", "奔跑:左侧偏移");
        MAP.put("Running: from the top", "奔跑:上方偏移");
        MAP.put("Scope eye box (lens shadow when misaligned)", "目镜眼框（偏离时镜头阴影）");
        MAP.put("Scope lens size on screen", "屏幕上倍镜镜片大小");
        MAP.put("Scope zoom", "倍镜缩放");
        MAP.put("Seated: distance", "坐姿:距离");
        MAP.put("Seated: field of view", "坐姿:视野");
        MAP.put("Seated: from the left", "坐姿:左侧偏移");
        MAP.put("Seated: from the top", "坐姿:上方偏移");
        MAP.put("Separation's cached walls checked against the game's own answer (D69)", "缓存墙体与游戏结果比对 (D69)");
        MAP.put("Shader programs kept on disk between sessions", "着色器程序跨会话保留");
        MAP.put("Shader variants compiled on the loading screen", "载入界面预编译着色器变体");
        MAP.put("Shoulder", "肩位");
        MAP.put("Show and trace the head look", "显示并追踪头部朝向");
        MAP.put("Show the aim ring", "显示瞄准环");
        MAP.put("Show the cast ring", "显示投射环");
        MAP.put("Show the loot menu", "显示拾取菜单");
        MAP.put("Show the rig (from the free camera)", "显示骨架（自由相机）");
        MAP.put("Show the shot's cone", "显示弹道锥");
        MAP.put("Show the tension gauge", "显示张力表");
        MAP.put("Show the wipers' sweep", "显示雨刷扫掠范围");
        MAP.put("Show zoom and zero when changed", "改动时显示倍率与归零");
        MAP.put("Sidebar", "侧边栏");
        MAP.put("Sight in the dark", "暗处瞄具");
        MAP.put("Signals the chunk cache leaves out gathered anyway, and counted if they changed a mesh", "区块缓存外的信号仍会收集，改变网格才计数");
        MAP.put("Simultaneous sounds", "同时发声数");
        MAP.put("Sitting: distance", "坐姿:距离");
        MAP.put("Sitting: field of view", "坐姿:视野");
        MAP.put("Sitting: from the left", "坐姿:左侧偏移");
        MAP.put("Sitting: from the top", "坐姿:上方偏移");
        MAP.put("Slowdown", "减速");
        MAP.put("Smoothing in the open (squares)", "开阔地平滑（格）");
        MAP.put("Smoothing in towns (squares)", "城镇平滑（格）");
        MAP.put("Snap as aiming starts", "开始瞄准时对齐");
        MAP.put("Snow layer: its shadow from coarser triangles (D61)", "雪层:粗略三角形的阴影 (D61)");
        MAP.put("Snow layer: the clipmap on any GPU (D61)", "雪层:任意显卡用 clipmap (D61)");
        MAP.put("Soft cap on the game's Java heap (restart)", "游戏 Java 堆软上限（重启生效）");
        MAP.put("Sound files read ahead", "音效文件预读");
        MAP.put("Spot blacks", "点状黑位");
        MAP.put("Sprinting: distance", "冲刺:距离");
        MAP.put("Sprinting: field of view", "冲刺:视野");
        MAP.put("Sprinting: from the left", "冲刺:左侧偏移");
        MAP.put("Sprinting: from the top", "冲刺:上方偏移");
        MAP.put("Squares from which zombies are drawn from baked clips", "多远开始用烘焙动画绘制丧尸（格）");
        MAP.put("Standing: distance", "站立:距离");
        MAP.put("Standing: field of view", "站立:视野");
        MAP.put("Standing: from the left", "站立:左侧偏移");
        MAP.put("Standing: from the top", "站立:上方偏移");
        MAP.put("Steady aim (hold breath)", "稳定瞄准（屏息）");
        MAP.put("Stop the gun clipping open near the camera while aiming", "瞄准时防止枪械穿模");
        MAP.put("Storm sky", "风暴天空");
        MAP.put("Straighten the art's level lines", "拉直美术的横线");
        MAP.put("Stroke up and back (s)", "雨刷上行与复位（秒）");
        MAP.put("Sunlight through leaves", "叶间阳光");
        MAP.put("Surface thickness (share)", "表面厚度（比例）");
        MAP.put("Sway amount", "晃动量");
        MAP.put("Switch to the pad as it is used", "使用手柄时自动切换");
        MAP.put("Tail lights", "尾灯");
        MAP.put("Tail lights apart (squares)", "尾灯间距（格）");
        MAP.put("Tail lights back (squares)", "尾灯后移（格）");
        MAP.put("Tail lights up (squares)", "尾灯上移（格）");
        MAP.put("Tension gauge size", "张力表大小");
        MAP.put("The characters' separation answered from a cache of the walls between squares (D69)", "角色分离由格间墙体缓存回答 (D69)");
        MAP.put("The game's chunk loading a frame (ms)", "游戏区块加载单帧（毫秒）");
        MAP.put("The game's chunk loading at most (ms)", "游戏区块加载上限（毫秒）");
        MAP.put("The game's simulation at a fixed tick", "游戏模拟固定步长");
        MAP.put("The game's UI between its steps (D69)", "步长之间的游戏界面 (D69)");
        MAP.put("The mix written to a WAV file (restart)", "混音写入 WAV 文件（重启生效）");
        MAP.put("The ported skeletons checked against the game's own step (D69)", "移植骨架与游戏步长比对 (D69)");
        MAP.put("The ported skeletons worked out twice, on two thread counts (D69)", "移植骨架双倍计算（两种线程数）(D69)");
        MAP.put("The simulation's worker threads (D69)", "模拟工作线程 (D69)");
        MAP.put("The switch from the isometric view (s)", "从等距视角切换（秒）");
        MAP.put("The walls a character stops at, kept by square, checked against the game's own answer", "角色受阻墙体按格缓存并与游戏结果比对");
        MAP.put("The world built on the loading screen", "世界在载入界面构建");
        MAP.put("The zombies' skeletons worked out by Viewpoint (D69)", "丧尸骨骼由 Viewpoint 计算 (D69)");
        MAP.put("Thinning past it (power)", "超出后稀释（幂）");
        MAP.put("Third person in a vehicle", "载具内第三人称");
        MAP.put("Third person on foot", "步行第三人称");
        MAP.put("Ticks a second", "每秒步长（tick）");
        MAP.put("Ticks in each of the game's steps (D69)", "每个游戏步长内的 tick (D69)");
        MAP.put("Tint", "色调");
        MAP.put("Tint the snow's colouring by how it found the snow (D61)", "按积雪方式着色 (D61)");
        MAP.put("Tint the snow's layer by its detail (D61)", "按细节给雪层着色 (D61)");
        MAP.put("Tools colour", "工具颜色");
        MAP.put("Town slope, at most (%)", "城镇坡度上限（%）");
        MAP.put("Trace the frames drawn (D57)", "追踪补绘帧 (D57)");
        MAP.put("Trace the game's fishing (console)", "追踪游戏钓鱼（控制台）");
        MAP.put("Tracking", "追踪");
        MAP.put("Trail drop every (mm run)", "每毫米生成尾迹水滴");
        MAP.put("Trail drop's size (share)", "尾迹水滴大小（比例）");
        MAP.put("Turn boost", "转向加成");
        MAP.put("Turn edge-on blades to the eye", "刀片侧刃朝向视线");
        MAP.put("Turn speed (degrees a second)", "转向速度（度/秒）");
        MAP.put("Twilight", "暮光");
        MAP.put("Up and down speed (degrees a second)", "俯仰速度（度/秒）");
        MAP.put("Value bands", "明度分层");
        MAP.put("Vanilla roofs (no model pack's)", "原版屋顶（不含模型包）");
        MAP.put("Variable zoom on high-power scopes", "高倍镜可变倍率");
        MAP.put("Vehicle camera distance", "载具相机距离");
        MAP.put("Vehicle camera height", "载具相机高度");
        MAP.put("Vehicle camera returns behind", "载具相机回正");
        MAP.put("Vehicle camera side offset", "载具相机侧偏");
        MAP.put("Vehicle tilt", "载具倾斜");
        MAP.put("Vehicle tilt, at most (degrees)", "载具倾斜上限（度）");
        MAP.put("Vertical offset", "垂直偏移");
        MAP.put("Vicinity on the right", "周围在右侧");
        MAP.put("Viewpoint's sound engine", "Viewpoint 声音引擎");
        MAP.put("Vignette", "暗角");
        MAP.put("Vignette shape", "暗角形状");
        MAP.put("Wait in a drizzle (s)", "细雨等待（秒）");
        MAP.put("Wait in heavy rain (s)", "大雨等待（秒）");
        MAP.put("Wait in rain (s)", "雨中等候（秒）");
        MAP.put("Walking", "步行");
        MAP.put("Walking: distance", "步行:距离");
        MAP.put("Walking: field of view", "步行:视野");
        MAP.put("Walking: from the left", "步行:左侧偏移");
        MAP.put("Walking: from the top", "步行:上方偏移");
        MAP.put("Warmth", "暖度");
        MAP.put("Weapon inertia when turning", "转向时武器惯性");
        MAP.put("Weapon range", "武器射程");
        MAP.put("Weapon recoil", "武器后坐");
        MAP.put("Weapon rest and bipods", "武器架与两脚架");
        MAP.put("Weapon sway", "武器晃动");
        MAP.put("Weather colour grade", "天气调色");
        MAP.put("Wet walls", "湿墙");
        MAP.put("What a frame between reuses from its state's first frame made again, and counted if it differs", "补绘帧复用首帧内容，不同则计数");
        MAP.put("Wind strength", "风力");
        MAP.put("Wind sway pace", "风摆节奏");
        MAP.put("Windscreen wipers", "挡风玻璃雨刷");
        MAP.put("Wireframe", "线框");
        MAP.put("World kept built in the isometric view", "等距视角下世界保持构建");
        MAP.put("Zombies with a model that are not drawn posed every 4th frame", "有模型的丧尸每 4 帧更新一次姿势");
        MAP.put("Zombies with a target updated every frame within (squares)", "目标每帧更新的丧尸范围（格）");
        MAP.put("Zombies' and corpses' looks layered in the shader (D58)", "丧尸与尸体外观在着色器分层 (D58)");
        MAP.put("Zones", "区域");
        MAP.put("0 darkens the corners of the screen's rectangle; 1 darkens a circle round the middle.", "0 使屏幕矩形四角变暗；1 使屏幕中央圆形区域变暗。");
        MAP.put("1.0 keeps the same feel per degree of view at every magnification.", "1.0 表示各倍率下每度视角的手感一致。");
        MAP.put("A door you can only open or close shows no menu, its outline only: the Interact key opens and closes it. A door with more to do (lock it, barricade it) still shows its menu.", "只能开关的门不显示菜单，只显示描边:交互键直接开关。还有别的操作（上锁、加固）的门仍显示菜单。");
        MAP.put("A far corpse is drawn with fewer triangles, as long as what it loses stays under this many pixels on screen. 0: every corpse whole.", "远处尸体用更少三角形绘制，只要损失不超过屏幕上的这个像素数。0:所有尸体完整绘制。");
        MAP.put("A fine moving grain over the image, stronger in the dark tones, as film has it.", "画面上的细密动态颗粒，暗部更明显，如胶片一般。");
        MAP.put("A gentle darkening towards the corners, stronger in gloomy weather.", "朝四角轻微变暗，阴天更明显。");
        MAP.put("A graphics card maker's upscaler in the anti-aliasing's place: it smooths the edges and brings a render resolution under 100% up to the screen's. FSR 3: AMD's. XeSS: Intel's. DLSS: NVIDIA's, on its RTX cards only; at 100% render resolution DLAA. Off: the anti-aliasing above.", "用显卡厂商的升采样器替代抗锯齿:平滑边缘并把低于 100% 的渲染分辨率提升到屏幕分辨率。FSR 3 为 AMD、XeSS 为 Intel、DLSS 仅 NVIDIA RTX 卡可用（100% 渲染分辨率时为 DLAA）。关闭:使用上面的抗锯齿。");
        MAP.put("A model shown for the first time takes its shader from those already made, instead of waiting for the render thread to make it (up to 20 ms each). The shaders the game's model scripts name are made as a save loads.", "模型首次显示时复用已编译好的着色器，而不是等渲染线程现编译（每个最多 20 毫秒）。游戏模型脚本里点名的着色器会在读档时预先编译。");
        MAP.put("A rivulet's width at its head (its tail a third as wide).", "细水流在水头处的宽度（尾部为其三分之一）。");
        MAP.put("A server on this machine (127.0.0.1) only, read-only, that answers what the profiler records, for scripts and tools while the game runs. Always on in dev mode.", "仅本机 (127.0.0.1) 的只读服务，对外提供性能分析记录，供游戏运行时的脚本和工具查询。开发者模式下始终开启。");
        MAP.put("A shot goes exactly where the crosshair is, and hits what it meets, on the body part it meets. The crosshair wanders within the ring round the screen's middle, wider the lower your character's skill and the game's hit chance. Out of a vehicle's window it works too, and the game's own rules for such a shot still hold: only to the window's side, slower and wider while the vehicle moves. In third person the camera comes over your shoulder while you aim from the seat. When it is off, the game uses its original aiming system and hit chance.", "子弹严格打向准星位置，命中它遇到的目标和部位。准星在屏幕中央的环内游走，角色技能越低、命中率越低环越大。从车窗射击同样有效，且仍受游戏规则限制:只能朝车窗一侧，载具移动时更慢更散。第三人称时从座位瞄准会让相机过肩。关闭时使用游戏原始瞄准与命中判定。");
        MAP.put("A small readout in the lower right corner for a moment after you change the zoom or the zero.", "改变倍率或归零后，右下角短暂显示读数。");
        MAP.put("A sound that comes near you sounds higher, and a sound that goes away from you sounds lower, as a car does when it drives past. Your own speed changes it too.", "靠近的声音音调变高，远离的变低，就像汽车驶过。你自己的速度也会影响。");
        MAP.put("A streak of light along each shot's way, by the gun: short and pale from a handgun, long and orange from a rifle, red from an automatic, a shotgun's pellets each its own. Low: your own shots only. Medium: everyone's. High and up: at night the newest light what they pass, more of them at each step.", "每发子弹沿弹道留下光迹:手枪短而淡，步枪长而橙，自动武器为红，霰弹每颗弹丸各有一条。低:仅自己的射击。中:所有人的。高及以上:夜间最新的光迹会照亮所经之处，档位越高数量越多。");
        MAP.put("A trail drop's radius against the running drop's: its water is taken from it.", "尾迹水滴半径相对流动水滴的比例:它的水由后者提供。");
        MAP.put("A vehicle on a slope of the terrain relief is drawn tilted to the ground under its wheels, up to this; its physics, and what everyone else's game sees of it, stay the game's own.", "载具位于地形起伏的斜坡上时，最多按车轮下的地面倾斜到该角度；其物理与他人看到的姿态仍是游戏本身。");
        MAP.put("A yellow dot on each head lamp's lens and a line along its beam, a red one on each tail or brake light, and a short cyan line the way each lamp's glass faces, drawn over everything.", "每个车头灯镜片上有黄点、沿光柱有黄线；每个尾灯/刹车灯为红点；每个灯罩朝向有短青线，均绘制在最上层。");
        MAP.put("Aiming a gun on a pad, in first and third person, the view is helped onto a zombie near the crosshair. The shot still goes exactly where the crosshair is. Never onto a player.", "用手柄持枪瞄准（第一/第三人称）时，视角会辅助吸附到准星附近的丧尸身上。子弹仍严格打向准星位置，且从不吸附玩家。");
        MAP.put("An experiment: how far a blade seen edge on near you turns towards you, so a lawn looks fuller from low down. Its root and the wind stay as they are.", "实验项:近处侧刃草叶朝你转向的幅度，让低视角下草坪更饱满。草根与风力不受影响。");
        MAP.put("As you start to aim, the view eases onto the chest of a zombie near the crosshair.", "开始瞄准时，视角平滑移到准星附近丧尸的胸口。");
        MAP.put("Asks the game for the 3D models of the objects and items in the loaded area before they first show, a little each frame, the nearest first: no object appears late, and the first switch to first person finds them loaded.", "在物体首次显示前向游戏请求已加载区域的 3D 模型，每帧处理一点、由近及远:物体不会迟显，首次切第一人称时模型已就绪。");
        MAP.put("At most this many corpses are 3D models, and no more than the posed corpses' pool holds (Cap: posed corpses, below; about 1.2 MiB a corpse). With fewer, the models thin out along the whole view rather than stopping short of its distance.", "最多这么多尸体使用 3D 模型，且不超过姿态尸体池容量（见下方「上限:姿态尸体」，每具约 1.2 MiB）。数量更少时，模型均匀稀疏到整个视野而非在距离处截断。");
        MAP.put("At the fixed tick, the game's windows and HUD updated and drawn for the frames between the game's steps, where the main thread has the time: hover, drags and scrolling at the screen's rate. Off, they answer at the tick's rate.", "固定步长下，游戏窗口与 HUD 在主线程有余力的帧里更新绘制:悬停、拖动、滚动都按屏幕刷新率响应。关闭则按步长频率响应。");
        MAP.put("At the next load of a save with the game's Texture compression off, the setup holds first person for it as on a card too small, whatever this card has. Its button turns compression on and quits the game.", "下次读取「关闭材质压缩」的存档时，设置向导会像对待显存不足的显卡一样等待处理。其按钮会开启压缩并退出游戏。");
        MAP.put("Beside the interaction menu, what the game's own menu shows on hovering the action chosen, where it tells what the menu does not: why an action is refused, or the tools, skill and materials it needs. Off: the menu alone.", "在交互菜单旁显示游戏自带菜单在悬停该动作时的说明，补充菜单没有的信息:动作为何被拒绝，或所需的工具、技能与材料。关闭:只显示菜单。");
        MAP.put("Blades of grass grown over the green ground round you, bending in the wind, pushed aside by what walks through them, laid flat under vehicles, and thrown about by shots and blasts: town lawns short, the wild grass tall. Each step reaches further with more blades, on the graphics card's time.", "在你周围绿地上生成草叶:随风摆动、被人踩开、被载具压平、被射击与爆炸掀动；城镇草坪低矮，野外草高。档位越高范围越大、草叶越多，消耗显卡时间。");
        MAP.put("Blades whose square the near world's light grids hold none for are drawn magenta: they take the open sky's light, not the ground's under them.", "近景光照网格未覆盖到的格子里的草叶会画成品红:它们取天空光而非地面光。");
        MAP.put("Breathing sway, affected by aiming skill, endurance, fatigue, panic, movement and weapon weight.", "呼吸晃动，受瞄准技能、耐力、疲劳、恐慌、移动与武器重量影响。");
        MAP.put("Builds and keeps every loaded chunk whether it is in view or not, so the hills about you cast their shadows as you turn; costs the main thread the building, and the pools room.", "无论是否在视野内，都构建并保留所有已加载区块，使你转身时周围山丘仍有阴影；代价是主线程构建开销与内存池占用。");
        MAP.put("Builds the world first and third person show while the game's loading screen waits, and holds its click to start until it is done, so the first switch shows it whole at once.", "在游戏载入界面等待时预先构建第一/第三人称世界，并在完成前不响应开始点击，使首次切换即完整显示。");
        MAP.put("Bushes and trees between the camera and the character dissolve, as models do. Only with the models' dissolve on.", "相机与角色之间的灌木和树木像模型一样溶解。仅在模型溶解开启时有效。");
        MAP.put("Colours each item's tile by what kind of thing it is (weapons, ammunition, equipment, medical, food and drink, tools, materials, books and maps), as Tarkov colours its grid, each in the colour chosen below, and your junk in its own whatever its kind. Other things stay plain. Its condition shows on the border.", "按物品种类给格子着色（武器、弹药、装备、医疗、食物饮料、工具、材料、书籍地图），像《逃离塔科夫》那样，各类颜色见下方；杂物无论种类都用自己的颜色。其他物品保持原样，状态显示在描边上。");
        MAP.put("Compiles on the loading screen the shaders a change of the built-in packs' settings asks for, so the change shows at once in place of after seconds. Compiled once, then kept with the rest.", "在载入界面预编译内置包设置改动所需的着色器，使改动立即生效而非等待数秒。只编译一次，之后与其他着色器一并保留。");
        MAP.put("Day and night follow the game's own clock and light, as in the isometric view: when it gets dark, how dark it gets, where the sun and the moon stand, and the moon's phase. Off: the sun, the moon and the light follow the real sky over Kentucky.", "昼夜跟随游戏自身的时钟与光照，与等距视角一致:何时变暗、暗到什么程度、日月位置与月相。关闭时日月与光照跟随肯塔基真实天象。");
        MAP.put("Decodes the sound files the game's sound scripts name (mods' sounds) as a save loads, on a thread of its own, so a sound plays the first time without a hitch. Within the cap of the sound files' memory (World, Memory).", "读档时在独立线程解码游戏音效脚本引用的音频（模组音效），使首次播放不卡顿。受「音效文件内存上限」限制（世界 → 内存）。");
        MAP.put("Dev mode only. Checks the meshes round the player against the newest recording (TESTING.md).", "仅开发者模式。用最新录制数据校验玩家周围的网格 (TESTING.md)。");
        MAP.put("Dev mode only. Explains the wall under the free cursor, or the crosshair: what each of its faces shows and why (console, screen).", "仅开发者模式。解释自由光标或准星所指的墙体:每个面显示什么及原因（控制台/屏幕）。");
        MAP.put("Dev mode only. Normal, the art only, the light only, the volumetric light, the bounce light, the lamps' shadows, the sun's maps.", "仅开发者模式。正常、仅美术、仅光照、体积光、反弹光、灯光阴影、太阳贴图。");
        MAP.put("Dev mode only. Records the mesher round the player (TESTING.md).", "仅开发者模式。录制玩家周围的网格生成 (TESTING.md)。");
        MAP.put("Dev mode only. Starts and stops recording the third-person camera's frames, for the offline checks (TESTING.md).", "仅开发者模式。启停第三人称相机帧录制，用于离线校验 (TESTING.md)。");
        MAP.put("Dev mode only. The culling of the rooms no one can see: on, frozen, off.", "仅开发者模式。不可见房间的剔除:开、冻结、关。");
        MAP.put("Dev mode only. The renderer's effects off one at a time.", "仅开发者模式。逐个关闭渲染特效。");
        MAP.put("Directions and steps taken round each pixel, as XeGTAO's presets a step down: Medium (1 x 2) is about half Ultra's time (3 x 3), High (2 x 2) two thirds; Extreme (9 x 3) the least noise for about twice Ultra's.", "每个像素周围的取样方向与步数，相当于 XeGTAO 预设降一档:中 (1x2) 约为超高 (3x3) 的一半耗时，高 (2x2) 为三分之二；极致 (9x3) 噪点最少，耗时约为超高的两倍。");
        MAP.put("Draws the ring the crosshair wanders within, from the game's hit chance, and where each shot went in the world. For checking the aim; nothing is drawn while not aiming a firearm.", "绘制由游戏命中率决定的准星游走环，以及每发子弹在世界中的落点。用于校验瞄准；未持枪瞄准时不绘制。");
        MAP.put("Draws the sides of a wide view closer to their true size: upright lines stay straight, the middle is drawn larger.", "把宽视野的边缘拉近真实尺寸:竖线保持笔直，中心区域画得更大。");
        MAP.put("Driving, in first and third person, the view goes back to the way the vehicle goes when the mouse has been still a while. Moving the mouse takes it back at once.", "驾驶时（第一/第三人称），鼠标静止一段时间后视角自动回正到车头方向。移动鼠标立即接管。");
        MAP.put("Each depth along a line blended to where its ray passes between two pixels, the pixel shading and casting from that one depth (Bend's offset mode): steadier lines on smooth surfaces, more jagged ones in places; off, each pixel casts from the further of its two.", "沿线条的各深度按射线在两像素间的通过位置混合，像素按该深度着色与投射（Bend 偏移模式）:平滑表面上线条更稳，个别处更锯齿；关闭时每个像素从较远的那个深度投射。");
        MAP.put("Each frame shows the world about a step behind the game's newest, its characters and vehicles placed between its last steps, and carried on along their last step while the next is late: off, at the newest, as the game draws it.", "每帧显示比游戏最新状态滞后约一步的世界，角色与载具插值在上一步之间，下一步迟到时沿上一步外推；关闭时按游戏绘制的最新状态显示。");
        MAP.put("Each shot climbs the view and pushes it a little sideways. Part of it settles back, the rest stays: hold the gun down on full auto. Every weapon kicks its own way (pistols snap, rifles push, snipers and shotguns punch).", "每发子弹让视角上抬并向一侧轻推。一部分会回正，其余保留:全自动时需要压枪。每种武器后坐方式不同（手枪弹跳、步枪推、狙击与霰弹猛击）。");
        MAP.put("Each step runs this many ticks, at the tick rate divided by it: tells the Lua modes apart.", "每个步长执行这么多 tick，tick 频率除以该值:用于区分 Lua 模式。");
        MAP.put("Each zombie's bones for drawing worked out by Viewpoint's own code from the game's animations, the same math as the game's: the same pose in less of the main thread's time. A zombie the code cannot pose (a ragdoll, its first frame) is posed by the game as before.", "每只丧尸的绘制骨骼由 Viewpoint 自己按游戏的动画数据计算，数学与游戏一致:相同姿势占用更少主线程时间。无法计算的（布娃娃、首帧）仍由游戏摆姿势。");
        MAP.put("Each zombie's skeleton copied once each time the game moves it, the graphics card blending its pose between those copies for every frame drawn and working out what each piece it wears takes from it: in a crowd the main thread does not, and the far ones move smoothly between their updates.", "游戏每次移动丧尸时复制一次骨骼，显卡在两次复制之间为每一帧混合姿势，并计算其穿戴各部件如何跟随:人群时主线程不再计算，远处丧尸在更新间隔间平滑移动。");
        MAP.put("Edge pixels cast no shadow: thinner shadows from leaves and thin things, none from a blade of grass whose march runs along it.", "边缘像素不投射阴影:树叶等细薄物体阴影更纤细，草叶沿其走向不投影。");
        MAP.put("Enables the calibration window, extra logging and the validator.", "启用校准窗口、额外日志与校验器。");
        MAP.put("Every lamp lights the world the way a real one does: street lamps throw their light down into a pool under the head, ceiling lights fill rooms from above, fires shine all round, light falls off with distance and bounces back up off the ground. Lamps far down the street light the road too. 0: Viewpoint's lamps.", "每盏灯按真实方式照明:路灯把光投成灯下的一滩，吸顶灯自上而下充满房间，火堆四周发光，光随距离衰减并从地面反弹。远处的路灯也会照亮路面。0 表示使用 Viewpoint 的灯光。");
        MAP.put("Falling rain and wet air spread the light of lamps and headlights into a soft glow.", "落雨与潮湿空气把灯光和车灯晕成柔和光晕。");
        MAP.put("Fast: Medium and High read a pixel in four at half the size each way, with 3 and 5 pairs of samples; Ultra every pixel with 5, Extreme every pixel with 12. Ground truth: directions and steps round each pixel, as XeGTAO's presets a step down: Medium (1 x 2) about half Ultra's time (3 x 3), High (2 x 2) two thirds, Extreme (9 x 3) the least noise for about twice Ultra's.", "快速:中与高把像素按四分之一大小读取，分别取 3 与 5 对样本；超高每像素 5 个，极致每像素 12 个。基准:按每像素方向与步数，相当于 XeGTAO 预设降一档:中 (1x2) 约超高 (3x3) 一半耗时，高 (2x2) 三分之二，极致 (9x3) 噪点最少、耗时约两倍。");
        MAP.put("Fine moving grain in dark scenes, like a camera at night.", "暗场景中的细密动态颗粒，像夜间相机。");
        MAP.put("For a strong PC: every corpse in view, within the distance above, is a 3D model, however many lie there, in place of Most 3D corpses. The posed corpses' pool still bounds them, about 1.2 MiB a corpse: raise its cap (below) for a big pile.", "适合高配:视野内、上述距离内的所有尸体都用 3D 模型，无论有多少具，替代「最多 3D 尸体」。仍受姿态尸体池限制（每具约 1.2 MiB）:尸体堆很大就调高下方上限。");
        MAP.put("For how long after the blade lets go a dragged drop stays put, its water held to the glass.", "雨刷离开后，被拖拽的水滴停留多久（水附着在玻璃上）。");
        MAP.put("For this session: a console line each time the game's fishing changes state (its stage, the gauge, aiming, the action queue, the bobber), to tell where it stood if it sticks.", "本次会话内:游戏钓鱼状态改变（阶段、进度、瞄准、动作队列、浮标）时输出一行控制台日志，卡住时可判断停在哪一步。");
        MAP.put("Frame times, how busy each thread and the GPU are, and what holds the frame rate back, in the top right corner: all of it, one line, the graph alone, or off.", "右上角显示帧耗时、各线程与 GPU 负载、以及帧率受限原因:全部、单行、仅图表、或关闭。");
        MAP.put("Frees about 16 MB of video memory, and as much of the system's commit, a chunk the isometric view has drawn; that view draws them all again when it comes back, and the game stops for a second or so each time. For a graphics card short of memory.", "释放等距视角已绘制区块的约 16 MB 显存及相应系统提交内存；回到等距视角时会全部重绘，每次游戏卡顿约一秒。适合显存不足的显卡。");
        MAP.put("Further than this, one colour for every four squares, a sixteenth of the memory.", "超过该距离时每四格只用一种颜色，内存占用降到十六分之一。");
        MAP.put("Ground truth: XeGTAO's, the more exact, with the way the sky is seen most; smooth only under the TAA. Fast: Intel's ASSAO, cheaper and steady on its own, for playing without the TAA.", "基准:采用 XeGTAO，更精确、天空表现最好；仅在 TAA 下平滑。快速:采用 Intel ASSAO，开销更低且自身稳定，适合不开 TAA 时游玩。");
        MAP.put("Guns with a bipod (Guns of Marz, Gael's Gun Store, VFE M60) put it down by the gun pack's own action when you go prone or rest the gun on something, and fold it when you walk off. The Bipod key in Options > Keybinds toggles it by hand.", "带两脚架的枪（Guns of Marz、Gael's Gun Store、VFE M60）在趴下或架枪时按枪包自身动作展开，走开时收起。也可用「选项 > 按键 > 两脚架」手动切换。");
        MAP.put("Held all the way across a moment, the turn quickens, to turn round faster.", "持续按住一个时刻，转向会加快，便于快速转身。");
        MAP.put("Held, aims as the mouse's right button does, on foot in first and third person; the right stick still turns the view. The game does not see its button then: on LT, that is the game's Shove, which you move to another button in the game's own Options, Controller. With a fishing line out, LT lets line out and RT reels in, whichever button aims.", "按住时等效于鼠标右键瞄准（第一/第三人称步行）；右摇杆仍可转视角。此时游戏看不到该按键:若在 LT 上，那是游戏的「推搡」，可在游戏自身「选项 > 手柄」里改绑。钓鱼放线时 LT 放线、RT 收线，与瞄准键无关。");
        MAP.put("Hides the sidebar's icons while Viewpoint's inventory screen is up (Tab), and shows them again as it closes, as set below.", "Viewpoint 背包界面（Tab）打开时隐藏侧边栏图标，关闭时恢复，详见下方设置。");
        MAP.put("How a column lists its items when the screen first opens and after this changes; the button beside each search switches it.", "界面首次打开及此项改变后，各列列出物品的方式；搜索框旁的按钮也能切换。");
        MAP.put("How a sound's direction is heard. Steam Audio renders each sound for your two ears with a head-related transfer function, so sounds above, below and behind you are told apart; it needs the Headphones output and Valve's files. FMOD's basic panning is the game's own, from left to right. Applies to sounds that start after the change.", "声音方向的听感方式。Steam Audio 用头相关传递函数为双耳渲染，能分辨上下与身后；需要「耳机」输出与 Valve 的音效文件。FMOD 基础声像即游戏自带的左右定位。仅对改动之后开始播放的声音生效。");
        MAP.put("How bright lights inside buildings are: rooms' ceiling lights and lamps indoors (1: as the game sets them). Needs Realistic lights.", "室内灯光的亮度:房间吸顶灯与室内台灯（1 表示与游戏设置一致）。需要开启「真实灯光」。");
        MAP.put("How bright the head lamps are, against a sealed halogen low beam's.", "车头灯亮度（相对密封卤素近光灯）。");
        MAP.put("How bright the image is before the tone curve. The eye's own correction works on top of it.", "色调曲线之前的画面亮度。眼睛的自动适应会叠加在其上。");
        MAP.put("How bright the tail and brake lights are; 0 none.", "尾灯与刹车灯亮度；0 表示不亮。");
        MAP.put("How close two drops join into one: a share of their radii together.", "两滴水滴多近会合并:以两者半径之和的比例表示。");
        MAP.put("How dark the corners of the image go, as a lens darkens them.", "画面四角变暗的程度，如同镜头暗角。");
        MAP.put("How dark the lines are, from a faint pencil to near black.", "线条深浅，从淡铅笔到接近全黑。");
        MAP.put("How dark the screen's columns and panels are. Lower shows more of the world through them; under 0.6 the words cast a shadow to stay readable.", "界面各列与面板的暗度。数值越低越能透出世界；低于 0.6 时文字会加投影以保证可读。");
        MAP.put("How deep the shade is (1: as XeGTAO matches its ray-traced reference, 0: none).", "阴影深度（1 表示与 XeGTAO 的光追基准一致，0 表示无）。");
        MAP.put("How far a lit floor's light bounces, in squares: a wider, smoother bounce for more time.", "受光地面反弹光的范围（格）:范围越大越平滑，耗时越多。");
        MAP.put("How far a pixel's depth may stand off the line through its two neighbours across the march and still be blended with them: past it, an edge. A plane seen at a slant is none.", "像素深度偏离相邻两像素连线多少以内仍与之混合:超出即为边缘。倾斜观察的平面不参与。");
        MAP.put("How far a running drop runs between two of the small drops it leaves behind it.", "流动水滴每留下两颗小水滴之间跑过的距离。");
        MAP.put("How far above its usual height the camera stands, in every state (squares; below 0, lower). The camera still looks where you look, so the character sits lower on the screen.", "相机相对其常规高度的抬升（格；小于 0 则降低）。相机仍看向你的视线方向，因此角色在屏幕上位置更低。");
        MAP.put("How far ahead of the rubber a dragged drop rides, against its radius.", "被拖拽的水滴领先雨刷多少（相对其半径）。");
        MAP.put("How far ahead the sound is mixed: the shorter, the sooner a sound is heard after what makes it, the more a slow or busy computer may crackle. Takes effect when the game starts next.", "声音提前混音的时长:越短，声音越即时，但慢机器或繁忙时更容易爆音。下次启动游戏生效。");
        MAP.put("How far apart the lanes are.", "车道之间的间距。");
        MAP.put("How far behind the character the camera stands, in every state. The character keeps its size on the screen whatever the third-person field of view.", "相机相对角色后退的距离。无论第三人称视野如何，角色在屏幕上的大小不变。");
        MAP.put("How far below level the head lamps point, in degrees: higher brings the bright part of the beam on the road nearer the car. Real low beams are aimed about half a degree to a degree down.", "车头灯向下的角度（度）:数值越大，路面上的亮区越靠近车身。真实近光灯通常下倾约 0.5 到 1 度。");
        MAP.put("How far each drop's drawn water reaches out to join its neighbours' (its radii): more makes nearby drops look like one body of water. Every pane's water.", "每颗水滴绘制的水体向外延伸与相邻水滴相接的范围（以半径计）:越大，邻近水滴越像一整片水。作用于所有玻璃。");
        MAP.put("How far from the eye they are gone.", "距离视点多远处完全消失。");
        MAP.put("How far from the eye they start to fade out: further off the depth is too coarse for them and stripes flat ground, and the shadow maps hold that detail.", "距离视点多远开始淡出:更远处深度精度不足会在地面上产生条纹，那部分改由阴影贴图表达。");
        MAP.put("How far from the player a corpse may be a 3D model. The chance of a corpse being a model falls with its distance from the player's feet, and over its last squares (Fade band) the models dissolve to the flat pictures. At most 40: the ring of chunks the models are drawn in.", "尸体距离玩家多远以内可用 3D 模型。越远概率越低，最后一段（淡出带）模型会溶解为平面贴图。最多 40:模型所在区块环的范围。");
        MAP.put("How far in front of an obstacle the muzzle starts giving way.", "枪口在障碍物前多远开始让步。");
        MAP.put("How far in front of your eye the gun sits when aiming down sights. Higher = smaller front sight, more of the target visible and less of your hands near the camera, but past about 1.3 the arms stretch to reach. Pistols are not affected. Does not change where you hit.", "开镜时枪械距眼睛多远。数值越大准星越小、目标可见更多、眼前的手更少；超过约 1.3 手臂会明显拉伸。手枪不受影响。不影响命中位置。");
        MAP.put("How far round a point its occluders are looked for, against the default (about a square and a half): wider, softer shade from larger things.", "在某点周围多大范围搜索遮挡物（相对默认约 1.5 格）:越大，大型物体产生的阴影越柔和。");
        MAP.put("How far round you the grass stands at its full number of blades.", "你周围多远内草保持完整密度。");
        MAP.put("How far the grass reaches against the quality's, at most 120 squares: past the world the game keeps loaded round you (about 50 squares) it grows from the map's files. Farther off the grass is the ground's colour, painted as the blades make it.", "草的覆盖范围（相对画质档，最多 120 格）:超出游戏在你周围保持加载的范围（约 50 格）后，草由地图文件生成。更远处以地面颜色表现草的效果。");
        MAP.put("How far the gun pulls back and rises when it meets something.", "枪械命中物体后回收与上抬的幅度。");
        MAP.put("How far the left wiper reaches from its pivot: a share of the windscreen's width. A blade longer than the windscreen is high stops short of upright, its tip under the top.", "左雨刷从支点伸出的长度:占挡风宽度比例。若长于挡风高度，则刮不到竖直位置，刷尖停在顶部下方。");
        MAP.put("How far the night turns blue and grey as your eyes adapt to the dark, while lamps keep their colour (1: as the eye's rods do it, 0: none).", "眼睛适应黑暗时夜色偏蓝灰的程度，灯光仍保留本色（1 模拟视杆细胞效果，0 表示无）。");
        MAP.put("How far the right stick moves before the view turns: raise it if the view drifts with the stick let go.", "右摇杆移动多少才转视角:松手后视角仍漂移就调高此项。");
        MAP.put("How far the right wiper reaches, the same way.", "右雨刷的伸出长度，含义同上。");
        MAP.put("How far the view is taken from flat (0.1) towards the full Panini projection (1).", "视角从平面 (0.1) 过渡到完整 Panini 投影 (1) 的程度。");
        MAP.put("How far the water has waves, reflections and depth. Loaded: only the area near you. Shells: also the nearer distant land. All: also the farthest distant land. The other water shows its map colour.", "水面有多远具备波浪、反射与深度。已加载:仅你附近的区域。外壳:还包括较近的远景陆地。全部:包括最远的远景陆地。其余水面显示地图颜色。");
        MAP.put("How far the wind bends the blades against its own.", "风力让草叶弯曲的幅度（相对其自身值）。");
        MAP.put("How fast drops gather the fine rain round them against their own.", "水滴收集周围细雨的速度（相对其自身值）。");
        MAP.put("How fast it is drawn to it.", "被绘制到该处的速度。");
        MAP.put("How fast the blades sway in the wind against their own.", "草叶随风摆动的速度（相对其自身值）。");
        MAP.put("How fast the blades thin out past that: 2 keeps as many on the screen far off as near, less keeps more far off. The blades left are wider, to cover the ground as the rest did.", "超过该距离后草叶稀疏的速度:2 表示屏上远近密度相同，更小则远处保留更多。剩余草叶会加宽以覆盖地面。");
        MAP.put("How fast the right stick turns the view across, pushed all the way, in first and third person. While aiming, Aim sensitivity (Controls, Third person) scales it.", "右摇杆推到底时横向转视角的快慢（第一/第三人称）。瞄准时由「瞄准灵敏度」（操控 → 第三人称）缩放。");
        MAP.put("How fast the right stick turns the view up and down, pushed all the way.", "右摇杆推到底时俯仰转视角的快慢。");
        MAP.put("How fast the rivulets run against the car's speed.", "细水流的速度（相对车速）。");
        MAP.put("How fast the view turns while aiming, on top of the zoom's own: 1 keeps a turn the same across the screen however far the view is zoomed in. A pad's stick takes it in first person too.", "瞄准时转视角的快慢（在倍率之上）:1 表示无论放大多少，屏幕上的转向手感一致。第一人称下同样作用于手柄摇杆。");
        MAP.put("How fast they run at the most.", "其最高速度。");
        MAP.put("How large the line's tension gauge is, left of the crosshair while the line is out: 1 is the game's own gauge's size on a 1080p screen, and it grows with a larger screen.", "鱼线张力表的大小（放线时显示在准星左侧）:1 为 1080p 下游戏自带尺寸，屏幕更大时随之放大。");
        MAP.put("How light the image is after the tone curve, for a screen darker or lighter than the one the look was set on. The exposure above works before the curve and changes how the highlights roll off; this does not.", "色调曲线之后的画面亮度，用于屏幕比设定时更亮或更暗的情况。上方曝光作用在曲线之前并影响高光滚降；此项不会。");
        MAP.put("How long a cell the blade wiped takes to bead again at full rain, on the windscreen.", "满雨量时，挡风玻璃上被雨刷刮过的区域重新布满水珠所需时间。");
        MAP.put("How long a dragged drop keeps its way once the blade slows or turns.", "雨刷减速或转向后，被拖拽的水滴保持原轨迹的时长。");
        MAP.put("How long a stroke up and back takes, for both wipers, at every rain.", "两个雨刷一次上行并复位的耗时，各雨量下一致。");
        MAP.put("How long an arc is along the sweep.", "刀光弧沿扫掠方向的长度。");
        MAP.put("How long an arc lasts after the blade passed.", "刀片经过后刀光弧的存留时长。");
        MAP.put("How long the camera takes to move between the isometric view and first or third person; 0 switches at once.", "相机在等距视角与第一/第三人称之间移动的耗时；0 为立即切换。");
        MAP.put("How long the game's picture and Viewpoint's dissolve into each other at the isometric end of the switch.", "切换回等距视角一端时，游戏画面与 Viewpoint 画面互相溶解的时长。");
        MAP.put("How long they rest at the foot between strokes in heavy rain.", "大雨时雨刷在底部两次挥动间的停顿。");
        MAP.put("How long they rest between strokes in a drizzle.", "细雨时雨刷两次挥动间的停顿。");
        MAP.put("How long they rest between strokes in rain.", "中雨时雨刷两次挥动间的停顿。");
        MAP.put("How long your character's animation pauses when a melee blow lands, so the blow has weight. The time is made up at once after, so attacks last as long as without it. 0 turns it off.", "近战命中时角色动画的停顿，使打击更有分量。停顿时间会立即补回，攻击总时长不变。0 表示关闭。");
        MAP.put("How many of the nearest cars' headlights cast shadows: what stands in a car's beams (people, zombies, other cars, fences) darkens the road behind it, and its beams in the air are cut by it. Your own car first; a car further off has a smaller shadow map, drawn less often.", "最近多少辆车的车灯投射阴影:光束中的人、丧尸、车辆、围栏会在其后路面留下阴影，空中的光柱也会被切断。优先本车；更远的车阴影贴图更小、更新更少。");
        MAP.put("How many times a second the game updates its world while the fixed tick is on.", "开启固定步长时，游戏每秒更新世界的次数。");
        MAP.put("How much a melee swing moves the camera, and how hard a blow jolts it when it lands, in first and third person.", "近战挥击带动相机的幅度，以及命中时的震动强度（第一/第三人称）。");
        MAP.put("How much a shot kicks the camera, in first and third person. Where the shot goes does not change.", "射击带动相机的幅度（第一/第三人称）。不影响命中位置。");
        MAP.put("How much a shot kicks the gun and the arms that hold it, in first and third person. Where the shot goes does not change.", "射击带动枪械与手臂的幅度（第一/第三人称）。不影响命中位置。");
        MAP.put("How much colour your eyes keep in the dark once they are used to it: the eye's night cells see no colour. 0: the dark all grey; 1: its colour kept.", "眼睛适应黑暗后仍保留的颜色:人眼暗视觉本无颜色。0 为全灰，1 为保留颜色。");
        MAP.put("How much farther than in the isometric view a weapon's ranges reach in first and third person: its best range, how its hit chance falls off past it, and the point blank. The isometric view shows distances short, and the game's ranges are made for it. 1 is the game's own.", "第一/第三人称下武器射程相对等距视角的补偿倍数:最佳射程、超出后的命中衰减、以及贴脸距离。等距视角会把距离显示得更近，游戏射程也据此设定。1 表示与游戏一致。");
        MAP.put("How much further out over the shoulder the camera stands (squares; below 0, nearer the middle). It follows the shoulder when the camera swaps.", "相机过肩外移的距离（格；小于 0 更靠中间）。换肩时相机随之切换。");
        MAP.put("How much light the lit floors round about bounce onto walls, ceilings and things (1: as the light model gives it, 0: none). Only with global illumination on.", "周围受光地面把光反弹到墙壁、天花板和物体上的强度（1 为光照模型值，0 为无）。需开启全局光照。");
        MAP.put("How much light the sky gives before sunrise and after sunset. 1: a real twilight, about half of daylight as the sun rises, still enough to see by when it is 6 degrees down (about half an hour before sunrise and after sunset), dark an hour and a quarter out. 0: Viewpoint's sky alone (very dark around sunrise and sunset). 2: the game's own long twilight (light for over three hours either side).", "日出前与日落后天空的光量。1 为真实晨昏:日出时约为白天一半，太阳低于地平 6 度（日出前/日落后约半小时）仍能视物，一小时一刻后转暗。0 为仅 Viewpoint 天空（日出日落前后很暗）。2 为游戏自带的长晨昏（两侧各三个多小时有光）。");
        MAP.put("How much memory the game may use. The game takes it as it starts.", "游戏可用的内存上限。启动时生效。");
        MAP.put("How much more the glass holds it then, against a drop at rest.", "此时玻璃对水滴的附着程度（相对静止水滴）。");
        MAP.put("How much of a bigger drop's way one beside it takes, so they move together.", "相邻小水滴跟随大水滴轨迹的比例，使它们一起移动。");
        MAP.put("How much of a zombie's movement across the view the view follows while the crosshair is on it: 0 none, 1 all of it. A zombie standing still is never pulled to.", "准星在丧尸身上时，视角跟随其横向移动的程度:0 不跟随，1 完全跟随。静止的丧尸不会吸引视角。");
        MAP.put("How much of the flashlight's light the surfaces it lands on bounce back round about (1: as the light model gives it, 0: none). Only with global illumination on.", "手电照到的表面向四周反弹的光量（1 为光照模型值，0 为无）。需开启全局光照。");
        MAP.put("How much of the flashlight's light the walls, floors and things it lands on bounce back into the room round about. 0: none.", "手电照到的墙、地面与物体把光反弹回房间的强度。0 表示无。");
        MAP.put("How much slower the right stick turns the view while the crosshair is over a zombie's body, so it stops on it: 0 not at all.", "准星在丧尸身上时右摇杆转视角的减速幅度，便于停住；0 表示不减速。");
        MAP.put("How much the camera moves on its own, in first and third person: how much a melee swing, a blow, a shot, a landing or a hit taken kick and shake it, and in third person the drift of a camera held by hand, the bob of the steps and the lean into turns. Off keeps the camera still. Lower it if the motion makes you feel unwell.", "相机自身运动的总强度（第一/第三人称）:挥击、打击、射击、落地、受击的带动与晃动，以及第三人称下手持相机的漂移、走路起伏与转向倾斜。关闭则相机保持稳定。若感到不适可调低。");
        MAP.put("How much the camera shakes when you are hit, bitten or land hard, and with explosions and thunder near, in first and third person.", "受击、被咬、重落地以及附近爆炸与雷声时相机的晃动幅度（第一/第三人称）。");
        MAP.put("How much the deepest shade is filled with flat ink, as a comic's inker fills it.", "最暗部被平涂墨色填充的程度，像漫画上墨。");
        MAP.put("How much the field of view changes: wider when running, narrower when aiming.", "视野变化的幅度:奔跑时变宽，瞄准时变窄。");
        MAP.put("How much the light falls in steps, shade, half light and full light, as an illustrator lays it, and how much the edges of people and cars catch the light behind them. 0: the light as it falls.", "光照被分成暗、半亮、全亮几档的程度，如同插画打光；以及人与车辆边缘被背光勾边的强度。0 表示按真实光照衰减。");
        MAP.put("How much the light falls into a few flat bands of brightness, as a colourist lays it. 0: smooth.", "光照被压成几档平涂亮度的程度，如同上色师处理。0 表示平滑过渡。");
        MAP.put("How much the upscaler sharpens the image it makes: 0 not at all, 0.25 as FSR 1 does, 1 the most. FSR 3 sharpens in its own pass, DLSS and XeSS through AMD's sharpening after them.", "升采样器对成品的锐化强度:0 不锐化，0.25 相当于 FSR 1，1 最强。FSR 3 自带锐化通道，DLSS 与 XeSS 通过后续的 AMD 锐化实现。");
        MAP.put("How much work the view inside scopes and sights costs. All levels only draw the part of the world the lens shows. High: everything, every frame (rain and object outlines in the lens too). Mid: no rain particles or outlines inside the lens. Low: like Mid, but the lens picture is redrawn every other frame (can lag a little when turning fast).", "镜内画面的开销。各档都只绘制镜片显示的那部分世界。高:全部内容每帧绘制（镜内也有雨滴与描边）。中:镜内不绘制雨滴与描边。低:同中，但镜内画面隔帧重绘（快速转向时略有延迟）。");
        MAP.put("How opaque the aim ring is. 1 is fully opaque.", "瞄准环的不透明度。1 为完全不透明。");
        MAP.put("How sharply a pixel goes into shadow as an occluder nears its depth.", "遮挡物接近该像素深度时转入阴影的锐利程度。");
        MAP.put("How sights are raised with a firearm. DayZ style: click the aim button (right mouse) to bring the sights up and keep them there, click again to lower them; hold it for ordinary hip aiming. Leave the game's own 'Toggle aim' option off with it.", "持枪抬镜的方式。DayZ 风格:点一下瞄准键（鼠标右键）抬起并保持，再点一下放下；按住则为普通腰射。使用该模式时请关闭游戏自带的「切换瞄准」选项。");
        MAP.put("How solid the ring is: lower lets the water show through it.", "水环的实心程度:越低越能透出水面。");
        MAP.put("How strongly the head lamps' beams show in the air, in dust, mist and rain; 0 none.", "车灯光柱在空气、尘埃、雾与雨中的可见强度；0 表示不显示。");
        MAP.put("How strongly the sun's and the moon's light shows in a room's dusty air, from each window or open door it comes in by.", "日月光在室内尘埃空气中的可见强度（按其射入的每扇窗与敞开门口计算）。");
        MAP.put("How strongly the sun's and the moon's light shows in a room's dusty air, from each window or open door it comes in by, as a shaft from the opening to where it lands. 1 is a shaft that reads against the wall behind it.", "日月光在室内尘埃空气中形成的可见光柱强度（从开口到落点）。1 表示在背景墙上清晰可辨。");
        MAP.put("How strongly the weather colours the picture.", "天气对画面的调色强度。");
        MAP.put("How tall the relief stands, times the real ground's. The roads' and banks' limits hold at the height the relief was built at: rebake to hold them at another.", "地形起伏的高度（相对真实地面的倍数）。道路与堤岸的限制按烘焙时的高度成立:改高度需重新烘焙。");
        MAP.put("How the grass, bushes and small plants round you stand: one card turned to face you, or two or three planes crossed through the plant, which look the same from every side.", "周围草、灌木与小植物的呈现方式:单面片朝向你，或两三张面片交叉穿透植株（各方向观感一致）。");
        MAP.put("How the scene's light becomes the screen's. ACES: the film industry's curve, contrast through the middle tones and a long roll into white, Somber's own. Filmic: vivid's, with more contrast. Neutral: Khronos PBR Neutral, colours as the art has them. Tony: Tony McMapface, soft and natural, the brightest going white as the eye sees them. Uncharted 2: John Hable's film curve, a long soft roll into white, bright colours paler. GT: Gran Turismo's curve, a straight middle between a toe and a shoulder, which keeps the shadows richer than the film curves do.", "场景光照如何转为屏幕画面。ACES:影视行业曲线，中间调有对比、向白过渡长，Somber 采用。Filmic:vivid 的曲线，对比更强。Neutral:Khronos PBR Neutral，颜色贴近美术原意。Tony:Tony McMapface，柔和自然，最亮处按人眼观感压向白色。Uncharted 2:John Hable 的电影曲线，向白过渡长而柔，亮色偏淡。GT:Gran Turismo 曲线，中段近乎直线，暗部比电影曲线保留更多细节。");
        MAP.put("How the scene's light becomes the screen's. Filmic: vivid's, with contrast. Neutral: Khronos PBR Neutral, colours as the art has them. Tony: Tony McMapface, soft and natural, the brightest going white as the eye sees them. Uncharted 2: John Hable's film curve from Uncharted 2, a long soft roll into white, bright colours paler.", "场景光照如何转为屏幕画面。Filmic:vivid 曲线，带对比。Neutral:Khronos PBR Neutral，颜色贴近美术原意。Tony:Tony McMapface，柔和自然，最亮处按人眼观感压向白色。Uncharted 2:《神秘海域2》的 John Hable 电影曲线，向白过渡长而柔，亮色偏淡。");
        MAP.put("How the turn grows as the stick goes over: 1 evenly, higher for finer aim near the centre and the full speed at the rim.", "摇杆推离中心时转向增益的变化:1 为均匀，数值越大中心附近越精细、边缘保持全速。");
        MAP.put("How thick each pixel is taken to be when it shades another: a share of the depth left before the far plane. Thicker joins more shadows and lets thin things cast thicker ones.", "像素给其它像素投影时被视为的厚度（以距远平面的深度比例计）。越厚，阴影越容易相连，细薄物体的投影也更厚。");
        MAP.put("How thick the ring's line is, however far off it lies, in pixels on a 1080p screen (more on a larger one), with a thin dark edge round it so it stands out on bright water.", "水环线条的粗细（不论远近，按 1080p 像素计，屏幕更大则更粗），外缘有一圈细暗边以便在亮水面上看清。");
        MAP.put("How well your eyes see in the dark once they are used to it: the dark lifted towards a dim grey, without its colour, sharpness or detail, which no setting brings back. Your eyes take time to get used to the dark, and a bright light undoes it. Cat's Eyes doubles it. 0: the night as black as its light.", "眼睛适应黑暗后的夜视能力:夜色被提亮为暗灰，但无颜色、锐度与细节，任何设置都无法恢复。适应需要时间，强光会打断。夜猫子特质使其翻倍。0 表示与光照一致的纯黑夜晚。");
        MAP.put("How wide a head lamp's beam spreads each side of its axis. The game's own lamps spread 41 degrees, the cone of its old square light.", "车头灯光束在轴线两侧的张开角度。游戏自带灯具张角为 41 度（旧版方形光照的锥形范围）。");
        MAP.put("How wide an arc is when fresh.", "刀光弧刚出现时的宽度。");
        MAP.put("How wide the lines are. They thin out with distance at any width.", "线条宽度。任何宽度都会随距离变细。");
        MAP.put("In a room from which no window or doorway in view reaches the outside, leaves out the whole distant world at once, before any of it is measured: the rooms' culling has the answer already. Off: each piece of it is left out on its own, or not at all.", "当可见的窗与门都看不到室外时，直接整体剔除远景世界，无需逐项测算:房间剔除已给出答案。关闭:逐块剔除或完全不剔除。");
        MAP.put("In a vehicle: how far above its usual height the camera stands (squares).", "载具内:相机相对常规高度的抬升（格）。");
        MAP.put("In a vehicle: how far behind it the camera stands. The vehicle keeps its size on the screen whatever the third-person field of view.", "载具内:相机在其后多远。无论第三人称视野如何，载具在屏幕上的大小不变。");
        MAP.put("In a vehicle: how far to the right of the middle the camera stands (squares; below 0, to the left).", "载具内:相机相对中线右偏多少（格；小于 0 为左偏）。");
        MAP.put("In first and third person, the game's sidebar at the screen's left: what the hands hold and its buttons. Off hides it whole; on shows the parts below that are on, moved up together. The isometric view always has the game's own.", "第一/第三人称下，屏幕左侧的游戏侧边栏:手持物品与各按钮。关闭则整体隐藏；开启则显示下方已启用的部分并上移合并。等距视角始终使用游戏原版。");
        MAP.put("In first and third person, the inventory key, Tab and the sidebar's bag and heart open Viewpoint's inventory screen and its character tabs. Off: the game's own inventory, loot and character windows, with the cursor freed for them, for a mod that changes those windows.", "第一/第三人称下，背包键、Tab 以及侧边栏的背包与心形图标会打开 Viewpoint 的背包界面及其角色标签页。关闭:改用游戏自带的背包、战利品与角色窗口并释放光标，适合会改这些窗口的模组。");
        MAP.put("In first and third person, what you aim at within reach is outlined and its items listed beside the crosshair. Off: the game's own loot window only.", "第一/第三人称下，把触及范围内瞄准的目标描边并在准星旁列出其物品。关闭:仅使用游戏自带的战利品窗口。");
        MAP.put("In first person, how far the view may turn each way from where the body faces while the free look's key is held. In third person the view goes all round.", "第一人称按住自由观察键时，视角相对身体朝向可转的角度。第三人称可绕全身。");
        MAP.put("In first person, the main thread's time a frame for taking the chunks the game has read into its world, which it otherwise takes several at once as the player walks into new ground: a long frame, which the world shows as a stop. A chunk not taken in yet is drawn by the far world.", "第一人称下，每帧在主线程把游戏已读取的区块并入世界的时间；否则玩家走入新区域时会一次并入多个区块，造成明显卡顿。尚未并入的区块由远景世界绘制。");
        MAP.put("In furniture mode, what the furniture tool needs to pick up, scrap or repair what you aim at: its tools, skill and parts, and what stops it. Off: the menu alone. The game's own furniture window, while its tool is out, stays as it is.", "家具模式下，家具工具拾取、拆解或修理目标所需:工具、技能、零件，以及受阻原因。关闭:只显示菜单。家具工具激活时游戏自带的家具窗口不受影响。");
        MAP.put("In the game's debug mode (-debug) only: a free camera the world is centred on; what is drawn, its detail and the sound follow it.", "仅在游戏调试模式 (-debug) 下:以自由相机为中心，绘制内容、细节与声音均随之移动。");
        MAP.put("In third person the character's head turns to where you look, standing and walking.", "第三人称下，站立与行走时角色头部会随你的视线转动。");
        MAP.put("In third person, draws the head look over the character and writes every pose's numbers into Zomboid/viewpoint-camera-traces, to find what turns the head wrong.", "第三人称下在角色身上绘制头部朝向，并把各姿势数值写入 Zomboid/viewpoint-camera-traces，用于排查头部转向异常。");
        MAP.put("In third person, raising the sights switches to first person and lowering them switches back. Hip fire stays in third person.", "第三人称下抬镜切到第一人称，放下切回。腰射仍保持第三人称。");
        MAP.put("Ink: a deep blue-black that keeps a little of the colour under it. Black: pure black lines.", "墨色:带一点底色的深蓝黑。黑色:纯黑线条。");
        MAP.put("Intel's ASSAO: Medium and High read a pixel in four at half the size each way, with 3 and 5 pairs of samples; Ultra every pixel with 5, Extreme every pixel with 12.", "Intel ASSAO:中与高把像素按四分之一大小读取，分别取 3 与 5 对样本；超高每像素 5 个，极致每像素 12 个。");
        MAP.put("Iron sights, red dots, holo sights and other unmagnified sights. 1.0 = no zoom.", "机瞄、红点、全息等无放大瞄具。1.0 表示不放大。");
        MAP.put("Its angle at the end of its sweep: 90 upright, more leaning left (never off the glass).", "其扫掠终点角度:90 为竖直，数值更大则更偏左（不会超出玻璃）。");
        MAP.put("Its angle at the end of its sweep.", "其扫掠终点的角度。");
        MAP.put("Keeps the clouds as soft as their resolution draws them, steadier as they move, rather than built up sharp over many frames.", "让云保持其分辨率下的柔软观感、移动时更稳定，而不是多帧累积后变得锐利。");
        MAP.put("Keeps Viewpoint's compiled shaders in the game's cache folder, so the next session loads them in place of compiling them again. A new graphics driver compiles them once more.", "把 Viewpoint 已编译的着色器保存在游戏缓存目录，下次启动直接加载而无需重编译。更换显卡驱动后会再编译一次。");
        MAP.put("Leaves out the distant land, its trees and the shell's blocks that the loaded world in front of them hides, which indoors is almost all of it. Off: only what falls outside the view is left out.", "剔除被前方已加载世界遮挡的远景陆地、树木与外壳方块（室内时几乎全部）。关闭:仅剔除视野之外的部分。");
        MAP.put("Leaves out the zombies, people and things that the loaded world in front of them hides, from some way off: nearer, one coming round a corner would show a frame late. Their shadows stay.", "剔除一定距离外被前方已加载世界遮挡的丧尸、人物与物体；距离过近时，从拐角出现会晚一帧。其阴影仍保留。");
        MAP.put("Lines drawn round shapes and along their creases, as a comic's inker draws them, fading into the haze with distance.", "沿形体轮廓与褶皱绘制的线条，如漫画上墨，随距离没入雾霭。");
        MAP.put("Low: fine beads of rain on the windows and the cars' glass. Medium: drops that cling, run down the glass, merge and wipe the beads off their way. High: lamps and torches shine in them, and rivulets run down the walls. Ultra and Extreme: more drops. True to size: from afar they are a faint wet sheen.", "低:窗与车窗上有细密水珠。中:水珠附着、顺玻璃流下、合并并擦去沿途水珠。高:灯光与手电在其上反光，墙上也有细水流。超高与极致:水滴更多。真实尺寸:远处表现为淡淡的湿润光泽。");
        MAP.put("Lower = snappier, higher = softer movement into and out of the compressed pose.", "越低越干脆，越高进入/离开压缩姿势越柔和。");
        MAP.put("Lowers the muzzle a little while you hold a firearm without aiming. Off by default.", "持枪未瞄准时略微压低枪口。默认关闭。");
        MAP.put("Makes the renderer, its shaders and the game's model shaders while the game loads a save, so the first switch to first or third person is quick. A bar at the bottom left shows the progress.", "读档时预先生成渲染器、着色器与游戏模型着色器，使首次切换第一/第三人称更快。左下角显示进度条。");
        MAP.put("Marks the ground round you that can be worked (a furrow dug, grass removed or scythed, dung raked, a grave dug, dirt taken), and the loot menu offers what can be done to the square aimed at.", "标出周围可作业的地面（挖沟、除草或割草、耙粪、挖坟、取土），拾取菜单也会列出对瞄准格子可执行的操作。");
        MAP.put("Models near the camera, or between it and your character, dissolve, so they never hide your character. Off keeps them solid: they can hide your character, and the camera can cut into them. Your own character still dissolves where the camera comes inside it.", "离相机近或挡在相机与角色之间的模型会溶解，避免遮住角色。关闭则保持实心:可能遮住角色，相机也可能切进模型内部。相机进入自身角色时该角色仍会溶解。");
        MAP.put("Moves the camera's near clip plane from 5 cm to about 1 cm while sights are up, so the receiver and stock right under your eye are drawn instead of being cut open.", "抬镜时把相机近裁剪面从 5 厘米移到约 1 厘米，使贴近眼睛的机匣与枪托正常绘制而不被剖开。");
        MAP.put("Moves the head lamps forward, out of the front, or below 0 back into it.", "车头灯向前移动；小于 0 则向后收。");
        MAP.put("Moves the head lamps out to the sides, or below 0 in towards the middle.", "车头灯向两侧移动；小于 0 则向中间靠。");
        MAP.put("Moves the head lamps up, or below 0 down.", "车头灯向上移动；小于 0 则向下。");
        MAP.put("Moves the loot menu down (more) or up (less) from its place beside the crosshair, as a share of the screen's height. It stays on the screen.", "把拾取菜单相对准星旁的位置下移（数值越大）或上移，按屏幕高度比例计，始终保持在屏内。");
        MAP.put("Moves the loot menu right (more) or left (less) from its place beside the crosshair, as a share of the screen's width. It stays on the screen.", "把拾取菜单相对准星旁的位置右移（数值越大）或左移，按屏幕宽度比例计，始终保持在屏内。");
        MAP.put("Moves the tail and brake lights back, out of the rear, or below 0 forward into it.", "尾灯与刹车灯向后移动；小于 0 则向前。");
        MAP.put("Moves the tail and brake lights out to the sides, or below 0 in towards the middle.", "尾灯与刹车灯向两侧移动；小于 0 则向中间靠。");
        MAP.put("Moves the tail and brake lights up, or below 0 down.", "尾灯与刹车灯向上移动；小于 0 则向下。");
        MAP.put("Multiplies every weapon's raise time (higher = faster).", "所有武器的抬枪时间倍率（越大越快）。");
        MAP.put("Multiplies the zoom of 2x/4x/8x scopes. 1.0 = the scope's own number against Viewpoint's wide view; 1.5 = a 4x scope zooms 6x.", "2/4/8 倍镜的倍率乘数。1.0 表示镜身标称值对应 Viewpoint 宽视野；1.5 表示 4 倍镜放大到 6 倍。");
        MAP.put("Nearer than this the far world's ground and walls have a colour for every square; further, one for every two squares, a quarter of the memory.", "在此距离内，远景地面与墙体每格一种颜色；更远处每两格一种，内存占四分之一。");
        MAP.put("Nearer, a zombie is posed by the game: its head turned, what it holds. Farther, its animations, each baked once, are blended on the graphics card as the game blends them, and the game does not work out its skeleton.", "较近时由游戏给丧尸摆姿势（转头、手持物）。更远时，各动画烘焙一次后在显卡上按游戏方式混合，游戏不再计算其骨骼。");
        MAP.put("Off grows a candidate blade for every place round you and throws away the ones the view cannot reach; on dispatches only the ground the view does reach. The picture is the same either way: this is for measuring what the dispatch costs.", "关闭时会为你周围的每个位置生成候选草叶再丢弃视野外的；开启时只派发视野能到达的地面。两种方式画面相同，此项用于测量派发开销。");
        MAP.put("On, a corpse is considered for a 3D model only while it lies on screen (with a small margin): any other keeps its picture with nothing done for it each frame, and one posed lately takes its pose back as it comes into view. Off, to compare: every corpse within the distance, all round the player.", "开启时，只有尸体在屏内（含少量余量）才考虑使用 3D 模型:其余尸体保持平面图，每帧不做任何处理，刚摆过姿势的进入视野时恢复姿势。关闭用于对比:玩家周围该距离内所有尸体都参与。");
        MAP.put("On: the lines fade into the fog and haze with the land. Off: they keep their strength through it.", "开启:线条随景物一同没入雾霭。关闭:线条保持强度穿透雾气。");
        MAP.put("Opens the inventory screen on what the loot menu shows, with the cursor free; again to close it.", "按拾取菜单所指向的内容打开背包界面并释放光标；再按一次关闭。");
        MAP.put("Other players' guns also give way at walls, doors and furniture on your screen. Worked out on your own game from what it already knows about them (no network traffic, nothing needed on the server); players who run this mod see yours the same way. Up to 12 nearest aiming players within 40 tiles.", "你屏幕上其他玩家的枪也会在墙、门与家具处让步。完全由本机依据已有信息计算（无网络流量，服务端无需支持）；装了本模组的玩家也会同样看到你的枪。最多处理 40 格内最近的 12 名瞄准中的玩家。");
        MAP.put("Outlines whatever the loot menu aims at: objects, the ground's items, bodies, vehicles, animals and players. Off: no outline; the menu still lists them. Ground mode has a switch of its own.", "给拾取菜单瞄准的目标描边:物体、地面物品、尸体、载具、动物与玩家。关闭则不描边，菜单仍会列出。地面模式有独立开关。");
        MAP.put("Over the windscreen as measured (outlined orange): each wiper's swept glass tinted (the left one blue, the right one orange), its blade outlined parked and at its sweep's end, the arc its tip draws and its pivot marked.", "按实测挡风玻璃叠加显示（橙色描边）:各雨刷扫过的区域着色（左蓝右橙），刷片在停放位与扫掠终点描边，并标出刷尖轨迹弧与支点。");
        MAP.put("Playing alone, a pad's button or stick makes it the player's, and a key or the mouse gives the player back to the keyboard and mouse. Turn it off for split-screen with the keyboard: a second pad's press then joins as the game's.", "单人游玩时，按手柄任意键或摇杆即切换为该玩家，按键鼠标则切回键鼠。用键盘分屏时请关闭:否则按第二个手柄会被游戏当作加入分屏。");
        MAP.put("Pushing the right stick up looks down, and down looks up.", "右摇杆上推改为向下看，下推改为向上看。");
        MAP.put("Puts each vehicle's lamps on the glass its own model lights for them (found once for each kind of vehicle); off, every lamp stands on the vehicle's box, moved by the sliders below.", "把每辆车的车灯放在其模型自带的灯罩玻璃上（每种车型只探测一次）；关闭则所有灯都挂在车体包围盒上，由下方滑块调整位置。");
        MAP.put("Puts the item selected down where you aim, as the game's Place Item does: one on the ground is moved there without taking it first.", "把选中的物品放到瞄准处，等同于游戏的「放置物品」:地上的物品可直接移动，无需先拾取。");
        MAP.put("Realistic: blades that bend, fall over at their tops and catch the light as real grass. Painted: tufts of the game's own grass art, which sway the same way and soften into the distance where a blade thinner than a pixel flickers.", "真实:草叶会弯折、顶端下垂并按真实草叶受光。手绘:使用游戏自带草丛贴图，摆动方式相同，并在远处柔化以避免亚像素草叶闪烁。");
        MAP.put("Rest the gun's handguard on a table, counter, low wall, fence or window sill with the sights up, or go prone (Viewpoint Advanced Movement), and the sway settles; with a deployed bipod it all but stops and the recoil is halved. Needs 'Physical weapon collision' on for surfaces.", "抬镜时把护木搭在桌、台面、矮墙、栏杆或窗台上，或趴下（需 Viewpoint Advanced Movement），晃动会稳定下来；展开两脚架后几乎不晃且后坐减半。需要开启「武器物理碰撞」才能架在物体上。");
        MAP.put("Rolls the loot of the containers a chunk loads with over the next frames, nearest first, not all in the frame it loads: no hitch as you walk or drive into a town. Single player only.", "区块加载时容器内的战利品在随后几帧内逐步生成（由近及远），而不是全挤在加载那一帧:走入或驱车进入城镇不再卡顿。仅单人有效。");
        MAP.put("Scales the view climb and the visible gun kick. Above 0, Viewpoint's own camera recoil and weapon recoil are replaced by this mod's.", "缩放视角上抬与可见的枪械后坐。大于 0 时，Viewpoint 自带的相机后坐与武器后坐由本模组替代。");
        MAP.put("Scopes of 4x and up zoom in steps: an 8x goes 2x / 4x / 8x, a 6x 1.5x / 3x / 6x, a 4x 2x / 4x. Optics registered with their own zoom levels always use them.", "4 倍及以上倍镜按档位变倍:8 倍为 2/4/8，6 倍为 1.5/3/6，4 倍为 2/4。自带变倍档位的瞄具始终使用自身档位。");
        MAP.put("Scopes show their magnified view inside the scope's glass, and red dots / holo sights show the world clearly through their window with the lit reticle, while the rest of the screen, the gun and your hands stay normal. Renders the world a second time while aiming through an optic, so it costs some frame rate. Off: magnified scopes magnify the whole first-person view behind a lens mask. If it ever fails it switches itself off and the classic view is used.", "倍镜的放大画面显示在镜片内，红点/全息瞄具透过窗口呈现清晰世界与发光准星，屏幕其余部分、枪身与双手保持正常。开镜时会把世界再渲染一次，因此会损失部分帧率。关闭:倍镜放大整个第一人称画面并加镜片遮罩。若运行出错会自动关闭并回退经典模式。");
        MAP.put("Seated in a vehicle on a slope, how the first-person view turns with it: its pitch and roll, as a head in the car turns; its pitch alone, the horizon kept level across; or not at all.", "在斜坡上的载具内，第一人称视角如何随车倾斜:同时俯仰与侧倾（如车内人头），仅俯仰（保持水平线），或完全不随动。");
        MAP.put("Separation asks, for each square holding a character next to another, whether a wall, window, door or stairs stands between them; the answers are kept until the game says a chunk around them changed.", "分离判定会询问相邻角色所在格之间是否有墙、窗、门或楼梯；结果会缓存，直到游戏报告周围区块发生变化。");
        MAP.put("Shots from the hip go somewhere inside a cone that depends on the weapon (wide for snipers and machine guns, tight for pistols), grows while moving or running and shrinks with Aiming skill. Aim down the sights to hit at range. Works with Viewpoint True Ballistics. Not added while Viewpoint's own 'Gunplay Rework (0.1.6)' setting is on: its aim ring already spreads hip fire.", "腰射的弹道落在一个与武器相关的锥形范围内（狙击与机枪大、手枪小），移动或奔跑时变大，随瞄准技能提升而收小。远距离请开镜。可与 Viewpoint True Ballistics 配合。若已开启 Viewpoint 的「枪械手感重做 (0.1.6)」，此项不再叠加（其准星环已包含腰射散布）。");
        MAP.put("Shows the dot that marks where you look and aim. The game's Hide all UI also hides it.", "显示标记视线与瞄准位置的中心点。游戏的「隐藏全部 UI」也会隐藏它。");
        MAP.put("Shows the mouse's controls as keys at the screen's bottom left, the most used first (drag, Ctrl+click, double-click and the rest), and every one of them on hovering its ?. Off: that corner is left empty. A controller's button prompts show either way.", "在屏幕左下角以按键形式提示鼠标操作，最常用的在前（拖动、Ctrl+点击、双击等），悬停在问号上可看全部。关闭:该角落留空。手柄按键提示不受影响。");
        MAP.put("Shows the ring round the screen's middle. The crosshair moves only inside this ring, and a smaller ring is a more accurate shot. Off, only the crosshair shows.", "显示屏幕中央的环。准星只在该环内游走，环越小射击越准。关闭:只显示准星。");
        MAP.put("Shows the weapon's measured length, its rear, pivot and muzzle, the probe hit, the obstruction amount and the pose on screen, and logs state changes.", "显示武器实测长度、后端、支点、枪口、探测命中点、受阻程度与屏幕上的姿势，并记录状态变化。");
        MAP.put("Shows your character's 3D model on the Character tab. Off saves drawing it; dropping clothes in its place still wears them.", "在角色标签页显示你的 3D 模型。关闭可省去绘制；把衣服拖到原位置仍然会穿上。");
        MAP.put("Smooths jagged edges. SMAA T2x: SMAA over two frames drawn a quarter of a pixel apart, sharp and steady. TAA+: each frame blended with the ones before, the steadiest and the softest. TAA: the same over fewer frames. TAA + FXAA: TAA over frames FXAA has smoothed. SMAA, FXAA: each frame on its own, edges can still shimmer. Off: none. Off while resolution scaling is on: its upscaler smooths the edges.", "平滑锯齿边缘。SMAA T2x:在两帧间偏移四分之一像素做 SMAA，锐利且稳定。TAA+:每帧与之前若干帧混合，最稳最柔。TAA:相同但参考帧更少。TAA + FXAA:在 FXAA 处理过的帧上做 TAA。SMAA、FXAA:仅单帧处理，边缘仍可能闪烁。关闭:不处理。分辨率缩放开启时若关闭，则由升采样器负责平滑。");
        MAP.put("Smooths jagged edges. TAA+: each frame blended with the ones before, the steadiest and smoothest. TAA: the same over fewer frames. TAA + FXAA: TAA over frames FXAA has smoothed. SMAA T2x: SMAA over two frames drawn a quarter of a pixel apart, sharp and steadier than SMAA for little more. SMAA, FXAA: each frame on its own, sharp, edges can still shimmer. Off: none. Off while resolution scaling is on: its upscaler smooths the edges.", "平滑锯齿边缘。TAA+:每帧与之前若干帧混合，最稳最平滑。TAA:相同但参考帧更少。TAA + FXAA:在 FXAA 处理过的帧上做 TAA。SMAA T2x:两帧间偏移四分之一像素的 SMAA，比 SMAA 更锐更稳且代价略高。SMAA、FXAA:单帧处理，锐利但边缘仍可能闪烁。关闭:不处理。分辨率缩放开启时若关闭，由升采样器负责平滑。");
        MAP.put("Smooths jagged edges. TAA+: each frame blended with the ones before, the steadiest and smoothest. TAA: the same over fewer frames. TAA + FXAA: TAA over frames FXAA has smoothed. SMAA, FXAA: each frame on its own, sharp, edges can still shimmer. Off: none.", "平滑锯齿边缘。TAA+:每帧与之前若干帧混合，最稳最平滑。TAA:相同但参考帧更少。TAA + FXAA:在 FXAA 处理过的帧上做 TAA。SMAA、FXAA:单帧处理，锐利但边缘仍可能闪烁。关闭:不处理。");
        MAP.put("Soft ghosts, a faint halo and a glow where the sun or the moon shines into the view, as a coated film lens makes them.", "日月直射镜头时的柔和鬼影、淡淡光晕与辉光，如同镀膜镜头产生的效果。");
        MAP.put("Squares the real ground is smoothed over before anything is built on it, away from towns: the hills keep their shape.", "城镇之外，真实地面在建造前被平滑的格数:越大山丘越圆缓。");
        MAP.put("Steps the game's furniture tool through the loot menu: pick up, place, rotate, disassemble, repair, then off. The loot menu offers that one thing for the furniture aimed at; in place mode, aimed at the floor, what you carry to put down.", "通过拾取菜单切换游戏的家具工具:拾取、放置、旋转、拆解、修理、关闭。瞄准家具时菜单只提供对应操作；放置模式下瞄准地面则放置携带的物品。");
        MAP.put("Storm clouds darken and drain the sky; the worst storms take on a greenish cast.", "风暴云让天空变暗褪色；最强的风暴会带一点绿色。");
        MAP.put("The 3D grass's blades cast these shadows on one another and the ground, and take them from everything else; off, the grass neither casts nor takes them, and the ambient occlusion and the sun's shadow maps shade it.", "3D 草叶之间以及在地面上互相投影，也接收其它物体的阴影；关闭则草既不投影也不接收，改由环境光遮蔽与太阳阴影贴图表现。");
        MAP.put("The blades a square near you against the quality's.", "你附近每格的草叶数（相对画质档）。");
        MAP.put("The blades' height against the grass's own: a town's lawn, the wild grass, all together.", "草叶高度（相对草自身）:城镇草坪与野外高草统一生效。");
        MAP.put("The blades' width against their own.", "草叶宽度（相对其自身）。");
        MAP.put("The camera moves to the other shoulder when a wall is in the way, and back when it clears. Never while aiming.", "有墙挡住时相机自动换肩，让开后换回。瞄准时不会换。");
        MAP.put("The camera starts and ends the switch far back with this narrow field of view, standing in for the game's flat isometric picture: the narrower, the flatter, and the further back.", "切换开始与结束时相机在远处、以此窄视野等效游戏的平面等距画面:越窄越平、相机越远。");
        MAP.put("The chance a blade's pass, up or down, leaves any arcs: each pass leaves its own, in places of its own.", "每次挥击（上或下）留下刀光弧的概率:每一下各自独立。");
        MAP.put("The chance a second, at full rain, that a free drop lands somewhere on the glass.", "满雨量时每秒有水滴落在玻璃上的概率。");
        MAP.put("The clouds above the low ones, as Horizon Forbidden West draws them: cirrus and veils high up, altocumulus lower, each drifting on the wind at its height. Textured: from images. Procedural: from the clouds' noise.", "低云之上的高层云，参照《地平线:西之绝境》:高空卷云与薄纱，较低的为高积云，各自按所在高度的风向飘移。贴图:使用图像。程序化:使用云的噪声生成。");
        MAP.put("The colour tiles of this type take (Ammunition). None leaves them plain.", "该类物品格子使用的颜色（弹药）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Books and maps). None leaves them plain.", "该类物品格子使用的颜色（书籍与地图）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Equipment). None leaves them plain.", "该类物品格子使用的颜色（装备）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Food and drink). None leaves them plain.", "该类物品格子使用的颜色（食物与饮料）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Materials). None leaves them plain.", "该类物品格子使用的颜色（材料）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Medical). None leaves them plain.", "该类物品格子使用的颜色（医疗）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Tools). None leaves them plain.", "该类物品格子使用的颜色（工具）。选「无」则保持原样。");
        MAP.put("The colour tiles of this type take (Weapons). None leaves them plain.", "该类物品格子使用的颜色（武器）。选「无」则保持原样。");
        MAP.put("The colour your junk's tiles take (Junk items, below), whatever kind of thing each is. None leaves them plain.", "杂物格子使用的颜色（见下方「杂物」），无论其种类。选「无」则保持原样。");
        MAP.put("The darkest tones raised, which washes the image as old film stock does. 0 keeps the blacks black.", "提高最暗调，使画面像老胶片一样发灰。0 保持纯黑。");
        MAP.put("The fine beads' size on the windscreen against the other glass's.", "挡风玻璃上细水珠的大小（相对其它玻璃）。");
        MAP.put("The flowers, weeds and leaves the game lays flat on the ground, and the vines on its walls, cast and take these shadows as if they stood up from it (Tuning's relief heights); off, they lie flat in it.", "游戏平铺在地面的花草与墙上的藤蔓，按立起的高度投影与受影（参看「地形起伏」的高度设置）；关闭则维持平贴。");
        MAP.put("The game updates its world a fixed number of times a second, set below, instead of once a frame, and the main thread rests between updates. Single player, in first person only.", "游戏每秒以固定次数更新世界（次数见下方），而非每帧一次，主线程在更新间隙休息。仅单人、第一人称有效。");
        MAP.put("The game's art is drawn for its isometric view, where a level line falls a pixel every two. Up close on a wall, a door frame or a door, those steps showed as teeth; this reads the art upright so the lines run straight.", "游戏美术按等距视角绘制（水平线每两像素下降一像素）。贴近墙面、门框或门时那些台阶会呈锯齿；此项按直立方式解析美术，使线条笔直。");
        MAP.put("The game's designated zones, for animals among others.", "游戏标定的区域（动物等）。");
        MAP.put("The ground has the relief and the shine of what it is made of: grass and soil rough and uneven, asphalt with its stones, tiles glazed between their grout lines, wood smooth. Off: every floor is flat and equally rough.", "地面按其材质呈现起伏与光泽:草地与泥土粗糙不平，沥青有碎石，地砖在缝间有釉光，木板平滑。关闭则所有地面同样平整粗糙。");
        MAP.put("The ground rising and falling as the real Kentucky does, the hills on the horizon where they stand.", "地面如真实肯塔基般起伏，地平线上的山丘也各就其位。");
        MAP.put("The heap the game's memory manager collects to stay within, under the game's own cap: less of the computer's memory held, more collecting when the game's use comes near it. Auto takes a quarter of the computer's memory, at least 4 GiB, and none where that is not under the game's cap. Read when the game starts.", "游戏内存管理器回收以维持的堆上限（低于游戏自身上限）:占用更少内存，接近上限时回收更频繁。自动取内存的四分之一（至少 4 GiB），若低于游戏上限则不设。启动时读取。");
        MAP.put("The items you count as junk, by name, with a comma between two (Receipt, Sheet of Paper; any case): every item of that name, worn, bloody, empty or renamed alike, whatever mod it comes from; berries and mushrooms by the name you know them by. An item's right-click menu on the screen adds it or takes it off. A name no item has stays, named under the box. A column's Filter lists them under Junk, and only there. It starts with what the game files under its own Junk category (cigarettes, receipts, tin cans and the like): take off what you use. Apart from the game's own Set Unwanted.", "按名称定义你视为杂物的物品，两个名称之间用逗号（如 Receipt, Sheet of Paper；不区分大小写）:同名的物品，不论磨损、血迹、空置或被改名，也不论来自哪个模组；浆果与蘑菇按你熟悉的名称。在界面中右键物品可加入或移出。没有物品使用的名称会保留并显示在框下。各列的「筛选」会把它们仅列在「杂物」下。初始包含游戏自身归类为杂物的物品（香烟、收据、罐头等）:把你用的移出去。与游戏自带的「设为不要」功能相互独立。");
        MAP.put("The largest a drop grows by joining others: drops that would pass it lie together unjoined, drawn as one body of water, and keep their water.", "水滴合并生长的上限:超过该尺寸的水滴彼此相邻但不合并，仅绘制成一整片水且各自保留水量。");
        MAP.put("The least radius a drop lands at.", "水滴落下的最小半径。");
        MAP.put("The left wiper's angle parked, from the windscreen's foot (the blade points right).", "左雨刷停放角度（以挡风下沿为基准，刷片朝右）。");
        MAP.put("The light the lit floors round about bounce onto walls, ceilings and things, and the light the flashlight's beam bounces back from where it lands.", "周围受光地面反弹到墙壁、天花板与物体上的光，以及手电光束在其落点反弹回来的光。");
        MAP.put("The line's tension gauge while the line is out, in first and third person and in the game's own view. Hidden, the tension works as before: the line breaks past the red, and a fish gets away when the line is too slack.", "放线时显示鱼线张力表（第一/第三人称及游戏原视角）。隐藏后张力机制照常:超过红区断线，线太松鱼会跑掉。");
        MAP.put("The most radius a drop lands at (they land at any size between, evenly).", "水滴落下的最大半径（其间的尺寸均匀分布）。");
        MAP.put("The most the shader programs kept on disk take: past it, the oldest are deleted.", "磁盘上着色器程序的占用上限:超出后删除最旧的。");
        MAP.put("The number of sounds that you hear at the same time: Lower is 64, as in the game without Viewpoint, Normal is 128, Higher is 256. When more sounds play, the quietest sounds stop until other sounds end. At Lower, sounds near you can stop suddenly in a large horde. Higher uses more processor time for sound. Takes effect when the game starts next.", "同时听到的声音数量:低为 64（等同未装 Viewpoint），中为 128，高为 256。超出时最轻的声音会被中断直到其它声音结束。低档时在尸潮中近处声音可能突然中断。高档次之耗更多处理器时间。下次启动游戏生效。");
        MAP.put("The picture's colour follows the weather: cool and grey in storms, golden when the sun comes out over wet ground, blue on rainy nights.", "画面颜色随天气变化:风暴中冷灰，雨后放晴泛金，雨夜偏蓝。");
        MAP.put("The port it answers on: http://127.0.0.1:<port>/", "其监听端口:http://127.0.0.1:<port>/");
        MAP.put("The profiler (Debug, Profiling): over half the screen, over all of it, off.", "性能分析面板（调试 → 性能分析）:覆盖半屏、全屏、关闭。");
        MAP.put("The red and the blue of the image pulled apart towards the edges of the screen, as a lens that does not focus every colour at one place.", "画面边缘红蓝通道分离，如同未能把各色聚焦于一点的镜头。");
        MAP.put("The render thread draws frames of its own while the game works out its next step: the world between the game's last two steps, the view at the newest mouse. Off, one frame a step.", "游戏计算下一步时渲染线程自行绘制帧:世界位于游戏最近两步之间，视角取最新鼠标位置。关闭则每步一帧。");
        MAP.put("The right wiper's angle parked.", "右雨刷停放角度。");
        MAP.put("The ring's colour within the game's reach. Past it the ring is always red.", "游戏射程内的环颜色。超出射程后环恒为红色。");
        MAP.put("The same in towns, where much of the ground about is built on: gentler ground under the streets and houses, blended to the open's at a town's edge.", "城镇内的同类设置（城镇大部分地面有建筑）:街道与房屋下方地形更平缓，在城镇边缘过渡到野外地形。");
        MAP.put("The same while aiming: the camera moves between the two as aiming starts and ends.", "瞄准时同理:相机在开始与结束瞄准时于两者间过渡。");
        MAP.put("The screen comes back even when the use stops before it is done: you ran, were hit or cancelled it. Off: it comes back only after a use you finished, so the view stays yours when you have to move.", "中途打断使用（跑动、受击、取消）后界面也会返回。关闭:只有完成使用后才返回，便于你在需要移动时保持视角自由。");
        MAP.put("The server sends what changes on every square round a player, and the game drops a change to a square it has not taken in yet: an item another player drops there is missing until the chunk loads again. A chunk that has waited this long is taken in at once (0: always at the game's pace).", "服务端会发送玩家周围各格的改动，而游戏会丢弃尚未并入区块的改动:别人放在那里的物品要等区块重新加载才出现。等待超过该时长的区块会立即并入（0 表示始终按游戏节奏）。");
        MAP.put("The shade in corners, in creases and under things, where less of the light from all round reaches (XeGTAO's ground-truth occlusion).", "角落、褶皱与物体下方的阴影（四周光照到达较少处），采用 XeGTAO 的基准遮蔽。");
        MAP.put("The shade in corners, in creases and under things, where less of the light from all round reaches.", "角落、褶皱与物体下方的阴影（四周光照到达较少处）。");
        MAP.put("The share of the fine beads the windscreen holds against the other glass. The blades clear them but do not drag them, as they drag the drops.", "挡风玻璃上细水珠的数量占比（相对其它玻璃）。雨刷会刮掉它们但不像大水珠那样拖动它们。");
        MAP.put("The share of the lanes across a blade (4 mm each) that leave an arc behind it, on a pass that leaves any.", "一次留下刀光弧的挥击中，刀刃上（每段 4 毫米）产生弧线的比例。");
        MAP.put("The share of the lanes across the air's way that hold a rivulet at full speed.", "气流通道中维持满速细水流的比例。");
        MAP.put("The simulated raindrops on glass by how they move: grey while held, coloured while they run, their colour the way they go on the screen (down blue, up yellow, left green, right magenta) and their brightness their speed. The windscreen the wipers sweep is outlined in orange.", "按运动状态显示玻璃上的模拟雨滴:静止为灰色，流动时着色，颜色表示屏幕上的流向（下蓝、上黄、左绿、右品红），亮度表示速度。雨刷扫过的挡风玻璃区域为橙色描边。");
        MAP.put("The size the world is drawn at against the screen's. Under 100%: fewer pixels, faster. With TAA, the samples of many frames make the image at the screen's size; without it, FSR 1 brings the image up to the screen and sharpens it; with resolution scaling on, its upscaler does. Over 100%: supersampling, every edge smoothed by four samples a pixel at 200%, at four times the cost.", "世界绘制分辨率相对屏幕的比例。低于 100%:像素更少、更快。开启 TAA 时由多帧采样重建到屏幕分辨率；未开 TAA 时由 FSR 1 放大并锐化；开启分辨率缩放时由对应的升采样器处理。高于 100%:超采样，200% 时每像素四个样本，代价约四倍。");
        MAP.put("The small shadows the sun's shadow maps are too coarse for, traced over the screen towards the sun: under a chair, a can on a table, a car's tyres on the road. What is off the screen casts none.", "太阳阴影贴图过粗而丢失的小阴影，沿屏幕朝太阳方向追踪:椅下、桌上罐头、路面上的轮胎印。屏幕之外的不投影。");
        MAP.put("The snow that lies on the ground and on roofs, a layer with its own depth that you and cars leave tracks in. It becomes deeper while it snows. Off: the game's own snow tiles. Each level above Low gives sharper tracks and a finer surface.", "覆盖地面与屋顶的积雪，具有真实厚度，你与车辆会留下印迹，下雪时逐渐加深。关闭:使用游戏自带的雪地地块。高于「低」的每档印迹更清晰、表面更细腻。");
        MAP.put("The snow that lies on the ground and on roofs. It becomes deeper while it snows. Off: the game's own snow tiles. Low: plain snow. Medium: snow with rough edges, a rough surface and crystals that sparkle in the sun. High: sharper tracks that stay when you walk away. Ultra: the finest snow surface.", "覆盖地面与屋顶的积雪，下雪时逐渐加深。关闭:使用游戏自带的雪地地块。低:普通积雪。中:边缘粗糙、表面起伏，晶体会在阳光下闪。高:印迹更清晰且离开后保留。超高:最细腻的雪面。");
        MAP.put("The steepest a town's ground lies, so its houses' flat foundations meet with banks rather than cliffs; steeper as the town thins out, and no limit in the open.", "城镇地面的最大坡度，使房屋的平地基以缓坡而非断崖衔接；城镇边缘可更陡，野外不限。");
        MAP.put("The sun rises exactly at the game's dawn and sets at its dusk, on its real path across the sky. Off: Viewpoint's own sun for the date and latitude.", "太阳在游戏黎明升起、黄昏落下，并沿真实天空轨迹运行。关闭:使用 Viewpoint 按日期与纬度计算的太阳。");
        MAP.put("The tab the screen shows as it opens: the character, or the one shown when it last closed.", "界面打开时显示的标签页:角色页，或上次关闭时的标签页。");
        MAP.put("The view turns with the mouse as it is when the frame is drawn, not as it was a frame before: less lag, most when the game holds the frame rate back.", "视角使用绘制该帧时的鼠标位置而非上一帧，延迟更低，在游戏限帧时尤为明显。");
        MAP.put("The walls have the relief and the shine of what they are made of: brick and stone rough between their mortar lines, siding in its boards, a bathroom's tiles glazed, a garage door's metal smooth. Off: every wall is flat and equally rough.", "墙面按其材质呈现起伏与光泽:砖石在灰缝间起伏，壁板有板缝，浴室瓷砖有釉光，车库门金属平滑。关闭则所有墙面平整且粗糙度相同。");
        MAP.put("The whole image towards green or towards magenta, the other half of a camera's white balance.", "整幅画面偏绿或偏品红，这是相机白平衡的另一个分量。");
        MAP.put("The whole image towards orange or towards blue, as a camera's white balance does it.", "整幅画面偏橙或偏蓝，如同相机白平衡。");
        MAP.put("The wipers on the windscreen of the car you are in: they sweep while its engine runs in the rain, more often as it rains harder, and carry the water off the glass before them.", "你所乘车子的挡风玻璃雨刷:雨天引擎运转时间歇摆动，雨越大越频繁，并把前方的水刮走。");
        MAP.put("Their length against their own (9 to 24 cm).", "其长度（自身基准 9 至 24 厘米）。");
        MAP.put("Threads beside the main thread that share the simulation's ported work each tick (the zombies' skeletons). 0 leaves it all on the main thread.", "除主线程外参与分担模拟移植工作（丧尸骨骼）的线程数。0 表示全部留在主线程。");
        MAP.put("Trees and bushes between you and the sun glow yellow-green with the light passing through them.", "你与太阳之间的树木和灌木被透射光照成黄绿色。");
        MAP.put("Turn to move: the body turns to where it walks, as with a controller, and backpedals facing the view when you walk backwards. Strafe: the body always faces the view, and walks sideways and backwards on the game's strafe steps, at the Backpedal speed.", "转向移动:身体朝行走方向转身（同手柄），后退时面朝视角倒退。横移:身体始终面朝视角，按游戏横移动作侧移与后退，速度取「倒退速度」。");
        MAP.put("Up to what radius a drop grows from the fine rain falling round it.", "水滴从周围细雨中增长的半径上限。");
        MAP.put("Uses the item selected as the game's inventory does: eats or drinks it, applies a bandage, wears it or takes it in hand. The menu's line says which, and the key shows only where it does something.", "按游戏背包的方式使用选中物品:吃喝、包扎、穿戴或拿在手上。菜单会注明具体动作，仅在有效时显示该键。");
        MAP.put("Vanilla: the plain look, quick on any GPU. Modern: the shader pack below.", "原版:朴素观感，任何显卡都快。现代:使用下方所选光影包。");
        MAP.put("Vicinity and the inventory are only as tall as what they list, and grow with it. Off: they always reach the bottom of the screen.", "周围与背包窗口的高度随内容伸缩。关闭:始终延伸到屏幕底部。");
        MAP.put("Viewpoint plays the game's sound, voice chat included, at 48 kHz in the output that you select here, with 3D sound and more sounds at the same time. When it is off, the game plays its own sound (32 kHz in 5.1), and the other settings here have no effect. Takes effect when the game starts next.", "Viewpoint 以 48 kHz 在你选定的输出设备上播放游戏声音（含语音），支持 3D 音效与更多同时发声。关闭时由游戏自行播放（32 kHz、5.1），此处其它设置无效。下次启动游戏生效。");
        MAP.put("Viewpoint shader packs with depth of field focus on the screen centre, which is your sights when ADS, so the world blurs. This keeps the view sharp while sights are up.", "带景深效果的 Viewpoint 光影包会对焦屏幕中心（开镜时即瞄具位置），导致世界模糊。此项在抬镜时保持画面清晰。");
        MAP.put("Viewpoint's own FMOD mixes in stereo at the latency chosen into a WAV file in Zomboid/viewpoint-captures, as it plays, instead of to the speakers: the mix as it leaves FMOD, for measuring. Read when the game starts.", "Viewpoint 自带的 FMOD 会以所选延迟把立体声混音写入 Zomboid/viewpoint-captures 下的 WAV 文件而不送扬声器:即 FMOD 输出的原始混音，供测量用。启动时读取。");
        MAP.put("Volumetric clouds in the sky, lit by the sun or the moon, shading the ground as they pass over it.", "天空中的体积云，受日月照亮，飘过时在地面投下阴影。");
        MAP.put("Walls out in the rain darken in uneven, running streaks, more of them the wetter it is.", "雨中的墙面呈现不规则的流痕变暗，越湿痕迹越多。");
        MAP.put("Water, puddles and car paint show what is around them. Off: they show only the sky. Medium: from one pixel in sixteen. High: from one pixel in four. Ultra: from the same pixels, further along each ray. Extreme: from every pixel.", "水面、水洼与车漆映出周围景物。关闭:只映天空。中:每十六像素取一。高:每四像素取一。超高:取同样像素但射线更长。极致:逐像素。");
        MAP.put("Water, puddles, car paint and polished floors show what is around them, traced over the screen. Off: they show only the sky. Low traces a quarter of the screen each way, Medium half; either costs the graphics card's time every frame, reflective or not.", "水面、水洼、车漆与抛光地面映出周围景物，沿屏幕追踪。关闭:只映天空。低为每向四分之一屏、中为一半；无论是否有反射都每帧消耗显卡时间。");
        MAP.put("What the far world builds from the map's files, kept in the game's cache folder for each save and map and read back next time: the far world comes in seconds after a load, not half a minute.", "远景世界从地图文件构建的结果，按存档与地图缓存在游戏目录，下次直接读回:读档后数秒即可呈现远景，而非等半分钟。");
        MAP.put("What the flashlight's beam falls on casts a shadow (a shadow map of its own). When a gun fires, what stands near it casts a shadow from the muzzle flash (six shadow maps, only while the flash shows).", "手电光束照到的物体投射阴影（独立阴影贴图）。枪械开火时，附近物体被枪口闪光投出阴影（6 张阴影贴图，仅在闪光出现期间）。");
        MAP.put("When a step runs more than one tick: whether Lua's key, mouse and UI events fire once a step, as the game fires them, or before every tick.", "一个步长执行多个 tick 时:Lua 的按键、鼠标与界面事件是按游戏方式每步触发一次，还是每个 tick 前触发。");
        MAP.put("Where the game's sound goes. Headphones mix it for two ears; the speakers' choices place it round you; Windows Sonic or Dolby Atmos hands it to Windows' spatial sound, which must be on in Windows' sound settings. Takes effect when the game starts next.", "游戏声音的输出位置。耳机按双耳混音；音箱选项把声音置于四周；Windows Sonic 或 Dolby Atmos 交给 Windows 空间音效（需在系统声音设置中开启）。下次启动游戏生效。");
        MAP.put("Where the head lamps' beams end, against the game's own reach (36 squares for a new lamp).", "车头灯光柱的终止距离（游戏新灯基准为 36 格）。");
        MAP.put("Where the left wiper pivots under the windscreen's foot: a share of its width from its middle, to the right.", "左雨刷支点位置（以挡风下沿计，从中线向右的比例）。");
        MAP.put("Where the right wiper pivots, the same way.", "右雨刷支点位置，含义同上。");
        MAP.put("Whether the rivulets the air drives at speed run on the windscreen too, or only on the other windows.", "气流高速吹出的细水流是否也出现在挡风玻璃上，还是仅在其它玻璃上。");
        MAP.put("Whether the view is behind the shoulder or at the eyes on foot. The key that switches the camera sets it, and a vehicle keeps a choice of its own.", "步行时视角位于肩后还是眼位。切换相机的按键会改变此项，载具另有独立选择。");
        MAP.put("Whether the view is behind the vehicle or at the eyes while seated in one. The key that switches the camera sets it while seated.", "乘坐载具时视角位于车后还是眼位。乘坐时按切换相机键即可改变。");
        MAP.put("Whether they run on the rear window too.", "是否也出现在后窗。");
        MAP.put("Which shoulder the camera looks over. The shoulder key swaps it while playing.", "相机过哪一侧肩。游戏中按换肩键切换。");
        MAP.put("While ground mode is on, outlines what you aim at, whatever the switch above says. Its squares' marks show either way.", "地面模式开启时，无论上方开关如何都会描边瞄准目标；其格子标记始终显示。");
        MAP.put("While looking through a variable scope: wheel up zooms in, wheel down zooms out.", "使用可变倍镜时:滚轮上滚放大，下滚缩小。");
        MAP.put("While the isometric view shows, keeps building what first and third person draw round you, a little each frame, so switching finds the world built. Costs the isometric view about a millisecond a frame while it builds.", "等距视角下持续构建第一/第三人称所需的周围世界，每帧一点，切换时即已就绪。构建期间等距视角每帧约多耗一毫秒。");
        MAP.put("While the loot menu shows a floor or a surface to put the item held on: puts it there. None by default: every button is the game's otherwise. The game does not see the press then.", "当拾取菜单显示可放置手持物品的地面或台面时:把物品放在那里。默认为「无」，否则所有按键归游戏。此时游戏不会收到该按键。");
        MAP.put("While the loot menu shows an item: uses or equips it, as a double-click in the game's inventory does. None by default: every button is the game's otherwise. The game does not see the press then.", "当拾取菜单显示物品时:使用或装备它，等同在游戏背包中双击。默认为「无」，否则按键归游戏。此时游戏不会收到该按键。");
        MAP.put("While the loot menu shows: opens the inventory screen on it, or the game's loot window with Viewpoint UI off, the pad in it (Y closes either). The game does not see the press then.", "拾取菜单显示时:在其上打开背包界面；Viewpoint 界面关闭时打开游戏战利品窗口（手柄为 Y 关闭）。此时游戏不会收到该按键。");
        MAP.put("While the loot menu shows: selects the row above, as the mouse wheel does; held, it steps on.", "拾取菜单显示时:选择上一行，等同滚轮；按住会连续移动。");
        MAP.put("While the loot menu shows: selects the row below, as the mouse wheel does; held, it steps on.", "拾取菜单显示时:选择下一行，等同滚轮；按住会连续移动。");
        MAP.put("While the loot menu shows: takes everything it lists. The game does not see the press then.", "拾取菜单显示时:拿取所列全部物品。此时游戏不会收到该按键。");
        MAP.put("While the loot menu shows: takes the item selected, or does the action selected. The game does not see the press then.", "拾取菜单显示时:拿取选中物品或执行选中动作。此时游戏不会收到该按键。");
        MAP.put("While the player moves, the chunks the game has read in a cone this wide either side of where it heads are taken in before the others, the nearest first; those it is about to reach always at once.", "玩家移动时，游戏已读取的区块中位于前进方向两侧该角度内的会优先并入（由近及远）；即将到达的区块总是立即并入。");
        MAP.put("While the view is on: opens the inventory screen with the cursor free, or closes it, as the game's own inventory key does.", "视角开启时:打开背包界面并释放光标，或关闭它，等同游戏自带背包键。");
        MAP.put("While you aim a cast, a ring on the water shows where it will land, as wide as the game's scatter at your Fishing skill; while the cast flies, a small one marks the spot it lands on.", "抛竿瞄准时，水面上的环显示落点范围，大小对应你的钓鱼技能；抛竿飞行时用小环标出落点。");
        MAP.put("While you eat, drink, take a pill, bandage or treat a wound, read or put on make-up, the screen closes so you watch it, and comes back as it was when you are done. Opened again meanwhile, it stays. Off: the screen stays.", "吃喝、服药、包扎/治疗、阅读或化妆时界面自动关闭以便观看动作，完成后恢复原样；期间再次打开则保持打开。关闭:界面不关闭。");
        MAP.put("While you hold a firearm, the ADS key does not open the vehicle / animal radial menu that shares it (V), and Viewpoint Interface's interaction prompt and action menu step aside while you aim. Lower the gun or holster it to use them.", "持枪时瞄准键不会触发与其共用的载具/动物径向菜单 (V)，且瞄准期间 Viewpoint Interface 的交互提示与动作菜单会让位。放下或收起枪即可使用。");
        MAP.put("While you place or move something in first or third person, marks the square it goes on, green where it can go and red where not (the game's highlight colours), with a strip along the edge for a wall, a door or a barricade. The see-through preview shows either way. In furniture mode, marks the squares of the object you aim at, green where you can do the action and red where not.", "第一/第三人称放置或移动物品时，标出目标格子:可放为绿、不可为红（沿用游戏高亮色），墙、门或路障沿边缘显示条带。半透明预览始终显示。家具模式下标出瞄准对象所占格子，可操作为绿、不可为红。");
        MAP.put("With the free camera on, draws the third-person camera's rig: the pivot, the shoulder, the camera wanted and the camera placed.", "开启自由相机时，绘制第三人称相机骨架:支点、肩位、目标相机与实际相机。");
        MAP.put("With the sights fully up, hold the Steady aim key (Left Shift by default, in the game's Options > Keybinds) to hold your breath: the sway almost stops for up to 5 seconds, then you breathe out with a short shake and have to let go of the key before you can steady again. Breath comes back in about 6 seconds. Magnified scopes are only steadied; iron sights, red dots and holo sights also zoom in a little. The eye and the gun do not move, so nothing clips.", "完全抬镜后按住稳定瞄准键（默认左 Shift，见游戏「选项 > 按键」）屏息:晃动几乎停止，最长 5 秒，随后呼气伴随短促抖动，需松开按键才能再次稳定。气息约 6 秒恢复。倍镜只获得稳定；机瞄、红点与全息还会略微放大。眼位与枪身不移动，因此不会穿模。");
        MAP.put("With Viewpoint UI off, in first and third person: the inventory key and Tab open the game's own inventory and loot windows and free the cursor for them. Off: Viewpoint leaves the inventory key to the game and to other mods, for a mod with an inventory of its own, and Tab opens nothing. The Cursor free or locked key then frees the cursor for what opens.", "Viewpoint 界面关闭时，第一/第三人称下:背包键与 Tab 会打开游戏自带的背包与战利品窗口并释放光标。若此项也关闭:Viewpoint 把背包键让给游戏与其它模组（供自带背包的模组使用），Tab 不打开任何东西，此时用「光标释放/锁定」键为打开的界面释放光标。");
        MAP.put("Within how far a drop is drawn towards a bigger one beside it (their radii together).", "水滴被拉向旁边更大水滴的距离（以两者半径之和计）。");
        MAP.put("Writes each frame drawn and each step of the game's for half a minute into the user folder's viewpoint-frame-traces, then turns itself off.", "把半分钟内绘制的每一帧与游戏的每一个步长写入用户目录的 viewpoint-frame-traces，随后自动关闭。");
        MAP.put("Your column lists only the container chosen with the icons at its top right (your inventory, a bag, a key ring), as the game's inventory window shows the one chosen. Off: it lists every container you carry, the chosen one framed.", "你的列只列出右上角图标选中的容器（背包、袋子、钥匙环），与游戏背包窗口一致。关闭:列出你携带的所有容器，选中的加边框。");
        MAP.put("Your gun occupies real space: near walls, closed doors and windows, tall furniture and vehicles it slides back and rises into a compressed ready instead of passing through, and returns exactly to your sights when there is room again. Long rifles need more room than pistols. First and third person, hip and ADS. Visual and handling only (client side); shots still leave along your aim. Untick to switch the whole system off.", "枪械占据真实空间:靠近墙壁、关闭的门窗、高家具与载具时会后收并抬起成压缩持枪姿态而非穿模，空间足够时精确回到瞄准位置。长枪比手枪需要更多空间。第一/第三人称、腰射与开镜均适用。仅影响视觉与手感（客户端），子弹仍沿瞄准方向射出。取消勾选可整体关闭。");
        MAP.put("Zombies chasing the player farther than this are updated every other frame: they react a frame later there, and a big chase costs about half as much. 30 is the game's own reach.", "追击玩家距离超过该值的丧尸改为隔帧更新:其反应慢一帧，大规模追击开销约减半。30 为游戏自身范围。");
        MAP.put("Zombies' and corpses' clothes, blood, dirt and holes drawn by the model shader from the game's own textures, instead of the textures the game makes for each of them, which turning in a crowd waits on and which take video memory.", "丧尸与尸体的衣物、血迹、污渍与破洞由模型着色器直接使用游戏贴图绘制，而不用游戏为每具单独生成的贴图（人群中转身会等待、并占用显存）。");
        MAP.put("Input", "输入");
        MAP.put("Gunplay", "枪械");
        MAP.put("Movement", "移动");
        MAP.put("Building", "建造");
        MAP.put("View", "视角");
        MAP.put("Buttons", "按键");
        MAP.put("Look", "视角");
        MAP.put("Aim assist", "瞄准辅助");
        MAP.put("Switching", "切换");
        MAP.put("Third person", "第三人称");
        MAP.put("Impact", "后坐");
        MAP.put("Vehicle", "载具");
        MAP.put("Camera", "相机");
        MAP.put("General", "常规");
        MAP.put("Shader Options", "着色器选项");
        MAP.put("Resource Packs", "资源包");
        MAP.put("Shaderpacks", "着色器包");
        MAP.put("Inventory", "背包");
        MAP.put("Health", "健康");
        MAP.put("Map", "地图");
        MAP.put("Crafting", "合成");
        MAP.put("Furniture", "家具");
        MAP.put("Zones", "区域");
        MAP.put("Sidebar", "侧边栏");
        MAP.put("Profiler", "性能分析");
        MAP.put("World", "世界");
        MAP.put("Advanced", "高级");
        MAP.put("Controls", "操控");
        MAP.put("About", "关于");
        MAP.put("Off", "关");
        MAP.put("On", "开");
        MAP.put("None", "无");
        MAP.put("Auto", "自动");
        MAP.put("Custom", "自定义");
        MAP.put("White", "白色");
        MAP.put("Black", "黑色");
        MAP.put("Red", "红色");
        MAP.put("Green", "绿色");
        MAP.put("Blue", "蓝色");
        MAP.put("Yellow", "黄色");
        MAP.put("Purple", "紫色");
        MAP.put("Orange", "橙色");
        MAP.put("Pink", "粉色");
        MAP.put("Teal", "青色");
        MAP.put("Grey", "灰色");
        MAP.put("Brown", "棕色");
        MAP.put("Name", "名称");
        MAP.put("Category", "类别");
        MAP.put("Weight", "重量");
        MAP.put("Condition", "状态");
        MAP.put("Type", "类型");
        MAP.put("Character", "角色");
        MAP.put("Low", "低");
        MAP.put("High", "高");
        MAP.put("Ultra", "超高");
        MAP.put("Extreme", "极致");
        MAP.put("Normal", "正常");
        MAP.put("Inventory screen", "背包界面");
        MAP.put("Loot menu", "拾取菜单");
        MAP.put("HUD", "HUD");
        MAP.put("Fishing", "钓鱼");
        MAP.put("Vanilla UI", "原版界面");
        MAP.put("Confirm", "确认");
        MAP.put("Reset to default", "重置为默认");
        MAP.put("Camera profiles", "相机配置");
        MAP.put("Chunks", "区块");
        MAP.put("Controller", "手柄");
        MAP.put("Debug", "调试");
        MAP.put("Detail", "细节");
        MAP.put("Far world", "远景世界");
        MAP.put("First person", "第一人称");
        MAP.put("Floor preview", "地面预览");
        MAP.put("Floors", "地面");
        MAP.put("Glass", "玻璃");
        MAP.put("Impact", "后坐");
        MAP.put("Key bindings", "按键绑定");
        MAP.put("Keys", "按键");
        MAP.put("Levels of detail", "细节层级");
        MAP.put("Memory", "内存");
        MAP.put("Minimize", "最小化");
        MAP.put("Mouse", "鼠标");
        MAP.put("Options", "选项");
        MAP.put("Plants", "植被");
        MAP.put("Profiling", "性能分析");
        MAP.put("Project Viewpoint", "Project Viewpoint");
        MAP.put("Restore", "恢复");
        MAP.put("Roofs", "屋顶");
        MAP.put("Seated eye", "坐姿眼位");
        MAP.put("Settings", "设置");
        MAP.put("Surfaces", "表面");
        MAP.put("Texture filtering", "纹理过滤");
        MAP.put("Views", "视角");
        MAP.put("Views and tools", "视角与工具");
        MAP.put("Pitch and roll", "俯仰与侧倾");
        MAP.put("Pitch only", "仅俯仰");
        MAP.put("None at all", "完全不动");
        MAP.put("Third person", "第三人称");
        MAP.put("First person", "第一人称");
    }
}
