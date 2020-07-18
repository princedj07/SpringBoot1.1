package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		Map<String, Object> map = new HashMap<>();
		map.put("server.servlet.context-path", "/spring-boot-app");
		map.put("server.port", "8585");
		application.setDefaultProperties(map);
		application.run(args);
	}

	@RequestMapping("/")
	public String helo() {
		return "server.servlet.context-path changes";
	}

}
