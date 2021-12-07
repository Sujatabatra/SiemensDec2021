package com.sujata.demo;

public class Grade extends Marks {
	private double percentage;
	private String grade;
	
	public Grade() {
		/*
		 * an implicit call to parent class default constructor(Zero argument) will happen,
		 * but if default constructor is not their in Parent Class , 
		 * then we need to give explicit call to argumented constructor of parents class with super(arguments)
		 */
		super(0,0,0);
		System.out.println("Hi I am default constructor in Grade class");
	}
	public void calculateGrade() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		if(percentage>75)
			grade="A Grade";
		else
			grade="B Grade";
	}
	
	public void display() {
		super.display();
		System.out.println("Grade : "+grade);
	}

}
