package com.zixiu.designmodel.proxy.static_proxy;

import android.util.Log;

import com.zixiu.designmodel.proxy.Subject;

/**
 * Author: Snail
 * Time:  2020/8/20 4:45 PM
 * FileName:  RealSubject
 * 简介：
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        Log.d("代理模式", "真正的主题");
    }
}
