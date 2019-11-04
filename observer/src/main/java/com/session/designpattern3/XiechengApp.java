package com.session.designpattern3;

import java.util.Observable;
import java.util.Observer;

public class XiechengApp implements Observer {

    public XiechengApp(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("xiecheng updated!");
    }
}
