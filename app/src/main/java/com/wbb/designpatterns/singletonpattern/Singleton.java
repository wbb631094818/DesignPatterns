package com.wbb.designpatterns.singletonpattern;


/**
 *  单例模式
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
