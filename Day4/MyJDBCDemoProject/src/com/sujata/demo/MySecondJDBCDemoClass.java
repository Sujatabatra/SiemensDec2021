package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 1. Connect to Database
 *      1.1 Register Driver
 *      1.2 Connect to Database
 * 2. Create Query
 * 3. Process result
 * 4. Close the connection
 */
public class MySecondJDBCDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
		Scanner scanner=new Scanner(System.in);
		PreparedStatement preparedStatement=null;
		 try {
//			 1. Connect
//			 1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/siemensdemo", "root", "sujata");
		
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig=scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			System.out.println("Enter Employee Salary : ");
			int sal=scanner.nextInt();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, desig);
			preparedStatement.setString(4, deptt);
			preparedStatement.setInt(5, sal);
			
			int rows= preparedStatement.executeUpdate();
			
//			3. Process Result
			if(rows>0)
				System.out.println("Record Added");
			else
				System.out.println("Record Not Added");
			
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
