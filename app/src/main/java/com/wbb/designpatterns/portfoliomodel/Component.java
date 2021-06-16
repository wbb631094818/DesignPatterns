package com.wbb.designpatterns.portfoliomodel;

/**
 *  组合模式的抽象类
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
