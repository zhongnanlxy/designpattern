package com.session.designpattern4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class XiechengApp implements PropertyChangeListener {

    private SensorData sensorData;

    public XiechengApp(SensorData observable) {
        observable.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("xiecheng updated!");
    }
}
