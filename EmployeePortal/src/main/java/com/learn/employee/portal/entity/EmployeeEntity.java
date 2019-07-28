package com.learn.employee.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeTable")
public class EmployeeEntity {
	@Id
	@Column(name = "emp_id")
	int empId;
	@Column(name = "first_name")
	String employeeFirstName;
	@Column(name = "last_name")
	String employeeLastName;
	@Column(name = "blood_group")
	String bloodGroup;
	@Column(name = "dob")
	String dateOfBirth;
	@Column(name = "age")
	int age;
	@OneToOne
	@JoinColumn(name = "emp_id")
	EmployeeSalaryEntity empSalList;

	/**
	 * @return
	 */
	public EmployeeSalaryEntity getEmpSalList() {
		return empSalList;
	}

	/**
	 * @param empSalList
	 */
	public void setEmpSalList(EmployeeSalaryEntity empSalList) {
		this.empSalList = empSalList;
	}

	/**
	 * @return
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	/**
	 * @param employeeFirstName
	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	/**
	 * @return
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}

	/**
	 * @param employeeLastName
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	/**
	 * @return
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
