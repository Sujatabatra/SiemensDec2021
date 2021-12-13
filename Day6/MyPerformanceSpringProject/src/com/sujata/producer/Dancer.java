package com.sujata.producer;

public class Dancer implements Performer {

	private String name;
	private String style;
	
	
	public Dancer(String name, String style) {
		super();
		this.name = name;
		this.style = style;
	}


	@Override
	public void perform() {
		System.out.println(name+" is performing in "+style+" style!");

	}

}
