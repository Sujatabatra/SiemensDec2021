package com.sujata.demo;

public class EggsMain {

	public static void main(String[] args) {
		Eggs eggs=new Eggs();
		eggs.setTotal(569);
		
		System.out.println("Gross : "+eggs.getGross()+" dozen : "+eggs.getDozen()+" Remaining : "+eggs.getRemaining());
		

	}

}
