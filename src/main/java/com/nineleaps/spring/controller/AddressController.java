package com.nineleaps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nineleaps.spring.model.Address;
import com.nineleaps.spring.service.impl.AddressServiceImpl;

@Controller
public class AddressController {
	
	private AddressServiceImpl address;

	@Autowired
	public AddressController(AddressServiceImpl address) {
		super();
		this.address = address;
	}

	public AddressController() {
		super();
	}
	
	@RequestMapping(path = "findAllAddress",method = RequestMethod.GET )
	public @ResponseBody List<Address> getAllAddress(){
		return address.getAllAddress();
	}
	
}
