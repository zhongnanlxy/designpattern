package com.session.designpattern5;

public class Main {
    public static void main(String[] args) {
        SensorData sensorData = new SensorData();

        new GaodeApp(sensorData);
        new DianpingApp(sensorData);
        new XiechengApp(sensorData);

        sensorData.setLongitude(10);
    }
}
