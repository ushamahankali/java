package com.ektha.test.firsttest;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i / 3 == 0 || i / 5 == 0) {
				sum = sum + i;
			}

			System.out.println("The sum of the digits is  :" + sum);
		}

	}
}
