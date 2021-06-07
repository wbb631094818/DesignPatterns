package com.wbb.designpatterns.proxypattern;

/**
 *  真正的对象类
 */
public class RealSubject extends Subject{

    @Override
    public void Request() {
        System.out.println("真正的请求");
    }
}
