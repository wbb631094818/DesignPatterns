package com.wbb.designpatterns.adapterpattern;

public class AdapterRun {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
