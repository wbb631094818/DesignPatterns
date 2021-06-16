package com.wbb.designpatterns.commandpattern;

/**
 *  命令抽象类
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     *  执行命令
     */
    abstract public void execute();
}
