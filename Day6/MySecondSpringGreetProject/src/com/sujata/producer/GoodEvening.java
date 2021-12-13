package com.sujata.producer;

public class GoodEvening implements Greet {

	private String name;

	@Override
	public void wish() {
		System.out.println("Good Evening " + name);

	}

	public void setName(String name) {
		this.name = name;
	}

}
