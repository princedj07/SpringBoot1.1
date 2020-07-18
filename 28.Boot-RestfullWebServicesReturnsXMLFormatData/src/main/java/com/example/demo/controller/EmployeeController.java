package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

//	@RequestMapping(value = "/getEmp", produces = "application/json")
	@RequestMapping(value = "/getEmp")
	public Employee getEmployeeDetails() {
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Prince");
		employee.setAge(25);
		employee.setSalary(50000);
		return employee;
	}
}
