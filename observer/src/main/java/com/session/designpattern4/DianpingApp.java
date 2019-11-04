package com.session.designpattern4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DianpingApp implements PropertyChangeListener {

    public DianpingApp(SensorData observable) {
        observable.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("dianping updated!");
    }
}
