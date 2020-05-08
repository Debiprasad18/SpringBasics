package com.nineleaps.spring.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "EMPLOYEE")
public class Employee implements Serializable {

	private static final long serialVersionUID = 5403519058841729377L;
	@Id
	@GeneratedValue
	Long id;
	String e_name;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "manager_id")
	private Employee manager;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "address_id")
	private Address address;

	public Employee(String e_name, Employee manager, Address address) {
		super();
		this.e_name = e_name;
		this.manager = manager;
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public static Employee createEmployee() {
        return new Employee();
    }
	
	public Employee createInstance() {
        return new Employee();
    }
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", e_name=" + e_name + ", manager=" + manager + ", address=" + address + "]";
	}

}