package com.ng.sbeans;

import org.springframework.stereotype.Component;

@Component("fineService")
public class PayrollService {

	public double calculateNetSalary(double basic, double hra, double allowance, double tax)
	{
		 double grossSalary = basic + hra + allowance;
		 double netSalary = grossSalary-tax;
		 SalarySlip slip = new SalarySlip(grossSalary,netSalary,tax);
		 System.out.println(slip);
		 return  netSalary;		  
	}
	
}
