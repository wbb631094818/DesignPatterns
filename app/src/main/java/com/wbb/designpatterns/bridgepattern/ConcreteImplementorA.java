package com.wbb.designpatterns.bridgepattern;

public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现类A的方法执行");
    }
}
