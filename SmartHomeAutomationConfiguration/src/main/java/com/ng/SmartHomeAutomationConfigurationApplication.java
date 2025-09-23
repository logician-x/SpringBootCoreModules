package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.SmartHomeService;

@SpringBootApplication
public class SmartHomeAutomationConfigurationApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(SmartHomeAutomationConfigurationApplication.class, args);){
				
						 SmartHomeService service = ctx.getBean(SmartHomeService.class);
						 service.printSmartHomeDetails();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
