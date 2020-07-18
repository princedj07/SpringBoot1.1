package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String welcome() {
		System.out.println("HelloWorldController.welcome()");
		return "Wlcome, Peter";
	}
}
