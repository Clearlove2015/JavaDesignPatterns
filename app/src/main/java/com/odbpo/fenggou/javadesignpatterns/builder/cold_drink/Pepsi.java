package com.odbpo.fenggou.javadesignpatterns.builder.cold_drink;

/**
 * @author: zc
 * @Time: 2019/1/4 10:12
 * @Desc:
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
