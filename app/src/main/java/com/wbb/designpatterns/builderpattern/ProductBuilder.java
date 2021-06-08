package com.wbb.designpatterns.builderpattern;

/**
 *  产品建造者模式抽象类   所有的具体建造类都必须继承该类实现里面的抽象方法
 */
public abstract class ProductBuilder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();

}
