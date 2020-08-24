package com.zixiu.designmodel.facroty.factory_method;

/**
 * Author: Snail
 * Time:  2020/8/20 3:00 PM
 * FileName:  Factory
 * 简介：
 */
public abstract class Factory {

    public abstract <T extends Products> T createProducts(Class<T> tClass);

}
