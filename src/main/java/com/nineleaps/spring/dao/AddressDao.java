package com.nineleaps.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.spring.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Long>{

}
