package com.wbb.designpatterns.strategy;

/**
 *  普通折扣  7折  8折 9折等
 */
public class CashDiscount extends CashSuper{

    /**
     *  折扣  默认8折
     */
    private double discount = 8;

    public CashDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double acceptCash(double money) {
        // 8折的具体计算
        return money*(discount/10);
    }
}
