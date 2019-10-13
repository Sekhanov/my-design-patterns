package com.sekhanov.desingpatterns.structuralpatterns.brigde;

/**
 * Tv
 */
public class Tv implements Device {

    private int chanel = 1;
    private int volume = 10;
    private boolean enable;


 

    @Override
    public void enable() {
        enable = true;

    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;

    }



    @Override
    public void setVolumeUp() {
        volume += 1;

    }

    @Override
    public void setVolumeDown() {
        volume -= 1;

    }

    
}