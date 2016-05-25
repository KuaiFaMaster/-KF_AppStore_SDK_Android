[TOC]

# 快发应用中心

**`使用前请务必阅读工程索引及工程说明书`**

* 请尽量使用Android Studio开发，如使用eclipse，请配置eclipse下的Gradle环境，如果没有配置gradle环境，请手动解压`.arr`,拿出jar包，资源文件，等

# 文档说明

## 环境要求

### 快发应用中心 SDK 接入要求

|项目|最低版本|
|:--|:--|
|Android Studio|1.5.1|
|Android SDK|API 14|
|Gradle|2.8|
|com.android.tools.build:gradle|1.5.0|
|com.android.support:v4|23.3.0|
|com.android.support:appcompat-v7|23.3.0|
|minSdkVersion|14|
|targetSdkVersion|14|

### 快发应用中心 SDK 接入Demo运行要求

|项目|最低版本|
|:--|:--|
|Android Studio|1.5.1|
|Android SDK|API 23|
|Gradle|2.8|
|com.android.tools.build:gradle|1.5.0|
|com.android.support:v4|23.3.0|
|com.android.support:appcompat-v7|23.3.0|
|com.android.support:design|23.3.0|
|minSdkVersion|14|
|targetSdkVersion|23|

## 接入准备

### 导入SDK

在Android Studio 工程的`根目录`的 `build.gradle`文件中配置

```
allprojects {
    repositories {
        maven {
            url 'http://nexus.i.kuaifazs.com/content/repositories/AndroidRelease/'
        }
        jcenter()
    }
}
```

在需要使用的`module`的`build.gradle`中配置

```gradle
dependencies {
    //暂未发布
}
```

### 详细接入配置

[详细文档请查看](KFAPPCenterAccess.md)
