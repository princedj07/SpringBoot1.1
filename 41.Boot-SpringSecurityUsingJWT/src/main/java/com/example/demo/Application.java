package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("\nApplication.main() Started...\n\n");
		SpringApplication.run(Application.class, args);
	}

}
