package com.coleection.sandbox.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coleection.sandbox.junit.tutorial.SimpleCalculator;

public class SimpleCalculatorTest {

	SimpleCalculator calculator = new SimpleCalculator();
	
	
	@Test
	public void twoPlusTwoShouldEqualsFour() {
		
		
		assertEquals(4, calculator.addition(2,2));
		
	}

	
	
	@Test
	public void twoPlusThreeShouldEqualsFive() {
		
		assertEquals(5, calculator.addition(2,3));
		
	}
	
	@Test
	public void threePlusThreeShouldEqualsSix() {
		
		assertEquals(6, calculator.addition(3,3));
		
	}
	
	
	
	
	
	
}
