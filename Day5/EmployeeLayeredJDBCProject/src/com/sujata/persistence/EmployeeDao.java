package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Employee;

/*
 * Dao : Data Access Object
 * Layer responsible for database interaction
 */
public interface EmployeeDao {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	int saveEmployee(Employee employee);
	int deleteEmployee(int empId);
	int updateEmployeeSalaryById(int empId,int salary);
}
