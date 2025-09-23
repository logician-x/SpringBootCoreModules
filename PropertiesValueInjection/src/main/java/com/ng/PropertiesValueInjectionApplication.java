package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.Student;

@SpringBootApplication
public class PropertiesValueInjectionApplication {

	public static void main(String[] args) {
	try(ConfigurableApplicationContext ctx = SpringApplication.run(PropertiesValueInjectionApplication.class, args)){
		
	     Student student = ctx.getBean(Student.class);
		System.out.println(student);
		
	}catch(Exception e) {
		e.printStackTrace();
	}	
		
	}

}
