package com.odbpo.fenggou.javadesignpatterns.decorator;

/**
 * @author: zc
 * @Time: 2019/1/4 16:27
 * @Desc:
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }

}
