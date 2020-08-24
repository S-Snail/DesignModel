package com.zixiu.designmodel.singleton;

/**
 * Author: Snail
 * Time:  2020/8/20 10:29 AM
 * FileName:  SingleTon
 * 简介：
 */
public class SingleTon {

    /**
     * 懒汉式，线程安全，性能低
     */

    private static SingleTon singleTon;

    private SingleTon() {

    }

    public static synchronized SingleTon getSingleTon() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }

}
