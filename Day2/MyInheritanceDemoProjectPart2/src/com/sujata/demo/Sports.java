package com.sujata.demo;

public class Sports extends Student {

	private String sportsName;

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	//Over loading
	public void input(int rollNo,String name,String sportsName) {
		input(rollNo, name);
		this.sportsName=sportsName;
	}
	
	//over riding
	public void display() {
		super.display();
		System.out.println("Sports Name : "+sportsName);
	}
}
