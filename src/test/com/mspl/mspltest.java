package com.mspl;

import junit.framework.Assert;
import org.junit.Test;

public class mspltest {

	@Test
	public void testSum() {
		// Given
		mspl calculator = new mspl();
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		mspl calculator = new mspl();
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		mspl calculator = new mspl();
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		mspl calculator = new mspl();
		calculator.divide(6, 0);
	}
	
}

