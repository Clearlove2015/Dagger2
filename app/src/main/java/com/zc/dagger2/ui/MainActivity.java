package com.zc.dagger2.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.zc.dagger2.MyApplication;
import com.zc.dagger2.R;
import com.zc.dagger2.base.ComponentHolder;
import com.zc.dagger2.bean.TestBean;
import com.zc.dagger2.di.component.DaggerTestComponent;
import com.zc.dagger2.di.module.TestModule;
import com.zc.dagger2.util.AppToast;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btn_click)
    Button btnClick;

    @Inject
    MyApplication application;
    @Inject
    SharedPreferences sp;
    @Inject
    TestBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerTestComponent.builder()
                .appComponent(ComponentHolder.getAppComponent())
                .testModule(new TestModule(this))
                .build()
                .inject(this);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("key", "value");
        editor.commit();

        AppToast.show(sp.getString("key", "default_value") + "\n" + bean.getContent());
    }

    @OnClick(R.id.btn_click)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }
}
