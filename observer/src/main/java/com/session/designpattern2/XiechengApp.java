package com.session.designpattern2;

public class XiechengApp implements Observer {

    public XiechengApp(Observable observable) {
        observable.registerListener(this);
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("xiecheng updated!");
    }
}
