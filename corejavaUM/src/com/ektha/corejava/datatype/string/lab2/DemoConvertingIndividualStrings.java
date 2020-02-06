package com.ektha.corejava.datatype.string.lab2;

import java.util.Scanner;

public class DemoConvertingIndividualStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ConvertingIndividualStrings cs = new ConvertingIndividualStrings();

		System.out.println("enter the date");
		String birthDayDate = scanner.nextLine();

		if (!cs.convertingIndividualStrings(birthDayDate)) {
			System.out.println("invalid format it should be MM/DD/YYYY");
		} else {
			// dividing and printing the data
			String month = birthDayDate.substring(0, 2);
			String day = birthDayDate.substring(3, 5);
			String year = birthDayDate.substring(6);
			System.out.println("month:" + month);
			System.out.println("day :" + day);
			System.out.println("year :" + year);
		}
		scanner.close();
	}

}
