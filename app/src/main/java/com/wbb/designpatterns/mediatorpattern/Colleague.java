package com.wbb.designpatterns.mediatorpattern;

/**
 *  抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

}
