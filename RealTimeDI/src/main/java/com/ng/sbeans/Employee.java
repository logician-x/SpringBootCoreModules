package com.ng.sbeans;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	
	private Long id;
	
	@Nonnull
	private String name; 
	@Nonnull
	private String job;
	@Nonnull
	private Double salary;
	private Double grossSalary;
	private Double netSalary;	
}
