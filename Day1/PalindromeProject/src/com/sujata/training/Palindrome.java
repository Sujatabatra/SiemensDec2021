package com.sujata.training;

import com.sujata.demo.Reverse;

public class Palindrome {

	private int number;
	private boolean status;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isStatus() {
		checkPalindrome();
		return status;
	}
	
	private void checkPalindrome() {
//		com.sujata.demo.Reverse reverse=new com.sujata.demo.Reverse();
		Reverse reverse=new Reverse();
		reverse.setNumber(number);
		if(number==reverse.getReverse())
			status=true;
		else
			status=false;
		
	}
}
