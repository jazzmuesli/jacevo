package com.github.jazzmuesli.jacevo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testDivide() {
		assertEquals(3.0, new Calculator().divide(27, 9), 1e-6);
	}
}
