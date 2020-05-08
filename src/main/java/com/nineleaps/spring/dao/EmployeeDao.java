package com.nineleaps.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.spring.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{

}
