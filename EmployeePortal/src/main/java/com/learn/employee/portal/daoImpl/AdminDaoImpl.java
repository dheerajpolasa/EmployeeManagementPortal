package com.learn.employee.portal.daoImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.employee.portal.dao.AdminDao;
import com.learn.employee.portal.repository.AdminRepo;

@Component
public class AdminDaoImpl implements AdminDao {
	Logger logger=Logger.getLogger(AdminDaoImpl.class);
	@Autowired
	AdminRepo adminRepo;

	/**
	 * check user credentials
	 */
	@Override
	public boolean checkUser(String userName, String password) {
		logger.info("In to the check user Dao Impl ");
		
		if (adminRepo.findByAdminIDAndAdminPassword(userName, password) == null) {
			logger.warn("User Does not Exists");
			return false;
		} else {
			logger.info("Successfully Login");
			return true;
		}
	}

}
