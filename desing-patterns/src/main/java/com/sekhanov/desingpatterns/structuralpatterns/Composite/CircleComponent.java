package com.sekhanov.desingpatterns.structuralpatterns.Composite;

/**
 * Circle
 */
public class CircleComponent implements GraphicsComponent {

    private int radius;

    public CircleComponent(int radius) {
        this.radius = radius;
    }

    @Override
    public void paint() {
        System.out.println("paint circle with radius" + radius);

    }

    
}