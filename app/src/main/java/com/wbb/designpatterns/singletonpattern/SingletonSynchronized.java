package com.wbb.designpatterns.singletonpattern;

/**
 *  单例模式  加个同步锁的方式
 *  双层判断
 *  一个判断是否为null，是为了创建后就不用再使用同步锁了
 *  第二个判断为null是同步锁等待中，如果创建成功了，就不要创建了
 *
 */
public class SingletonSynchronized {

    private volatile static SingletonSynchronized singleton;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getSingleton() {
        if(singleton == null){
            synchronized (SingletonSynchronized.class){
                if (singleton == null){
                    singleton = new SingletonSynchronized();
                }
            }
        }
        return singleton;
    }
}
