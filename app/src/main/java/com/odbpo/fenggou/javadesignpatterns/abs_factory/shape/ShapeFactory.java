package com.odbpo.fenggou.javadesignpatterns.abs_factory.shape;

import com.odbpo.fenggou.javadesignpatterns.abs_factory.AbstractFactory;
import com.odbpo.fenggou.javadesignpatterns.abs_factory.color.Color;

/**
 * @author: zc
 * @Time: 2019/1/4 9:35
 * @Desc:
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
