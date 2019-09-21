package com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility;

/**
 * MiddleWare
 */
public abstract class MiddleWare {

    private MiddleWare next;

    public MiddleWare linkWith(MiddleWare next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String login, String password);

    protected boolean checkNext(String login, String password) {
        if(next == null) {
            return true;
        }
        return next.check(login, password);
    }
    
}