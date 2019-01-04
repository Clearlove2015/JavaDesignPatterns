package com.odbpo.fenggou.javadesignpatterns.abs_factory;

import com.odbpo.fenggou.javadesignpatterns.abs_factory.color.Color;
import com.odbpo.fenggou.javadesignpatterns.abs_factory.shape.Shape;

/**
 * @author: zc
 * @Time: 2019/1/4 9:40
 * @Desc: 抽象工厂模式
 */
public class AbstractFactoryPatternDemo {
    //快速生成main方法：https://blog.csdn.net/user11223344abc/article/details/80251025
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }

}
