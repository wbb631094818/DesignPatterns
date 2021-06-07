package com.wbb.designpatterns.strategy;

/**
 *  定义一个行为的抽象类。 主要的行为，打折是我们这个例子的行为，中间打折的方式算法就是我们使用策略模式要封装的算法
 */
public abstract class CashSuper {

    /**
     *  打折计算
     * @param money 打折前的金额
     * @return 打折后的金额
     */
    public abstract double acceptCash(double money);

}
