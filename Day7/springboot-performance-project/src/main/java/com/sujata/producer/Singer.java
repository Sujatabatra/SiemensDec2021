package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("priya")
public class Singer implements Performer {

	private String song;
	private String name;
	
	
	public Singer(@Value("Ankhiyo Ke Jharokhe Se") String song,@Value("Priya") String name) {
		super();
		this.song = song;
		this.name = name;
	}


	@Override
	public void perform() {
		System.out.println(name+" is singing "+song+"!!");
		
	}
	
	
}
