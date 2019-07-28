package com.learn.employee.portal.exception;

import org.apache.log4j.Logger;

public class WrongCredentialsException extends Exception {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	Logger logger = Logger.getLogger("WrongCredentialsException.class");

	public WrongCredentialsException(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		logger.info("Wrong Credential exception occurred");
		return "Invalid credentials: " + this.username + " " + this.password;
	}

	@Override
	public String getMessage() {
		return this.toString();
	}
}
