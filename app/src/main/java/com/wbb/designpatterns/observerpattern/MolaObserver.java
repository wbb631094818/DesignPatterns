package com.wbb.designpatterns.observerpattern;

import java.util.Random;

/**
 *  摩拉奖励
 */
public class MolaObserver implements Observer{
    @Override
    public void onUpdata() {
        System.out.println("获得"+new Random().nextInt(1000000)+"摩拉");
    }
}
