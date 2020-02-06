package com.nivtek.autoinsuranceportal.quote.app;

import java.util.Scanner;

import com.nivtek.autoinsuranceportal.quote.controller.QuoteController;
import com.nivtek.autoinsuranceportal.quote.entity.Request;
import com.nivtek.autoinsuranceportal.quote.entity.Vehicle;

/**
 * @author Sartha Tamang.
 *
 */
public class InsuranceQuoteApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your First Name: ");

		String firstName= scan.nextLine();

		System.out.println("Enter your Last Name: ");

		String lastName = scan.nextLine();

		System.out.println("Enter your Driver License No : ");

		String drivingLicenseNumber = scan.nextLine();

		System.out.println("Enter your VIN: ");

		String vin = scan.nextLine();

		Vehicle vehicle = new Vehicle();
		Request request = new Request();

		vehicle.setVin(vin);
		request.setVin(vin);
		request.setDrivingLicenseNumber(drivingLicenseNumber);
		request.setFirstName(firstName);
		request.setLastName(lastName);
		
		/*
		 * calling the controlller class methods
		 */
		
		QuoteController quoteController = new QuoteController();
		quoteController.getQuote(request);
		
		scan.close();

	}

}
