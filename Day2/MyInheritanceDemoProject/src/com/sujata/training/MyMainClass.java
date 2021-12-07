package com.sujata.training;

import com.sujata.demo.Marks;
import com.sujata.demo.Student;

public class MyMainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(101, "AAAA");
		student.display();
		
		Marks marks=new Marks();
		marks.input(111, "Some Name", 89, 67, 78);
		marks.display();

	}

}
