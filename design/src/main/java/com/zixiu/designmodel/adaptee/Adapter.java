package com.zixiu.designmodel.adaptee;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/20 8:14 PM
 * FileName:  Adapter
 * 简介：适配器角色
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void volt5() {
        Log.d("适配器模式", "适配器角色 -> 5V");
    }

    @Override
    public void volt220() {
        super.volt220();
    }
}
