package com.sekhanov.desingpatterns.structuralpatterns.brigde;

/**
 * Device
 */
public interface Device {
   
    void enable();
    void disable();
    void setChanel(int chanel);
    void setVolumeUp();
    void setVolumeDown();
}