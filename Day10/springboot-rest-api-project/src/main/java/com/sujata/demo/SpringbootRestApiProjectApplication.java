package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.resource")
public class SpringbootRestApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiProjectApplication.class, args);
	}

}
