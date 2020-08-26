package com.zixiu.designmodel.command;

/**
 * Author: Snail
 * Time:  2020/8/26 3:04 PM
 * FileName:  ConcreateCommand1
 * 简介：
 */
public class ConcreateCommand1 extends Command {

    public ConcreateCommand1() {
        super(new ConcreateReceiver1());
    }

    public ConcreateCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.mReceiver.doSomething();
    }
}
