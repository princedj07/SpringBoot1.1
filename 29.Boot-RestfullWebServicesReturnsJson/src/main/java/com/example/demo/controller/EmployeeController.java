package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployeeInfo(@RequestBody Employee employee ) {
		
		System.err.println("Employee Details : "+employee.toString());
		return "Employee Saved Successfully : "+employee;
	}
}
