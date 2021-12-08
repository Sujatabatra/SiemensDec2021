package com.sujata.demo;

public class MyCheckedException {

	public static void main(String[] args) {
		System.out.println("Hello everyone , I am going to sleep for 2 seconds");
		try {
			
			Thread.sleep(2000);
		} 
		catch (InterruptedException e)/*checked exception*/ {
			e.printStackTrace();
		}
		System.out.println("Hello guys i woke up after 2 seconds");

	}

}
