package com.sujata.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Employee;

//mapping resultSet to employee object which JdbcTemplate will use for all DQL (Data Query Language i.e select)
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int eid = resultSet.getInt("ID");
		String name = resultSet.getString("NAME");
		String desig = resultSet.getString("DESIGNATION");
		String depart = resultSet.getString("DEPARTMENT");
		int sal = resultSet.getInt("SALARY");
		
		Employee employee = new Employee(eid, name, desig, depart, sal);
		
		return employee;
	}

}
