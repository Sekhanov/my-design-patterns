package com.sekhanov.desingpatterns.structuralpatterns.adapter;

/**
 * SquarePeg
 */
public class SquarePeg {

    private int side;

    public SquarePeg(int side) {
        this.side = side;
    }

    /**
     * @return the side
     */
    public int getSide() {
        return side;
    }
}