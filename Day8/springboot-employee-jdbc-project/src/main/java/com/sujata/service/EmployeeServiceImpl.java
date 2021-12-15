package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	/*
	 * if there is only one implementation class for the interface , we are
	 * specifying as private type variable, then @Qualifier is optional
	 */
	@Autowired
//	@Qualifier("employeeDaoImpl")
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployeeList() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee searchEmployeeById(int empId) {

		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		int rows = employeeDao.saveEmployee(employee);
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public boolean removeEmployee(int empId) {
		int rows = employeeDao.deleteEmployee(empId);
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateEmployee(int id, int salary) {
		int rows = employeeDao.updateEmployeeSalaryById(id, salary);
		if (rows > 0)
			return true;
		return false;
	}

}
