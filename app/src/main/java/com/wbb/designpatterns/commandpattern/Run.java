package com.wbb.designpatterns.commandpattern;

public class Run {

    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();


        i.setCommand(c);
        i.executeCommand();

    }
}
