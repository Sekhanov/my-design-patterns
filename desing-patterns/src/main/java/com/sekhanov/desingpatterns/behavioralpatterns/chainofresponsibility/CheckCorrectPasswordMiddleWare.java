package com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility;

/**
 * CheckCorrectPasswordMiddleWare
 */
public class CheckCorrectPasswordMiddleWare extends MiddleWare {

    private Server server;

    public CheckCorrectPasswordMiddleWare(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String login, String password) {
        if(server.checkPassword(password)) {
            return checkNext(login, password);
        }
        System.out.println("Password not correct");
        return false;
    }

}