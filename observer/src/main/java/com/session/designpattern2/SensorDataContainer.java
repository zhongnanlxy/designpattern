package com.session.designpattern2;

import java.util.ArrayList;
import java.util.List;

public class SensorDataContainer implements Observable {

    private SensorData sensorData;
    private List<Observer> observers = new ArrayList<>();

    public SensorDataContainer(SensorData sensorData) {
        this.sensorData = sensorData;
    }

    public void updateSensorData() {
        sensorData.setTemperature(-1.0);
        notifyListeners();
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
    public void notifyListeners() {
        observers.forEach(it->it.update(sensorData));
    }
}


