package com.ektha.customerapp.demo;

public class CustomerService {

	public void saveCustomer(Customer cust) {
		CustomerDAO custDAO = new CustomerDAO();

		cust.setFirsName(cust.getFirsName().toUpperCase());
		cust.setLastName(cust.getLastName().toUpperCase());
		cust.setEmaiId(cust.getEmaiId().toUpperCase());
		cust.setPhoneNumber(cust.getPhoneNumber().toUpperCase());

		custDAO.saveCustomer(cust);

	}
}
