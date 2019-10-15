package com.sekhanov.desingpatterns.structuralpatterns.proxy;

/**
 * Producer
 */
public interface Producer {

    String produceProduct();
    
    String destroyProduct();
}