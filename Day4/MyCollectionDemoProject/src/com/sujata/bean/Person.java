package com.sujata.bean;

//POJO : Plain Old Java Object : private properties, public constructor and public getters and setters
public class Person {

	private int pId;
	private String pName;
	private int pAge;
	
	public Person() {
		
	}

	public Person(int pId, String pName, int pAge) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	/*
	 * print object with System.out.println()
	 */
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + "]";
	}
	
	
}
