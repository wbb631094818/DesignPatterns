package com.wbb.designpatterns.commandpattern;

/**
 *  调用者  要求该命令执行这个请求
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
