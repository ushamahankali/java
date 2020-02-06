package com.ektha.customerapp.demo;

import java.util.Scanner;

public class DemoCustomerApp {

	public static void main(String[] args) {

		CustomerRequest request = new CustomerRequest();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the customer First name:");
		request.setFirsName(scanner.next());
		System.out.println("Enter the customer Last name:");
		request.setLastName(scanner.next());
		System.out.println("Enter the Email id:");
		request.setEmaiId(scanner.next());
		System.out.println("Enter the PhoneNumber name:");
		request.setPhoneNumber(scanner.next());

		scanCustomerData(request);

		scanner.close();

	}

	private static void scanCustomerData(CustomerRequest requst) {

		CustomerController custContrl = new CustomerController();

		custContrl.doPost(requst);

	}

}
