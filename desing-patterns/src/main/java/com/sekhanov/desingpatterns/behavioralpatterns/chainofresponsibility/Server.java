package com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Server {

	private MiddleWare middleWare;
	private Map<String, String> users = new HashMap<>();

	public void addUser(String login, String password) {
		this.users.put(login, password);
	}

	public MiddleWare getMiddleWare() {
		return middleWare;
	}

	public boolean logIn(String login, String password) {
		if(middleWare.check(login, password)) {
			System.out.println("authorization successfully");
			return true;
		}
		return false;
	}

	public void setMiddleWare(MiddleWare middleWare) {
		this.middleWare = middleWare;
	}

	public boolean checkLogin(String login) {
		return users.containsKey(login);
	}

	public boolean checkPassword(String password) {
		return users.containsValue(password);
	}



}
