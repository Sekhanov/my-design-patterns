package com.sekhanov.desingpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.CheckCorrectPasswordMiddleWare;
import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.CheckLoginExistMiddleWare;
import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.MiddleWare;
import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.Server;
import com.sekhanov.desingpatterns.creationalpatterns.singleton.Singleton;
import com.sekhanov.desingpatterns.objectoriented.delegationpattern.Circle;
import com.sekhanov.desingpatterns.objectoriented.delegationpattern.Delegate;
import com.sekhanov.desingpatterns.objectoriented.delegationpattern.Rectangle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsRun implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsRun.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// demoChainOfResponsibility();
		// demoSingleton();
		demoDelegate();

	}

	private void demoDelegate() {
		Delegate delegate = new Delegate(new Circle());
		delegate.draw();
		Delegate delegate2 = new Delegate(new Rectangle());
		delegate2.draw();
	}

	private void demoSingleton() {
		Singleton singleton1 = Singleton.getInstance(1);
		Singleton singleton2 = Singleton.getInstance(2);
		System.out.println("singleton2 value = " + singleton2.getValue());
	}

	private void demoChainOfResponsibility() {
		Server server = new Server();
		server.addUser("admin", "admin_pass");
		server.addUser("user", "user_pass");
		MiddleWare middleWare = new CheckLoginExistMiddleWare(server);
		middleWare.linkWith(new CheckCorrectPasswordMiddleWare(server));
		server.setMiddleWare(middleWare);
		loginAndPassInputFromCommandLine(new BufferedReader(new InputStreamReader(System.in)), server);

	}

	private void loginAndPassInputFromCommandLine(BufferedReader bufferedReader, Server server) {
		boolean success = false;
		String login = null;
		String password = null;
		do {
			try {
				System.out.println("enter login");
				login = bufferedReader.readLine();
				System.out.println("enter password");
				password = bufferedReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			success = server.logIn(login, password);
		} while (!success);
	}

}
