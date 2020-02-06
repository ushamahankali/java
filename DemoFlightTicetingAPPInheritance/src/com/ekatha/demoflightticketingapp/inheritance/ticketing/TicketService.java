package com.ekatha.demoflightticketingapp.inheritance.ticketing;

import java.util.Random;
import java.util.Scanner;

public class TicketService {

	CustomerDetailsDB cdetails = new CustomerDetailsDB();
	CreditCard creditcard = new CreditCard();
	Scanner scanner = new Scanner(System.in);

	public void bookTicket(UserDetails ud, int ticketPrice) {
		Random r = new Random();
		StringBuffer s = new StringBuffer(String.format("Itinerary for %s\n ", ud.firstName + ud.lastName));
		s.append(String.format("Ticket booked from Dallas to Miami for %d", ticketPrice));
		System.out.println(s);
		System.out.println("The Itinerary number is " + (r.nextInt(1000)));
	}

	boolean validateBankDetails(UserDetails cc, int ticketPrice) {

		BankAccountDetails bb1 = (BankAccountDetails) cc;
		System.out.println("enter the Account number");
		bb1.setAccountNumber(scanner.nextInt());
		System.out.println("enter the Routing number");
		bb1.setRoutingNumber(scanner.nextInt());
		if (cdetails.FIRSTNAME.equalsIgnoreCase(bb1.firstName) && cdetails.LASTNAME.equalsIgnoreCase(bb1.lastName)
				&& cdetails.ROUTINGNUMBER == bb1.routingNumber && cdetails.ACCOUNTNUMBER == bb1.accountNumber) {
			if (ticketPrice < cdetails.CREDITLIMIT)
				return true;
			else {
				System.out.println("The paypal id is not correct");
				return false;
			}

		} else {
			System.out.println("The account has been declined");

			return false;
		}

	}

	boolean validateCreditCard(UserDetails cc, int ticketPrice) {

		CreditCard cc1 = (CreditCard) cc;
		// details.setNameOnTheCard(scanner.next());

		System.out.println("enter the credit card number");
		cc1.setCcNumber(scanner.nextInt());
		System.out.println("enter the cvvNumber");
		cc1.setCvvNumber(scanner.nextInt());

		if (cdetails.FIRSTNAME.equalsIgnoreCase(cc1.firstName) && cdetails.LASTNAME.equalsIgnoreCase(cc1.lastName)
				&& cdetails.CCNUMBER == cc1.ccNumber && cdetails.CVVNUMBER == cc1.cvvNumber) {
			if (ticketPrice < cdetails.CREDITLIMIT)
				return true;
			else {
				System.out.println("The card has been declined due to insufficient funds");
				return false;
			}

		} else {
			System.out.println("The card has been declined");

			return false;
		}
	}

	boolean validatePayPalDetails(UserDetails cc, int ticketPrice) {

		PayPalDetails pp1 = (PayPalDetails) cc;
		System.out.println("enter the paypal id");
		pp1.setPayPalId(scanner.nextLine());
		if (cdetails.FIRSTNAME.equalsIgnoreCase(pp1.firstName) && cdetails.LASTNAME.equalsIgnoreCase(pp1.lastName)
				&& cdetails.PAYPALID.equalsIgnoreCase(pp1.payPalId)) {
			if (ticketPrice < cdetails.CREDITLIMIT)
				return true;
			else {
				System.out.println("The paypal id is not correct");
				return false;
			}

		} else {
			System.out.println("The account has been declined");

			return false;
		}

	}
}
