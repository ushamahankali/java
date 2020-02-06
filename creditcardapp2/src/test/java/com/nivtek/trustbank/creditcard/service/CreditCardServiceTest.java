package com.nivtek.trustbank.creditcard.service;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Dipendra Pokharel
 *
 */

public class CreditCardServiceTest {

	private CreditCardService ccService = new CreditCardService();

	@Test
	public void testGetCreditLimit() {

		int expected = 1000;
		int actual = ccService.getCardLimit(10000);
		assertEquals(expected, actual);

	}


}
