package com.wbb.designpatterns.visitorpattern;

/**
 *  具体元素  实现accept操作
 */
public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitconcreteElementA(this);
    }

    /**
     *  其他的相关方法
     */
    public void operationA(){

    };
}
