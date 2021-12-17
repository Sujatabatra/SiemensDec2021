package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
/*
 * if the class name and table name are same then
 * @Table is optional
 */
//@Table(name="Employee")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employee {
	@Id
	@Column(name = "id")
	private int eId;
	@Column(name="name")
	private String eName;
	/*
	 * if table name and property name in class is same then
	 * @Column annotation is optional
	 */
//	@Column(name="designation")
	private String designation;
//	@Column(name="department")
	private String department;
//	@Column(name="salary")
	private int salary;
	
	public Employee() {
		
	}

	public Employee(int eId, String eName, String designation, String department, int salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	

}
