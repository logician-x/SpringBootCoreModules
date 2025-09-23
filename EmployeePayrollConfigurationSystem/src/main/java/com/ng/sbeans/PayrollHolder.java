package com.ng.sbeans;

import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "payroll")
public class PayrollHolder {

	private String companyName;
	private String currency;
	private Double taxRate;
	private Boolean overtimeEnabled;
	private List<String> departments;
	private Map<String, Double> salaryBands;
	private HolidayPolicy holidayPolicy;
	private List<Benefits> objlist;	
}
