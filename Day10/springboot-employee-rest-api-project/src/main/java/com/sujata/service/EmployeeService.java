package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	//Get
	List<Employee> getEmployeeList();
	//Get
	Employee searchEmployeeById(int empId);
	//Post
	boolean insertEmployee(Employee employee);
	//Delete
	boolean removeEmployee(int empId);
	//Put
	boolean updateEmployee(int id,int salary);
}
