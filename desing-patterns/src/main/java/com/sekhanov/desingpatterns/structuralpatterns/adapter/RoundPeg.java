package com.sekhanov.desingpatterns.structuralpatterns.adapter;

/**
 * RoundPeg
 */
public class RoundPeg {

    protected int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public RoundPeg(){}

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }
}