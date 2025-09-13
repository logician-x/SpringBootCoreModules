package com.ng;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ng.sbeans.SeasonFinder;

@SpringBootApplication
public class AppConfig {

			
		@Bean("ldate")
		public LocalDate getDate() {
			return LocalDate.now();
		}
		
		public static void main(String[] args) {
			
			 try(ConfigurableApplicationContext ctx = SpringApplication.run(AppConfig.class, args);){
				 System.out.println("ctx class name::"+ctx.getClass());
			  SeasonFinder  finder =  ctx.getBean(SeasonFinder.class);
			  System.out.println("current season::"+finder.findSeason());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
