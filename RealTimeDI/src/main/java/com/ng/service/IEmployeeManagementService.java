package com.ng.service;
import java.util.List;

import com.ng.sbeans.Employee;
public interface IEmployeeManagementService {
		
		public List<Employee> fetchEmpsByDesgs(String desg1,String desg2,String desg3)throws Exception;
	
}
