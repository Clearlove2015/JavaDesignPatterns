package com.odbpo.fenggou.javadesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zc
 * @Time: 2019/1/4 17:04
 * @Desc:
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
