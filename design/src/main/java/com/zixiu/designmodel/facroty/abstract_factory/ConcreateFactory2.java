package com.zixiu.designmodel.facroty.abstract_factory;

/**
 * Author: Snail
 * Time:  2020/8/20 3:57 PM
 * FileName:  ConcreateFactory2
 * 简介：
 */
public class ConcreateFactory2 extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreateProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreateProductB2();
    }
}
