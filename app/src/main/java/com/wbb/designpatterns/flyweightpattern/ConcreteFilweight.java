package com.wbb.designpatterns.flyweightpattern;

/**
 *  享元接口的实现类
 */
public class ConcreteFilweight extends Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("Flyweight具体实现类: "+extrinsicstate);
    }
}
