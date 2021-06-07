package com.wbb.designpatterns.simplefactory;

public class run {
    public static void main(String[] args) {
        Operation operation = OperationFactory.Companion.createOperate("+");
        operation.setNumberA(44);
        operation.setNumberB(44);
        System.out.println("结果为：" + operation.operationResults());
    }
}
