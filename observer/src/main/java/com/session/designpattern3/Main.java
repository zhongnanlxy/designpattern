package com.session.designpattern3;

public class Main {
    public static void main(String[] args) {
        SensorData sensorData = new SensorData();
        new GaodeApp(sensorData);
        new DianpingApp(sensorData);
        new XiechengApp(sensorData);

        sensorData.setTemperature(10);
    }
}
