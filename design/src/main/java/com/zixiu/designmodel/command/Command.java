package com.zixiu.designmodel.command;

/**
 * Author: Snail
 * Time:  2020/8/26 2:59 PM
 * FileName:  Command
 * 简介：命令角色，需要执行的所有命令都在这里执行
 */
public abstract class Command {
    protected Receiver mReceiver;

    public Command(Receiver receiver) {
        this.mReceiver = receiver;
    }

    public abstract void execute();
}
