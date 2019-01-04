package com.odbpo.fenggou.javadesignpatterns.decorator;

/**
 * @author: zc
 * @Time: 2019/1/4 16:30
 * @Desc: 装饰器模式
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
