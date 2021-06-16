package com.wbb.designpatterns.interpreterpattern;


/**
 *  抽象的解释器操作。该接口为抽象语法书中所有的节点所共享
 */
public abstract class AbstractExpression {

    public abstract void interpret(Context context);

}
