package com.coleection.sandbox.junit.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void twoPlusTwoShouldEqualsFour() {
		SimpleCalculator calculator = new SimpleCalculator();
		
		assertEquals(4, calculator.addition(2,2));
		
	}

}
