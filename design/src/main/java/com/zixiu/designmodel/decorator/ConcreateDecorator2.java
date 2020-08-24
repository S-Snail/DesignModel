package com.zixiu.designmodel.decorator;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/21 5:07 PM
 * FileName:  ConcreateDecorator2
 * 简介：
 */
public class ConcreateDecorator2 extends Decorator {

    public ConcreateDecorator2(Component mComponent) {
        super(mComponent);
    }

    @Override
    public void operate() {
        decorator2();
        super.operate();
    }

    private void decorator2() {
        Log.d("装饰者模式", "装饰者2");
    }
}
