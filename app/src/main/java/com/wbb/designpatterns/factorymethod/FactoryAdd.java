package com.wbb.designpatterns.factorymethod;

import com.wbb.designpatterns.simplefactory.Operation;
import com.wbb.designpatterns.simplefactory.OperationAdd;

/**
 *  加法工厂
 */
public class FactoryAdd implements Factory{
    @Override
    public Operation create() {
        return new OperationAdd();
    }
}
