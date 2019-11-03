package com.session.designpattern2;

public interface Observable {
    void registerListener(Observer observer);
    void removeListener(Observer observer);
    void notifyListeners();
}
