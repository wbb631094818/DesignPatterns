package com.wbb.designpatterns.mediatorpattern;

/**
 *  具体的同事2类
 */
public class ConcretColleague2 extends Colleague{

    public ConcretColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }
    public void  notify(String message){
        System.out.println("同事2得到消息: "+message);
    }
}
