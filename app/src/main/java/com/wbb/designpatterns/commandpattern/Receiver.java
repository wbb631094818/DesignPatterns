package com.wbb.designpatterns.commandpattern;

/**
 *  执行命令请求的类，主要实施与执行与请求相关的操作
 */
public class Receiver {

    public void action(){
        System.out.println("执行请求！");
    }
}
