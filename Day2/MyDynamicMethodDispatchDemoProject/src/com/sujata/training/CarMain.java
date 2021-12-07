package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Car;
import com.sujata.demo.Toyota;

public class CarMain {

	public static void main(String[] args) {
//		Reference Variable of Base class
		Car car;
		/*
		 *Polymorphism : Over riding (Run Time Polymorphism)
		 *Dynamic Method Dispatch
		 *Object creation happend at run time and atb run time decision happens 
		 *that which version of engine will get called
		 *run time means dynamic 
		 */
		car=new BMW("Q5","Blue");
		car.engine();
		
		car=new Audi("A8", "Red");
		car.engine();
		
		car=new Toyota("Altis","Golden");
		car.engine();

	}

}
