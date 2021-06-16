package com.wbb.designpatterns.memento;

public class MementoRun {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        // 存储备忘录  记录状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // 更改状态
        originator.setState("Off");
        originator.show();

        // 恢复状态
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
