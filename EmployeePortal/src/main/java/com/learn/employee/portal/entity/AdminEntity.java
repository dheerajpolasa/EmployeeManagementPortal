package com.learn.employee.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class AdminEntity {
	@Id
	@Column(name = "")
	String adminID;
	@Column(name = "")
	String adminPassword;

	/**
	 * @return adminID
	 */
	public String getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID
	 */
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	/**
	 * @return adminPassword
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * @param adminPassword
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}
