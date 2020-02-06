package com.ektha.corejava.datatype.array.lab2;

public class High_Low_AvgMain {

	public static void main(String[] args) {
		int numbersArray[] = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

		High_Low_Avg arrays = new High_Low_Avg();
		System.out.println("The given array is");
		arrays.printingArray(numbersArray);
		System.out.println("The Odd Numbers in Arry are :");
		arrays.printingArray(arrays.getAllOddNumbers(numbersArray));
		arrays.findHightNumber(numbersArray);
		arrays.findLowestNumber(numbersArray);
		System.out.println("the average of the array is \n" + arrays.findingAverageOfArray(numbersArray));
		System.out.println("The Number LessThan Average :");
		arrays.printingArray(arrays.findingNumberLessThanAverage(numbersArray));

		System.out.println("The Number Divided By 3 :");
		arrays.printingArray(arrays.findingNumberDividedBy3(numbersArray));
		System.out.println("The Even numbers after increased by 2 array :");
		arrays.printingArray(arrays.findingEvenNumbers(numbersArray));

	}

}
