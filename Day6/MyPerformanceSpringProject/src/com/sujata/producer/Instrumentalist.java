package com.sujata.producer;

public class Instrumentalist implements Performer {

	private String name;
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
