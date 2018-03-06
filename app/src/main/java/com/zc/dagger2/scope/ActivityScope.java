package com.zc.dagger2.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by zc on 2018/3/6.
 */
@Scope//注意此处是@Scope，而不是@ActivityScope
@Retention(RetentionPolicy.RUNTIME)//注意此处不要忘记写
public @interface ActivityScope {
}
