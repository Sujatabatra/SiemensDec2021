<%@page import="java.util.List"%>
<%@page import="com.sujata.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List All Employees</h1>
<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
	</tr>
	<% 
	//picking the data what comes back as object with ModelAndView
		List<Employee> employees=(List<Employee>)request.getAttribute("employees");
	//Traversing List
	for(Employee employee:employees){ %>
	<tr>
		<td><%=employee.geteId() %></td>
		<td><%=employee.geteName() %></td>
		<td><%=employee.getDesignation() %></td>
		<td><%=employee.getDepartment() %></td>
		<td><%=employee.getSalary() %></td>
	</tr>
	<%} %>
</table>
<br><br>
<a href="/">Go To Main Page</a>
</body>
</html>