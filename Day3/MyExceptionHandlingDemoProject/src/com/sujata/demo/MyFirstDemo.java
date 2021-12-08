package com.sujata.demo;

import java.util.Scanner;


public class MyFirstDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number1,number2;
		int total;
		int location=0;
		try {
		System.out.println("Enter first No : ");
		number1=scanner.nextInt();
		System.out.println("Enter second No : ");
		number2=scanner.nextInt();
		
		int divisionResult=number1/number2;
		System.out.println("Division : "+divisionResult);
		
		int arr[];
		System.out.println("Enter total no of elements in an array : ");
		total=scanner.nextInt();
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter element at index "+index+" : ");
			arr[index]=scanner.nextInt();
		}
		
		System.out.println("Enter location in an array whose value you want to see : ");
		location=scanner.nextInt();
		
		System.out.println("Element at "+location+" location in an array is "+arr[location]);
		
		
		System.out.println("Good Bye from try block");
		}
		catch(ArithmeticException exception) {
			System.out.println("Infinity");
		}
		catch(NegativeArraySizeException exception) {
			System.out.println("Array Size can never be negative");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Location "+location+" don't exist in an array");
		}
//		generic catch
//		catch(Exception exception) {
//			System.out.println("Something went wrong");
//		}
		/*
		 * irrespective of exception comes or don't handeled by handler or not finally block will get executed
		 */
		finally {
			System.out.println("Hi I am finally Block!");
		}
		System.out.println("Good Bye from Main!");

	}

}
