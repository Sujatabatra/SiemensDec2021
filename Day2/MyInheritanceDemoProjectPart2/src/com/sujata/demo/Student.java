package com.sujata.demo;
//Super class or base class
public class Student /*extends Object*/ {

	private int rollNo;
	private String name;

	public Student() {
		/*
		 * an implicit call to parent class default constructor will happen
		 */
		System.out.println("Hi I am Student class default constructor");
	}
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void input(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	public void display() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
	}
	
}
