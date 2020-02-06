package com.nivtek.autoinsuranceportal.quote.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.nivtek.autoinsuranceportal.quote.dao.VehicleDao;
import com.nivtek.autoinsuranceportal.quote.entity.Quote;
import com.nivtek.autoinsuranceportal.quote.entity.Request;

/**
 * @author Sartha Tamang.
 *
 */
public class QuoteService {

	/**
	 * @param request
	 */
	public void getQuote(Request request) {

		int amount = 0;

		// Generates Random Number.
		Random random = new Random();
		int quoteNumber = random.nextInt(100000);

		// List - Luxury Cars.

		List<String> luxuryCars = new ArrayList<String>();
		
		luxuryCars.add("BMW");
		luxuryCars.add("MERCEDES");
		luxuryCars.add("AUDI");
		luxuryCars.add("PORSCHE");

		String vin = request.getVin();
		
		String drivingLicenseNumber = request.getDrivingLicenseNumber();
		
		String firstName = request.getFirstName();
		String lastName = request.getLastName();
		int term = Quote.getTerm();

		VehicleDao vehicleDao = new VehicleDao();

		// get Vehicle make;
		String make = vehicleDao.getVehicle(vin).getMake();

		// get number of Claims
		
		int numOfClaims = Character.getNumericValue(drivingLicenseNumber.charAt(drivingLicenseNumber.length() - 1));

		// get number of Voilations.
		
		int numOfVoilations = Character.getNumericValue(drivingLicenseNumber.charAt(2));

		
		/* quote amount for Brand based on car model calculating the quote; */
		 
		
		if (luxuryCars.contains(make)) {

			amount += 400;

		} else {
			amount += 200;
		}

		// quote amount for number of Claims;
		if (numOfClaims == 0) {
			amount += 0;
		} else if (numOfClaims <= 8 && numOfClaims != 0) {
			amount += 50;
		} else if (numOfClaims > 8) {
			amount += 100;
		}

		// quote amount for Voilations;
		if (numOfVoilations == 0) {
			
			amount += 0;
		} else if (numOfVoilations <= 8 && numOfVoilations != 0) {
			amount += 50;
		} else if (numOfVoilations > 8) {
			amount += 100;
		}

		System.out.println("Hello " + firstName + " " + lastName + " Your quote number is: " + quoteNumber + "."
				+ " Your quoted amount is: $ " + amount + " for the term " + term + " months.");

	}

}
