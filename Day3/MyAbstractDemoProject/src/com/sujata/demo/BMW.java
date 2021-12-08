package com.sujata.demo;

public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}
	
	public void BmwEngine() {
		System.out.println("BMW Engine goes BOOOM");
	}
	
	public void engine() {
		BmwEngine();
	}

	
}
