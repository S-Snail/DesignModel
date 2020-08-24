package com.zixiu.designmodel.flyweight;

/**
 * Author: Snail
 * Time:  2020/8/21 4:19 PM
 * FileName:  Flyweight
 * 简介：享元模式:使用共享对象可以有效的支持大量的细粒度对象
 * 抽象享元角色
 * 优点：避免
 */
public abstract class Flyweight {
    //内部状态：可以共享的信息，存储在对象内部并且不会随环境的改变而改变
    private String mIntrinsic;

    //外部状态：不可以共享的信息，随着环境的改变而改变，是对象的索引值
    protected String mExtrinsic;

    public Flyweight(String extrinsic) {
        this.mExtrinsic = extrinsic;
    }
}
