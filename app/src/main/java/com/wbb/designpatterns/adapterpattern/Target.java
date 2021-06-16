package com.wbb.designpatterns.adapterpattern;

/**
 * 原来的接口功能任务请求，我们将使用适配器模式改变这个方法的功能请求，
 */
public class Target {

    public void request(){
        System.out.println("普通请求！");
    }

}
