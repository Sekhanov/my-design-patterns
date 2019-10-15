package com.sekhanov.desingpatterns.behavioralpatterns.visitor;

/**
 * Shape
 */
public abstract class Shape {

    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("draw shape");
    }

    public abstract void accept(Visitor visitor);
}