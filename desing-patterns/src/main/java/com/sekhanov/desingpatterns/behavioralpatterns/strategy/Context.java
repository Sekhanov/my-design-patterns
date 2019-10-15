package com.sekhanov.desingpatterns.behavioralpatterns.strategy;

/**
 * Context
 */
public class Context {

    private Strategy strategy;


    /**
     * @param strategy the strategy to set
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void executeStrategy() {
        strategy.execute();
    }
}