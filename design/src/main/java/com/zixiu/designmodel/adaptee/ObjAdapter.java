package com.zixiu.designmodel.adaptee;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/20 8:41 PM
 * FileName:  ObjAdapter
 * 简介：对象适配器（用的比较多）
 */
public class ObjAdapter implements Target {
    private Adaptee mAdaptee;

    public ObjAdapter(Adaptee mAdaptee) {
        this.mAdaptee = mAdaptee;
    }

    @Override
    public void volt5() {
        Log.d("适配器模式", "对象适配器角色 -> 5V");
    }

    public void volt220() {
        mAdaptee.volt220();
    }
}
