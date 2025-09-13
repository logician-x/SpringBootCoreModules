package com.ng;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.DiscountService;

@SpringBootApplication
public class ProductDiscountCalculatorApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(ProductDiscountCalculatorApplication.class, args);
				Scanner sc = new Scanner(System.in);){
				System.out.println("enter price ::");
				double price = sc.nextDouble();
				System.out.println("Enter discount Percentage::");
				double percentage = sc.nextDouble();
				DiscountService dservice =  ctx.getBean(DiscountService.class);
				System.out.println(dservice.applyDiscount(price,percentage));;
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
