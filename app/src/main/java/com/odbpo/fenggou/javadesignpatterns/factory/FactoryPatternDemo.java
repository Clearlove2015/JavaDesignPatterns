package com.odbpo.fenggou.javadesignpatterns.factory;

/**
 * @author: zc
 * @Time: 2019/1/4 9:07
 * @Desc: 工厂模式
 */
public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }

}
