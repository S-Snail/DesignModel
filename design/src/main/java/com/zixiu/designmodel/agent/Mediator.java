package com.zixiu.designmodel.agent;

/**
 * Author: Snail
 * Time:  2020/8/25 11:31 AM
 * FileName:  Mediator
 * 简介：中介者 —— 用一个中介对象封装一系列对象的交互
 * 以买卖房产为例
 */
public abstract class Mediator {

    protected ConcreateColleague1 concreateColleague1;
    protected ConcreateColleague2 concreateColleague2;

    public void setConcreateColleague1(ConcreateColleague1 concreateColleague1) {
        this.concreateColleague1 = concreateColleague1;
    }

    public void setConcreateColleague2(ConcreateColleague2 concreateColleague2) {
        this.concreateColleague2 = concreateColleague2;
    }

    public ConcreateColleague1 getConcreateColleague1() {
        return concreateColleague1;
    }

    public ConcreateColleague2 getConcreateColleague2() {
        return concreateColleague2;
    }

    public abstract void findBuyer();

    public abstract void findSaler();
}
