package com.wbb.designpatterns.corpattern;

/**
 *  处理请求的静态类
 */
public abstract class Handler {

    protected Handler successor;

    /**
     *  设置继承者
     * @param successor  继承者
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     *  处理请求的抽象方法
     * @param request 级别
     */
    public abstract void handleRequest(int request);
}
