package com.wbb.designpatterns.visitorpattern;

/**
 *  具体元素  实现accept操作
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitconcreteElementB(this);
    }

    /**
     *  其他的相关方法
     */
    public void operationB(){

    };
}
