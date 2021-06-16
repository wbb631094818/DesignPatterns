package com.wbb.designpatterns.portfoliomodel;

public class PortfoliRun {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new LeafComponent("Leaf A"));
        root.add(new LeafComponent("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new LeafComponent("Composite XA"));
        comp.add(new LeafComponent("Composite XB"));

        root.add(comp);

        Composite  comp2= new Composite("Composite XY");
        comp2.add(new LeafComponent("Leaf XYA"));
        comp2.add(new LeafComponent("Leaf XYB"));
        comp.add(comp2);

        root.add(new LeafComponent("Leaf C"));

        LeafComponent leafComponent = new LeafComponent("Leaf D");
        root.add(leafComponent);
        root.remove(leafComponent);

        root.display(0);
    }
}
