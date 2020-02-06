package com.ektha.corejava.datatype.string.lab4;

public class DemoMaxOfNumberInString {

	public static void main(String args[]) {

		String number = "324, 457, 112, 259, 323, 222";

		MaxOfNumberInString mns = new MaxOfNumberInString();

		int[] resultArray = mns.convertingStringToArray(number);

		int[] sumArray = mns.addingDigitsOfArray(resultArray);

		System.out.println("For each of the numbers, sum up the digits  ");
		mns.printingArray(mns.addingDigitsOfArray(resultArray));

		System.out.println("Parse the string, split it into an array of numbers. ");
		mns.printingArray(resultArray);

		System.out.println("The numbers in an array which contatin maximum sum ");
		mns.printingArray(mns.findingmaximumnumbers(sumArray, resultArray));

	}

}
