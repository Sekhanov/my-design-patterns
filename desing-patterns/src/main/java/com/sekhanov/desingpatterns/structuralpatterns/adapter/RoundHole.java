package com.sekhanov.desingpatterns.structuralpatterns.adapter;

/**
 * RoundHole
 */
public class RoundHole {

    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean isFit(RoundPeg roundPeg) {
        return roundPeg.getRadius() <= radius;
    }
}