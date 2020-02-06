package com.ektha.corejava.datatype.array.lab2;

import java.util.Arrays;

;

public class High_Low_Avg {

	public int findHightNumber(int[] array) {
		int maxNumber = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNumber) {

				maxNumber = array[i];

			}

		}
		System.out.println("The maximum number in the given array is :" + maxNumber);
		return maxNumber;

	}

	public double findingAverageOfArray(int[] array) {

		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		if (array.length == 0)
			return 0;
		double average = total / array.length;

		// System.out.println("\nThe Average of the array is:" + average);
		return average;

	}

	public int[] findingEvenNumbers(int[] numberArray) {
		// System.out.println("The even numbers after increased by 2 are:");
		@SuppressWarnings("unused")
		int[] result = new int[numberArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] % 2 == 0) {

				numberArray[i] += 2;

			}
		}
		for (int i = 0; i < numberArray.length; i++) {

		}

		return numberArray;

	}

	public int[] findingNumberDividedBy3(int[] numberArray) {
		// System.out.println("finding the number which are divide by 3 :");

		int[] result = new int[numberArray.length];
		int j = 0;
		for (int i = 0; i < numberArray.length; i++) {

			if (numberArray[i] % 3 == 0) {
				{
					result[j] = numberArray[i];
					j++;
				}

			}

		}
		int[] findingNumberDividedBy3 = Arrays.copyOf(result, j);
		return findingNumberDividedBy3;
	}

	public int[] findingNumberLessThanAverage(int[] numberArray) {
		double average = findingAverageOfArray(numberArray);
		int j = 0;
		int[] result = new int[numberArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < average) {
				result[j] = numberArray[i];
				j++;

			}
		}
		int[] findingNumberLessThanAverage = Arrays.copyOf(result, j);
		return findingNumberLessThanAverage;

	}

	public int findLowestNumber(int[] numberArray) {
		int minNumber = Integer.MAX_VALUE;
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < minNumber) {

				minNumber = numberArray[i];

			}

		}
		System.out.println("The minimum number in the given array is :" + minNumber);
		return minNumber;

	}

	/*
	 * 7) Print every number less than the average.
	 */

	public int[] getAllOddNumbers(int[] numberArray) {

		int[] result = new int[numberArray.length];
		int j = 0;
		for (int i = 0; i < numberArray.length; i++) {
			/* finding the odd number in array */
			if (numberArray[i] % 2 != 0) {
				{
					result[j] = numberArray[i];
					j++;
				}

			}
		}

		int[] oddNumberArray = Arrays.copyOf(result, j);
		return oddNumberArray;

	}

	/* 1) Go through the array */
	public void printingArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
