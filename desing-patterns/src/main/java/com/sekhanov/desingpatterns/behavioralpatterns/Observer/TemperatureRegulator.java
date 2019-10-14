package com.sekhanov.desingpatterns.behavioralpatterns.Observer;

/**
 * TemparatureRegulator
 */
public class TemperatureRegulator implements Observer{

    @Override
    public void update(ObserveSubject observeSubject) {
        TemperatureSensor temperatureSensor = null;
        if(observeSubject instanceof TemperatureSensor) {
            temperatureSensor = (TemperatureSensor) observeSubject;
        }

        if(temperatureSensor.getTemperature() >= 100) {
            temperatureSensor.setTemperature(50);
            System.out.println("temperature reduced to" + temperatureSensor.getTemperature());
        }

    }

    
}