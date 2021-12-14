package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Performer;

@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class SpringbootPerformanceProjectApplication implements CommandLineRunner {

	
	@Autowired
	@Qualifier("priya")
	Performer performer1;
	@Autowired
	@Qualifier("kshitij")
	Performer performer2;
	public static void main(String[] args) {
		/*ApplicationContext springContainer=*/SpringApplication.run(SpringbootPerformanceProjectApplication.class, args);
		
//		Performer performer1=(Performer)springContainer.getBean("shyamala");
//		performer1.perform();
//		
//		Performer performer2=(Performer)springContainer.getBean("suresh");
//		performer2.perform();
	}

	@Override
	public void run(String... args) throws Exception {
		
		performer1.perform();
		performer2.perform();
	}

}
