package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeRowMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	/*
	 * JdbcTemplte is responsible for establishing the connection, query, process
	 * result and closing the connection and also handling exception
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		String query="SELECT * FROM EMPLOYEE";
		List<Employee> employeeList=jdbcTemplate.query(query, new EmployeeRowMapper());
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		String query="SELECT * FROM EMPLOYEE where ID=?";
		Employee employee=null;
		try {
			employee=jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), id);
		}
		catch(Exception ex) {
			return employee;
		}
		return employee;
	}

	@Override
	public int saveEmployee(Employee employee) {
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
		/*
		 * for any dml(Data Manipulation Language i.e for insert,delete and update) operation call update method of JdbcTemplate class
		 */
		int rows=jdbcTemplate.update(query, employee.geteId(),employee.geteName(),employee.getDesignation(),employee.getDepartment(),employee.getSalary());
		return rows;
	}

	@Override
	public int deleteEmployee(int empId) {
		String query="DELETE FROM EMPLOYEE WHERE ID=?";
		int rows=jdbcTemplate.update(query,empId);
		return rows;
	}

	@Override
	public int updateEmployeeSalaryById(int empId, int salary) {
		String query="UPDATE EMPLOYEE SET SALARY=? WHERE ID=?";
		int rows=jdbcTemplate.update(query, salary,empId);
		return rows;
	}

}
