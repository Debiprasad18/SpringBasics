package com.nineleaps.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nineleaps.spring.dao.EmployeeDao;
import com.nineleaps.spring.model.Address;
import com.nineleaps.spring.model.Employee;

//@Service
@Component
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		super();
	}
	
	@Resource
	@Qualifier("empl")
	private Employee employee;
	
	@Inject
	@Qualifier("addrs")
	private Address address;
	
	@Autowired
	private List<String> companyList;
	
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
	
	public List<String> getCompanyList(){
		return companyList;
	}
}
