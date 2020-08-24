package com.zixiu.designmodel.singleton;

/**
 * Author: Snail
 * Time:  2020/8/20 10:36 AM
 * FileName:  DCLSingleTon
 * 简介：
 */
public class DCLSingleTon {

    /**
     * double checked locking
     * 双检索模式/双重校验锁模式，线程安全，且在多线程下能保持高性能
     */
    private static DCLSingleTon dclSingleTon;

    private DCLSingleTon() {

    }

    public static DCLSingleTon getDCLSingleTon() {
        if (dclSingleTon == null) {
            synchronized (DCLSingleTon.class) {
                if (dclSingleTon == null) {
                    dclSingleTon = new DCLSingleTon();
                }
            }
        }
        return dclSingleTon;
    }
}
