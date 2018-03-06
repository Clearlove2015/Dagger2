package com.zc.dagger2.util;

import android.widget.Toast;

import com.zc.dagger2.MyApplication;
import com.zc.dagger2.base.ComponentHolder;

/**
 * Created by zc on 2018/3/6.
 */

public class AppToast {

    public static void show(String content){
        MyApplication context = ComponentHolder.getAppComponent().getApp();
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
    }

}
