package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.ng.sbeans.*;
import com.ng.sbeans.CarFactory;

@SpringBootApplication
public class FactoryBeanExam1Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(FactoryBeanExam1Application.class, args);){
			
			CarFactory factory =  ctx.getBean(CarFactory.class);
			 Car car =  (Car)factory.getObject();
			System.out.println(car);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
