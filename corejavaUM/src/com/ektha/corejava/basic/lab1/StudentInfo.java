/*Besides first name and last name, add a 3rd program argument called age.
Parse it as a primitive int using

int age = Integer.parseInt(args[2]);

Print first name, last name and age of the person.*/

package com.ektha.corejava.basic.lab1;

public class StudentInfo {

	String firstName;
	String lastName;
	int age;

	/* Constructor and in this converting String age into the Integer number */
	public StudentInfo(String firstName, String lastName, String age) {

		this.firstName = firstName;
		this.lastName = lastName;
		try {
			this.age = Integer.parseInt(age);
		} catch (NumberFormatException ex) {
			System.out.println("please pass integer for age");
		}

	}

	/* Method to print the student Details */
	public String getStudentInfo() {

		return new String("Student FirstName:" + firstName + "\nStudent LastName:" + lastName + "\nStudent Age:" + age);

	}

}
