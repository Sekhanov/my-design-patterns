package com.sekhanov.desingpatterns.structuralpatterns.proxy;

/**
 * ProxyPhoneProducer
 */
public class ProxyPhoneProducer implements Producer {

    private Producer producer;

    @Override
    public String produceProduct() {
        lazyInitProducer();
        System.out.println("logging produce phone from proxy");
        return producer.produceProduct();
    }


    private void lazyInitProducer() {
        if(producer == null) {
            producer = new PhoneProducer();
        }
    }
    @Override
    public String destroyProduct() {
        System.out.println("logging destroy phone from proxy");
        return producer.destroyProduct();
    }

    
}