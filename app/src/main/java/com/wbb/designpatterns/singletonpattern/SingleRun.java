package com.wbb.designpatterns.singletonpattern;

public class SingleRun {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        if (singleton == singleton2){
            System.out.println("两对象是相同的实例");
        }
    }
}
