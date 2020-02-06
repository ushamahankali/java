package com.ektha.corejava.oprator.lab3;

import java.util.Scanner;

/**
 * @author usha
 *
 */

public class QuotientAndReminder {
//method to find the Quotient and Reminder
	public static void getQuotientAndReminder(int i, int j) {
		int quotient = i / j;

		int reminder = i % j;

		System.out.println("The FirstNumber: " + i + "\tThe SecondNumber: " + j + " \tThe Quotient is:" + quotient
				+ "\tThe Reminder is:" + reminder);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// taking to integer values from the Scanner class
		System.out.println("Enter the First Number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int number2 = scanner.nextInt();

		// calling the method to find Quotient and Reminder for the given numbers
		getQuotientAndReminder(number1, number2);

		scanner.close();

	}

}
