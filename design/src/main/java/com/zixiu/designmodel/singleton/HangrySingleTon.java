package com.zixiu.designmodel.singleton;

/**
 * Author: Snail
 * Time:  2020/8/20 11:13 AM
 * FileName:  HangerySingleTon
 * 简介：
 */
public class HangrySingleTon {

    /**
     * 饿汉式，非lazy初始化，线程安全，基于ClassLoader机制避免了多线程问题，但浪费内存
     */

    //方式一
    private static HangrySingleTon hangrySingleTon = new HangrySingleTon();

    //方式二
    static {
        hangrySingleTon = new HangrySingleTon();
    }

    private HangrySingleTon() {

    }

    public static synchronized HangrySingleTon getHangrySingleTon() {
        return hangrySingleTon;
    }


}
