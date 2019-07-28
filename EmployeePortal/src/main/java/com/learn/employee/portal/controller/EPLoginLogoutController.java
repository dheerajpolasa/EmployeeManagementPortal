package com.learn.employee.portal.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learn.employee.portal.serviceImpl.AdminServicesImpl;

@Controller
@SessionAttributes({ "username" })
public class EPLoginLogoutController {
	@Autowired
	AdminServicesImpl adminServices;

	/**
	 * @param username
	 * @param password
	 * @param modelMap
	 * @return
	 * @throws SQLException
	 */
	@RequestMapping(value = "/Access/Login", method = RequestMethod.POST)
	public String validateUser(@RequestParam String username, @RequestParam String password, ModelMap modelMap)
			throws SQLException {
		boolean returnNumber = adminServices.checkUser(username, password);
		if (returnNumber) {
			modelMap.put("username", username);
			return "AdminHomePage";
		} else {
			modelMap.put("errorMsg", "Incorrect username or password");
			System.out.println("Wrong password");
			return "UserLogin";
		}

	}

	/**
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/Access/Logout", method = RequestMethod.GET)
	public String invalidateSession(ModelMap modelMap) {

		System.out.println("User is Logged out and session is invalidated");
		return "UserLogin";
	}

}
