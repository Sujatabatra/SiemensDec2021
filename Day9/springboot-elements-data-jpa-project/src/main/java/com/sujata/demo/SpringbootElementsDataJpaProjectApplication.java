package com.sujata.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.ElementPresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class SpringbootElementsDataJpaProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = SpringApplication.run(SpringbootElementsDataJpaProjectApplication.class,
				args);

		ElementPresentation employeePresentation = (ElementPresentation) springContainer.getBean("elementPresentationImpl");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			employeePresentation.performMenu(choice);
		}
	}

}
