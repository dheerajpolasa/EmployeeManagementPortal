package com.learn.employee.portal.dao;

import java.sql.SQLException;
import java.util.List;

import com.learn.employee.portal.entity.EmployeeEntity;

public interface EmployeeDao {

	public List<EmployeeEntity> getEmployeeDetails() throws SQLException;

	public EmployeeEntity addEmployDetails(EmployeeEntity emp) throws SQLException;

	public boolean deleteEmployeeDetails(int empID) throws SQLException;

	public boolean updateEmployeeDetails(EmployeeEntity emp) throws SQLException;

	public EmployeeEntity getOneEmployeeDetails(int empID) throws SQLException;

	public EmployeeEntity searchEmployeeById(int empId) throws SQLException;

	public List<EmployeeEntity> searchEmployeeByName(String employeeFirstName, String employeeLastName)
			throws SQLException;
}
