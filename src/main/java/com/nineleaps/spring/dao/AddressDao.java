package com.nineleaps.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nineleaps.spring.model.Address;

public interface AddressDao extends JpaRepository<Address, Long>{

}
