package com.indus.training.core;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Calci Class
 */
public class TestCalci extends TestCase {

	private Calci calObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		calObj = new Calci();

	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		calObj = null;
	}

	/**
	 * Test Case for addition method
	 */
	public void testAddition() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 5.0;

		// 3. Actual Result
		double actResult = calObj.addition(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for subtract method
	 */
	public void testSubtract() {

		// 1. Inputs
		double param1 = 5.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actResult = calObj.subtract(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for multiply method
	 */
	public void testMultiply() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 6.0;

		// 3. Actual Result
		double actResult = calObj.multiply(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for division method
	 */
	public void testDivision() {

		// 1. Inputs
		double param1 = 4.0;
		double param2 = 2.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actResult = calObj.division(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

}
