package com.zixiu.designmodel.facade;

/**
 * Author: Snail
 * Time:  2020/8/24 2:26 PM
 * FileName:  Facade
 * 简介：门面模式：子系统与外部通信，必须通过一个类来进行
 * 好处：屏蔽代码风险
 */
public class Facade {

    private ClassA mClassA = new ClassA();
    private ClassB mClassB = new ClassB();
    private ClassC mClassC = new ClassC();

    public void doSomethingA() {
        mClassA.doSomething();
    }

    public void doSomethingB() {
        mClassB.doSomething();
    }

    public void doSomethingC() {
        mClassC.doSomething();
    }

}
