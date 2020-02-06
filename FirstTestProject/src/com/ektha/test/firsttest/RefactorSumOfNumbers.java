package com.ektha.test.firsttest;

public class RefactorSumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of all the multiple of 3 or 5 below 1000 \n" + sum);
	}

}
