package com.wbb.designpatterns.bridgepattern;

/**
 *  长方形
 */
public class RectangleShape extends Shape{
    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}
