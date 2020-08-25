package com.zixiu.designmodel.agent;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/25 11:36 AM
 * FileName:  ConcreateColleague1
 * 简介：买家
 */
public class ConcreateColleague1 extends Colleague {

    public ConcreateColleague1(Mediator mediator) {
        super(mediator);
    }

    public void buyer() {
        Log.d("中介模式", "买家 - hi中介，我要买房，帮我找房源");
        mMediator.findSaler();
    }

    public void pay(){
        Log.d("中介模式","买家 - 付款");
    }

}
