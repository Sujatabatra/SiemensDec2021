package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeesResource(){
		return employeeService.getEmployeeList();
	}
	
	@GetMapping(path="/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("id") int employeeId) {
		return employeeService.searchEmployeeById(employeeId);
	}
	
	@PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmployeeResource(@RequestBody Employee employee) {
		boolean status=employeeService.insertEmployee(employee);
		if(status)
			return employee;
		else 
			return new Employee();
	}
}
