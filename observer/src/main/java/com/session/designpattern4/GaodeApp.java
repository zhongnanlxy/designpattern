package com.session.designpattern4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GaodeApp implements PropertyChangeListener {
    private SensorData sensorData;

    public GaodeApp(SensorData observable) {
        observable.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("gaode updated!");
    }
}
