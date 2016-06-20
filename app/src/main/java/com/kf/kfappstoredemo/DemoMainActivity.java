package com.kf.kfappstoredemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.kf.appstore.sdk.InitCallback;
import com.kf.appstore.sdk.KFAppStoreApi;
import com.kf.appstore.sdk.KFConstants;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoMainActivity extends AppCompatActivity {

    @BindView(R.id.btn_skip_kf_app_store)
    Button btnSkipKfAppStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        useSDKInActivity();
    }

    private void useSDKInActivity() {
        KFAppStoreApi.init(this.getApplication(), new InitCallback() {
            @Override
            public void initResponse(int code, String msg) {
                if (KFConstants.Init.INIT_SUCCESS == code) {
                    //Success
                    if (null != btnSkipKfAppStore) {
                        btnSkipKfAppStore.setVisibility(View.VISIBLE);
                    }
                } else if (KFConstants.Init.INIT_fail == code) {
                    //fail
                    if (null != btnSkipKfAppStore) {
                        btnSkipKfAppStore.setVisibility(View.GONE);
                    }
                }
            }
        });
    }

    @OnClick(R.id.btn_skip_kf_app_store)
    public void onClick() {
        KFAppStoreApi.enterAppStore(DemoMainActivity.this);
    }
}
