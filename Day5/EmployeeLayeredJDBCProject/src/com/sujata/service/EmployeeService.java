package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	List<Employee> getEmployeeList();
	
	Employee searchEmployeeById(int empId);
	
	boolean insertEmployee(Employee employee);
	
	boolean removeEmployee(int empId);
	
	boolean updateEmployee(int id,int salary);
}
