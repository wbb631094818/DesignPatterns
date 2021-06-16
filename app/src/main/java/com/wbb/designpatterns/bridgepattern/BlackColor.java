package com.wbb.designpatterns.bridgepattern;

/**
 *  黑色
 */
public class BlackColor implements Color{
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的"+shape);
    }
}
