package com.sekhanov.desingpatterns.behavioralpatterns.Observer;

import java.util.List;

/**
 * ObserveSubject.a
 */
public abstract class ObserveSubject {

    protected List<Observer> observerList;

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(this);
        }
    }
}