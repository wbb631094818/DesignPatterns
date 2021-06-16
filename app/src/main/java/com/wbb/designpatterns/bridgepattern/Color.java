package com.wbb.designpatterns.bridgepattern;

/**
 *  颜色接口
 */
public interface Color {
    /**
     * 涂颜色的方法
     * @param shape 形状
     */
    public void bepaint(String shape);
}
