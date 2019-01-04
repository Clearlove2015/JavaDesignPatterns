package com.odbpo.fenggou.javadesignpatterns.observer;

/**
 * @author: zc
 * @Time: 2019/1/4 17:05
 * @Desc:
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
