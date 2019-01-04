package com.odbpo.fenggou.javadesignpatterns.builder.cold_drink;

/**
 * @author: zc
 * @Time: 2019/1/4 10:11
 * @Desc:
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
