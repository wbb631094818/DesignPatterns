package com.wbb.designpatterns.decorator;

public class DecoratorRun {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setSex("男");
        // 开始装饰
        // T 恤
        TShirts tShirts = new TShirts();
        tShirts.decorate(person);
        // 大裤衩
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
