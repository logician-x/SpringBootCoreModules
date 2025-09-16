package com.ng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;

import com.ng.sbeans.Employee;
import com.ng.service.IEmployeeManagementService;

@Controller("empController")
public class EmployeeOperationsController {

	@Autowired
	private IEmployeeManagementService service;

	public List<Employee> showAllEmployeeOnDesg(String desg1, String desg2, String desg3) throws Exception {

		try {
		
			System.out.println("EmployeeOperationsController.showAllEmployeeOnDesg()");
			return service.fetchEmpsByDesgs(desg1, desg2, desg3);
		} catch (Exception e) {
			throw e;
		}
	}

}
