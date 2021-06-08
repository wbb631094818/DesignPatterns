package com.wbb.designpatterns.builderpattern;

public class BuilderRun {

    public static void main(String[] args) {
        Director director = new Director();
        ProductBuilder builder1 = new ConcreteBuilder1();
        ProductBuilder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        builder1.getResult().show();

        director.construct(builder2);
        builder2.getResult().show();

        Computer computer = new Computer.Builder("英特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount("2")
                .build();
    }
}
