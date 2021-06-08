package com.wbb.designpatterns.abstractfactory;

import com.wbb.designpatterns.simplefactory.Operation;
import com.wbb.designpatterns.simplefactory.OperationAdd;
import com.wbb.designpatterns.simplefactory.OperationSub;

/**
 *  得力计算器的工厂类
 */
public class DeliCalculatorFactory implements CalculatorFactory{
    @Override
    public Operation add() {
        return new OperationAdd();
    }

    @Override
    public Operation sub() {
        return new OperationSub();
    }
}
