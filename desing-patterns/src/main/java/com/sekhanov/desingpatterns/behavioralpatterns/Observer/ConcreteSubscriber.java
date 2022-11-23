package com.sekhanov.desingpatterns.behavioralpatterns.observer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConcreteSubscriber implements Subscriber {

    private final String name;

    @Override
    public void update(Payload payload) {
        System.out.println(String.format("%s got the next info: %s", name, payload.getInfo()));
    }
}
