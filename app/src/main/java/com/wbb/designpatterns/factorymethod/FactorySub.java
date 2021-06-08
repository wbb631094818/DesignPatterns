package com.wbb.designpatterns.factorymethod;

import com.wbb.designpatterns.simplefactory.Operation;
import com.wbb.designpatterns.simplefactory.OperationSub;

/**
 *  减法工厂
 */
public class FactorySub implements Factory{
    @Override
    public Operation create() {
        return new OperationSub();
    }
}
