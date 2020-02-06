package com.ekatha.demoflightticketingapp.inheritance.ticketing;

public class PaymentType {

	TicketService tc = new TicketService();

	public void getTypeofPayment(UserDetails ud, int ticketPrice) {
		if (ud.typeOfPayment == UserDetails.CREDITCARDTYPE) {

			if (tc.validateCreditCard(ud, ticketPrice))

				tc.bookTicket(ud, ticketPrice);

		}
		if (ud.typeOfPayment == UserDetails.PAYPALTYPE) {

			if (tc.validatePayPalDetails(ud, ticketPrice))

				tc.bookTicket(ud, ticketPrice);

		}
		if (ud.typeOfPayment == UserDetails.BANKTYPE) {

			if (tc.validateBankDetails(ud, ticketPrice))

				tc.bookTicket(ud, ticketPrice);

		}
	}
}
