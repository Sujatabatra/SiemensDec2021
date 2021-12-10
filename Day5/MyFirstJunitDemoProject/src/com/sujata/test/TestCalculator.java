package com.sujata.test;

/*
 * by static import we are importing all the static members of Assertions class
 * means while calling static members of Assertions class we not not to use class name
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("testing calculator class method")
class TestCalculator {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@DisplayName("test cases for divide method")
	@Nested
	class TestDivideMethod {
		@DisplayName("Testing divide for 20 and 4")
		@Test
		void t001() throws NegativeNumberException {
			assertEquals(5, calculator.divide(20, 4));
		}

		@DisplayName("Testing divide for 20 and -2")
		@Test
		void t002() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(20, -2));
		}

		@DisplayName("Testing divide for -20 and 2")
		@Test
		@EnabledOnOs({OS.LINUX})
		void t003() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-20, 2));
		}

		@DisplayName("Testing divide for 20 and 0")
		@Test
		@EnabledOnOs({OS.WINDOWS,OS.LINUX,OS.SOLARIS})
		void t004() throws NegativeNumberException {
			assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
		}

		@DisplayName("Testing divide for 0 and 3")
		@Test
		@EnabledOnOs({OS.WINDOWS})
		void t005() throws NegativeNumberException {
			assertEquals(0, calculator.divide(0, 3));
		}
	}

	@DisplayName("test cases for add method")
	@Nested
	class TestAddMethod {

		@DisplayName("Testing add for 20 and 4")
		@Test
		void t006() throws NegativeNumberException {
			assertEquals(24, calculator.add(20, 4));
		}

		@DisplayName("Testing add for 20 and -2")
		@Test
		@Disabled
		void t007() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.add(20, -2));
		}

		@DisplayName("Testing add for -20 and 2")
		@Test
		void t008() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-20, 2));
		}

		@DisplayName("Testing add for 20 and 0")
		@Test
		void t009() throws NegativeNumberException {
			assertEquals(20, calculator.add(20, 0));
		}

		@DisplayName("Testing add for 0 and 3")
		@Test
		void t010() throws NegativeNumberException {
			assertEquals(3, calculator.add(0, 3));
		}
	}

}
