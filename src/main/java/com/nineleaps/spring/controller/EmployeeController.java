package com.nineleaps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.spring.model.Employee;
import com.nineleaps.spring.model.Order;
import com.nineleaps.spring.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired(required = true)
	private EmployeeServiceImpl employee;
	
	@Autowired
	private List<Order> list;
	
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
	
	@GetMapping("/findAllCompanies")
	public List<String> getCompanies(){
		System.out.println(list);
		return employee.getCompanyList();
	}
}
