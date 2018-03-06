package com.zc.dagger2.di.component;

import com.zc.dagger2.di.module.TestModule;
import com.zc.dagger2.scope.ActivityScope;
import com.zc.dagger2.ui.MainActivity;
import com.zc.dagger2.ui.SecondActivity;

import dagger.Component;

/**
 * Created by zc on 2018/3/6.
 */
@ActivityScope//不要忘了还要在关联的Component接口中声明，否则会编译报错
@Component(modules = TestModule.class,dependencies = AppComponent.class)//注意此处dependencies = AppComponent.class，而不是dependencies = AppModule.class
public interface TestComponent {
    void inject(MainActivity activity);
    void inject(SecondActivity activity);
}
