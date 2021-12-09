package com.sujata.misc;

import com.sujata.bean.Person;

public class MyDemoClass {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		if(i==j)
			System.out.println("Both i and j are equal");
		else
			System.out.println("i and j are not equal");

		Person p1=new Person(100, "ABC", 34);
		Person p2=new Person(100, "ABC", 34);
		if(p1==p2)
			System.out.println("Both p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		if(p1.equals(p2))
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
	}

}
