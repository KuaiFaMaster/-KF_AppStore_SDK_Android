package com.kf.kfappstoredemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kf.appstore.sdk.KFAppStoreApi;

public class DemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_main);
    }

    public void onSkipKFAppStore(View view) {
        KFAppStoreApi.enterAppStore(DemoMainActivity.this);
    }
}
