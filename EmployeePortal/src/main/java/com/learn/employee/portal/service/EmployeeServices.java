package com.learn.employee.portal.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learn.employee.portal.entity.EmployeeEntity;
import com.learn.employee.portal.entity.EmployeeSalaryEntity;

@Component
public interface EmployeeServices {
	public EmployeeSalaryEntity addSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException;

	public boolean updateSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException;

	public List<EmployeeSalaryEntity> getSalaryDetail() throws SQLException;

	public boolean deleteSalaryDetails(EmployeeSalaryEntity empsal) throws SQLException;

	public EmployeeSalaryEntity getOneEmployeeSalaryDetails(int empID) throws SQLException;

	public List<EmployeeEntity> getEmployeeDetails() throws SQLException;

	public EmployeeEntity addEmployDetails(EmployeeEntity emp) throws SQLException;

	public boolean deleteEmployeeDetails(int emp) throws SQLException;

	public boolean updateEmployeeDetails(EmployeeEntity emp) throws SQLException;

	public EmployeeEntity getOneEmployeeDetails(int empID) throws SQLException;

	public EmployeeEntity searchEmployeeById(int empId) throws SQLException;

	public List<EmployeeEntity> searchEmployeeByName(String employeeFirstName, String employeeLastName)
			throws SQLException;

}
