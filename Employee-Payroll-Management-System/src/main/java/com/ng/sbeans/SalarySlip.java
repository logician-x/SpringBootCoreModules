package com.ng.sbeans;

public record SalarySlip(double grossSalary,double netSalary,double deductions) {

	@Override
	public String toString() {
		return "Gross Salary:"+grossSalary+
		      "\nTax Deduction:"+deductions+
				"\nNet Salary:"+netSalary;
	}

	
		
		
}
