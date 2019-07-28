package com.learn.employee.portal.serviceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.employee.portal.daoImpl.AdminDaoImpl;
import com.learn.employee.portal.service.AdminService;

@Service
public class AdminServicesImpl implements AdminService {
	@Autowired
	AdminDaoImpl adminDao;
	Logger logger =Logger.getLogger(AdminServicesImpl.class);
	@Override
	public boolean checkUser(String userName, String password) {
		logger.info("In to the Check User Function");
		return adminDao.checkUser(userName, password);
	}

}
