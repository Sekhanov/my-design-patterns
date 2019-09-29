package com.sekhanov.desingpatterns.structuralpatterns.facade;

/**
 * PcFacade
 * фасад объединяет все классы, которые без него пришлось бы
 * вызывать отдельно
 */
public class PcFacade {

    public void copyFromDvdRomToHdd() {
        Power power = new Power();
        power.powerOn();
        DvdRom dvdRom = new DvdRom();
        dvdRom.loadData();
        Hdd hdd = new Hdd();
        hdd.copyFromDvdRom(dvdRom);
    }
}