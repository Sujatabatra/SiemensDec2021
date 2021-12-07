package com.sujata.demo;

public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}
	//over riding
	public void engine() {
		System.out.println("BMW Engine goes BOOOM");
	}

	
}
