package com.sujata.producer;

public class Juggler implements Performer {

	private String name;
	private int balls;

	public void setName(String name) {
		this.name = name;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println(name+" is juggling "+balls+" balls");

	}

}
