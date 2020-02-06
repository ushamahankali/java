package com.nivtek.creditcardapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nivtek.creditcardapp.entity.Customer;

public class CustomerMapper implements RowMapper<Customer>{
	
	@Override
	public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(resultSet.getInt("customerId"));
		customer.setFirstName(resultSet.getString("firstName"));
		customer.setMiddleName(resultSet.getString("middleName"));
		customer.setLastName(resultSet.getString("lastName"));
		customer.setSsn(resultSet.getString("ssn"));
		customer.setBirthDate(resultSet.getString("birthDate"));
		customer.setAnnualIncome(resultSet.getInt("annualIncome"));
		return customer;
	}
}
