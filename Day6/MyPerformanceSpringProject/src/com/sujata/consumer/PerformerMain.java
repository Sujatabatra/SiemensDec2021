package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerMain {
	
	public static void main(String args[]) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		Performer performer1=(Performer)springContainer.getBean("priya");
		performer1.perform();
		
		Performer performer2=(Performer)springContainer.getBean("shyamala");
		performer2.perform();
		
		Performer performer3=(Performer)springContainer.getBean("kshitij");
		performer3.perform();
		
		
		Performer performer4=(Performer)springContainer.getBean("suresh");
		performer4.perform();
		
	}

}
