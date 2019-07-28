package com.learn.employee.portal.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.employee.portal.daoImpl.EmployeeDaoImpl;
import com.learn.employee.portal.daoImpl.EmployeeSalaryDaoImpl;
import com.learn.employee.portal.entity.EmployeeEntity;
import com.learn.employee.portal.entity.EmployeeSalaryEntity;
import com.learn.employee.portal.service.EmployeeServices;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
	Logger logger=Logger.getLogger(EmployeeServicesImpl.class);
	@Autowired
	EmployeeDaoImpl employeeDao;
	@Autowired
	EmployeeSalaryDaoImpl employeeSalaryDao;

	/**
	 * Add salary details to database
	 */
	@Override
	public EmployeeSalaryEntity addSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException {
		logger.info("In to the add Salary Details");
		return employeeSalaryDao.addSalaryDetail(empsal);
	}

	/**
	 * update salary details
	 */
	@Override
	public boolean updateSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException {
		logger.info("In to the update Salary Details");
		
		return employeeSalaryDao.updateSalaryDetail(empsal);
	}

	/**
	 * get employee salary details
	 */
	@Override
	public List<EmployeeSalaryEntity> getSalaryDetail() throws SQLException {
		logger.info("In to the get Salary Details");
		
		return employeeSalaryDao.getSalaryDetail();
	}

	/**
	 * delete employee details
	 */
	@Override
	public boolean deleteSalaryDetails(EmployeeSalaryEntity empsal) throws SQLException {
		logger.info("In to the delete Salary Details");
		
		return employeeSalaryDao.deleteSalaryDetails(empsal);
	}

	/**
	 * get specific employee details by id
	 */
	@Override
	public EmployeeSalaryEntity getOneEmployeeSalaryDetails(int empID) throws SQLException {
		logger.info("In to the getOne Employee Salary Details");
		
		return employeeSalaryDao.getOneEmployeeSalaryDetails(empID);
	}

	/**
	 * return List of Employees
	 */
	@Override
	public List<EmployeeEntity> getEmployeeDetails() throws SQLException {
		logger.info("In to the getEmployee  Details");
		return employeeDao.getEmployeeDetails();
	}

	/**
	 * Add Employee Details
	 */
	@Override
	public EmployeeEntity addEmployDetails(EmployeeEntity emp) throws SQLException {
		logger.info("In to the add Employee Details");
		
		return employeeDao.addEmployDetails(emp);
	}

	/**
	 * Search employee by id
	 */
	@Override
	public boolean deleteEmployeeDetails(int emp) throws SQLException {
		logger.info("In to the delete Employee Details");
		
		return employeeDao.deleteEmployeeDetails(emp);
	}

	/**
	 * Delete employee details by id
	 */
	@Override
	public boolean updateEmployeeDetails(EmployeeEntity emp) throws SQLException {
		logger.info("In to the Update Employee Details");
		
		return employeeDao.updateEmployeeDetails(emp);
	}

	/**
	 * Get specific employee details by id
	 */
	@Override
	public EmployeeEntity getOneEmployeeDetails(int empID) throws SQLException {
		logger.info("In to the one employee Details");
		
		return employeeDao.getOneEmployeeDetails(empID);
	}

	/**
	 * update employee details
	 */
	@Override
	public EmployeeEntity searchEmployeeById(int empId) throws SQLException {
		logger.info("In to the Search Employee By Id");
		
		return employeeDao.searchEmployeeById(empId);
	}

	/**
	 * search employee details by name
	 */
	@Override
	public List<EmployeeEntity> searchEmployeeByName(String employeeFirstName, String employeeLastName)
			throws SQLException {
		logger.info("In to the Search EmployeeDetails");
		
		return employeeDao.searchEmployeeByName(employeeFirstName, employeeLastName);
	}

}
