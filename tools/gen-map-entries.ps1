# 由 database/translations.csv 生成 Tr.java 里的 MAP.put 行
param(
    [string]$Csv = "$PSScriptRoot\..\database\translations.csv",
    [string]$Out = ""
)
$ErrorActionPreference = "Stop"
$lines = New-Object System.Collections.Generic.List[string]
foreach ($r in (Import-Csv $Csv -Encoding UTF8)) {
    if (-not $r.english -or -not $r.chinese) { continue }
    $en = $r.english -replace '\\','\\' -replace '"','\"'
    $zh = $r.chinese -replace '\\','\\' -replace '"','\"'
    $lines.Add('        MAP.put("' + $en + '", "' + $zh + '");')
}
if ($Out) { $lines | Set-Content $Out -Encoding UTF8; Write-Host ("written " + $Out + " (" + $lines.Count + " lines)") }
else { $lines | ForEach-Object { $_ } }
