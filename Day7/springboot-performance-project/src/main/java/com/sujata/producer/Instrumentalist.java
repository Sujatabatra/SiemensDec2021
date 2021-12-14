package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("suresh")
public class Instrumentalist implements Performer {

	@Value("Suresh")
	private String name;
	
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		System.out.print(name+" is playing ");
		instrument.play();

	}

}
