package com.wbb.designpatterns.abstractfactory;

import com.wbb.designpatterns.simplefactory.Operation;

/**
 *  父类为计算器工厂接口
 */
public interface CalculatorFactory {

    /**
     *  加法
     * @return
     */
    Operation add();

    /**
     *  减法
     * @return
     */
    Operation sub();

}
