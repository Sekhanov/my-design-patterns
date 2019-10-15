package com.sekhanov.desingpatterns.behavioralpatterns.visitor;

/**
 * Visitor
 */
public interface Visitor {

    void visitDot(Dot dot);
    void visitCircle(Circle circle);
}