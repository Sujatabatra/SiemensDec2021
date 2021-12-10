package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Employee;

/*
 * Dao : Data Access Object
 * Layer responsible for database interaction
 */
public interface EmployeeDao {

	List<Employee> getAllEmployees();
}
