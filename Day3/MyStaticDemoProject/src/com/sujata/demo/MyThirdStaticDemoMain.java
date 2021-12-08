package com.sujata.demo;


class MyThirdStaticDemo {

	static {
		System.out.println("Hi I am static block");
	}

	{
		System.out.println("Hi I am instance block");
	}

	public MyThirdStaticDemo() {
		System.out.println("Hi I am MyThirdSaticDemo constructor!");
	}
}

public class MyThirdStaticDemoMain {

	public static void main(String[] args) {
		MyThirdStaticDemo ob1=new MyThirdStaticDemo();
		System.out.println("=================");
		MyThirdStaticDemo ob2=new MyThirdStaticDemo();

	}

}
