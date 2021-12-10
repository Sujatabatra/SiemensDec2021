package com.sujata.test;

/*
 * by static import we are importing all the static members of Assertions class
 * means while calling static members of Assertions class we not not to use class name
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class TestCalculator {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	void t001()throws NegativeNumberException {
		assertEquals(5, calculator.divide(20, 4));
	}

	@Test
	void t002()throws NegativeNumberException {
		assertThrows(NegativeNumberException.class,()->calculator.divide(20, -2));
	}
	
	@Test
	void t003()throws NegativeNumberException {
		assertThrows(NegativeNumberException.class,()->calculator.divide(-20, 2));
	}
	
	@Test
	void t004()throws NegativeNumberException {
		assertThrows(ArithmeticException.class,()->calculator.divide(20, 0));
	}
	
	@Test
	void t005()throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 3));
	}
	
	

}
