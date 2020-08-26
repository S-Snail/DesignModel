package com.zixiu.designmodel.command;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/26 2:51 PM
 * FileName:  ConcreateReceiver1
 * 简介：
 */
public class ConcreateReceiver1 extends Receiver {
    @Override
    public void doSomething() {
        Log.d("命令模式", "写代码");
    }
}
