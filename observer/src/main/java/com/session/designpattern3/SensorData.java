package com.session.designpattern3;

import java.util.Observable;

public class SensorData extends Observable {
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
        notifyObservers(this);
    }

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
}
