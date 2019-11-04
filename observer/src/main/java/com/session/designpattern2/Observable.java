package com.session.designpattern2;

public interface Observable<T> {
    void registerListener(Observer observer);
    void removeListener(Observer observer);
    void notifyListeners(T data);
}
