package com.wbb.designpatterns.flyweightpattern;

import java.util.HashMap;

/**
 *  享元工厂，用来创建并管理享元Flyweight类
 */
public class FlyweightFactory {

    private HashMap<String,Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFilweight());
        flyweights.put("Y",new ConcreteFilweight());
        flyweights.put("Z",new ConcreteFilweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
