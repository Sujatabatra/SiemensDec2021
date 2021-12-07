package com.sujata.training;

import com.sujata.demo.MyFirstClass;


public class MainInDifferentPackage {

	public static void main(String[] args) {
		MyFirstClass myFirstClass = new MyFirstClass();
		myFirstClass.methodTwo();
//		default methods are not visible in different package
//		myFirstClass.methodThree();
//		private methods cannot be accessed from different class
//		myFirstClass.methodOne();


		/*
		 * As MySecondClass is in default scope 
		 * so its visiblity is not there in different package
		 * so we won't be able to create the object of default class in different package
		 */
//		MySecondClass mySecondClass = new MySecondClass();
//		mySecondClass.methodTwo();
//		mySecondClass.methodThree();
//		private methods cannot be accessed from different class
//		mySecondClass.methodOne();

	}

}
