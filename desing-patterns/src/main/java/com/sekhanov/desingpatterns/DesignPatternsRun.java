package com.sekhanov.desingpatterns;

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
		System.out.println("hello!");

	}

}
