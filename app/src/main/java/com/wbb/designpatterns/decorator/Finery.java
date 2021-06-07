package com.wbb.designpatterns.decorator;

/**
 * 服装类   服装类是依附于人的  所以继承一下
 */
public class Finery extends Person {

    protected Person component;

    /**
     * 装饰的对象   衣服传在人身上
     *
     * @param component 人类
     */
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
