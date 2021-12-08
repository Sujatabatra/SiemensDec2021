package com.sujata.demo;

import java.util.Scanner;

class AgeInput{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeException {
		if(age<18)
			throw new AgeException("Age can't be less than 18");
		this.age = age;
	}
	
}
public class AgeExceptionMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		AgeInput ageInput=new AgeInput();
		
		System.out.println("Enter age : ");
		int age=scanner.nextInt();

		ageInput.setAge(age);
		System.out.println("User is of the age "+ageInput.getAge()+" so eligible for voting");
		}
		catch(AgeException exception) {
			System.out.println("User is not eligible for voting");
		}
	}

}
