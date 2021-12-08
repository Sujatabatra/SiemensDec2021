package com.sujata.demo;

import java.util.Scanner;

public class MyThrowsDemo {

	/*
	 * if we are making use of throws then parent needs to handle that exception
	 */
	public static void goToSleep(int time)throws InterruptedException {
//		try {
			Thread.sleep(time);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		try {
		System.out.println("Enter time for sleep : ");
		int time=scanner.nextInt();
		System.out.println("Take rest for "+time+" milli seconds ");
		goToSleep(time);
		System.out.println("Time to wake up!");
		}
		catch(InterruptedException ex) {
			System.out.println("Some thing went wrong ");
		}
	}

}
