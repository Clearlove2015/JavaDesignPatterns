package com.odbpo.fenggou.javadesignpatterns.abs_factory.color;

/**
 * @author: zc
 * @Time: 2019/1/4 9:32
 * @Desc:
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
