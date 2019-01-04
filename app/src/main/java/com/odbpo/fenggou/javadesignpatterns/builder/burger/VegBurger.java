package com.odbpo.fenggou.javadesignpatterns.builder.burger;

/**
 * @author: zc
 * @Time: 2019/1/4 10:10
 * @Desc:
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
