package com.nivtek.creditcardapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.creditcardapp.entity.Customer;

@Repository
public class CustomerDAO {
	
	private JdbcTemplate templateObj;
	
	private static Logger logger = Logger.getLogger(CustomerDAO.class);
	
	public void setDataSource(DataSource datasource) {
		this.templateObj = new JdbcTemplate(datasource);
	}

	public void saveCustomer(Customer customer) {
		String sql = "INSERT INTO customers (firstName, middleName, lastName, ssn, birthDate, annualIncome) VALUES (?,?,?,?,?,?)";	
		templateObj.update(sql, customer.getFirstName(), customer.getMiddleName(), customer.getLastName(), customer.getSsn(), customer.getBirthDate(), customer.getAnnualIncome());
	}
	
	public Customer getCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM customers WHERE ssn = '"+ ssn +"'";
		List<Customer> listOfCustomer = templateObj.query(sql, new CustomerMapper());
		if(listOfCustomer.size()==0) {
			return null; 
		}
		return listOfCustomer.get(0);		
	}
	
	public int getCustomerIdBySsn(String ssn) {
		return getCustomerBySsn(ssn).getCustomerId(); 
	}

	public Customer getCustomerByCustomerId(int customerId) {
		String sql = "SELECT * FROM customers WHERE customerId =" + customerId;
		List<Customer> listOfCustomer = templateObj.query(sql, new CustomerMapper());
		if(listOfCustomer.size()==0) {
			return null;
		}
		return listOfCustomer.get(0); 
	}
}
