package com.ektha.junitbasics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Random {

	private static long cvvNumber() {
		long n3 = 0;
		for (int i = 0; i < 99999999; i++) {
			n3 = Math.round(Math.random() * (999 - 100) + 100);
			if (n3 < 100 || n3 >= 1000)
				System.out.println(n3);
		}
		return n3;
	}

	private static long generateCreditCardNo() {
		String firstDigit = "3249";
		String randomNumber = String.valueOf((long) (Math.random() * 1e12));
		String lastDigits = ("000000000000" + randomNumber).substring(randomNumber.length());

		long number = Long.parseLong(firstDigit + lastDigits);
		return number;
	}

	public static void main(String args[]) {

		System.out.println(generateCreditCardNo());
		System.out.println(cvvNumber());

		LocalDateTime ldt = LocalDateTime.now().plusYears(3);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
		String date = formatDate.format(ldt);

		System.out.println(date);

	}
}
