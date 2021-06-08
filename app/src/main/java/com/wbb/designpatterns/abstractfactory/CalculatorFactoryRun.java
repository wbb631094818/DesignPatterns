package com.wbb.designpatterns.abstractfactory;

public class CalculatorFactoryRun {
    public static void main(String[] args) {
        CalculatorFactory casioCalculatorFactory = new CasioCalculatorFactory();
        CalculatorFactory deliCalculatorFactory = new DeliCalculatorFactory();

        casioCalculatorFactory.add().operationResults();
        casioCalculatorFactory.sub().operationResults();

        deliCalculatorFactory.add().operationResults();
        deliCalculatorFactory.sub().operationResults();
    }
}
