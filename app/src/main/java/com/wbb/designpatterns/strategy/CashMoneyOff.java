package com.wbb.designpatterns.strategy;

/**
 * 现金满减,满300减100
 */
public class CashMoneyOff extends CashSuper {

    /**
     * 满减金额
     */
    private double moneyOffNuber = 300;
    /**
     * 减去金额
     */
    private double minusAmount = 100;

    public CashMoneyOff(double moneyOffNuber, double minusAmount) {
        this.moneyOffNuber = moneyOffNuber;
        this.minusAmount = minusAmount;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyOffNuber) {
            return money - minusAmount;
        }
        return money;
    }
}
