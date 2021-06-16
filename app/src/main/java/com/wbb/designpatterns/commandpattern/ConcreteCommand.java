package com.wbb.designpatterns.commandpattern;

/**
 *  具体的命令类
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
