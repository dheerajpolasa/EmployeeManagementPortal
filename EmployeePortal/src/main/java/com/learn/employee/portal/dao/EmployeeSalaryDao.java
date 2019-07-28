package com.learn.employee.portal.dao;

import java.sql.SQLException;
import java.util.List;

import com.learn.employee.portal.entity.EmployeeSalaryEntity;

public interface EmployeeSalaryDao {
	public EmployeeSalaryEntity addSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException;

	public boolean updateSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException;

	public List<EmployeeSalaryEntity> getSalaryDetail() throws SQLException;

	public boolean deleteSalaryDetails(EmployeeSalaryEntity empsal) throws SQLException;

	public EmployeeSalaryEntity getOneEmployeeSalaryDetails(int empID) throws SQLException;
}
