package com.zixiu.designmodel.bridge;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/24 3:15 PM
 * FileName:  RefineAbstracion2
 * 简介：
 */
public class RefineAbstraction2 extends Abstraction {

    public RefineAbstraction2(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operator() {
        Log.d("桥接模式", "小杯 - " + this.getImplementor().implement());
    }
}
