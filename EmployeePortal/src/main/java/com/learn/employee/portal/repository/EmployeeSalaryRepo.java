package com.learn.employee.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.employee.portal.entity.EmployeeSalaryEntity;

public interface EmployeeSalaryRepo extends JpaRepository<EmployeeSalaryEntity, Integer> {

	public EmployeeSalaryEntity findByEmpId(int empId);

	public boolean deleteByEmpId(int emplId);
}
