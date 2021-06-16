package com.wbb.designpatterns.bridgepattern;

/**
 *  正方形
 */
public class SquareShape extends Shape{
    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
