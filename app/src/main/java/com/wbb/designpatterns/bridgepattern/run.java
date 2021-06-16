package com.wbb.designpatterns.bridgepattern;

public class run {
    public static void main(String[] args) {
        //白色
        Color white = new WhiteColor();
        //正方形
        Shape square = new SquareShape();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectange = new RectangleShape();
        rectange.setColor(white);
        rectange.draw();
    }
}
