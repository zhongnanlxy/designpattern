package com.session.designpattern;

public class SensorData {

    private double longitude;
    private double latitude;
    private double temperature;


    public static void main(String[] args) {
        SensorData sensorData = new SensorData();

        GaodeApp gaodeApp = new GaodeApp();
        DianpingApp dianpingApp = new DianpingApp();
        XiechengApp xiechengApp = new XiechengApp();

        gaodeApp.update(sensorData.getLongitude(), sensorData.getLatitude(), sensorData.getTemperature());
        dianpingApp.update(sensorData.getLongitude(), sensorData.getLatitude(), sensorData.getTemperature());
        xiechengApp.update(sensorData.getLongitude(), sensorData.getLatitude(), sensorData.getTemperature());
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getTemperature() {
        return temperature;
    }
}


