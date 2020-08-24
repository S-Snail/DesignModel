package com.zixiu.designmodel.bridge;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/24 3:15 PM
 * FileName:  RefineAbstraction1
 * 简介：
 */
public class RefineAbstraction1 extends Abstraction {

    public RefineAbstraction1(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operator() {
        Log.d("桥接模式", "大杯 - " + this.getImplementor().implement());
    }
}
