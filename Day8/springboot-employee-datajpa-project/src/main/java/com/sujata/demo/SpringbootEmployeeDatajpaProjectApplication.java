package com.sujata.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
/*
 * @EntityScan : specify the package where all beans are stored , which are
 * annotated with @Entity
 */
@EntityScan(basePackages = "com.sujata.bean")
/*
 * @EnableJpaRepositories : specify the package where all interfaces extending
 * JPARepository and Annotated with @Repository are stored
 */
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootEmployeeDatajpaProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootEmployeeDatajpaProjectApplication.class, args);
		
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}
	}

}
