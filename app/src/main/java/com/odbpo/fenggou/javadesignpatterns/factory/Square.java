package com.odbpo.fenggou.javadesignpatterns.factory;

/**
 * @author: zc
 * @Time: 2019/1/4 9:03
 * @Desc:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
