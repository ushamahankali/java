package com.ektha.corejava.datatype.array.lab2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class High_Low_AvgTest {

	High_Low_Avg test = new High_Low_Avg();

	@Test
	void testFindHightNumber() {
	
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int result = 36;
		assertEquals(result, test.findHightNumber(numberArray));
		// test with empty array
		int[] numberArray1 = {};
		int result1 = Integer.MIN_VALUE;
		assertEquals(result1, test.findHightNumber(numberArray1));
		// test with negatove values
		int[] numberArray2 = { -2, -7, -5, -4, -12, -17, -8 };
		double result2 = -2;
		assertEquals(result2, test.findHightNumber(numberArray2));
	}


	@Test
	void testFindingAverageOfArray() {
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		double averageResult = 14.2;
		assertEquals(averageResult, test.findingAverageOfArray(numberArray));
		// test with empty array

		int[] numberArray1 = {};
		double averageResult1 = 0;

		assertEquals(averageResult1, test.findingAverageOfArray(numberArray1));

		// test with negatove values
		int[] numberArray2 = { 2, 7, -5, 4, 12, 17, -2 };
		double averageResult2 = 5;
		assertEquals(averageResult2, test.findingAverageOfArray(numberArray2));
	}

	@Test
	void testFindingEvenNumbers() {
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int[] resultArray = { 9, 10, 12, 14, 20, 22, 21, 5, 38, 3 };
		assertArrayEquals(resultArray, test.findingEvenNumbers(numberArray));
		// test with empty array
		int[] numberArray1 = {};
		int[] resultArray1 = {};
		assertArrayEquals(resultArray1, test.findingEvenNumbers(numberArray1));
		// test with negatove values
		int[] numberArray2 = { -9, -8, -10, -12, -18, -20, -21, -5, -36, -3 };
		int[] resultArray2 = { -9, -6, -8, -10, -16, -18, -21, -5, -34, -3 };
		assertArrayEquals(resultArray2, test.findingEvenNumbers(numberArray2));
	}

	@Test
	void testFindingNumberDividedBy3() {
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int[] resultArray = { 9, 12, 18, 21, 36, 3 };
		assertArrayEquals(resultArray, test.findingNumberDividedBy3(numberArray));
		// test with empty array
		int[] numberArray1 = {};
		int[] resultArray1 = {};
		assertArrayEquals(resultArray1, test.findingNumberDividedBy3(numberArray1));
		// test with no value divisible by 3
		int[] numberArray2 = { 1, 2, 8, 4, 5, 7, 10 };
		int[] resultArray2 = {};
		assertArrayEquals(resultArray2, test.findingNumberDividedBy3(numberArray2));
	}

	@Test
	void testFindingNumberLessThanAverage() {
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int[] resultArray = { 9, 8, 10, 12, 5, 3 };
		assertArrayEquals(resultArray, test.findingNumberLessThanAverage(numberArray));
		// test with empty array
		int[] numberArray1 = {};
		int[] resultArray1 = {};
		assertArrayEquals(resultArray1, test.findingNumberLessThanAverage(numberArray1));
		// negative array test
		int[] numberArray2 = { -2, -5, -7, -10, -6, -12 };
		int[] resultArray2 = { -10, -12 };
		assertArrayEquals(resultArray2, test.findingNumberLessThanAverage(numberArray2));
	}

	@Test
	void testFindLowestNumber() {
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int result = 3;
		assertEquals(result, test.findLowestNumber(numberArray));
		// test with empty array
		int[] numberArray1 = {};
		int result1 = Integer.MAX_VALUE;
		assertEquals(result1, test.findLowestNumber(numberArray1));
		// test with negatove values
		int[] numberArray2 = { -2, -7, -5, -4, -12, -17, -8 };
		double result2 = -17;
		assertEquals(result2, test.findLowestNumber(numberArray2));
	}

	@Test
	void testGetAllOddNumbers() {
		// test with basic array
		int[] numberArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int[] resultArray = { 9, 21, 5, 3 };
		assertArrayEquals(resultArray, test.getAllOddNumbers(numberArray));
		// test with empty array
		int[] numberArray1 = {};
		int[] resultArray1 = {};
		assertArrayEquals(resultArray1, test.getAllOddNumbers(numberArray1));
		// test with even array
		int[] numberArray2 = { 2, 4, 6, 8, 10 };
		int[] resultArray2 = {};
		assertArrayEquals(resultArray2, test.getAllOddNumbers(numberArray2));

	}

}
