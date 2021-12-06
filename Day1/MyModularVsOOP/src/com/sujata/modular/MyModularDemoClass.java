package com.sujata.modular;
/*
 * as we are trying to memic modular approach behavior in object oriented language ,
 * so we are using static, but you all need to ignore static keyword for a time being
 */
public class MyModularDemoClass {

	static int number, factorial;
	
	static void inputNumber(int no) {
		number=no;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	static void display() {
		// syso after that press ctrl+space key together for auto complete
		System.out.println("Factorail : "+factorial);
	}
	
	public static void main(String[] args) {
		inputNumber(4);
		calculateFactorial();
		factorial=number*factorial; //logical error
		display();

	}

}
