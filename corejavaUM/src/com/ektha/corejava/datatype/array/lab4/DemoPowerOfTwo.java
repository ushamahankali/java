package com.ektha.corejava.datatype.array.lab4;

class DemoPowerOfTwo {

	public static void main(String[] args) {
		PowerOfTwo pt = new PowerOfTwo();

		pt.printArray(pt.powerOfTwo(5));
		System.out.println("\n exponential values of the base 3 and power 5.");
		pt.printArray(pt.powerOfBase(5, 3));
	}

}