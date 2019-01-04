package com.odbpo.fenggou.javadesignpatterns.observer;

/**
 * @author: zc
 * @Time: 2019/1/4 17:05
 * @Desc:
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }

}
