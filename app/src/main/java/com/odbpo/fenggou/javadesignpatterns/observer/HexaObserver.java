package com.odbpo.fenggou.javadesignpatterns.observer;

/**
 * @author: zc
 * @Time: 2019/1/4 17:06
 * @Desc:
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}
