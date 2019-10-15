package com.sekhanov.desingpatterns.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator
 */
public class ConcreteMediator extends Mediator{

    private List<Sender> senders;

    public ConcreteMediator() {
        senders = new ArrayList<>();
    }

    public void addSender(Sender sender) {
        senders.add(sender);
    }


    @Override
    public void send(String message, Sender sender) {
        senders.forEach(s -> {
            if(!s.equals(sender)) {
                s.notify(message, sender);
            }
        });


    }

    
}