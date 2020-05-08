package com.nineleaps.spring.controller;

import com.nineleaps.spring.service.impl.AddressServiceImpl;

public class AddressController {
	
	private AddressServiceImpl address;

	public AddressController(AddressServiceImpl address) {
		super();
		this.address = address;
	}

	public AddressController() {
		super();
	}
	
}
