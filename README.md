# Viewpoint 简体中文汉化 (ViewpointCN)

Project Viewpoint（僵毁 3D 第一人称模组）的**全量简体中文汉化**，通过 ZombieBuddy 以 Java 补丁方式注入，并附带 CJK 字体注入。

- 适配：Project Viewpoint **0.1.7** / 游戏 **Build 42.22.2**
- 工坊条目：[3814510123](https://steamcommunity.com/sharedfiles/filedetails/?id=3814510123)
- 依赖：**Project Viewpoint**（3809306528）+ **ZombieBuddy**（3619862853）

## 汉化范围

| 项目 | 数量 |
|---|---|
| 左侧导航 | 11 项 |
| 页面标题 / 子页签 | 58 |
| 设置名称 | 411 |
| 悬停说明（tooltip） | 371 |
| 下拉选项值 / 颜色名 / 排序方式 | 已覆盖 |

覆盖页面：图形、鼠标~键盘、相机、手柄、声音、界面（背包/拾取/HUD/钓鱼/原版界面）、世界（视野范围/细节/内存）、附加组件、Recoil & ADS、关于。

## 原理

Viewpoint 的设置界面用 ImGui 绘制，普通 Lua 模组无法改文字。本模组：

1. `Patches.java` — 用 ZombieBuddy 的 `@Patch` 挂在 Viewpoint 的文本入口上（`LiveSettings$Setting.label/tooltip`、`SettingsPages$Page.name/line`、`SettingsPages$Subtab.<init>`、`Widgets.*`、`LiveSettings$Choice.*` 等），把英文替换为中文；
2. `Tr.java` — 英中词表（约 1800 条）；
3. 字体注入 — 把黑体/思源黑体加入 ImGui 图集并 `atlas.build()` + `setTexID(0)` 强制重建贴图，解决中文显示成问号/方块的问题。

## 目录结构

```
.
├─ java/src/viewpointcn/      源码（Patches.java / Tr.java）
├─ 42/media/java/client/      发布内容（ViewpointCN.jar + 字体）
├─ 42/media/lua/client/       Mod Options 翻译
├─ mod.info / 42/mod.info     模组信息
├─ workshop.txt               工坊元数据
├─ preview.png                工坊预览（256×256）
├─ poster.png                 模组封面（512×512）
└─ build.ps1                  一键编译
```

## 构建

需要 JDK 21+、ZombieBuddy 与 Viewpoint 的 jar 作为编译依赖（默认从 Steam 工坊目录读取，可用参数覆盖）：

```powershell
.\build.ps1
# 或指定路径
.\build.ps1 -Javac "D:\jdk21\bin\javac.exe" -Jar "D:\jdk21\bin\jar.exe" ^
  -ZombieBuddy "D:\STEAM\steamapps\workshop\content\108600\3619862853\mods\ZombieBuddy\libs\ZombieBuddy.jar" ^
  -Viewpoint  "D:\STEAM\steamapps\workshop\content\108600\3809306528\mods\Viewpoint\42\media\java\client\Viewpoint.jar"
```

输出覆盖 `42/media/java/client/ViewpointCN.jar`。

## 安装（玩家）

1. 订阅 Project Viewpoint 与 ZombieBuddy；
2. 订阅本模组；
3. 启动游戏，在 ZombieBuddy 的 Java Mod Approval 弹窗里允许 ViewpointCN 的 jar；
4. 进入游戏按 `Delete` 打开 Viewpoint 设置窗口，界面即为中文。

## 已知问题

- 设置窗口左上角 `Options /` 面包屑由引擎直接绘制，无法汉化；
- Viewpoint 更新后可能出现未翻译的新条目，欢迎提 issue / PR。

## 更新日志

见 [CHANGELOG.md](CHANGELOG.md)。

## 说明

本仓库只包含汉化文本、补丁代码与字体注入逻辑，不包含 Project Viewpoint 本体代码。
