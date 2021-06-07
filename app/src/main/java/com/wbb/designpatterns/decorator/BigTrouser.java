package com.wbb.designpatterns.decorator;

/**
 *  衣服 大裤衩
 */
public class BigTrouser extends Finery{

    @Override
    public void show() {
        super.show();
        System.out.print("大裤衩");
    }
}
