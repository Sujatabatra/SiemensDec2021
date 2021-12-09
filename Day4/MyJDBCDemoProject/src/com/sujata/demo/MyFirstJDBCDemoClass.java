package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 1. Connect to Database
 *      1.1 Register Driver
 *      1.2 Connect to Database
 * 2. Create Query
 * 3. Process result
 * 4. Close the connection
 */
public class MyFirstJDBCDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
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
				System.out.println(id+"  "+name+"  "+desig+"  "+depart+"  "+sal);
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

	}

}
