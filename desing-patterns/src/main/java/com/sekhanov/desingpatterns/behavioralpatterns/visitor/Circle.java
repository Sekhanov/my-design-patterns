package com.sekhanov.desingpatterns.behavioralpatterns.visitor;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);

    }

    


    /**
     * @return int return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

}
