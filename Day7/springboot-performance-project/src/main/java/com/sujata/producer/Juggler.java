package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("shyamala")
public class Juggler implements Performer {

	@Value("Shyamala")
	private String name;
	@Value("4")
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
