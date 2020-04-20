package com.qa.Example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.calc.Calculator;

public class CalculatorTest {

	Calculator c;

	@Before
	public void brefore() {
		c = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(7, c.add(3, 4));
	}

	@Test
	public void subtract() {
		assertEquals(15, c.subtract(20, 5));
	}

}
