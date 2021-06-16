package com.wbb.designpatterns.bridgepattern;

/**
 *  被提炼的抽象类
 */
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        implementor.operation();
    }
}
