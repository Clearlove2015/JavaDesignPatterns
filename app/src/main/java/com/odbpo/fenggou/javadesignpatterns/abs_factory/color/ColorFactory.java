package com.odbpo.fenggou.javadesignpatterns.abs_factory.color;

import com.odbpo.fenggou.javadesignpatterns.abs_factory.AbstractFactory;
import com.odbpo.fenggou.javadesignpatterns.abs_factory.shape.Shape;

/**
 * @author: zc
 * @Time: 2019/1/4 9:37
 * @Desc:
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
