package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Sports;
import com.sujata.demo.Student;

public class MyMainClass {

	public static void main(String[] args) {
		
		Grade grade=new Grade();
		grade.input(999, "Amit", 89, 45, 98);
		grade.calculateGrade();
		grade.display();
		
		

	}

}
