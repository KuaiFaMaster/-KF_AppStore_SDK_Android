[TOC]

# 快发应用中心

**`使用前请务必阅读工程索引及工程说明书`**

* 请尽量使用Android Studio开发，如使用eclipse，请配置eclipse下的Gradle依赖
* 如果没有配置gradle环境，请手动解压各个包的`.arr`,拿出jar包，资源文件等，当然这样非常麻烦

# 文档说明

## 发布版本

* 0.1.5
* compile 'com.kf.appstore.sdk:AppStore-Android:0.1.5@aar'

## 环境要求

### 快发应用中心 SDK 接入要求

|项目|最低版本|
|:--|:--|
|Android Studio|1.3.1|
|Android SDK|API 14|
|Gradle|2.6|
|com.android.tools.build:gradle|1.3.0|
|com.android.support:v4|23.3.0|
|com.android.support:appcompat-v7|23.3.0|
|minSdkVersion|14|
|targetSdkVersion|23|

推荐配置

|项目|最低版本|
|:--|:--|
|Android Studio|1.5.1|
|Android SDK|API 14|
|Gradle|2.8|
|com.android.tools.build:gradle|1.3.0|
|com.android.support:v4|23.3.0|
|com.android.support:appcompat-v7|23.3.0|
|minSdkVersion|14|
|targetSdkVersion|23|

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
    // third library start
    compile 'com.android.support:appcompat-v7:23.3.0'
    compile 'com.android.support:design:23.3.0'
    compile 'com.android.support:recyclerview-v7:23.3.0'
    compile 'com.nineoldandroids:library:2.4.0'
    compile 'cn.bingoogolapple:bga-refreshlayout:1.1.4@aar'
    compile 'cn.bingoogolapple:bga-banner:2.0.4@aar'
    compile 'cn.bingoogolapple:bga-adapter:1.0.9@aar'
    compile 'cn.bingoogolapple:bga-swipeitemlayout:1.0.4@aar'
    compile 'org.xutils:xutils:3.3.34'
    compile group: 'com.google.code.gson', name: 'gson', version: '2.6.2'
    compile group: 'mdl.sinlov.imagetoolbox', name: 'imagetoolbox', version: '1.0.3'
    compile 'com.dataeye.sdk.appsdk:appsdk:2.5.2@aar'
    // third library end
    compile 'com.kf.appstore.sdk:AppStore-Android:0.1.5@aar'
}
```

更新版本，修改`0.0.2@aar`到新版本，如果想简单使用，不用关心版本，可以修改为`latest.integration@aar`

### 详细接入配置

[详细文档请查看](KFAPPCenterAccess.md)
