package com.zixiu.designmodel.command;

/**
 * Author: Snail
 * Time:  2020/8/26 3:09 PM
 * FileName:  Invoker
 * 简介：调用者，相当于项目经理
 */
public class Invoker {

    private Command mCommand;

    public void setmCommand(Command mCommand) {
        this.mCommand = mCommand;
    }

    public void action() {
        mCommand.execute();
    }

}
