package com.kf.kfappstoredemo;

import android.app.Application;

import com.kf.appstore.sdk.InitCallback;
import com.kf.appstore.sdk.KFAppStoreApi;
import com.kf.appstore.sdk.KFConstants;

/**
 * <pre>
 *     sinlov
 *
 *     /\__/\
 *    /`    '\
 *  ≈≈≈ 0  0 ≈≈≈ Hello world!
 *    \  --  /
 *   /        \
 *  /          \
 * |            |
 *  \  ||  ||  /
 *   \_oo__oo_/≡≡≡≡≡≡≡≡o
 *
 * </pre>
 * Created by sinlov on 16/5/26.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
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
    }
}
