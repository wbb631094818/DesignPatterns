package com.wbb.designpatterns.strategy;

public class CashContext {
    // 声明策略对象
    private CashSuper cashSuper;

    // 传入该对象
    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashMoneyOff(300,100);
                break;
            case "打8折":
                cashSuper = new CashDiscount(8);
                break;
            default:
                break;
        }
    }

    // 调用该对象的算法策略，并返回结果
    public double getResult(double money){
        if (cashSuper!=null){
           return cashSuper.acceptCash(money);
        }
        return money;
    }
}
