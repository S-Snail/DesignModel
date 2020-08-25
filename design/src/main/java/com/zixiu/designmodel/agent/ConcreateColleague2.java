package com.zixiu.designmodel.agent;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/25 11:36 AM
 * FileName:  ConcreateColleague2
 * 简介：卖家
 */
public class ConcreateColleague2 extends Colleague {

    public ConcreateColleague2(Mediator mediator) {
        super(mediator);
    }

    public void saller() {
        Log.d("中介模式", "卖家 - hi中介，房子打扫好了，可以出售了");
        mMediator.findBuyer();
    }

    public void clean() {
        Log.d("中介模式", "卖家 - 打扫房子");
    }
}
