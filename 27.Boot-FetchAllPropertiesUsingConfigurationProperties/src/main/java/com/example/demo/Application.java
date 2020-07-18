package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.properties.UserProperties;

@SpringBootApplication
@RestController
public class Application {

	@Autowired 
	private UserProperties userProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.err.println(userProperties.toString());
	}
	
	@RequestMapping("/hello")
	public String hello() {
		String name = userProperties.getUserName();
		int age = userProperties.getAge();
		List<String> list = userProperties.getEmailList();
		for (String string : list) {
			System.err.println("EmailList : "+string);
		}
		return "Hello, "+name+" Your Age Running is "+age;
	}
}
