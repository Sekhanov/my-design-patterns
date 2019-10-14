package com.sekhanov.desingpatterns.structuralpatterns.decorator;

/**
 * Decorator
 */
public class Decorator implements Component {

    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }

    
}