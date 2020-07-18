package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		System.out.println("Application.main()");
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String helo() {
		System.out.println("Application.helo()");
		return "server.servlet.context-path changes";
	}

}
