package com.nineleaps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.spring.model.Employee;
import com.nineleaps.spring.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employee;

	public EmployeeController(EmployeeServiceImpl employee) {
		super();
		this.employee = employee;
	}

	public EmployeeController() {
		super();
	}
	
	@GetMapping("/findAll")
	public List<Employee> getEmployees(){
		return employee.getEmployees();
	}
	
}
