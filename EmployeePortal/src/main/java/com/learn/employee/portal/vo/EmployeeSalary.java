package com.learn.employee.portal.vo;

public class EmployeeSalary {

	int House_Rent_Allowance;
	int travel_Allowance;
	int medical_Allowance;
	int basic_Salary;
	int employee_Id;

	/**
	 * @return
	 */
	public int getEmployee_Id() {
		return employee_Id;
	}

	/**
	 * @param employee_Id
	 */
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	/**
	 * 
	 */
	public EmployeeSalary() {

	}

	/**
	 * @param employee_Id
	 * @param House_Rent_Allowance
	 * @param travel_Allowance
	 * @param medical_Allowance
	 * @param basic_Salary
	 */
	public EmployeeSalary(int employee_Id, int House_Rent_Allowance, int travel_Allowance, int medical_Allowance,
			int basic_Salary) {
		this.employee_Id = employee_Id;
		this.House_Rent_Allowance = House_Rent_Allowance;
		this.travel_Allowance = travel_Allowance;
		this.medical_Allowance = medical_Allowance;
		this.basic_Salary = basic_Salary;
	}

	/**
	 * @param House_Rent_Allowance
	 * @param travel_Allowance
	 * @param medical_Allowance
	 * @param basic_Salary
	 */
	public EmployeeSalary(int House_Rent_Allowance, int travel_Allowance, int medical_Allowance, int basic_Salary) {
		this.House_Rent_Allowance = House_Rent_Allowance;
		this.travel_Allowance = travel_Allowance;
		this.medical_Allowance = medical_Allowance;
		this.basic_Salary = basic_Salary;
	}

	/**
	 * @return the house_Rent_Allowance
	 */
	public int getHouse_Rent_Allowance() {
		return House_Rent_Allowance;
	}

	/**
	 * @param house_Rent_Allowance the house_Rent_Allowance to set
	 */
	public void setHouse_Rent_Allowance(int house_Rent_Allowance) {
		House_Rent_Allowance = house_Rent_Allowance;
	}

	/**
	 * @return the travel_Allowance
	 */
	public int getTravel_Allowance() {
		return travel_Allowance;
	}

	/**
	 * @param travel_Allowance the travel_Allowance to set
	 */
	public void setTravel_Allowance(int travel_Allowance) {
		this.travel_Allowance = travel_Allowance;
	}

	/**
	 * @return the medical_Allowance
	 */
	public int getMedical_Allowance() {
		return medical_Allowance;
	}

	/**
	 * @param medical_Allowance the medical_Allowance to set
	 */
	public void setMedical_Allowance(int medical_Allowance) {
		this.medical_Allowance = medical_Allowance;
	}

	/**
	 * @return the basic_Salary
	 */
	public int getBasic_Salary() {
		return basic_Salary;
	}

	/**
	 * @param basic_Salary the basic_Salary to set
	 */
	public void setBasic_Salary(int basic_Salary) {
		this.basic_Salary = basic_Salary;
	}

}
