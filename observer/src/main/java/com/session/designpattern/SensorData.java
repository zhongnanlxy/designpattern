package com.session.designpattern;

public class SensorData {

    private double longitude;
    private double latitude;
    private double temperature;

    private GaodeApp gaodeApp = new GaodeApp();
    private DianpingApp dianpingApp = new DianpingApp();
    private XiechengApp xiechengApp = new XiechengApp();

    public static void main(String[] args) {
        SensorData sensorData = new SensorData();

        sensorData.setLongitude(10);
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
        gaodeApp.update(this.getLongitude(), this.getLatitude(), this.getTemperature());
        dianpingApp.update(this.getLongitude(), this.getLatitude(), this.getTemperature());
        xiechengApp.update(this.getLongitude(), this.getLatitude(), this.getTemperature());
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


