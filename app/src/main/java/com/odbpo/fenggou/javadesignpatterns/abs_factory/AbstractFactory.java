package com.odbpo.fenggou.javadesignpatterns.abs_factory;

import com.odbpo.fenggou.javadesignpatterns.abs_factory.color.Color;
import com.odbpo.fenggou.javadesignpatterns.abs_factory.shape.Shape;

/**
 * @author: zc
 * @Time: 2019/1/4 9:33
 * @Desc:
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
