package com.ektha.corejava.flowcontrol.lab3;

public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'B';
		SwitchCase scase = new SwitchCase();
		scase.calculationOfGrades(grade);

	}

	public void calculationOfGrades(char grade) {
		switch (grade) {
		case 'A':

			System.out.println("The range of the marks based on the grade is  80-100");
			break;

		case 'B':

			System.out.println("The range of the marks based on the grade is  73-79");
			break;

		case 'C':

			System.out.println("The range of the marks based on the grade is  65-72");
			break;

		case 'D':

			System.out.println("The range of the marks based on the grade is  55-64");
			break;

		case 'E':

			System.out.println("The range of the marks based on the grade is  < 55 ");
			break;

		default:

			System.out.println(" Grade does not exist");

		}
	}

}
