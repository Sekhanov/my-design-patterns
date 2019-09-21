package com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility;

/**
 * CheckLoginExistMiddleWare
 */
public class CheckLoginExistMiddleWare extends MiddleWare {

    private Server server;

    public CheckLoginExistMiddleWare(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String login, String password) {
        if (server.checkLogin(login)) {            
            return checkNext(login, password);
        }
        System.out.println("login not exist");
        return false;
    }

}