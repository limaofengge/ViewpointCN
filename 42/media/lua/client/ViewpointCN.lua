-- ViewpointCN: Viewpoint 第一人称模组的简体中文汉化补丁
-- 原理：包装 PZAPI.ModOptions.create 与 MainOptions.addCombo，
--       对 Viewpoint 注册的文本按"英文原文"匹配替换，未知文本一律透传。
-- 注意：Viewpoint 的 Java 设置窗口(Delete 键)文本在 Java 内部，本补丁无法覆盖。
-- 加载顺序：本 mod 应排在 Viewpoint 之前（模组列表里拖到它上面）。

local T = {}

T.groups = {
    ["Keys/Views"] = "键位/视角",
    ["Keys/Loot menu"] = "键位/拾取菜单",
    ["Keys/Free camera"] = "键位/自由相机",
    ["Keys/Debug"] = "键位/调试",
}

T.labels = {
    ["First person on or off"] = "开关第一人称",
    ["First or third person"] = "第一/第三人称切换",
    ["Viewpoint settings window"] = "Viewpoint 设置窗口",
    ["Viewpoint screenshot"] = "Viewpoint 截图",
    ["Loot menu: take or do"] = "拾取菜单:拾取/执行",
    ["Loot menu: take all"] = "拾取菜单:全部拾取",
    ["Loot menu: open the loot window"] = "拾取菜单:打开战利品窗口",
    ["Free camera on or off"] = "开关自由相机",
    ["Physical free camera on or off"] = "开关物理自由相机",
    ["Free camera: forward"] = "自由相机:前进",
    ["Free camera: back"] = "自由相机:后退",
    ["Free camera: left"] = "自由相机:左移",
    ["Free camera: right"] = "自由相机:右移",
    ["Free camera: up"] = "自由相机:上升",
    ["Free camera: down"] = "自由相机:下降",
    ["Free camera: four times as fast"] = "自由相机:四倍速",
    ["Free camera: back to the player"] = "自由相机:回到玩家",
    ["Level-of-detail view"] = "LOD 层级视图",
    ["Next debug view"] = "下一调试视图",
    ["Next effect off"] = "逐个关闭特效",
    ["Rooms' culling"] = "房间剔除",
    ["Performance overlay"] = "性能覆盖层",
    ["Record the mesher"] = "录制网格器",
    ["Check the mesher"] = "校验网格器",
    ["Show the loot menu"] = "显示拾取菜单",
}

T.tooltips = {
    ["The first-person view on or off."] = "第一人称视角开关。",
    ["While the view is on: the camera over the shoulder, or back to the eyes."] = "视角开启时:切换越肩镜头或回到第一人称。",
    ["Shows or hides this window."] = "显示或隐藏此窗口。",
    ["Saves the view to Zomboid/viewpoint-shots."] = "将画面保存到 Zomboid/viewpoint-shots。",
    ["Takes the item selected in the loot menu, or does the action selected; the wheel selects. The game's Interact stays the game's."] = "拾取菜单中选中的物品,或执行选中的动作;用滚轮切换选项。游戏自带的互动键不受影响。",
    ["Takes everything the loot menu shows."] = "拾取菜单显示的全部物品。",
    ["Opens the game's own loot window on what the loot menu shows, with the cursor free; again to close it."] = "打开游戏自带的战利品窗口并释放光标;再按一次关闭。",
    ["While the view is on: a camera flying anywhere, the world still round the player."] = "视角开启时:自由飞行的相机,世界仍围绕玩家。",
    ["A free camera the world is centred on: what is drawn, its detail and the sound follow it."] = "以世界为中心的自由相机:画面、细节与声音都跟随它。",
    ["The free camera back at the player's eyes."] = "自由相机回到玩家眼前。",
    ["Every surface tinted by its level of detail (Debug, Views)."] = "每个表面按其细节层级着色(调试用)。",
    ["Normal, the art only, the light only, the volumetric light, the bounce light, the lamps' shadows, the sun's maps."] = "依次为:正常、仅美术、仅光照、仅体积光、仅反弹光、仅灯影、仅日光贴图。",
    ["The renderer's effects off one at a time."] = "逐个关闭渲染特效。",
    ["The culling of the rooms no one can see: on, frozen, off."] = "不可见房间的剔除:开启、冻结、关闭。",
    ["The overlay's next mode: full, compact, the graph alone, off."] = "覆盖层的下一模式:完整、紧凑、仅图表、关闭。",
    ["Records the mesher round the player (TESTING.md)."] = "录制玩家周围的网格数据(TESTING.md)。",
    ["Checks the meshes round the player against the newest recording (TESTING.md)."] = "用最新录制数据校验玩家周围的网格(TESTING.md)。",
    ["In first and third person, what you aim at within reach is outlined and its items listed beside the crosshair. Off: the game's own loot window only."] = "开启后,第一/第三人称下准星指向范围内的物品会高亮并显示在准星旁。关闭则只使用游戏自带的战利品窗口。",
}

T.combos = {
    ["Menu framerate"] = "菜单帧率",
}

T.comboOptions = {
    ["Same as in-game"] = "与游戏内相同",
}

-- 包装 PZAPI.ModOptions.create:翻译 Viewpoint 注册到模组选项面板的文本
local function wrapModOptions()
    -- 注意:文件加载时 PZAPI 可能还没就绪,此时绝不能写"已包装"标记,
    -- 否则 OnGameBoot 的重试会被挡住(2026-10-06 实测踩坑)。
    if not PZAPI or not PZAPI.ModOptions or not PZAPI.ModOptions.create then return end
    if PZAPI.ModOptions.viewpointcnWrapped then return end
    PZAPI.ModOptions.viewpointcnWrapped = true

    local stockCreate = PZAPI.ModOptions.create
    function PZAPI.ModOptions:create(...)
        local page = stockCreate(self, ...)
        if page and not page.viewpointcnWrapped then
            page.viewpointcnWrapped = true
            local addTitle = page.addTitle
            local addKeyBind = page.addKeyBind
            local addTickBox = page.addTickBox
            if addTitle then
                function page:addTitle(group)
                    return addTitle(self, T.groups[group] or group)
                end
            end
            if addKeyBind then
                function page:addKeyBind(id, label, trigger, tooltip)
                    return addKeyBind(self, id, T.labels[label] or label, trigger, T.tooltips[tooltip] or tooltip)
                end
            end
            if addTickBox then
                function page:addTickBox(name, label, value, tooltip)
                    return addTickBox(self, name, T.labels[label] or label, value, T.tooltips[tooltip] or tooltip)
                end
            end
        end
        return page
    end
end

-- 数据兜底:不管选项是怎么注册进来的,直接扫描 PZAPI 已注册的全部选项,
-- 把匹配的英文 name/tooltip 原地替换成中文。任何时序下都生效。
local function translatePages()
    if not PZAPI or not PZAPI.ModOptions or not PZAPI.ModOptions.Data then return end
    for _, options in ipairs(PZAPI.ModOptions.Data) do
        for _, option in ipairs(options.data or {}) do
            if type(option.name) == "string" then
                local n = T.labels[option.name] or T.groups[option.name]
                if n then option.name = n end
            end
            if type(option.tooltip) == "string" then
                local tp = T.tooltips[option.tooltip]
                if tp then option.tooltip = tp end
            end
        end
    end
end

-- 包装 MainOptions.addCombo:翻译"菜单帧率"下拉框
-- 即使本 mod 加载在 Viewpoint 之后,选项界面每次打开都会重新走这里,依然生效
local function wrapCombos()
    if not MainOptions or MainOptions.viewpointcnWrapped then return end
    MainOptions.viewpointcnWrapped = true

    local stock = MainOptions.addCombo
    function MainOptions:addCombo(x, y, w, h, name, options, selected, target, onchange)
        local newName = T.combos[name] or name
        local newOptions = options
        if type(options) == "table" then
            newOptions = {}
            for i, v in ipairs(options) do
                newOptions[i] = T.comboOptions[v] or v
            end
        end
        return stock(self, x, y, w, h, newName, newOptions, selected, target, onchange)
    end
end

wrapModOptions()
wrapCombos()
Events.OnGameBoot.Add(function()
    wrapModOptions()
    wrapCombos()
    translatePages()
end)
Events.OnGameStart.Add(function()
    translatePages()
end)

print("[ViewpointCN] 汉化补丁已加载")
