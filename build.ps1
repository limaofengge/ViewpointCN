# 编译 ViewpointCN：javac -> 打包 jar -> 覆盖 42/media/java/client/ViewpointCN.jar
param(
    [string]$Javac = "javac",
    [string]$Jar = "jar",
    [string]$ZombieBuddy = "D:\STEAM\steamapps\workshop\content\108600\3619862853\mods\ZombieBuddy\libs\ZombieBuddy.jar",
    [string]$Viewpoint = "D:\STEAM\steamapps\workshop\content\108600\3809306528\mods\Viewpoint\42\media\java\client\Viewpoint.jar",
    [string]$GameJar = "D:\STEAM\steamapps\common\ProjectZomboid\projectzomboid.jar"
)
$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$src = Join-Path $root "java\src\viewpointcn"
$out = Join-Path $root "build\classes"
Remove-Item (Join-Path $root "build") -Recurse -Force -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path $out | Out-Null

$cp = "$ZombieBuddy;$Viewpoint;$GameJar"
Write-Host "javac: $Javac"
& $Javac -nowarn -encoding UTF-8 -cp $cp -d $out (Get-ChildItem "$src\*.java").FullName
if ($LASTEXITCODE -ne 0) { throw "javac failed ($LASTEXITCODE)" }

$dest = Join-Path $root "42\media\java\client\ViewpointCN.jar"
Push-Location $out
& $Jar cf $dest .
Pop-Location
Write-Host ("built: " + $dest + "  " + [math]::Round((Get-Item $dest).Length/1KB,1) + " KB")
