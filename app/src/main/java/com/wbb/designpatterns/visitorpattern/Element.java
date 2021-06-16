package com.wbb.designpatterns.visitorpattern;

/**
 *  定义一个Accept操作
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);
}
