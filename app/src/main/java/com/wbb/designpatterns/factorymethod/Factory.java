package com.wbb.designpatterns.factorymethod;

import com.wbb.designpatterns.simplefactory.Operation;

/**
 *  工厂接口，所有的工厂都需要实现该接口
 */
public interface Factory {
    // 实例化类
    Operation create();
}
