package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.PayrollService;

@SpringBootApplication
public class EmployeePayrollConfigurationSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(EmployeePayrollConfigurationSystemApplication.class, args);){
			
				 PayrollService service = ctx.getBean(PayrollService.class);
				 service.payrollSnapshot();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
