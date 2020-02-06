package com.ektha.demoflightticketingapp.ticketing;

import java.util.Scanner;

public class DemoFlightTicketingApp {

	public static void main(String[] args) {

		/* inserting the inputs from the console */
		Scanner scanner = new Scanner(System.in);
		CreditCard cc = new CreditCard();
		System.out.print("enter the name on the card ");

		cc.setNameOnTheCard(scanner.next());
		System.out.println("enter the credit card number");
		cc.setCcNumber(scanner.nextInt());
		System.out.println("enter the cvvNumber");
		cc.setCvvNumber(scanner.nextInt());

		System.out.println("enter the ticket price");
		int ticketPrice = scanner.nextInt();

		TicketService tc = new TicketService();
		/* calling the validatecreditcard method to verify the creditcard details */
		if (tc.validateCreditCard(cc, ticketPrice))

			/* based on the validation bookticket is called to purchase ticket */
			tc.bookTicket(cc, ticketPrice);

		scanner.close();

	}

}
