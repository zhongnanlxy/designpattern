package com.session.designpattern2;

public class DianpingApp implements Observer {
    private Observable observable;

    public DianpingApp(Observable observable) {
        this.observable = observable;
        observable.registerListener(this);
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("dianping updated!");
    }
}
