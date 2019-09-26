package com.sekhanov.desingpatterns.objectoriented.delegationpattern;

/**
 * Rectangle
 */
public class Rectangle  implements Graphics{

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    
}