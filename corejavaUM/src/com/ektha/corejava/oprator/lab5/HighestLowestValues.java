package com.ektha.corejava.oprator.lab5;

public class HighestLowestValues {

	public void maxValue(int[] numberArray) {
		int maxValue = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > maxValue) {

				maxValue = numberArray[i];

			}
		}
		System.out.println("The maximum Value in the given numbers :" + maxValue);
	}

	public void minValue(int[] numberArray) {
		int minValue = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < minValue) {

				numberArray[i] = minValue;

			}
		}
		System.out.println("The minimum Value in the given numbers :" + minValue);
	}
}
