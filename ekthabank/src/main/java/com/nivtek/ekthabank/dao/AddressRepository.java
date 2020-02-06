package com.nivtek.ekthabank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivtek.ekthabank.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
