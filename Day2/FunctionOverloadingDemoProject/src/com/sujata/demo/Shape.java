package com.sujata.demo;

public class Shape {

	/*
	 * Polymorphism
	 * Function Overloading : functions have same name but different signature
	 * function signature means
	 * no and types of arguments and their sequence
	 * 
	 */
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
	
	public void area(double radius) {
		double area=3.142*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
}
