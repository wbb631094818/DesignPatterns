package com.wbb.designpatterns.interpreterpattern;

/**
 *  非终结符表达式
 */
public class NonterminaExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
