package com.session.designpattern2;

public class GaodeApp implements Observer {

    public GaodeApp(Observable observable) {
        observable.registerListener(this);
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("gaode updated!");
    }
}
