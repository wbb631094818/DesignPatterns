package com.wbb.designpatterns.mediatorpattern;

/**
 *  具体的中介实现类
 */
public class ConcreteMediator extends Mediator{

    private ConcretColleague1 concretColleague1;
    private ConcretColleague2 concretColleague2;

    public void setConcretColleague1(ConcretColleague1 concretColleague1) {
        this.concretColleague1 = concretColleague1;
    }

    public void setConcretColleague2(ConcretColleague2 concretColleague2) {
        this.concretColleague2 = concretColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concretColleague1){
            concretColleague2.notify(message);
        }else {
            concretColleague1.notify(message);
        }
    }
}
