package com.zc.dagger2.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zc.dagger2.MyApplication;
import com.zc.dagger2.R;
import com.zc.dagger2.base.ComponentHolder;
import com.zc.dagger2.bean.TestBean;
import com.zc.dagger2.di.component.DaggerTestComponent;
import com.zc.dagger2.di.module.TestModule;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {
    @Bind(R.id.tv_content)
    TextView tvContent;

    @Inject
    MyApplication application;
    @Inject
    SharedPreferences sp;
    @Inject
    TestBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        DaggerTestComponent.builder()
                .appComponent(ComponentHolder.getAppComponent())
                .testModule(new TestModule(this))
                .build()
                .inject(this);
        tvContent.setText(sp.getString("key","default_value") + " " + bean.getContent());
    }
}
