package com.wbb.designpatterns.bridgepattern;

/**
 *  白色
 */
public class WhiteColor implements Color{
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的"+shape);
    }
}
