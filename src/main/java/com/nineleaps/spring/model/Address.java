package com.nineleaps.spring.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "ADDRESS")
public class Address implements Serializable, InitializingBean, DisposableBean {

	private static final long serialVersionUID = -790853363371158411L;
	@Id
	@GeneratedValue
	Long id;
	String address_line1;
	String address_line2;

	public Address(String addressLine1, String addressLine2) {
		this.address_line1 = addressLine1;
		this.address_line2 = addressLine2;
	}

	public Address() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + address_line1 + ", addressLine2=" + address_line2 + "]";
	}

	@PostConstruct
	public void custominit() {
		System.out.println("Address post construction call");
	}

	@PreDestroy
	public void customdestroy() {
		System.out.println("Address pre destroy call");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After property Set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Before destroy");
	}

}
