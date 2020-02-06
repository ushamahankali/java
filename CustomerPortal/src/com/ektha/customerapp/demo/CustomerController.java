package com.ektha.customerapp.demo;

public class CustomerController {

	public void doPost(CustomerRequest req) {

		CustomerService cs = new CustomerService();

		Customer cust = new Customer();

		cust.setFirsName(req.getFirsName());
		cust.setLastName(req.getLastName());
		cust.setEmaiId(req.getEmaiId());
		cust.setPhoneNumber(req.getPhoneNumber());

		cs.saveCustomer(cust);

	}
}
