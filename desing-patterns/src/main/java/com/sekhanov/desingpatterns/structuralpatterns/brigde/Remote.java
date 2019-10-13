package com.sekhanov.desingpatterns.structuralpatterns.brigde;

/**
 * Remote
 */
public interface Remote {

    void enable();
    void disable();
    void setChanel(int chanel);
    void setVolumeUp();
    void setVolumeDown();
    
}