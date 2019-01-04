package com.odbpo.fenggou.javadesignpatterns.decorator;

/**
 * @author: zc
 * @Time: 2019/1/4 16:26
 * @Desc:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
