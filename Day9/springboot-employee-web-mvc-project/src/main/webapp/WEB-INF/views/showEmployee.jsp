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
<h1>Employee details</h1>
<% 
	//picking the data what comes back as object with ModelAndView
		Employee employee=(Employee)request.getAttribute("employee");
if(employee!=null){	
%>

<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
	</tr>
	
	<tr>
		<td><%=employee.geteId() %></td>
		<td><%=employee.geteName() %></td>
		<td><%=employee.getDesignation() %></td>
		<td><%=employee.getDepartment() %></td>
		<td><%=employee.getSalary() %></td>
	</tr>
	
</table>
<%}
else{
%>
<h1>Employee does not exist</h1>
<%} %>
<br><br>
<a href="/">Go To Main Page</a>
</body>
</html>