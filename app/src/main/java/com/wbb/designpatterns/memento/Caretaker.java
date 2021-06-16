package com.wbb.designpatterns.memento;

/**
 *  管理备忘录的类
 */
public class Caretaker {

    private Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
