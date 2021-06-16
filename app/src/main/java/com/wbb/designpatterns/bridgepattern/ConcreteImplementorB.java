package com.wbb.designpatterns.bridgepattern;

public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现类B的方法执行");
    }
}
