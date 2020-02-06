package com.ektha.corejava.oprator.lab5;

import java.util.Scanner;

public class DemoHighestLowestValues {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer values");
		int[] number = new int[5];
		number[0] = scanner.nextInt();
		number[1] = scanner.nextInt();
		number[2] = scanner.nextInt();
		number[3] = scanner.nextInt();
		number[4] = scanner.nextInt();
		HighestLowestValues hlValues = new HighestLowestValues();
		hlValues.maxValue(number);
		hlValues.minValue(number);
		scanner.close();

	}

}
