package com.wbb.designpatterns.decorator;

/**
 *  具体的服装类  T恤
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.print("T恤");
    }
}
