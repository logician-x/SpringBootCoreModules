package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.CoursePlatformService;

@SpringBootApplication
public class OnlineCoursePlatformConfigurationApplication {

	public static void main(String[] args) {
		
			try(ConfigurableApplicationContext ctx = SpringApplication.run(OnlineCoursePlatformConfigurationApplication.class, args);){
				
				CoursePlatformService cservice= ctx.getBean(CoursePlatformService.class);
				cservice.printAllProperties();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}
