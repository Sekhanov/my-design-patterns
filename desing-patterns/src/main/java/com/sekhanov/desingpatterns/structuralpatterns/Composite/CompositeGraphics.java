package com.sekhanov.desingpatterns.structuralpatterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositeGraphics
 */
public class CompositeGraphics implements GraphicsComponent {

    private List<GraphicsComponent> graphicsComponentList = new ArrayList<>();

    @Override
    public void paint() {
        for (GraphicsComponent g : graphicsComponentList) {
            g.paint();
        }
    }

    public void addComponent(GraphicsComponent circle) {
        graphicsComponentList.add(circle);
    }

    
}