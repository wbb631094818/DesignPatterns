package com.wbb.designpatterns.bridgepattern;

/**
 *  圆形形状
 */
public class CricleShape extends Shape{
    @Override
    public void draw() {
        color.bepaint("圆形");
    }
}
