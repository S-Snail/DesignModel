package com.zixiu.designmodel.bridge;

/**
 * Author: Snail
 * Time:  2020/8/24 3:07 PM
 * FileName:  Abstraction
 * 简介：桥接模式：通过抽象角色引用实现角色，将抽象和实现解耦，使得两者可以独立的变化
 * 应用场景：同一个角色有两个（或多个）变化的维度，并且两个维度都需要扩展
 * 例如：冲咖啡 两个维度：大/小杯  加/不加糖
 */
public abstract class Abstraction {

    //抽象化角色，保持实现化角色的引用，是桥接模式的核心
    //这里的实现化角色，代码咖啡的调料
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public abstract void operator();
}
