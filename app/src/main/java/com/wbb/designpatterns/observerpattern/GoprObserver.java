package com.wbb.designpatterns.observerpattern;

/**
 *  圣痕奖励
 */
public class GoprObserver implements Observer{
    @Override
    public void onUpdata() {
        System.out.println("获取渡火*2");
    }
}
