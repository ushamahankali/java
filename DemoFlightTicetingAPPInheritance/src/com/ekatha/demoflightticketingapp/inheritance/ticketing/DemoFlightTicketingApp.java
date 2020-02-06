package com.ekatha.demoflightticketingapp.inheritance.ticketing;

import java.util.Scanner;

public class DemoFlightTicketingApp {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		UserDetails userDetails = null;

		System.out.print("enter the First Name: ");
		String firstName = scanner.nextLine();

		System.out.print("enter the Last Name: ");
		String lastName = scanner.nextLine();

		boolean accepted = false;
		int typeOfPayment = 0;
		int count = 0;
		do {

			try {

				System.out.print("enter the Payment Type: 1-Credit Card, 2-Bank, 3-Paypal ");
				typeOfPayment = scanner.nextInt();
				if (typeOfPayment >= UserDetails.CREDITCARDTYPE && typeOfPayment <= UserDetails.PAYPALTYPE)
					accepted = true;
				else {

					System.out.println("Sorry! you didn't entered the valid input");

				}
				count++;

			} catch (Exception ex) {
				System.out.println("enter the valid input");
				scanner.nextLine();
			}
		} while (!accepted && count < 3);

		if (typeOfPayment == 1) {
			userDetails = new CreditCard();
			userDetails.setFirstName(firstName);
			userDetails.setLastName(lastName);
			userDetails.setTypeOfPayment(typeOfPayment);
		}
		if (typeOfPayment == 2) {
			userDetails = new BankAccountDetails();
			userDetails.setFirstName(firstName);
			userDetails.setLastName(lastName);
			userDetails.setTypeOfPayment(typeOfPayment);
		}
		if (typeOfPayment == 3) {
			userDetails = new PayPalDetails();
			userDetails.setFirstName(firstName);
			userDetails.setLastName(lastName);
			userDetails.setTypeOfPayment(typeOfPayment);
		}

		if (userDetails != null) {
			System.out.println("enter the ticket price");
			int ticketPrice = scanner.nextInt();
			PaymentType pt = new PaymentType();

			pt.getTypeofPayment(userDetails, ticketPrice);
			/*
			 * if (tc.validateCreditCard(cc, ticketPrice))
			 *
			 * based on the validation bookticket is called to purchase ticket
			 * tc.bookTicket(cc, ticketPrice);
			 */
		}
		scanner.close();

	}
}
