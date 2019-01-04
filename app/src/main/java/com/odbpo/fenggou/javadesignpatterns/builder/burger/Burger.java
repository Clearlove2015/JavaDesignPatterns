package com.odbpo.fenggou.javadesignpatterns.builder.burger;

import com.odbpo.fenggou.javadesignpatterns.builder.Item;
import com.odbpo.fenggou.javadesignpatterns.builder.pack.Packing;
import com.odbpo.fenggou.javadesignpatterns.builder.pack.Wrapper;

/**
 * @author: zc
 * @Time: 2019/1/4 10:06
 * @Desc:
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract String name();

    public abstract float price();
}
