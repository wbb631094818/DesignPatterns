package com.wbb.designpatterns.memento;

/**
 *  备忘录类   主要记录对象的某一个时间的状态
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
