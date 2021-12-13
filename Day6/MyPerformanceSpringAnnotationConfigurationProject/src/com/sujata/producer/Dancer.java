package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kshitij")
public class Dancer implements Performer {

	private String name;
	private String style;
	
	
	public Dancer(@Value("Kshitij") String name,@Value("Free Style") String style) {
		super();
		this.name = name;
		this.style = style;
	}


	@Override
	public void perform() {
		System.out.println(name+" is performing in "+style+" style!");

	}

}
