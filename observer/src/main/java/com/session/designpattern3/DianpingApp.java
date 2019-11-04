package com.session.designpattern3;

import java.util.Observable;
import java.util.Observer;

public class DianpingApp implements Observer {

    public DianpingApp(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("dianping updated!");
    }
}
