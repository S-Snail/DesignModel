package com.zixiu.designmodel.facroty.factory_method;

/**
 * Author: Snail
 * Time:  2020/8/20 3:05 PM
 * FileName:  ConcreateFactory
 * 简介：
 */
public class ConcreateFactory extends Factory {
    @Override
    public <T extends Products> T createProducts(Class<T> tClass) {
        Products product = null;
        try {
            product = (Products) Class.forName(tClass.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
