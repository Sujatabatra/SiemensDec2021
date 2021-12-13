package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class GreetConsumer {
	
	public static void main(String args[]) {
//		Greet greet=new GoodMorning();
		
		/*
		 * life cycle ( creation of objects) is being done by spring container i.e ApplicationContext
		 * by considering configuration file , which is .xml file stored in classpath i.e erc folder
		 */
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("greet.xml");
		
		Greet greet1=(Greet)springContainer.getBean("eve");
		
		greet1.wish();
	}

}
