package com.zixiu.designmodel.singleton;

/**
 * Author: Snail
 * Time:  2020/8/20 11:22 AM
 * FileName:  StaticInnerClassSingleTon
 * 简介：
 */
public class StaticInnerClassSingleTon {

    private StaticInnerClassSingleTon() {

    }

    public static StaticInnerClassSingleTon getStaticInnerClassSingleTon() {
        return SingleTonHolder.staticInnerClassSingleTon;
    }

    /**
     * 静态内部类的方式，只有在调用getInstance时才lazy初始化，线程安全
     */
    private static class SingleTonHolder {
        public static StaticInnerClassSingleTon staticInnerClassSingleTon = new StaticInnerClassSingleTon();
    }

}
