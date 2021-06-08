package com.wbb.designpatterns.observerpattern;

import java.util.ArrayList;

/**
 * 被观察者的抽象类
 */
public abstract class Subject {


    private final ArrayList<Observer> list = new ArrayList<>();

    // 删除观察者
    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    // 添加观察者
    public void setObserver(Observer observer) {
        this.list.add(observer);
    }

    // 通知所有的观察者
    public void notifyObserver() {
        for (Observer o : list) {
            o.onUpdata();
        }
    }
}
