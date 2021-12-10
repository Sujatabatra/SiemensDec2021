package com.sujata.test;

/*
 * by static import we are importing all the static members of Assertions class
 * means while calling static members of Assertions class we not not to use class name
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.*;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("testing calculator class method")
class TestCalculatorParametrizedTestDemo {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@DisplayName("Testing divide for 20 and 4")
	@Test
	void t001() throws NegativeNumberException {
		assertEquals(5, calculator.divide(20, 4));
	}

	
	@ParameterizedTest
	@MethodSource("getArgumentsForTestCaseExceptionCheck")
	void testCaseForCheckingException(int number1,int number2,Class className) {
		assertThrows(className,()->calculator.divide(number1,number2));
	}
	
	static Stream<Arguments> getArgumentsForTestCaseExceptionCheck(){
		return Stream.of(
				arguments(20,-2,NegativeNumberException.class),
				arguments(-20,2,NegativeNumberException.class),
				arguments(20,0,ArithmeticException.class)
				);
	}
	
//	@DisplayName("Testing divide for 20 and -2")
//	@Test
//	void t002() throws NegativeNumberException {
//		assertThrows(NegativeNumberException.class, () -> calculator.divide(20, -2));
//	}
//
//	@DisplayName("Testing divide for -20 and 2")
//	@Test
//	void t003() throws NegativeNumberException {
//		assertThrows(NegativeNumberException.class, () -> calculator.divide(-20, 2));
//	}
//
//	@DisplayName("Testing divide for 20 and 0")
//	@Test
//	void t004() throws NegativeNumberException {
//		assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
//	}

	@DisplayName("Testing divide for 0 and 3")
	@Test
	void t005() throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 3));
	}

}
