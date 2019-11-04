package com.session.designpattern4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class DianpingApp implements PropertyChangeListener {
    private SensorData sensorData;

    public DianpingApp(SensorData observable) {
        observable.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("dianping updated!");
    }
}
