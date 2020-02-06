package com.ektha.corejava.datatype.array.lab3;

class Fibonacci {
	public int getFibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return getFibonacci(n - 1) + getFibonacci(n - 2);

	}

	public int[] printFibonacci(int number) {

		int fibonacciArray[] = new int[number];
		for (int i = 0; i < number; i++) {

			fibonacciArray[i] = getFibonacci(i + 1);
		}

		return fibonacciArray;

	}

}
