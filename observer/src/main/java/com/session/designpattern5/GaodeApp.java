package com.session.designpattern5;

import com.google.common.eventbus.Subscribe;

public class GaodeApp {

    public GaodeApp(SensorData sensorData) {
        sensorData.register(this);
    }

    @Subscribe
    public void update(SensorData sensorData) {
        System.out.println("gaode updated!");
    }
}
