package com.wbb.designpatterns.factorymethod;

import com.wbb.designpatterns.simplefactory.Operation;

public class FactoryRun {
    public static void main(String[] args) {
        // 加法运算
        Operation add = new FactoryAdd().create();
        add.setNumberA(2);
        add.setNumberB(2);
        add.operationResults();

        // 减法运算
        Operation sub = new FactorySub().create();
        sub.setNumberA(2);
        sub.setNumberB(2);
        sub.operationResults();
    }
}
