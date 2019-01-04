package com.odbpo.fenggou.javadesignpatterns.abs_factory.shape;


/**
 * @author: zc
 * @Time: 2019/1/4 9:03
 * @Desc:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
