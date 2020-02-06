package com.nivtek.autoinsurancequote.app;

import java.util.Scanner;

import com.nivtek.autoinsurancequote.controller.QuoteController;
import com.nivtek.autoinsurancequote.controller.VehicleController;
import com.nivtek.autoinsurancequote.entity.Request;
import com.nivtek.autoinsurancequote.entity.Vehicle;

/**
 * @author Bootcamp User 024
 *
 */
public class InsuranceApp {

	public static void main(String[] args) {
		//get inputs
		Scanner scanner = new Scanner(System.in);
		System.out.print("First Name = ");
		String firstName = scanner.nextLine();
		
		System.out.print("Last Name = ");
		String lastName = scanner.nextLine();
		
		System.out.print("Licence Number = ");
		String licenceNumber = scanner.nextLine();
		
		System.out.print("VIN = ");
		String vin = scanner.nextLine();
		scanner.close();
		
		//vin
		
		Vehicle vehicle = new Vehicle();
		Request request = new Request();
		vehicle.setVin(vin);
		request.setVin(vin);
		request.setLicenceNumber(licenceNumber);
		request.setFirstName(firstName);
		
		//
		
		QuoteController quoteController = new QuoteController();
		quoteController.getQuote(request);
			
		

	}

}
