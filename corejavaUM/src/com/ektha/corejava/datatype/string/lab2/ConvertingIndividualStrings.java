package com.ektha.corejava.datatype.string.lab2;

public class ConvertingIndividualStrings {

	public boolean convertingIndividualStrings(String date) {

		boolean result = false;

		// checking for length
		if (date.length() != 10) {

			return result;
		}
		// chechking for special character and divide it into substring
		if (date.charAt(2) != '/' || date.charAt(5) != '/') {

			return result;
		}
		String test = date.substring(0, 2);
		int month = 0;
		try {
			month = Integer.parseUnsignedInt(test);
		} catch (NumberFormatException e) {
			return result;
		}
		// checking for month
		if (month < 1 || month > 12) {

			return result;
		}

		String days = date.substring(3, 5);
		int day = 0;
		try {
			day = Integer.parseInt(days);
		} catch (NumberFormatException e) {
			return result;
		}
		// checking for days
		if (day < 1 && day > 31) {

			return result;

		}
		// checking month and days based on leapyear
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {

			return result;
		}
		if (month == 2 && day > 29) {

			return result;
		}
		int year = 0;
		String years = date.substring(6);
		try {
			year = Integer.parseInt(years);
		} catch (NumberFormatException e) {
			return result;
		}
		// checking for years
		if (year < 1) {
			return result;
		}

		return result = true;

	}

}
