package com.wbb.designpatterns.bridgepattern;


/**
 *  形状类  为一个抽象类  主要提供画形状的方法
 */
public abstract class Shape {

    Color color;

    /**
     *  连接颜色  桥接
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
