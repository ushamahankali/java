package com.nivtek.ekthabank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nivtek.ekthabank.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
