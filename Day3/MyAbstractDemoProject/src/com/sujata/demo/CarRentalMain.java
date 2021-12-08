package com.sujata.demo;

public class CarRentalMain {

	public static void main(String[] args) {
		Audi audi=new Audi("A6", "White");
		BMW bmw=new BMW("Q3", "Black");
		Toyota toyota=new Toyota("Altis", "Red");
		
		Driver monu=new Driver("Monu");
		Driver sonu=new Driver("Sonu");
		
		monu.setCar(bmw);
		monu.drive();
		
//		monu.setCar(toyota);
//		monu.drive();

	}

}
