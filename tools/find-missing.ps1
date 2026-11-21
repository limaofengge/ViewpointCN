# 读取游戏导出的未翻译清单，与 database/translations.csv 比对，输出仍缺的词条
param(
    [string]$Dump = "$env:USERPROFILE\Zomboid\viewpoint-untranslated.txt",
    [string]$Csv = "$PSScriptRoot\..\database\translations.csv",
    [string]$Out = "$PSScriptRoot\..\database\missing.txt"
)
$ErrorActionPreference = "Stop"
if (-not (Test-Path $Dump)) { throw "找不到未翻译清单：$Dump（先在游戏里打开一次 Viewpoint 设置窗口）" }
$known = @{}
foreach ($r in (Import-Csv $Csv -Encoding UTF8)) { if ($r.english) { $known[$r.english] = $true } }
$missing = New-Object System.Collections.Generic.List[string]
$curKey = $null
foreach ($line in (Get-Content $Dump -Encoding UTF8)) {
    if ($line -match '^KEY=(.+)$') { $curKey = $matches[1] }
    elseif ($line -match '^\s+(LABEL|TIP)=(.+)$') {
        $s = $matches[2]
        if (-not $known.ContainsKey($s)) { $missing.Add($s) }
    }
}
$uniq = $missing | Sort-Object -Unique
$uniq | Set-Content $Out -Encoding UTF8
Write-Host ("missing=" + $uniq.Count + " -> " + $Out)
$uniq | Select-Object -First 40 | ForEach-Object { "  " + $_ }
