
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

public class High_Low_AvgOnArrayMain {

	public static void main(String[] args) {

		High_Low_AvgOnArray array = new High_Low_AvgOnArray();
		array.printingArray();
		array.findingEvenNumbers();
		array.findingOddNumbers();
		array.findingNumberDividedBy3();
		array.findingAverageOfArray();
		array.findHighestNumber();
		array.findLowestNumber();

	}
}
