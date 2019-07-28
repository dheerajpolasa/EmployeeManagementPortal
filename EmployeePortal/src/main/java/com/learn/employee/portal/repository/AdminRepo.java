package com.learn.employee.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.employee.portal.entity.AdminEntity;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, Integer> {

	public AdminEntity findByAdminIDAndAdminPassword(String username, String Password);

}
