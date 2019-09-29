package com.sekhanov.desingpatterns.structuralpatterns.facade;

/**
 * Hdd
 */
public class Hdd {
    

    public void copyFromDvdRom(DvdRom dvdRom){
        if(dvdRom.isData()) {
            System.out.println("coping from dvdrom");
        } else {
            System.out.println("enter disk to dvdrom");
        }
    }
}