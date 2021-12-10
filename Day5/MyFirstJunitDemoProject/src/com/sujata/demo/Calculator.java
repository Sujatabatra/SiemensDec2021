package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class Calculator {

	//should divide positive integers
	public int divide(int number1,int number2)throws NegativeNumberException {
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Negative Number Not Allowed");
	}
	
	//should add positive intergers
	public int add(int number1,int number2)throws NegativeNumberException {
		if(number1>=0 && number2>=0)
			return number1+number2;
		else
			throw new NegativeNumberException("Negative Number Not Allowed");
	}
}
