package com.sekhanov.desingpatterns.structuralpatterns.brigde;

/**
 * SomeRemote
 */
public class SomeRemote implements Remote {

    private Device device;

    

    @Override
    public void enable() {
        System.out.println("remote enable device");
        device.enable();

    }

    @Override
    public void disable() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setChanel(int chanel) {
        device.setChanel(chanel);

    }



    public SomeRemote(Device device) {
        this.device = device;
    }

    @Override
    public void setVolumeUp() {
        this.device.setVolumeUp();

    }

    @Override
    public void setVolumeDown() {
        this.device.setVolumeDown();

    }


        
}