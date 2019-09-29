package com.sekhanov.desingpatterns.structuralpatterns.facade;

/**
 * DvdRom
 */
public class DvdRom {

    private boolean data;
    
    public boolean isData() {
        return data;
    }

    public void loadData() {
        data = true;
    }

    public void unloadData() {
        data = false;
    }


}