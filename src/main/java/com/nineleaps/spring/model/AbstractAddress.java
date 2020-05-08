package com.nineleaps.spring.model;

public abstract class AbstractAddress {

	private String address_line1;

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public AbstractAddress() {
	}
	
	public abstract Address getAddress();
}
