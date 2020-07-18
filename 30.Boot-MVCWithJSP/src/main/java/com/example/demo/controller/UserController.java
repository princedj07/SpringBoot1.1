package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

	@RequestMapping("/login")
	public ModelAndView showLoginPage(Model model) {
		
		model.addAttribute("message", "Hi, Welcome to Spring Boot World");
		System.out.println("UserController.showLoginPage()");
		return new ModelAndView("welcome");
	}
}
