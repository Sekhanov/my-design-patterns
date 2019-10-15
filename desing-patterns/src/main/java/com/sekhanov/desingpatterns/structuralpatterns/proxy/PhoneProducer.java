package com.sekhanov.desingpatterns.structuralpatterns.proxy;

/**
 * ProducePhone
 */
public class PhoneProducer  implements Producer{

    @Override
    public String produceProduct() {        
        return "phone ready";
    }

    @Override
    public String destroyProduct() {        
        return "product derstoyed";
    }

    
}