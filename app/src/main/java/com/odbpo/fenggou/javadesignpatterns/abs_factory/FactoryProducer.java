package com.odbpo.fenggou.javadesignpatterns.abs_factory;

import com.odbpo.fenggou.javadesignpatterns.abs_factory.color.ColorFactory;
import com.odbpo.fenggou.javadesignpatterns.abs_factory.shape.ShapeFactory;

/**
 * @author: zc
 * @Time: 2019/1/4 9:37
 * @Desc:
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }

}
