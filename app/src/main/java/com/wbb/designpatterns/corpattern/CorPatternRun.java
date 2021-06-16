package com.wbb.designpatterns.corpattern;

public class CorPatternRun {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2,3,14,22,18,3,27,20};
        for (int i:requests) {
            h1.handleRequest(i);
        }
    }
}
