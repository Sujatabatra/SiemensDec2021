package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/listAllEmps")
	public ModelAndView listAllEmployeesController() {
		ModelAndView mv=new ModelAndView();
		List<Employee> employeeList=employeeService.getEmployeeList();
		mv.addObject("employees", employeeList);
		mv.setViewName("showAllEmployees");
		return mv;
	}
	
	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmployeePageController() {
		return new ModelAndView("inputForEmpSearch");
	}
	
	/*
	 * Whenever you want to read form data in current controller,
	 * create an argument of type HttpServletRequest
	 */
	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		String eId=request.getParameter("empId");
		
		Employee emp=employeeService.searchEmployeeById(Integer.parseInt(eId));
		
		modelAndView.addObject("employee", emp);
		modelAndView.setViewName("showEmployee");
		
		return modelAndView;
	}
	
	@RequestMapping("/insertEmployeePage")
	public ModelAndView insertEmployeePageController() {
		return new ModelAndView("inputEmpDetails");
	}
	
	@RequestMapping("/saveEmp")
	public ModelAndView insertEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		int id=Integer.parseInt(request.getParameter("eId"));
		String name=request.getParameter("eName");
		String des=request.getParameter("eDesig");
		String dep=request.getParameter("eDeptt");
		int sal=Integer.parseInt(request.getParameter("eSal"));
		
		Employee employee=new Employee(id, name, des, dep, sal);
		String message=null;
		if(employeeService.insertEmployee(employee))
			message="Employee Added Successfully";
		else
			message="Employee Insertion Failed";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("output");
		
		return modelAndView;
	}
}
