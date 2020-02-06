
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

public class StudentInfoScannMain {

	public static void main(String[] args) {

		StudentInfoScanner studentInfoScanner = new StudentInfoScanner();
		/* calling the method */
		System.out.println(studentInfoScanner.getStudentInfo());

	}
}
