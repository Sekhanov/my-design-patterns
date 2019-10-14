package com.sekhanov.desingpatterns.structuralpatterns.decorator;

/**
 * ConcreteDecorator
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);        
    }

    @Override
    public void show() { 
        super.show();
        System.out.println("additional behavior from concrete decorator");       
    }
}