package com.learn.employee.portal.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.employee.portal.entity.EmployeeEntity;
import com.learn.employee.portal.entity.EmployeeSalaryEntity;
import com.learn.employee.portal.serviceImpl.EmployeeServicesImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServicesImpl employeeServiceObj;
	private List<EmployeeEntity> employeeList;

	/**
	 * @return
	 */
	@RequestMapping(value = "/Access/create", method = RequestMethod.GET)
	public String CreateEmployee() {
		System.out.println("in EmployeeController and goToEmployeePage method");

		return "CreateNewEmployee";
	}

	/**
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/Access/FetchEmployeeDetails", method = RequestMethod.GET)
	public String FetchEmployee(ModelMap modelMap) {
		try {
			employeeList = employeeServiceObj.getEmployeeDetails();
			modelMap.addAttribute("employeeList", employeeList);
			return "EmployeeDetailsWithSalary";
		} catch (SQLException e) {
			String msg = "Error occurred while Fetching the Details ";
			modelMap.addAttribute("errorMessage", msg);
			e.printStackTrace();
			return "ErrorDetails";
		}
	}

	/**
	 * @param employeeSalary
	 * @param employee
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/Access/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute EmployeeSalaryEntity employeeSalary,
			@ModelAttribute EmployeeEntity employee, ModelMap modelMap) {
		String msg = null;
		try {
			if (employeeServiceObj.addEmployDetails(employee) != null
					&& employeeServiceObj.addSalaryDetail(employeeSalary) != null) {
				msg = "Employee Details added successfully";
			} else {
				msg = "Failed to add details";
			}
		} catch (SQLException e) {
			msg = "DataBase is Not Working";
			modelMap.addAttribute("Error", msg);
			e.printStackTrace();
			return "ErrorDetails.jsp";

		}
		return "redirect:/EmployeePortal/Access/FetchEmployeeDetails";
	}

	/**
	 * @param empID
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/Access/delete")
	public String deleteEmployee(@RequestParam int empID, ModelMap modelMap) {
		try {
			employeeServiceObj.deleteEmployeeDetails(empID);
		} catch (SQLException e) {
			String msg = "Error occurred while Deletion ";
			modelMap.addAttribute("errorMessage", msg);
			e.printStackTrace();
			return "ErrorDetails";
		}
		return "AdminHomePage";
	}

	/**
	 * @param empID
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/Access/fetchOneEmployee")
	public String fetchOneEmployee(@RequestParam int empID, @RequestParam String empName, ModelMap modelMap) {
		System.out.println(empID);
		System.out.println(empName);
		try {
			System.out.println("hii");
			EmployeeEntity employee = employeeServiceObj.getOneEmployeeDetails(empID);
			modelMap.addAttribute("oneEmployee", employee);
			return "UpdateEmployee";
		} catch (SQLException e) {
			String msg = "Error occurred while Fetching One Employee Details";
			modelMap.addAttribute("errorMessage", msg);
			e.printStackTrace();
			return "ErrorDetails";
		}
	}

	/**
	 * @param employeeEntity
	 * @param employeeSalaryEntity
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/Access/UpdateEmployee")
	public String updateEmployee(@ModelAttribute EmployeeEntity employeeEntity,
			@ModelAttribute EmployeeSalaryEntity employeeSalaryEntity, ModelMap modelMap) {
		try {
			employeeServiceObj.updateSalaryDetail(employeeSalaryEntity);
			employeeServiceObj.updateEmployeeDetails(employeeEntity);
		} catch (SQLException e) {
			e.printStackTrace();
			return "ErrorDetails";
		} catch (Exception e) {
		}
		return "redirect:/EmployeePortal/Access/FetchEmployeeDetails";

	}

}
