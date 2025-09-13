package com.ng;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.NumberService;

@SpringBootApplication
public class EvenOrOddCheckerApplication {

	public static void main(String[] args) {
			
			try(ConfigurableApplicationContext ctx =SpringApplication.run(EvenOrOddCheckerApplication.class, args);
					Scanner sc = new Scanner(System.in)){
					
				System.out.println("enter a number::");
				int n = sc.nextInt();
				  NumberService nservice = ctx.getBean(NumberService.class);
				System.out.println("Result::"+  nservice.checkEvenOdd(n));				
			}
				 catch(Exception e) {
				
				e.printStackTrace();
			}
		
	}
	

}
