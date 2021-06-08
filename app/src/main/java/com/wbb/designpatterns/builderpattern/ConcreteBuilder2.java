package com.wbb.designpatterns.builderpattern;

/**
 *  具体的建造者A
 */
public class ConcreteBuilder2 extends ProductBuilder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }

}
