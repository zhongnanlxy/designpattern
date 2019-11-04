package com.session.designpattern5;

import com.google.common.eventbus.Subscribe;

public class DianpingApp {

    public DianpingApp(SensorData sensorData) {
        sensorData.register(this);
    }

    @Subscribe
    public void updateSensor(SensorData sensorData) {
        System.out.println("dianping updated!");
    }

}
