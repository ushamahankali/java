package com.ektha.demoflightticketingapp.ticketing;

import java.util.Random;

public class TicketService {

	CreditCardTable cct = new CreditCardTable();
	Random random = new Random();

	/*
	 * based on the ticket price creditlimit is verified and book ticket and
	 * generate a itinerary with random number
	 */
	public void bookTicket(CreditCard cc, int ticketPrice) {

		StringBuffer s = new StringBuffer(String.format("Itinerary for %s\n ", cc.nameOnTheCard));
		s.append(String.format("Ticket booked from Dallas to Miami for %d", ticketPrice));
		System.out.println(s);
		System.out.println("The Itinerary number is " + (random.nextInt(1000)));
	}

	/*
	 * this is the method where all the credit card details checked with the
	 * creditcara table
	 */
	boolean validateCreditCard(CreditCard cc, int ticketPrice) {

		if (cct.NAMEONTHECARD.equals(cc.nameOnTheCard) && cct.CCNUMBER == cc.ccNumber
				&& cct.CVVNUMBER == cc.cvvNumber) {
			if (ticketPrice < cct.CREDITLIMIT)
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
}
