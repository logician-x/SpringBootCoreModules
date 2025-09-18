package com.ng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ng.dao.DAO;
import com.ng.sbeans.Employee;


import java.util.List;  

@Service
public class EmployeeService implements IEmployeeManagementService{
	
	@Autowired
	private DAO dao;

	@Override
	public List<Employee> fetchEmpsByDesgs(String desg1, String desg2, String desg3)throws Exception {
		 	
			desg1 = desg1.toLowerCase();
			desg2 = desg2.toLowerCase();
			desg3 = desg3.toLowerCase();
			System.out.println("EmployeeService.fetchEmpsByDesgs()");
			List<Employee> list = dao.retrieveAllEmployee(desg1,desg2,desg3);
			list.forEach(emp->{
					emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
					emp.setNetSalary(emp.getSalary()+(emp.getSalary()*0.3));
			});
			return list;
	}

	@Override
	public String insertEmployee(Employee emp) throws Exception {
			return dao.insert(emp)>0?"Inserted Successfully":"Failded to insert";
	}
	
	
}
