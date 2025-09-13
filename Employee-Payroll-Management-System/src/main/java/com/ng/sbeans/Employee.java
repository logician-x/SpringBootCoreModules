package com.ng.sbeans;

public record Employee(String name, String designation,double basic,
		double hra, double allowance,double tax) {

	@Override
	public String toString() {
		return "Employee Name:"+name+
				"\nDesignation: "+designation+
				"\nBasic Salary:"+basic+
				"\nHRA: "+hra+
				"Allowances:"+allowance;
	}
			
}
