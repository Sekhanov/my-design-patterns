package com.sekhanov.desingpatterns.objectoriented.delegationpattern;

/**
 * Circle
 */
public class Circle implements Graphics {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    
}