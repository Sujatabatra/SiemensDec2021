package com.sujata.demo;


class MyFirstStaticDemo{
	
	int x;
	int y;
	static int z;
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z);
	}
}

public class MyFirstStaticDemoMain {

	public static void main(String[] args) {
		System.out.println("z : "+MyFirstStaticDemo.z);
		MyFirstStaticDemo.z=10;
		System.out.println("z : "+MyFirstStaticDemo.z);
		System.out.println("===================");
		MyFirstStaticDemo ob1=new MyFirstStaticDemo();
		ob1.z=15;
		ob1.x=20;
		ob1.show();
		System.out.println("================");
		MyFirstStaticDemo ob2=new MyFirstStaticDemo();
		ob2.show();
		System.out.println("=================");
		

	}

}
