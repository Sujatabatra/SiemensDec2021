package com.sujata.demo;

public class Audi extends Car {

	public Audi(String model, String color) {
		super(model, color);
	}
	//over riding
	public void engine() {
		System.out.println("Audi Engine goes AOOOM");
	}

	
}
