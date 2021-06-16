package com.wbb.designpatterns.interpreterpattern;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPatternRun {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminaExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression ae:list
             ) {
            ae.interpret(context);
        }
    }
}
