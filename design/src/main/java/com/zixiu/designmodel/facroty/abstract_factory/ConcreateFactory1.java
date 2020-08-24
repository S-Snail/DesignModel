package com.zixiu.designmodel.facroty.abstract_factory;

/**
 * Author: Snail
 * Time:  2020/8/20 3:56 PM
 * FileName:  ConcreateFactory1
 * 简介：
 */
public class ConcreateFactory1 extends AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreateProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreateProductB1();
    }
}
