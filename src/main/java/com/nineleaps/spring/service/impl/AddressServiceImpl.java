package com.nineleaps.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nineleaps.spring.dao.AddressDao;
import com.nineleaps.spring.model.Address;

@Service
public class AddressServiceImpl {

	private AddressDao addressDao;

	public AddressDao getAddressDao() {
		return addressDao;
	}

	@Autowired//(required = false)
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public AddressServiceImpl(AddressDao addressDao) {
		super();
		this.addressDao = addressDao;
	}

	public AddressServiceImpl() {
		super();
	}

	public List<Address> getAllAddress(){
		return addressDao.findAll();
	}

}
