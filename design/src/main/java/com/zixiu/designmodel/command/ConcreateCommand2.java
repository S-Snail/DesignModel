package com.zixiu.designmodel.command;

/**
 * Author: Snail
 * Time:  2020/8/26 3:05 PM
 * FileName:  ConcreateCommand2
 * 简介：
 */
public class ConcreateCommand2 extends Command {

    public ConcreateCommand2() {
        super(new ConcreateReceiver2());
    }

    public ConcreateCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.mReceiver.doSomething();
    }
}
