package com.sujata.demo;

public class Eggs {

	private int total,gross,dozen,remaining;

	public void setTotal(int total) {
		this.total = total;
		calculateEggs();
	}

	public int getGross() {
		return gross;
	}

	public int getDozen() {
		return dozen;
	}

	public int getRemaining() {
		return remaining;
	}
	
	private void calculateEggs() {
		gross=total/144;
		
		total=total%144;
		
		dozen=total/12;
		
		remaining=total%12;
	}
	
}
