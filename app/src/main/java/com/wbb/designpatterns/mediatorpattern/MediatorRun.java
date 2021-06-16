package com.wbb.designpatterns.mediatorpattern;

public class MediatorRun {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcretColleague1 c1 = new ConcretColleague1(mediator);
        ConcretColleague2 c2 = new ConcretColleague2(mediator);

        mediator.setConcretColleague1(c1);
        mediator.setConcretColleague2(c2);

        c1.send("吃饭了吗");
        c2.send("没有呢，你请客吗？");
    }

}
