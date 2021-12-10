package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getEmployeeList() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee searchEmployeeById(int empId) {
		
		return employeeDao.getEmployeeById(empId);
	}

}
