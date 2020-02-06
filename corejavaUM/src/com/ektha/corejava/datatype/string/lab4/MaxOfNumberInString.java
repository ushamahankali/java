package com.ektha.corejava.datatype.string.lab4;

public class MaxOfNumberInString {

	public int[] addingDigitsOfArray(int[] arrayNumber) {

		int[] resultArray = new int[arrayNumber.length];

		for (int i = 0; i < arrayNumber.length; i++) {
			resultArray[i] = sumOfDigit(arrayNumber[i]);

		}

		return resultArray;

	}

	public int[] convertingStringToArray(String str) throws NumberFormatException {
		String[] tempString = str.split("\\s*,\\s*");

		int[] numberArray = new int[tempString.length];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = Integer.parseInt(tempString[i]);

		}

		return numberArray;

	}

	public int[] findingmaximumnumbers(int[] arrayNumber, int[] numberArray) {

		int count = 0;
		int maxValue = arrayNumber[0];
// finding the maximum value in the sum of digits of array
		for (int i = 0; i < numberArray.length; i++) {
			if (arrayNumber[i] > maxValue) {

				maxValue = arrayNumber[i];

			}
		}

		// finding the maximum number in a given arry
		count = 0;
		for (int j : arrayNumber) {
			if (j == maxValue) {
				count++;
			}
		}

		// reading the maximum values in converted string array
		int[] resultArray = new int[count];
		count = 0;
		for (int k = 0; k < arrayNumber.length; k++) {
			if (arrayNumber[k] == maxValue) {
				resultArray[count] = numberArray[k];
				count++;
			}
		}
		System.out.println("The maximum value is :" + maxValue);
		return resultArray;

	}

	public void printingArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private int sumOfDigit(int number) {
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}

}
