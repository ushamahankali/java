package com.ektha.corejava.datatype.array.lab4;

public class PowerOfTwo {
	public int[] powerOfBase(int n, int base) {
		if (n < 0) {
			int[] r = {};
			return r;
		} else if (n == 0) {
			int[] array = { 0 };
			return array;
		}
		int[] result = new int[n];
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = base * result[i - 1];
		}

		return result;

	}

	public int[] powerOfTwo(int n) {
		if (n < 0) {
			int[] r = {};
			return r;
		} else if (n == 0) {
			int[] array = { 0 };
			return array;
		}
		int[] result = new int[n];
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = 2 * result[i - 1];
		}
		// System.out.println(result);
		return result;

	}

	public int[] printArray(int[] array) {
		if (array.length == 1) {
			System.out.print(+array[0]);
		} else {
			for (int i = 0; i < array.length; i++) {
				if (i == 0) {
					System.out.print(+array[i] + ", ");
				} else if (i == array.length - 1) {
					System.out.print(array[i]);
				} else {
					System.out.print(array[i] + ", ");
				}
			}
		}
		return array;
	}
}