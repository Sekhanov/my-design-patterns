package com.sekhanov.desingpatterns.behavioralpatterns.Observer;

/**
 * MonitorObserver
 */
public class Monitor  implements Observer{

    @Override
    public void update(ObserveSubject observeSubject) {
        TemperatureSensor temperatureSensor = null;
        if(observeSubject instanceof TemperatureSensor) {
            temperatureSensor = (TemperatureSensor) observeSubject;
        }
        System.out.println("Current temperature is: " + temperatureSensor.getTemperature());

    }

    
}