package com.wbb.designpatterns.bridgepattern;

/**
 *  灰色
 */
public class GrayColor implements Color{
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的"+shape);
    }
}
