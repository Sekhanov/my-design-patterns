package com.sekhanov.desingpatterns.behavioralpatterns.mediator;

public abstract class Sender {

    protected Mediator mediator;
    protected String name;

    public Sender(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message, Sender sender);

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
