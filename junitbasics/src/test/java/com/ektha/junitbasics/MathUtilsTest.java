package com.ektha.junitbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mu = new MathUtils();
		int expected = 2;
		int actual = mu.add(1, 1);
		assertEquals(expected, actual);
	}

	@Test
	void testMul() {
		MathUtils mu = new MathUtils();
		int expected = 6;
		int actual = mu.mul(2, 3);
		assertEquals(expected, actual);
	}
}
