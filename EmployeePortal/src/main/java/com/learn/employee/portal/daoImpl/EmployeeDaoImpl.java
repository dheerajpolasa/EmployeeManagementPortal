package com.learn.employee.portal.daoImpl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.employee.portal.dao.EmployeeDao;
import com.learn.employee.portal.entity.EmployeeEntity;
import com.learn.employee.portal.repository.EmployeeRepo;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeRepo employeeRepo;
	EntityManagerFactory emf;

	/**
	 * return List of Employees 
	 */
	public List<EmployeeEntity> getEmployeeDetails() throws SQLException {
		List<EmployeeEntity> results = employeeRepo.findAll();
		return results;
	}

	/**
	 * Add Employee Details 
	 */
	public EmployeeEntity addEmployDetails(EmployeeEntity emp) throws SQLException {
		return employeeRepo.save(emp);
	}

	/**
	 * Search employee by id
	 */
	public EmployeeEntity searchEmployeeById(int empId) throws SQLException {
		return employeeRepo.findByEmpId(empId);
	}

	/**
	 * Delete employee details by id
	 */
	public boolean deleteEmployeeDetails(int empID) throws SQLException {
		try {
			employeeRepo.deleteById(empID);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Get specific employee details by id
	 */
	public EmployeeEntity getOneEmployeeDetails(int empId) throws SQLException {

		return employeeRepo.findByEmpId(empId);
	}

	/**
	 * update employee details
	 */
	public boolean updateEmployeeDetails(EmployeeEntity emp) throws SQLException {
		EmployeeEntity employee = employeeRepo.findByEmpId(emp.getEmpId());
		employee.setAge(emp.getAge());
		employee.setBloodGroup(emp.getBloodGroup());
		employee.setDateOfBirth(emp.getDateOfBirth());
		employee.setEmployeeFirstName(emp.getEmployeeFirstName());
		employee.setEmployeeLastName(emp.getEmployeeLastName());
		employeeRepo.save(employee);
		return true;
	}

	/**
	 * search employee details by name
	 */
	public List<EmployeeEntity> searchEmployeeByName(String employeeFirstName, String employeeLastName)
			throws SQLException {

		return employeeRepo.findByEmployeeFirstNameAndEmployeeLastName(employeeFirstName, employeeLastName);
	}

}
