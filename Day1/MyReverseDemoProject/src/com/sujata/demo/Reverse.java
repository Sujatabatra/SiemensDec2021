package com.sujata.demo;

public class Reverse {

	private int number, reverse;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		calculateReverse();
		return reverse;
	}
	
	private void calculateReverse() {
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
	}
	
}
