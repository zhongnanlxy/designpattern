package com.session.designpattern2;

import java.util.ArrayList;
import java.util.List;

public class SensorData implements Observable<SensorData> {
    private double longitude;
    private double latitude;
    private double temperature;
    private List<Observer> observers = new ArrayList<>();


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
        updateSensorData(this);
    }

    private void updateSensorData(SensorData sensorData) {
        notifyListeners(sensorData);
    }

    @Override
    public void registerListener(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeListener(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyListeners(SensorData sensorData) {
        observers.forEach(it -> it.update(sensorData));
    }
}
