package com.session.designpattern4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SensorData {
    PropertyChangeSupport listeners = new PropertyChangeSupport(this);

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
        firePropertyChange("longitude", this.longitude, longitude);
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.removePropertyChangeListener(listener);
    }

    public void firePropertyChange(PropertyChangeEvent event) {
        listeners.firePropertyChange(event);
    }

    public void firePropertyChange(String propertyName, double oldValue, double newValue) {
        listeners.firePropertyChange(propertyName, oldValue, newValue);
    }
}
