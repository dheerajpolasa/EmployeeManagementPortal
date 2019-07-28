package com.learn.employee.portal.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.employee.portal.dao.EmployeeSalaryDao;
import com.learn.employee.portal.entity.EmployeeSalaryEntity;
import com.learn.employee.portal.repository.EmployeeSalaryRepo;

@Component
public class EmployeeSalaryDaoImpl implements EmployeeSalaryDao {
	@Autowired
	EmployeeSalaryRepo employeeSalaryRepo;

	/**
	 * Add salary details to database
	 */
	public EmployeeSalaryEntity addSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException {
		return employeeSalaryRepo.save(empsal);
	}

	/**
	 * update salary details
	 */
	public boolean updateSalaryDetail(EmployeeSalaryEntity empsal) throws SQLException {
		EmployeeSalaryEntity employee = employeeSalaryRepo.findByEmpId(empsal.getEmpId());
		employee.setHouseRentAllowance(empsal.getHouseRentAllowance());
		employee.setBasicSalary(empsal.getBasicSalary());
		employee.setMedicalAllowance(empsal.getMedicalAllowance());
		employee.setTravelAllowance(empsal.getTravelAllowance());
		employeeSalaryRepo.save(employee);
		return true;
	}

	/**
	 * get employee salary details
	 */
	public List<EmployeeSalaryEntity> getSalaryDetail() throws SQLException {
		return employeeSalaryRepo.findAll();
	}

	/**
	 * delete employee details
	 */
	public boolean deleteSalaryDetails(EmployeeSalaryEntity empsal) throws SQLException {
		return employeeSalaryRepo.deleteByEmpId(empsal.getEmpId());
	}

	/**
	 * get specific employee details by id
	 */
	public EmployeeSalaryEntity getOneEmployeeSalaryDetails(int empId) throws SQLException {
		return employeeSalaryRepo.findByEmpId(empId);
	}
}
