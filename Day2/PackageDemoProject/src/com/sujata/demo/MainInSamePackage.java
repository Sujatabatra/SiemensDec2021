package com.sujata.demo;

public class MainInSamePackage {

	public static void main(String[] args) {

		MyFirstClass myFirstClass = new MyFirstClass();
		myFirstClass.methodTwo();
		myFirstClass.methodThree();
//		private methods cannot be accessed from different class
//		myFirstClass.methodOne();

/*		even if MySecondClass is in default scope
 *  but as we are creating object in same package but different class 
 *  so its visible and we are able to create object*/
		MySecondClass mySecondClass = new MySecondClass();
		mySecondClass.methodTwo();
		mySecondClass.methodThree();
//		private methods cannot be accessed from different class
//		mySecondClass.methodOne();
	}

}
