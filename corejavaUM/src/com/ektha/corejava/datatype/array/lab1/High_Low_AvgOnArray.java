/*Array Assignment 1 – Part 1

Int[] numbersArray = {9, 8, 10, 12, 18, 20, 21, 5, 36, 3};
Start with the above Array and perform the following functions.
1)	Go  through the array and print only odd numbers.
2)	For all even numbers, increase the value by 2 and store it in the same array at the same index.
a.	Print the new Array.
3)	Print out every number divisible by 3.
4)	Print the average of the array.
5)	Print out the highest value in the array.
6)	Print out the lowest value in the array.
7)	Print every number less than the average.
Format your code.
*/

package com.ektha.corejava.datatype.array.lab1;

public class High_Low_AvgOnArray {

//Array declaration and intialization

	int numbersArray[] = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

	int total = 0;
	int maxNumber = numbersArray[0];
	int minNumber = numbersArray[0];

	/* Print out the highest value in the array. */
	public void findHighestNumber() {
		System.out.println("The Highest value in the array is:");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] > maxNumber) {

				maxNumber = numbersArray[i];

			}

		}
		System.out.println(maxNumber);
	}

	/*
	 * Print the average of the array. Print every number less than the average.
	 */
	public void findingAverageOfArray() {

		for (int i = 0; i < numbersArray.length; i++) {
			total = total + numbersArray[i];
		}
		int average = total / numbersArray.length;

		System.out.println("\nThe Average of the array is:" + average);

		/* Print every number less than the average. */
		System.out.println("\nThe numer which are less than the average are:");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < average) {
				System.out.println(numbersArray[i]);
			}
		}

	}

	/*
	 * 2) For all even numbers, increase the value by 2 and store it in the same
	 * array at the same index. a. Print the new Array.
	 */
	public void findingEvenNumbers() {
		System.out.println("The even numbers after increased by 2 are:");

		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 0) {

				numbersArray[i] += 2;
				// System.out.println(numbersArray[i]);

			}
		}
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println(numbersArray[i]);
		}

	}

	/* 3) Print out every number divisible by 3. */
	public void findingNumberDividedBy3() {

		System.out.println("finding the number which are divide by 3 :");

		for (int i = 0; i < numbersArray.length; i++) {
			/* finding the odd number in array */
			if (numbersArray[i] % 3 == 0) {
				System.out.println(numbersArray[i]);
			}

		}
	}

	/* 1) Go through the array and print only odd numbers. */
	public void findingOddNumbers() {
		System.out.println("The Odd Numbers in Arry are :");

		for (int i = 0; i < numbersArray.length; i++) {
			/* finding the odd number in array */
			if (numbersArray[i] % 2 != 0) {
				System.out.println(numbersArray[i]);

			}
		}

	}

	/* 5) Print out the lowest value in the array. */
	public void findLowestNumber() {
		System.out.println("The Lowest value in the array is:");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < minNumber) {

				minNumber = numbersArray[i];

			}

		}
		System.out.println(minNumber);
	}

	public void printingArray() {
		System.out.println("The given array is:");
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println(numbersArray[i]);
		}
	}

}