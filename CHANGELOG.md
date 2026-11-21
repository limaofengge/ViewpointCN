# 更新日志

## v1.0.0 — 2026-11-22

首个全量版本，适配 Viewpoint 0.1.7 / Build 42.22.2。

- 导航 11 项、页面标题与子页签 58 项全部汉化
- 设置名称 411 条、悬停说明 371 条全部汉化
- 下拉选项值、颜色名、排序方式汉化
- 修复中文显示为问号/方块：注入 CJK 字体后强制重建 ImGui 图集
- 新增补丁：`SettingsPages$Page.line`、`SettingsPages$Subtab.<init>`、`Widgets.pages(String[])`、`LiveSettings$Choice.labels()/text()`、`LoadModel$Part.<init>`
- 移除失效补丁：`Widgets.addText/button`、`imgui.ImGui.text*`、`LoadModel$Part.label`、`PadBinds.look`
- 已知未汉化：窗口左上角 `Options /` 面包屑
