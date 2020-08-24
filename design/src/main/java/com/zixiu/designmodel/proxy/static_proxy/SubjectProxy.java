package com.zixiu.designmodel.proxy.static_proxy;

import android.util.Log;

import com.zixiu.designmodel.proxy.Subject;

/**
 * Author: Snail
 * Time:  2020/8/20 4:48 PM
 * FileName:  SubjectProxy
 * 简介：
 */
public class SubjectProxy implements Subject {
    public Subject mSubject;
    private String tag = "代理模式";

    public SubjectProxy(Subject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void request() {
        before();
        mSubject.request();
        after();
    }

    private void before() {
        Log.d(tag, "代理开始");
    }

    private void after() {
        Log.d(tag, "代理完成");
    }
}
