package com.ekatha.corejava.syntax;

import java.util.Scanner;

public class SyntaxOfJavaProgramming {
	/* 5)delcaring a method */
	public int checkEvenOddNumber() {

		System.out.println("Enter an Integer:");

		Scanner s = new Scanner(System.in);
		/* 4)delcaring variables */
		int number = s.nextInt();
		/* 6)if conditions */
		if (number % 2 == 0) {
			System.out.println("The entered number is Even number");
		} else {
			System.out.println("Ther entered number is odd number");

		}
		s.close();
		/* 10)return */
		return number;

	}

}
