package com.wbb.designpatterns.flyweightpattern;

/**
 *  不需要共享的Flyweight子类
 */
public class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight实现类："+extrinsicstate);
    }
}
