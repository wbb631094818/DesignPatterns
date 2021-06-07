package com.wbb.designpatterns.strategy;

/**
 *  普通没有折扣，正常收费
 */
public class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
