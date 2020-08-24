package com.zixiu.designmodel.decorator;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/21 5:04 PM
 * FileName:  ConcreateDecorator1
 * 简介：
 */
public class ConcreateDecorator1 extends Decorator {

    public ConcreateDecorator1(Component mComponent) {
        super(mComponent);
    }

    @Override
    public void operate() {
        decorator1();
        super.operate();
    }

    private void decorator1() {
        Log.d("装饰者模式", "装饰者1");
    }
}
