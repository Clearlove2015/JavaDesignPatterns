package com.odbpo.fenggou.javadesignpatterns.observer;

/**
 * @author: zc
 * @Time: 2019/1/4 17:07
 * @Desc: 观察者模式
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
