package com.zixiu.designmodel.agent;

/**
 * Author: Snail
 * Time:  2020/8/25 11:33 AM
 * FileName:  Colleague
 * 简介：同事类
 */
public abstract class Colleague {

    protected Mediator mMediator;

    public Colleague(Mediator mediator) {
        this.mMediator = mediator;
    }
}
