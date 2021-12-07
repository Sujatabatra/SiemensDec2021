package com.sujata.demo;

//Sub class or derived class
public class Marks extends Student {
	private int marks1,marks2,marks3;

//	public Marks() {
//		/*
//		 * an implicit call to parent class default constructor will happen
//		 */
//		System.out.println("Hi I am default constructor of Marks class");
//	}
	public Marks(int marks1,int marks2,int marks3) {
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	//Over loading
	public void input(int rollNo,String name,int marks1,int marks2,int marks3) {
		input(rollNo, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	/*
	 * over riding : 
	 * 1. function name and signature is same
	 * 2. over riding can be done in base class and derived class
	 * 3. while over riding the method in derive class yoy can broader the scope of method
	 * private < default < protected < public
	 */
	public void display() {
		//call the base class version of over riden method
		super.display();
		System.out.println("Marks 1 : "+marks1);
		System.out.println("Marks 2 : "+marks2);
		System.out.println("Marks 3 : "+marks3);
	}

}
