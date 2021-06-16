package com.wbb.designpatterns.portfoliomodel;

import java.util.ArrayList;
import java.util.List;

/**
 *  定义有枝点行为，用来存储子部件
 */
public class Composite extends Component{

    /**
     *  存储的下面所有的枝节点和页节点
     */
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("-").append(depth).append(name);
        System.out.println(stringBuilder.toString());
        for (Component com:components) {
            com.display(depth+1);
        }
    }
}
