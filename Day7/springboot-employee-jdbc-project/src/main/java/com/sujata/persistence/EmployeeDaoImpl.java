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

import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeRowMapper;

@Component("empDao")
public class EmployeeDaoImpl implements EmployeeDao {
	/*
	 * JdbcTemplte is responsible for establishing the connection, query, process
	 * result and closing the connection and also handling exception
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployees() {
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ArrayList<Employee> employeeList = new ArrayList<Employee>();
//		try {
////			 1. Connect
////			 1.1 Register Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
////			1.2 Connect to DataBase
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
//
////			2. Query
//			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");
//			ResultSet resultSet = preparedStatement.executeQuery();
//
////			3. Process Result
//			while (resultSet.next()) {
//				int id = resultSet.getInt("ID");
//				String name = resultSet.getString("NAME");
//				String desig = resultSet.getString("DESIGNATION");
//				String depart = resultSet.getString("DEPARTMENT");
//				int sal = resultSet.getInt("SALARY");
//				// store each row in an object of Employee class
//				Employee employee = new Employee(id, name, desig, depart, sal);
//				// add Employee object into an ArrayList
//				employeeList.add(employee);
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			try {
////				 4. close the connection
//				connection.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//		}
		String query="SELECT * FROM EMPLOYEE";
		List<Employee> employeeList=jdbcTemplate.query(query, new EmployeeRowMapper());
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(int id) {
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		Employee employee = null;
//		try {
////			 1. Connect
////			 1.1 Register Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
////			1.2 Connect to DataBase
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
//
////			2. Query
//			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE where ID=?");
//			preparedStatement.setInt(1, id);
//
//			ResultSet resultSet = preparedStatement.executeQuery();
//
////			3. Process Result
//			if (resultSet.next()) {
//				int eid = resultSet.getInt("ID");
//				String name = resultSet.getString("NAME");
//				String desig = resultSet.getString("DESIGNATION");
//				String depart = resultSet.getString("DEPARTMENT");
//				int sal = resultSet.getInt("SALARY");
//				// store each row in an object of Employee class
//				employee = new Employee(id, name, desig, depart, sal);
//
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			try {
////				 4. close the connection
//				connection.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//		}
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
//		Connection connection = null;
//		Scanner scanner = new Scanner(System.in);
//		PreparedStatement preparedStatement = null;
//		try {
////			 1. Connect
////			 1.1 Register Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
////			1.2 Connect to DataBase
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
//
////			2. Query
//			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
//
//			preparedStatement.setInt(1, employee.geteId());
//			preparedStatement.setString(2, employee.geteName());
//			preparedStatement.setString(3, employee.getDesignation());
//			preparedStatement.setString(4, employee.getDepartment());
//			preparedStatement.setInt(5, employee.getSalary());
//
//			int rows = preparedStatement.executeUpdate();
//
////			3. Process Result
//			if (rows > 0)
//				return rows;
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			try {
////				 4. close the connection
//				connection.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//		}
		
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
		/*
		 * for any dml(Data Manipulation Language i.e for insert,delete and update) operation call update method of JdbcTemplate class
		 */
		int rows=jdbcTemplate.update(query, employee.geteId(),employee.geteName(),employee.getDesignation(),employee.getDepartment(),employee.getSalary());
		return rows;
	}

	@Override
	public int deleteEmployee(int empId) {
//		Connection connection = null;
//		Scanner scanner = new Scanner(System.in);
//		PreparedStatement preparedStatement = null;
//		try {
////			 1. Connect
////			 1.1 Register Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
////			1.2 Connect to DataBase
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
//
////			2. Query
//			preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
//
//			preparedStatement.setInt(1, empId);
//
//			int rows = preparedStatement.executeUpdate();
//
////			3. Process Result
//			if (rows > 0)
//				return rows;
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			try {
////				 4. close the connection
//				connection.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//		}
		String query="DELETE FROM EMPLOYEE WHERE ID=?";
		int rows=jdbcTemplate.update(query,empId);
		return rows;
	}

	@Override
	public int updateEmployeeSalaryById(int empId, int salary) {
//		Connection connection = null;
//		Scanner scanner = new Scanner(System.in);
//		PreparedStatement preparedStatement = null;
//		try {
////			 1. Connect
////			 1.1 Register Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
////			1.2 Connect to DataBase
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
//
////			2. Query
//			preparedStatement = connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=? WHERE ID=?");
//
//			preparedStatement.setInt(1, salary);
//			preparedStatement.setInt(2, empId);
//
//			int rows = preparedStatement.executeUpdate();
//
////			3. Process Result
//			if (rows > 0)
//				return rows;
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			try {
////				 4. close the connection
//				connection.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//		}

		String query="UPDATE EMPLOYEE SET SALARY=? WHERE ID=?";
		int rows=jdbcTemplate.update(query, salary,empId);
		return rows;
	}

}
