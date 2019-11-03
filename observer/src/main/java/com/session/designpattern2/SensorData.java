package com.session.designpattern2;

public class SensorData {
    private double longitude;
    private double latitude;
    private double temperature;

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
