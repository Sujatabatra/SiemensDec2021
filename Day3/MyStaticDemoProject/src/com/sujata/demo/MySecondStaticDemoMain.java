package com.sujata.demo;


class MySecondStaticDemo{
	
	private int x;
	private int y;
	private static int z;
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z);
	}

	static public void display() {
//		System.out.println("x : "+x);
//		System.out.println("y : "+y);
		System.out.println("z : "+z);
	}
	public static int getZ() {
		return z;
	}

	public static void setZ(int z) {
		MySecondStaticDemo.z = z;
	}
	
}

public class MySecondStaticDemoMain {

	public static void main(String[] args) {
		MySecondStaticDemo.setZ(10);
		System.out.println(MySecondStaticDemo.getZ());
	}

}
