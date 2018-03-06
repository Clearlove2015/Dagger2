package com.zc.dagger2.di.module;

import android.app.Activity;

import com.zc.dagger2.bean.TestBean;
import com.zc.dagger2.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zc on 2018/3/6.
 */
@Module
public class TestModule {
    Activity activity;

    public TestModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope//局部单例
    TestBean provideTestBean(){
        return new TestBean("TestBean");
    }
}
