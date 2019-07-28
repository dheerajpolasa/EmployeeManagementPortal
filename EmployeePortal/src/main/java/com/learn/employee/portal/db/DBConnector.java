package com.learn.employee.portal.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class DBConnector {
	static ResourceBundle resourceBundle = ResourceBundle.getBundle("Application");
	static final String JDBC_DRIVER = resourceBundle.getString("JDBC_DRIVER");
	static final String DB_URL = resourceBundle.getString("DB_URL");
	static final String USER = resourceBundle.getString("USER");
	static final String PASS = resourceBundle.getString("PASS");
	Logger logger = Logger.getLogger(DBConnector.class);

	/**
	 * @return Connection of Database object
	 */
	public java.sql.Connection getConnection() {

		Connection conn = null;
		Statement stmt = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			logger.info("Driver registered Successfully");
			conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);

			return conn;

		} catch (SQLException se) {

			// se.printStackTrace();
			logger.info(se.getMessage(), se);
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
		}
		logger.info("Connection Created Successfully");
		return conn;

	}

}
