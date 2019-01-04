package com.odbpo.fenggou.javadesignpatterns.builder.burger;

/**
 * @author: zc
 * @Time: 2019/1/4 10:11
 * @Desc:
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
