package com.wbb.designpatterns.memento;

/**
 *  发起人类  主要是备忘这个类的状态
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("状态："+state);
    }
}
