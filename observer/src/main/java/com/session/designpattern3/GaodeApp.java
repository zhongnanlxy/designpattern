package com.session.designpattern3;

import java.util.Observable;
import java.util.Observer;

public class GaodeApp implements Observer {
    private Observable observable;

    public GaodeApp(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("gaode updated!");
    }
}
