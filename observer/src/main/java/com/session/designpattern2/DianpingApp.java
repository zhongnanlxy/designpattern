package com.session.designpattern2;

public class DianpingApp implements Observer {

    public DianpingApp(Observable observable) {
        observable.registerListener(this);
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("dianping updated!");
    }
}
