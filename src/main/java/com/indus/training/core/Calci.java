package com.indus.training.core;

/**
 * Provides methods for performing basic arithmetic operations
 */
public final class Calci {

	/**
	 * final method for adding two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return the sum
	 */
	public final double addition(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 + param2;
		}
		return result;

	}

	/**
	 * final method for subtracting two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return the difference
	 */
	public final double subtract(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 - param2;
		}
		return result;

	}

	/**
	 * final method for multiplying two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return the product
	 */
	public final double multiply(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 * param2;
		}
		return result;

	}

	/**
	 * final method for performing division
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return the quotient
	 */
	public final double division(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 / param2;
		}
		return result;

	}

}
