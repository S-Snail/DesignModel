package com.zixiu.designmodel.memento;

/**
 * Author: Snail
 * Time:  2020/8/26 4:14 PM
 * FileName:  Memento
 * 简介：
 */
public class Memento {
    private String mState = "";

    public Memento(String mState) {
        this.mState = mState;
    }

    public String getmState() {
        return mState;
    }
}
