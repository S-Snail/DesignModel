package com.zixiu.designmodel.memento;

/**
 * Author: Snail
 * Time:  2020/8/26 4:17 PM
 * FileName:  Creataker
 * 简介：备忘录角色管理员
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
