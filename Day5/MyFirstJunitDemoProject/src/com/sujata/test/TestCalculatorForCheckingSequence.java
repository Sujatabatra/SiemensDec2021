package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * order of execution
 * 1. setUpBeforeClass
 * 
 * 2. setup
 * 3. TestCase1
 * 4. tearDown
 * 
 * 5. setUp
 * 6. TestCase2
 * 7. tearDown
 * 
 * 8. tearDownAfterClass
 */
class TestCalculatorForCheckingSequence {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	void testDivide() {
		System.out.println("Test Case 1");
	}

	@Test
	void testAdd() {
		System.out.println("Test Case 2");
	}

}
