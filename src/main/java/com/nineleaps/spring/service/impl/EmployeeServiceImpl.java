package com.nineleaps.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.spring.dao.EmployeeDao;
import com.nineleaps.spring.model.Bean1;
import com.nineleaps.spring.model.Employee;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private Bean1 bean1;

	public EmployeeServiceImpl() {
		super();
	}
	
	//@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	//@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
