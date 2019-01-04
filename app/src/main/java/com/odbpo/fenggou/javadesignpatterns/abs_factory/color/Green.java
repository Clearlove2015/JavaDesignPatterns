package com.odbpo.fenggou.javadesignpatterns.abs_factory.color;

/**
 * @author: zc
 * @Time: 2019/1/4 9:32
 * @Desc:
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
