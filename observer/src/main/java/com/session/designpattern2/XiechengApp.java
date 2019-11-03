package com.session.designpattern2;

public class XiechengApp implements Observer {
    private Observable observable;

    public XiechengApp(Observable observable) {
        this.observable = observable;
        observable.registerListener(this);
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("xiecheng updated!");
    }
}
