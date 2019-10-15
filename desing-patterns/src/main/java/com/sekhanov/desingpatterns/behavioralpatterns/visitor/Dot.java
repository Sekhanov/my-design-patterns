package com.sekhanov.desingpatterns.behavioralpatterns.visitor;

public class Dot extends Shape {


    public Dot(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);

    }

}
