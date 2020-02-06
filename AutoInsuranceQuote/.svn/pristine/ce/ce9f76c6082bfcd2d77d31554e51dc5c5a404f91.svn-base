package com.nivtek.autoinsurancequote.service;

import java.awt.List;
import java.util.ArrayList;

import com.nivtek.autoinsurancequote.dao.ClaimDao;
import com.nivtek.autoinsurancequote.dao.VehicleDao;
import com.nivtek.autoinsurancequote.dao.ViolationDao;
import com.nivtek.autoinsurancequote.entity.Quote;
import com.nivtek.autoinsurancequote.entity.Request;

/**
 * @author Bootcamp User 024
 *
 */
public class QuoteService {

	/**
	 * @param request
	 */

	public void getQuote(Request request) {
		
		String name = request.getFirstName();
		
		int term = Quote.getTerm();
	
		
		int amount = 0;
		
		int quoteNumber = (int) (1000 + (Math.random() * 100));
		
		ArrayList<String> luxuryCars = new ArrayList<String>();
		luxuryCars.add("BMW");
		luxuryCars.add("BENZ");
		luxuryCars.add("AUDI");
		
		String vin = request.getVin();
		String licenceNumber = request.getLicenceNumber();
		
		VehicleDao vehicleDao = new VehicleDao();
		//ViolationDao violationDao = new ViolationDao();
		//ClaimDao claimDao = new ClaimDao();
		
		//get vehicle model
		
		String make = vehicleDao.getVehicle(vin).getMake();
		
		//get num of claims from licence number
		int numOfClaims = Character.getNumericValue(licenceNumber.charAt(licenceNumber.length() - 1));
		
		//get num of Violations
		int numOfViolations = Character.getNumericValue(licenceNumber.charAt(2));
		
		//System.out.println(numOfClaims + " ... " + numOfViolations);
		
		//Conditions for Increasing the amount. Lux pays min. 850 normal pays min. 500
				
		if(luxuryCars.contains(make)) {
			amount += 500;
			
			if(numOfClaims > 5 ) {
				amount += 200;
			} else {
				amount +=150;
			}
			
			if(numOfViolations > 5) {
				amount +=300;
			} else {
				amount +=200;
			}
		}else {
			amount +=300;
			
			if(numOfClaims > 5) {
				amount += 150;
			} else {
				amount += 100;
			}
			
			if(numOfViolations > 5) {
				amount += 200;
			} else {
				amount +=100;
			}
		}
		
		
		System.out.println("-------------------\n"
				+ "Thank You! " + name + ". \n"
				+ "Your Quote Number is: " + quoteNumber + ". \nYour Insurance cost is: " + amount
				+".\nThe term of your insurance is: " + term + " months.\n-------------------");
		
		
	}

}
