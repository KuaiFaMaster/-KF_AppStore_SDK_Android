[TOC]

# 接入准备

* 请确认开发环境
* 导入SDK
* 接入到应用

# 配置

* 编码 UTF-8
* jdk 1.7 及以上
* Android Studio 1.5.1 及以上
* Gradle 2.8 及以上

## 权限配置

```xml
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.READ_PHONE_STATE"/>
```

## AndroidManifest 配置

在`module`的`AndroidManifest.xml` 中按如下配置

```xml
        <activity
            android:name="com.kf.appstore.sdk.ui.KFGameCenterActivity"
            android:launchMode="singleTask"
            android:screenOrientation="portrait"
            android:theme="@style/KF.FullScreen.Write" />
        <activity
            android:name="com.kf.appstore.sdk.ui.KFAppDetailActivity"
            android:label="@string/title_activity_kfapp_detail"
            android:launchMode="singleTask"
            android:screenOrientation="portrait"
            android:theme="@style/KF.FullScreen.Write"/>
        <activity
            android:name="com.kf.appstore.sdk.ui.KFDownloadManageActivity"
            android:label="@string/title_activity_kfdownload_manage"
            android:launchMode="singleTask"
            android:screenOrientation="portrait"
            android:theme="@style/KF.FullScreen.Write" />
        <activity
            android:name="com.kf.appstore.sdk.ui.KFFeedBackActivity"
            android:label="@string/title_activity_feed_back"
            android:launchMode="singleTask"
            android:screenOrientation="portrait"
            android:windowSoftInputMode="adjustPan|stateAlwaysHidden"
            android:theme="@style/KF.FullScreen.Write"/>

        <service
            android:name="com.kf.appstore.sdk.service.KFDownloadService"
            android:stopWithTask="true" />

```

如出现报错合并主题失败请在`module`的`AndroidManifest.xml`中加入

```xml
<manifest
	...
	xmlns:tools="http://schemas.android.com/tools">
	<application
		...
		tools:replace="android:theme">
	</application>
</manifest>
```

# Application 配置

在 Application 的 onCreate 方法中添加

```java
KFAppStoreApi.init(this, new InitCallback() {
    @Override
    public void initResponse(int code, String msg) {
        if (KFConstants.Init.INIT_SUCCESS == code) {
            //Success
        } else if (KFConstants.Init.INIT_fail == code) {
            //fail
        }
    }
});
```

## 进入下载中心

`**请确认初始化成功后使用SDK**`

```java
KFAppStoreApi.enterAppStore(MainActivity.this);
```