package com.sujata.training;

public class MainPalindrome {

	public static void main(String[] args) {
		Palindrome palidrome=new Palindrome();
		
		palidrome.setNumber(12341);
		System.out.println("Is Number Palindrome : "+palidrome.isStatus());

	}

}
