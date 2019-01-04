package com.odbpo.fenggou.javadesignpatterns.observer;

/**
 * @author: zc
 * @Time: 2019/1/4 17:06
 * @Desc:
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
