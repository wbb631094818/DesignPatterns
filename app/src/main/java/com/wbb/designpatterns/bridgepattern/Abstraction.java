package com.wbb.designpatterns.bridgepattern;

/**
 *  抽象类
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
