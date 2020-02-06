package com.ektha.customerapp.demo;

public class CustomerDAO {

	public void saveCustomer(Customer cust) {

		System.out.println(cust.getFirsName());
		System.out.println(cust.getLastName());
		System.out.println(cust.getPhoneNumber());
		System.out.println(cust.getEmaiId());
	}

}
