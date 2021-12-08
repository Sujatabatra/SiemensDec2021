package com.sujata.demo;

public class ShapeMain {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5, 8);
		rectangle.area();
		rectangle.perimeter();
		rectangle.display();
		
		Circle circle=new Circle(6);
		circle.area();
		circle.circumference();
		circle.display();

	}

}
