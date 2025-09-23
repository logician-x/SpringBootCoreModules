package com.ng.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pservice")
public class PayrollService {

	@Autowired
	private PayrollHolder pholder;

	public void payrollSnapshot() {

		System.out.println("currency:" + pholder.getCurrency());
		System.out.println("tax:" + pholder.getTaxRate());
		System.out.println("overtime status:" + pholder.getOvertimeEnabled());
		System.out.println("\u001B[32m"+"Benefits List:"+"\u001B[0m");
		pholder.getObjlist().forEach(benefit->{
			   System.out.println("Name:"+benefit.getName());
			   System.out.println(benefit.getDescription());
			   System.out.println("Amount:"+benefit.getAmount());
		});
		System.out.println("\u001B[32m"+"salary band and departments:"+"\u001B[0m");
		pholder.getSalaryBands().forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("\u001B[32m"+"Departments::"+"\u001B[0m");
		pholder.getDepartments().forEach(System.out::println);
		System.out.println("\u001B[32m"+"HolidayPolicy:"+"\u001B[0m");
		System.out.println(pholder.getHolidayPolicy());
	}

}
