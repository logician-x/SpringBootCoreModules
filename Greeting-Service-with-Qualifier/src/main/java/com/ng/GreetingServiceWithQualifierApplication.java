package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.GreetingManager;

@SpringBootApplication
public class GreetingServiceWithQualifierApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext cnf = SpringApplication.run(GreetingServiceWithQualifierApplication.class, args);){
			
			   GreetingManager gm =  cnf.getBean("gm",GreetingManager.class);
			   gm.showGreeting("Nageshwar");
			   
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
