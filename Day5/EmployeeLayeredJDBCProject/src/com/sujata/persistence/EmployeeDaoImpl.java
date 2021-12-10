package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		 try {
//			 1. Connect
//			 1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
		
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3. Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("ID");
				String name=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String depart=resultSet.getString("DEPARTMENT");
				int sal=resultSet.getInt("SALARY");
				//store each row in an object of Employee class
				Employee employee=new Employee(id, name, desig, depart, sal);
				//add Employee object into an ArrayList
				employeeList.add(employee);
			}
			
		 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 finally {
			 try {
//				 4. close the connection
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 }

		return employeeList;
	}

}
