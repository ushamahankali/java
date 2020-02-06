
/*Collect first name, last name and age as inputs from the user instead of program arguments.

Use the Scanner class to collect strings and integer inputs.

Inputs are typed in on the console using the keyboard.

Print the first name, last name & age values collected from the user.

Refer to the Scanner class in the JDK 1.6 api.

The Scanner class has methods called :
1) next() to collect a String and
2) nextInt() to collect integers.
*/

package com.ektha.corejava.basic.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfoScanner {
	String firstName;
	String lastName;
	int age;

	/* Default constructor */
	public StudentInfoScanner() {

	}

	/* constructor */
	public StudentInfoScanner(String firstName, String lastName, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	/* Method to get scanner class and insert the details */
	public String getStudentInfo() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your first name");
		firstName = scanner.next();
		System.out.println("enter your last name");
		lastName = scanner.next();
		boolean continueInputAge = true;
		/*
		 * used try catch block to check enter the valid input and if not to catch the
		 * exception
		 */
		do {

			try {

				System.out.println("enter your age");

				age = scanner.nextInt();
				continueInputAge = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				scanner.nextLine();

			}

		} while (continueInputAge);

		scanner.close();
		return new String("Student FirstName:" + firstName + "\nStudent LastName:" + lastName + "\nStudent Age:" + age);

	}

}
