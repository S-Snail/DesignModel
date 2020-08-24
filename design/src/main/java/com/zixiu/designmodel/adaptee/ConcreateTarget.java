package com.zixiu.designmodel.adaptee;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/20 8:12 PM
 * FileName:  ConcreateTarget
 * 简介：目标角色
 */
public class ConcreateTarget implements Target {
    @Override
    public void volt5() {
        Log.d("适配器模式", "目标角色 -> 5V");
    }
}
