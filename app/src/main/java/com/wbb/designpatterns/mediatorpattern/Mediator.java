package com.wbb.designpatterns.mediatorpattern;

/**
 *  抽象的中介类
 *
 */
public abstract class Mediator {

    public abstract void send(String message,Colleague colleague);
}
