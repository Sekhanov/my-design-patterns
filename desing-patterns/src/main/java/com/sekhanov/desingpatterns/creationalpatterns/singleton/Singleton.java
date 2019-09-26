package com.sekhanov.desingpatterns.creationalpatterns.singleton;

/**
 * Singleton
 */
public class Singleton {

    private static Singleton instance;
    private int value;

    private Singleton(int value) {
        this.value = value;
    }

    public static Singleton getInstance(int value) {
        if(instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public int getValue() {
        return value;
    }
}