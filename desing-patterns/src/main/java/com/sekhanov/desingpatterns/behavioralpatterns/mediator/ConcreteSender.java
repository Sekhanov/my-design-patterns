package com.sekhanov.desingpatterns.behavioralpatterns.mediator;

/**
 * ConcreteSender
 */
public class ConcreteSender  extends Sender {

    public ConcreteSender(Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void notify(String message, Sender sender) {
        System.out.println("уведомление у " + this.name);
        System.out.println(sender.getName() + ": " + message);

    }

  

    
}