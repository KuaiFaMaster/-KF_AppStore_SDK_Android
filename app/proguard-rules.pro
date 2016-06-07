# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/sinlov/opt/android-sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-keepattributes Signature

-keep class com.google.** {
    <fields>;
    <methods>;
}


-keepclassmembers class * extends java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}


# Gson specific classes
-keep class sun.misc.Unsafe {
    <fields>;
    <methods>;
}


# -keep class com.google.gson.stream.** { *; }
# Application classes that will be serialized/deserialized over Gson
-keep class com.kf.appstore.sdk.bean.** {
    <fields>;
    <methods>;
}

-dontwarn com.nineoldandroids.**
-keep class com.nineoldandroids.**{ *;}


-keep class android.view.** { *; }

-dontwarn  android.net.http.**
-keep class android.net.http.** { *; }

-dontwarn org.apache.http.**
-keep class org.apache.http.** { *; }

-dontwarn cn.bingoogolapple.**
-keep class cn.bingoogolapple.** { *; }

-dontwarn org.xutils.**
-keep class org.xutils.** { *; }

-dontwarn com.kf.appstore.sdk.**
-keep class com.kf.appstore.sdk.** { *; }

-keep class * extends java.lang.annotation.Annotation { *; }