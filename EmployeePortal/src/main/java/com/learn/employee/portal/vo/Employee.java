package com.learn.employee.portal.vo;

import javax.persistence.Id;

public class Employee {

	String employeeFirstName;
	String employeeLastName;
	String bloodGroup;
	String dateOfBirth;
	@Id
	int empId;
	int age;
	EmployeeSalary empSalList;

	/**
	 * 
	 */
	public Employee() {

	}

	/**
	 * @param empId
	 * @param employeeFirstName
	 * @param employeeLastName
	 * @param bloodGroup
	 * @param dateOfBirth
	 * @param age
	 */
	public Employee(int empId, String employeeFirstName, String employeeLastName, String bloodGroup, String dateOfBirth,
			int age) {
		this.empId = empId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.bloodGroup = bloodGroup;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	/**
	 * @param employeeFirstName
	 * @param employeeLastName
	 * @param bloodGroup
	 * @param dateOfBirth
	 * @param age
	 */
	public Employee(String employeeFirstName, String employeeLastName, String bloodGroup, String dateOfBirth, int age,
			EmployeeSalary employeeSalList) {
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.bloodGroup = bloodGroup;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.empSalList = employeeSalList;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeFirstName(String employeeName) {
		this.employeeFirstName = employeeName;
	}

	/**
	 * @return the employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}

	/**
	 * @param employeeLastName the employeeLastName to set
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public EmployeeSalary getEmpSalList() {
		return empSalList;
	}

	public void setEmpSalList(EmployeeSalary empSalList) {
		this.empSalList = empSalList;
	}

}
