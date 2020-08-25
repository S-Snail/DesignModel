package com.zixiu.designmodel.template;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/25 2:53 PM
 * FileName:  ConcreateClass1
 * 简介：
 */
public class ConcreateClass1 extends AbstractClass{
    @Override
    protected void method1() {
        Log.d("模版模式","ConcreateClass1 -> method1()");
    }

    @Override
    protected void method2() {
        Log.d("模版模式","ConcreateClass1 -> method2()");
    }

    @Override
    protected boolean hookMethod() {
        return true;
    }
}
