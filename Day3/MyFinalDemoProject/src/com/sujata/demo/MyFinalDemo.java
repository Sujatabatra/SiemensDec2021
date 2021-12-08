package com.sujata.demo;

final class Base{
	private int x;
	final private int y=15;
	
	public void changeValues() {
		x=10;
//		y=20;
		
	}
	public void show() {
		System.out.println("Hi I am show method from Base class");
	}
	
	final public void display() {
		System.out.println(" Hi I am display method from Base class");
	}
}

class Derived extends Base{
	//Override
	public void show() {
		System.out.println("HI I am show method from Derived class");
	}
	//We can't over ride display() as display is marked final
//	public void display() {
//		
//	}
}


public class MyFinalDemo {
	public static void main(String args[]) {
		
	}
}
