package com.odbpo.fenggou.javadesignpatterns.abs_factory.color;

/**
 * @author: zc
 * @Time: 2019/1/4 9:33
 * @Desc:
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
