package com.sekhanov.desingpatterns.structuralpatterns.adapter;

/**
 * SquarePegAdapter
 */
public class SquarePegAdapter extends RoundPeg{

    /**
     * класс адаптирует квадратные колышки для того, чтобы взаимодействовать с круглой дырой
     * @param squarePeg
     */
    public SquarePegAdapter(SquarePeg squarePeg) {
        this.radius = (int) Math.sqrt(Math.pow(squarePeg.getSide(), 2)); 
    }

    @Override
    public int getRadius() {        
        return super.getRadius();
    }

    

    
}