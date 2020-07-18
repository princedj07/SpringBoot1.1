package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/restricted")
	public String restricted() {
		
		return "to see this text you need to be logged in!!";
	}
	
	@RequestMapping("/log")
	public String logout() {
		
		return "Successfully logout...";
	}
}
