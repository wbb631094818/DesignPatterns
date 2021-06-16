package com.wbb.designpatterns.iteratorpattern;

/**
 *  遍历集合中的元素   具体实现一个顺序遍历的迭代器
 */
public interface Iterator {

    /**
     *  是否存在下一个元素
     * @return
     */
    public abstract boolean hasNext();

    /**
     *  下一个元素
     * @return
     */
    public abstract Object next();

}
