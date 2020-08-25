package com.zixiu.designmodel.template;

/**
 * Author: Snail
 * Time:  2020/8/25 2:45 PM
 * FileName:  AbstractClass
 * 简介：模板模式
 * 抽象模板
 */
public abstract class AbstractClass {

    /**
     * 基本方法：由子类实现，在模板方法中被调用
     */
    protected abstract void method1();

    protected abstract void method2();

    /**
     * 钩子方法，子类可以通过钩子函数，约束父类的行为
     *
     * @return
     */
    protected abstract boolean hookMethod();

    /**
     * 模版方法：可有一个或多个，实现对基本方法的调度，完成固定逻辑
     * 为防止恶意操作，一般加上final防止被复写
     */
    public final void templete() {
        method1();
        if (hookMethod()) {
            method2();
        }
    }

}
