package com.sujata.oop;

/*
 * * with this private access modifier : data hiding
	 * with class : encapsulation
	 * with method : abstraction
	 * 
==============================================================
 * data is protected with private access modifier
 * we need to decide upon accessibility of data
 * readable : getter
 * writable : setter
 */
public class Factorial {

	/*
	 * readable :  factorial , getter ( output variables : getter)
	 * writable : number , setter (input variables : setter)
	 
	 */
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}


	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	
	
}
