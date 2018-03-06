package com.zc.dagger2.base;

import com.zc.dagger2.di.component.AppComponent;

/**
 * Created by zc on 2018/3/6.
 */

public class ComponentHolder {
    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static void setAppComponent(AppComponent appComponent) {
        ComponentHolder.appComponent = appComponent;
    }
}
