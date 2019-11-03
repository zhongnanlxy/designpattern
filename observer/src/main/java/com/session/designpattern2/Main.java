package com.session.designpattern2;

public class Main {
    public static void main(String[] args) {
        SensorDataContainer sensorDataContainer = new SensorDataContainer(new SensorData());
        new GaodeApp(sensorDataContainer);
        new DianpingApp(sensorDataContainer);
        new XiechengApp(sensorDataContainer);

        sensorDataContainer.updateSensorData();
    }
}
