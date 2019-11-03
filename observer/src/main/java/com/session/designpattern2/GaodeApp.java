package com.session.designpattern2;

public class GaodeApp implements Observer {
    private Observable observable;

    public GaodeApp(Observable observable) {
        this.observable = observable;
        observable.registerListener(this);
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("gaode updated!");
    }
}
