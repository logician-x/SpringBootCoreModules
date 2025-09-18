package com.ng;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.controller.HospitalOperationsController;
import com.ng.model.Hospital;

@SpringBootApplication
public class HospitalManagementSystemApplication {

    private final HospitalOperationsController hospitalController;

    HospitalManagementSystemApplication(HospitalOperationsController hospitalController) {
        this.hospitalController = hospitalController;
    }

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(HospitalManagementSystemApplication.class, args);
				Scanner sc = new Scanner(System.in);){
			
				System.out.println("Enter loc1::");
				String loc1 = sc.next();
				System.out.println("Enter loc2::");
				String loc2 = sc.next();
				
			  HospitalOperationsController controller = ctx.getBean(HospitalOperationsController.class);
			   List<Hospital> list =controller.showHospitalByLoc(loc1, loc2);
			   
			   list.stream().collect(Collectors.groupingBy(Hospital::getLoc)).forEach((k,v)->{
				   
				   System.out.println("Loc1::"+k);
				   v.forEach(hospital->{
					   
					   	System.out.println("Hospital id::"+hospital.getHospitalno());
					   	System.out.println("Name::"+hospital.getHname());
					   	
				   });
			   });
			   
		}catch(Exception e) {
			System.out.println("Root cause::"+e.getMessage());
		}
	}

}
