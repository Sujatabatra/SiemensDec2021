package com.sujata.demo;

public class Circle extends InputValue implements Shape, RoundedShape {

	private static final double PI=3.142;
	private double circumference,area;
	
	public Circle(int radius) {
		setValue(radius);
	}
	
	@Override
	public void circumference() {
		circumference=2*PI*getValue();

	}

	@Override
	public void area() {
		area=PI*getValue()*getValue();
	}

	@Override
	public void display() {
		System.out.println("Area of Circle : "+area);
		System.out.println("Circumference of Circle "+circumference);

	}

}
