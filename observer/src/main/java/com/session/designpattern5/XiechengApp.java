package com.session.designpattern5;

import com.google.common.eventbus.Subscribe;

public class XiechengApp {

    public XiechengApp(SensorData sensorData) {
        sensorData.register(this);
    }

    @Subscribe
    public void updateXiecheng(SensorData sensorData) {
        System.out.println("xiecheng updated!");
    }
}
