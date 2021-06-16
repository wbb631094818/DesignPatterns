package com.wbb.designpatterns.adapterpattern;

/**
 *  适配器   将Adaptee类和Target类功能适配
 *  将Target类的request方法功能变成Adaptee类specificRequest方法的功能
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
       adaptee.specificRequest();
    }
}
