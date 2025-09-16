package com.ng;



import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;  
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.controller.EmployeeOperationsController;
import com.ng.sbeans.Employee;


@SpringBootApplication
public class RealTimeDiApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx =SpringApplication.run(RealTimeDiApplication.class, args);
				Scanner sc = new Scanner(System.in);){
				 System.out.println("RealTimeDiApplication.main()");
				 EmployeeOperationsController controller= ctx.getBean(EmployeeOperationsController.class);
				  System.out.println("Enter desg1::");
				  String desg1 = sc.next();
				  System.out.println("Enter desg2::");
				  String desg2 = sc.next();
				  System.out.println("Enter desg3::");
				  String desg3 = sc.next();
				  List<Employee> list = controller.showAllEmployeeOnDesg(desg1, desg2, desg3);
				  int i= 1;
				  list.stream().sorted(Comparator.comparing(Employee::getJob)).collect(Collectors.groupingBy(Employee::getJob,TreeMap::new,Collectors.toList())).forEach((k,v)->{
					  				String str = "\u001B[32m";
					  				String reset ="\u001B[0m";
					  				System.out.println(str+"Job category::"+k+reset);
					  			    v.forEach(emp->{
					  			    	
					  			    	System.out.println(" Employee"+i);
						  			    System.out.println("ID::"+emp.getId());
						  			    System.out.println("Name::"+emp.getName());
						  			    System.out.println("Salary::"+emp.getSalary());
						  			    System.out.println("NetSalary::"+emp.getNetSalary());
						  			    System.out.println(" Gross-Salary::"+emp.getGrossSalary());
					  			    });
					  			    System.out.println("===============================================");
				  });
							
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}