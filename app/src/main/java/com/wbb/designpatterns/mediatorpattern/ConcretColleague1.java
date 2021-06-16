package com.wbb.designpatterns.mediatorpattern;

/**
 *  具体的同事1类
 */
public class ConcretColleague1 extends Colleague{

    public ConcretColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void  notify(String message){
        System.out.println("同事1得到消息: "+message);
    }
}
