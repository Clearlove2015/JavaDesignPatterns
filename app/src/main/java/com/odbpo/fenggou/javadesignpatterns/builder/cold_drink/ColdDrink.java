package com.odbpo.fenggou.javadesignpatterns.builder.cold_drink;

import com.odbpo.fenggou.javadesignpatterns.builder.Item;
import com.odbpo.fenggou.javadesignpatterns.builder.pack.Bottle;
import com.odbpo.fenggou.javadesignpatterns.builder.pack.Packing;

/**
 * @author: zc
 * @Time: 2019/1/4 10:09
 * @Desc:
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract String name();

    public abstract float price();
}
