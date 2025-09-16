package com.ng.sbeans;

import lombok.Data;


@Data
public class Employee {

	private Long id;
	private String name;
	private String job;
	private Double salary;
	private Double grossSalary;
	private Double netSalary;
	
	public Employee(){
		System.out.println("Employee.Employee()");
	}
}
