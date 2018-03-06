package com.zc.dagger2;

import android.app.Application;

import com.zc.dagger2.base.ComponentHolder;
import com.zc.dagger2.di.component.AppComponent;
import com.zc.dagger2.di.component.DaggerAppComponent;
import com.zc.dagger2.di.module.AppModule;

/**
 * Created by zc on 2018/3/6.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    public void inject(){
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        ComponentHolder.setAppComponent(appComponent);
    }

}
