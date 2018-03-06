package com.zc.dagger2.bean;

/**
 * Created by zc on 2018/3/6.
 */

public class TestBean {
    String content;

    public TestBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
