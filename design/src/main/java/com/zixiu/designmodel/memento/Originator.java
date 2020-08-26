package com.zixiu.designmodel.memento;

/**
 * Author: Snail
 * Time:  2020/8/26 4:11 PM
 * FileName:  Originator
 * 简介：
 */
public class Originator {

    private String mState = "";

    public String getmState() {
        return mState;
    }

    public void setmState(String state) {
        this.mState = state;
    }


    public Memento createMemento() {
        return new Memento(this.mState);
    }

    public void restoreMemento(Memento memento) {
        mState = memento.getmState();
    }
}
