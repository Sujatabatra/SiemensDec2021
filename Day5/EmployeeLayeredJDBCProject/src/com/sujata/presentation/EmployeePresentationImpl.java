package com.sujata.presentation;

import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. List All Employees ");
		System.out.println("2. Search Employee By ID ");
		System.out.println("3. Insert Employee ");
		System.out.println("4. Delete Employee By ID ");
		System.out.println("5. Update Employee Salary ");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice) {
		switch (choice) {
		case 1:
			List<Employee> empList=employeeService.getEmployeeList();
			for(Employee e:empList) {
				System.out.println(e);
			}
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
