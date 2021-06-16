package com.wbb.designpatterns.visitorpattern;

/**
 *  具体的访问者  实现每个由Vistor声明的操作
 */
public class ConcreteVisitor1 extends Visitor{
    @Override
    public void visitconcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("concreteElementA 被 ConcreteVisitor1 访问");
        concreteElementA.operationA();
    }

    @Override
    public void visitconcreteElementB(ConcreteElementB concreteElementA) {
        System.out.println("ConcreteElementB 被 ConcreteVisitor1 访问");
        concreteElementA.operationB();
    }
}
