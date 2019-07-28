package com.learn.employee.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class EmployeeSalaryEntity {
	@Id
	@Column(name = "")
	int empId;
	@Column(name = ")
	int houseRentAllowance;
	@Column(name = "")
	int travelAllowance;
	@Column(name = "")
	int medicalAllowance;
	@Column(name = "")
	int basicSalary;

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
	public int getHouseRentAllowance() {
		return houseRentAllowance;
	}

	/**
	 * @param houseRentAllowance
	 */
	public void setHouseRentAllowance(int houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	/**
	 * @return
	 */
	public int getTravelAllowance() {
		return travelAllowance;
	}

	/**
	 * @param travelAllowance
	 */
	public void setTravelAllowance(int travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	/**
	 * @return
	 */
	public int getMedicalAllowance() {
		return medicalAllowance;
	}

	/**
	 * @param medicalAllowance
	 */
	public void setMedicalAllowance(int medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	/**
	 * @return
	 */
	public int getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary
	 */
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
}
