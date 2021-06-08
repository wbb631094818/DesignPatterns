package com.wbb.designpatterns.observerpattern;

/**
 *  游戏角色  玩家
 */
public class Player extends Subject{

    /**
     *  打副本
     */
    public void aCopyThePlay(){
        System.out.println("打赢火本。领取奖励中");
        // 通知各个监听者
        notifyObserver();
    }

}
