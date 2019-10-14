package com.sekhanov.desingpatterns.behavioralpatterns.Observer;

import java.util.ArrayList;

/**
 * TemperatureSensor
 */
public class TemperatureSensor extends ObserveSubject {

    private int temperature;
    

    public TemperatureSensor() {
        this.observerList = new ArrayList<>();
    }
    /**
     * @return int return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

}