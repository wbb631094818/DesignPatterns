package com.wbb.designpatterns.corpattern;

/**
 * 具体处理类  处理它所负责的请求  可以处理就处理，不能处理就转发给后面的类
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request< 20){
            System.out.println("ConcreteHandler2 处理请求： "+request);
        }else if (successor !=null){
            successor.handleRequest(request);
        }
    }
}
