
/*Besides first name and last name, add a 3rd program argument called age.
Parse it as a primitive int using

int age = Integer.parseInt(args[2]);

Print first name, last name and age of the person.*/
package com.ektha.corejava.basic.lab1;

public class IntroductionMain {

	public static void main(String[] args) {

		/* its the condition to check for the Input Values */
		if (args.length < 3) {
			System.out.println("Invalid arguments, pass firstName, lastName and age");
		}

		/* Creating object */
		StudentInfo studentinfo = new StudentInfo(args[0], args[1], args[2]);

		/* Calling the method and printing the student details */
		System.out.println(studentinfo.getStudentInfo());

	}

}
