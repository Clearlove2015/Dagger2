package com.zc.dagger2.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.zc.dagger2.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zc on 2018/3/6.
 */
@Module
public class AppModule {
    MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton//全局单例
    MyApplication provideApplication(){
        return application;
    }

    @Provides
    @Singleton//全局单例
    SharedPreferences provideSharedPreferences(){
        return application.getSharedPreferences("sp_file", Context.MODE_PRIVATE);
    }

}
