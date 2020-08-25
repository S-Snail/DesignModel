package com.zixiu.designmodel.agent;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/25 1:33 PM
 * FileName:  ConcreateMediator
 * 简介：中介
 */
public class ConcreateMediator extends Mediator {
    @Override
    public void findBuyer() {
        Log.d("中介模式", "中介 - 已找到买家");
        this.getConcreateColleague1().pay();
    }

    @Override
    public void findSaler() {
        Log.d("中介模式", "中介 - 已找到卖家");
        this.getConcreateColleague2().clean();
        this.getConcreateColleague2().saller();
    }
}
