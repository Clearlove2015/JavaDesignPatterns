package com.odbpo.fenggou.javadesignpatterns.builder;

import com.odbpo.fenggou.javadesignpatterns.builder.pack.Packing;

/**
 * @author: zc
 * @Time: 2019/1/4 10:04
 * @Desc:
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
