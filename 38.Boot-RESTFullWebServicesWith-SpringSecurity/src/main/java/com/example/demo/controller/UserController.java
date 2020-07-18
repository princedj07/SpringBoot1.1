package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/userLogin")
	public String userValidation() {
		return "User, Successfully logged in !!!";
	}
	
	@RequestMapping("/adminLogin")
	public String adminValidation() {
		return "Admin user, Successfully logged in !!!";
	}
}
