package com.zc.dagger2.di.component;

import android.content.SharedPreferences;

import com.zc.dagger2.MyApplication;
import com.zc.dagger2.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zc on 2018/3/6.
 */
@Singleton//不要忘了还要在关联的Component接口中声明，否则会编译报错
@Component(modules = AppModule.class)
public interface AppComponent {
    MyApplication getApp();
    SharedPreferences getSP();
}
