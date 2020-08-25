package com.zixiu.designmodel.template;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/25 2:53 PM
 * FileName:  ConcreateClass2
 * 简介：
 */
public class ConcreateClass2 extends AbstractClass {
    @Override
    protected void method1() {
        Log.d("模版模式","ConcreateClass2 -> method1()");
    }

    @Override
    protected void method2() {
        Log.d("模版模式","ConcreateClass2 -> method2()");
    }

    @Override
    protected boolean hookMethod() {
        return false;
    }
}
