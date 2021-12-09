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
public class MyThirdJDBCDemoClass {

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
			preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
			
			System.out.println("Enter Employee ID whoes record you want to delete : ");
			int id=scanner.nextInt();
			
			preparedStatement.setInt(1, id);
			
			
			int rows= preparedStatement.executeUpdate();
			
//			3. Process Result
			if(rows>0)
				System.out.println("Record Deleted");
			else
				System.out.println("Record Not Deleted");
			
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
