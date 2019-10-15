package com.sekhanov.desingpatterns.behavioralpatterns.mediator;

/**
 * Mediator
 */
public abstract class Mediator {

    public abstract void send(String message, Sender sender);
    
}