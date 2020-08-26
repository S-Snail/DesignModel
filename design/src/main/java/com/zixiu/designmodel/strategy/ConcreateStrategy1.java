package com.zixiu.designmodel.strategy;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/26 10:20 AM
 * FileName:  ConcreateStrategy1
 * 简介：
 */
public class ConcreateStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        Log.d("策略模式", "执行策略1");
    }
}
