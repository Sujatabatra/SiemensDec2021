package org.animals;
/*
 * Why Constructor : if we want to initialize out objects while declaring them
 * Syntax Rules for Creating Constructors
 * 1. Constructor name should be same as of your class name
 * 2. Constructor can be argumented and non argumented
 * 3. Constructor cannot return any value not even void
 * 4. Constructor can be in any scope (private,default or public)
 * =============================
 * When any of the class don't have any constructor 
 * the compiler creates default(Zero Argument) constructor for that class
 * Complier created constructor initiliaze all variables 
 * with default initial values ( byte,short,int,long=0, float, double=0.0, boolean=false,char=\u0000,objects=null)
 */
public class Deer {
	private String color;
	private int age;
	private int weight;
	
	/*
	 * All three constructors have same name : Constructor Overloading
	 * Constructor Overloading means constructor have same name but their signature are different
	 * Signature means no and type of arguments and their sequence
	 * Polymorphism : Constructor Overloading
	 */
//	Zero Argument Constructor : Default Constructor
	public Deer() {
		color="Dark Golden with black Spots";
		age=4;
		weight=150;
	}
//	Three Arguements Constructor
	public Deer(String co,int a,int w) {
		color=co;
		age=a;
		weight=w;
	}
//	Two Arguement Constructor
	public Deer(String co,int a) {
		color=co;
		age=a;
		weight=90;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isVegetarian() {
		return true;
	}
	public boolean canClimb() {
		return false;
	}
	public void sound() {
		System.out.println(" Deer is of "+color+" of age  "+age+" years weighted "+weight+" kgs and make sound snort!");
	}

}
