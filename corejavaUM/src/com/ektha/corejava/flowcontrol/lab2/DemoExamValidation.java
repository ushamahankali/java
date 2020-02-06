package com.ektha.corejava.flowcontrol.lab2;

import java.util.Scanner;

public class DemoExamValidation {

	public static void main(String[] args) {

		ExamValidation validation = new ExamValidation();

		Scanner scan = new Scanner(System.in);
		int marks;

		System.out.println("Enter the marks");
		marks = scan.nextInt();

		if (validation.hasPassed(marks)) {
			System.out.println("Passed Successfully!");
		} else {
			System.out.println("Failed! The range of the qualifying exam marksis between 65 and 100");
		}

		scan.close();
	}

}
