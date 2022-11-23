package com.sekhanov.desingpatterns.behavioralpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Publisher {

    private final Payload payload = new Payload();

    private final Set<Subscriber> subscribers = new HashSet<>();

    public boolean subscribe(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    public boolean unsubscribe(Subscriber subscriber) {
        return subscribers.remove(subscriber);
    }

    private void updateAll() {
        subscribers.forEach(s -> s.update(payload));
    }

    public void businessLogic(String info) {
        payload.setInfo(info);
        updateAll();
    }
}
