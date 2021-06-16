package com.wbb.designpatterns.iteratorpattern;


/**
 *  接口类  所有遍历的集合的接口  只要实现了该接口，这个类就将成为一个保存多个元素的集合
 */
public abstract class Aggregate {

    public abstract Iterator iterator();
}
