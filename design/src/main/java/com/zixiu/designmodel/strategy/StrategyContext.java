package com.zixiu.designmodel.strategy;

/**
 * Author: Snail
 * Time:  2020/8/26 10:22 AM
 * FileName:  StrategyContext
 * 简介：
 */
public class StrategyContext {

    private Strategy mStrategy;

    public StrategyContext(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public void setmStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public void doSomething() {
        mStrategy.doSomething();
    }
}
