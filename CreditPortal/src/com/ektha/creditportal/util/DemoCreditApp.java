package com.ektha.creditportal.util;

import java.util.Scanner;

import com.ektha.creditportal.controller.CreditController;
import com.ektha.creditportal.entity.Request;

public class DemoCreditApp {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Request cr = new Request();
		// getting the applicant details from the user

		System.out.println("ENTER THE APPLICANT DETAILS");
		System.out.println("Enter the Applicant First Name:");
		cr.setFirstName(scanner.nextLine());
		System.out.println("Enter the Applicant Last Name:");
		cr.setLastName(scanner.nextLine());
		System.out.println("Enter the Applicant SSN Number:");
		cr.setSsnNumber(scanner.nextInt());
		System.out.println("Enter the Applicant Salary:");
		cr.setSalary(scanner.nextInt());
		scanData(cr);
		scanner.close();

	}

	private static void scanData(Request req) {

		CreditController cc = new CreditController();

		cc.doPost(req);

	}
}
