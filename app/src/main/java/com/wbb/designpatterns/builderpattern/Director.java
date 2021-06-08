package com.wbb.designpatterns.builderpattern;

/**
 *  指挥者类
 */
public class Director {

    public void construct(ProductBuilder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

}
