package com.wbb.designpatterns.portfoliomodel;

/**
 * 分支子叶
 */
public class LeafComponent extends Component {
    public LeafComponent(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Leaf add");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Leaf remove");
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("-").append(depth).append(name);
        System.out.println(stringBuilder.toString());
    }
}
