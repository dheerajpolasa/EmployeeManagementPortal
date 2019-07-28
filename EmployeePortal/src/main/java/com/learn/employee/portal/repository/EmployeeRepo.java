package com.learn.employee.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.employee.portal.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
	public EmployeeEntity findByEmpId(int empId);

	public List<EmployeeEntity> findByEmployeeFirstNameAndEmployeeLastName(String employeeFirstName,
			String employeeLastName);

	public boolean deleteByEmpId(int empId);

	public List<EmployeeEntity> findAll();

}
