# 汉化词库 (translation database)

ViewpointCN 的全部英中对照，由 `java/src/viewpointcn/Tr.java` 导出。

| 文件 | 说明 |
|---|---|
| `translations.csv` | 两列：`english`、`chinese`。UTF-8（带 BOM），Excel/VS Code 可直接打开 |
| `translations.json` | 同一内容的 JSON 数组，方便脚本或其它语言调用 |

当前条目：**1609 条**（设置名、提示、页面标题、选项值）。

## 用途

1. **版本升级时快速核对**：Viewpoint 更新后，游戏里跑一遍设置窗口，未翻译的条目会写进
   `%USERPROFILE%\Zomboid\viewpoint-untranslated.txt`；用 `tools/find-missing.ps1` 与 CSV 比对，
   得到待翻译清单。
2. **协作翻译**：只改 CSV，再用 `tools/gen-map-entries.ps1` 生成 Java 代码写回 `Tr.java`。
3. **复用**：其它 Viewpoint 附属模组（Recoil & ADS、Minimap 等）也可参考本词库。

## 约定

- 键名保持 Viewpoint 里的英文原文，大小写与标点原样（含结尾句号）；
- 占位符 `%s` / `%d` / `%.1f` 必须保留，位置可调整；
- 单位与专有名词保留原文：`MiB / GB / ms / cm / fps / DLSS / FSR / XeSS / TAA / SMAA / FMOD / Steam Audio`；
- 不带结尾句号的短标签保持无句号。

## 更新流程

```powershell
# 1) 游戏内打开设置窗口，导出未翻译清单
#    -> %USERPROFILE%\Zomboid\viewpoint-untranslated.txt

# 2) 与词库比对
.\tools\find-missing.ps1

# 3) 在 CSV 里补上 english,chinese

# 4) 由 CSV 生成 Java 代码
.\tools\gen-map-entries.ps1 -Out D:\tmp\entries.java

# 5) 粘贴进 Tr.java，编译
.\build.ps1
```
