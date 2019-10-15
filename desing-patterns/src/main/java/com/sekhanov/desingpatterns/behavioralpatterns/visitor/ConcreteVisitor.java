package com.sekhanov.desingpatterns.behavioralpatterns.visitor;

/**
 * ConcreteVisitor
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visitDot(Dot dot) {
        System.out.printf("Some info from dot x = %d, y = %d", dot.x, dot.y);

    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.printf("some infro from circle: radius = %d", circle.getRadius());
    }


    
}