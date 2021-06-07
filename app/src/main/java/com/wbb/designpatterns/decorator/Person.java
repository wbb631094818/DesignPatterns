package com.wbb.designpatterns.decorator;

/**
 *  定义一个人的类
 *  该类将会是我们装饰的对象
 */
public class Person {
    // 在这个类中，有一些核心的方法，比如  名字，性别等等 这些核心的功能方法，我们可以放在这个类中实现
    // 而像穿衣服这个功能，可以用装饰者模式动态添加。毕竟穿衣服这个功能，也是可以不穿的
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void show(){
        System.out.print("性别为"+sex+"的"+name);
    }
}
