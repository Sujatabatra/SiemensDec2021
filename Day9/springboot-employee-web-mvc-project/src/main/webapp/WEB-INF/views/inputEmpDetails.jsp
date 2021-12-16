<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Employee Details</h1>
<form action="./saveEmp">
	Enter Employee ID : <input type="text" name="eId"><br><br>
	Enter Employee Name : <input type="text" name="eName"><br><br>
	Enter Employee Designation : <input type="text" name="eDesig"><br><br>
	Enter Employee Department : <input type="text" name="eDeptt"><br><br>
	Enter Employee Salary : <input type="text" name="eSal"><br><br>
	<input type="submit" value="Save Employee">
</form>
<br><br>
<a href="/">Go Back to Main Page</a>
</body>
</html>