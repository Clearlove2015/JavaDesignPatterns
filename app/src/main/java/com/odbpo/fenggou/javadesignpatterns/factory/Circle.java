package com.odbpo.fenggou.javadesignpatterns.factory;

/**
 * @author: zc
 * @Time: 2019/1/4 9:04
 * @Desc:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
