package com.ektha.corejava.datatype.array.lab3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoFibonacci {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Fibonacci fb = new Fibonacci();

		try {
			System.out.println("Enter the limit");
			int number = scanner.nextInt();
			System.out.println(Arrays.toString(fb.printFibonacci(number)));
			scanner.close();
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("enter valid numbers");

		} catch (NegativeArraySizeException e) {
			// e.printStackTrace();
			System.out.println("enter valid  positive numbers");
		}

	}

}
