package com.nineleaps.spring.service.impl;

import com.nineleaps.spring.dao.AddressDao;

public class AddressServiceImpl {

		private AddressDao addressDao;

		public AddressServiceImpl(AddressDao addressDao) {
			super();
			this.addressDao = addressDao;
		}

		public AddressServiceImpl() {
			super();
		}
		
		
}
