package org.animals.demo;

import org.animals.*;

public class AnimalMain {

	public static void main(String[] args) {
		
		Deer deer1=new Deer();
		deer1.sound();
		
		Deer deer2=new Deer("Black",2,50);
		deer2.sound();
		
		Deer deer3=new Deer("Black",2);
		deer3.sound();
		

	}

}
