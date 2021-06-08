package com.wbb.designpatterns.abstractfactory;

import com.wbb.designpatterns.simplefactory.Operation;
import com.wbb.designpatterns.simplefactory.OperationAdd;
import com.wbb.designpatterns.simplefactory.OperationSub;

/**
 *  卡西欧计算器的工厂类
 */
public class CasioCalculatorFactory implements CalculatorFactory{
    @Override
    public Operation add() {
        return new OperationAdd();
    }

    @Override
    public Operation sub() {
        return new OperationSub();
    }
}
