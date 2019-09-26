package com.sekhanov.desingpatterns.objectoriented.delegationpattern;

/**
 * Delegate
 */
public class Delegate {

    private Graphics graphics;

    public Delegate(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw() {
        graphics.draw();
    }
}