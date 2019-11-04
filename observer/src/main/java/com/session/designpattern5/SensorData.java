package com.session.designpattern5;

import com.google.common.eventbus.EventBus;

public class SensorData {
    private EventBus bus;

    private double longitude;
    private double latitude;
    private double temperature;

    public SensorData() {
        this.bus = new EventBus();
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

    public void setLongitude(double longitude) {
        this.longitude = longitude;
        bus.post(this);
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void register(Object subscribe) {
        bus.register(subscribe);
    }
}
