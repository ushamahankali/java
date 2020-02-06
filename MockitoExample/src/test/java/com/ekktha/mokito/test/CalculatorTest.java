package com.ekktha.mokito.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ektha.mokito.Calculator;
import com.ektha.mokito.CalculatorService;

public class CalculatorTest {

	static Calculator c = null;

	static CalculatorService service = mock(CalculatorService.class);

	@BeforeAll
	public static void setUp()

	{
		c = new Calculator(service);
	}

	@Test
	public void testperform() {

		when(service.add(2, 5)).thenReturn(5);

		assertEquals(10, c.perform(2, 5));
		verify(service).add(2, 5);

	}

}
