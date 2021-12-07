package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Sports;
import com.sujata.demo.Student;

public class MyMainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(101, "AAAA");
		student.display();
		System.out.println("=============");
		
		Marks marks=new Marks();
		marks.input(111, "Some Name", 89, 67, 78);
		marks.display();
		
		System.out.println("============");
		
		Grade grade=new Grade();
		grade.input(999, "Amit", 89, 45, 98);
		grade.calculateGrade();
		grade.display();
		
		System.out.println("=================");
		
		Sports sports=new Sports();
		sports.input(222, "Bharat", "Football");
		sports.display();

	}

}
