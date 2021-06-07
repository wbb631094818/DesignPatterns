package com.wbb.designpatterns.strategy;

public class run {

    public static void main(String[] args) {
       double money =  new CashContext("正常收费").getResult(500);
       System.out.println("正常收费 钱："+money);
       money =  new CashContext("满300返100").getResult(500);
       System.out.println("满300返100 钱："+money);
       money =  new CashContext("打8折").getResult(500);
       System.out.println("打8折 钱："+money);
    }
}
