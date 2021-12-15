package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.controller")
public class SpringbootFirstWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstWebProjectApplication.class, args);
	}

}
