package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Component("empPresentation")
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
//	@Qualifier("employeeServiceImpl")
	private EmployeeService employeeService;

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
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			List<Employee> empList = employeeService.getEmployeeList();
			for (Employee e : empList) {
				System.out.println(e);
			}
			break;
		case 2:
			System.out.println("Enter Employee Id to be searched for : ");
			int id = scanner.nextInt();
			Employee employee = employeeService.searchEmployeeById(id);
			if (employee == null)
				System.out.println("Employee with id " + id + " doesnot exist");
			else
				System.out.println(employee);
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int eid = scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name = scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig = scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt = scanner.next();
			System.out.println("Enter Employee Salary : ");
			int sal = scanner.nextInt();
			Employee emp = new Employee(eid, name, desig, deptt, sal);
			if (employeeService.insertEmployee(emp))
				System.out.println("Employee Added");
			else
				System.out.println("Employee addition failed");
			break;
		case 4:
			System.out.println("Enter employee ID to be deleted : ");
			int empId = scanner.nextInt();
			if (employeeService.removeEmployee(empId))
				System.out.println("Employee Deleted");
			else
				System.out.println("Employee Deletion failed");
			break;
		case 5:
			System.out.println("Enter Employee ID whoes salary you want to update : ");
			int eId = scanner.nextInt();
			System.out.println("Enter new Salary : ");
			int salary = scanner.nextInt();
			if (employeeService.updateEmployee(eId, salary))
				System.out.println("Employee Updated");
			else
				System.out.println("Employee Updation failed");
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
