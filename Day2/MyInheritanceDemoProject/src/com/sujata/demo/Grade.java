package com.sujata.demo;

public class Grade extends Marks {
	private double percentage;
	private String grade;
	
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
