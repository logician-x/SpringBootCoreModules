package com.ng;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.ng.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.controller.ProductController;
import com.ng.model.Product;

@SpringBootApplication
public class ProductInventoryManagementSystemApplication {

	private final ProductService productService;

	ProductInventoryManagementSystemApplication(ProductService productService) {
		this.productService = productService;
	}

	public static void main(String[] args) {

		try (ConfigurableApplicationContext ctx = SpringApplication
				.run(ProductInventoryManagementSystemApplication.class, args); Scanner sc = new Scanner(System.in)) {

			ProductController controller = ctx.getBean(ProductController.class);
			while (true) {
				String color = "\u001B[32m";
				String RESET = "\u001B[0m";
				System.out.println(color+"Welcome to product management system"+RESET);
				System.out.println("1.Increase Stock\n2.Decrease Stock\n3.Check Availability\n4. List Low Stock Products");
				System.out.println("5.Calculate Total Inventory Value");
				System.out.println("6. Exit");
				System.out.println("Enter your choice:");
				int ch = Integer.parseInt(sc.next());
				switch (ch) {
				case 1:
					System.out.println("Enter name of the product:");
					String name = sc.next();
					System.out.println("Enter quantity to increase:");
					int quantity = sc.nextInt();
					System.out.println(controller.addStock(quantity, name));
					break;
				case 2:
					System.out.println("Enter name of the product:");
					String pname = sc.next();
					System.out.println("Enter quantity to decrease:");
					int requiredquantity = sc.nextInt();
					System.out.println(controller.reduceStock(requiredquantity,pname));
					break;
				case 3:
					System.out.println("Enter name of the product:");
					String checkName = sc.next();
					System.out.println("Available quanitity:"+controller.checkAvailaibility(checkName));
					break;
				case 4:
					List<Product> list = controller.getStockList();
					Collections.sort(list, (p1,p2)->p1.getId().compareTo(p2.getId()));
					list.stream().forEach(emp->{
						  System.out.println("\u001B[35m"+"Product name:"+emp.getName()+"\u001B[0m");
						  System.out.println("ID:"+emp.getId());
						  System.out.println("Quantity:"+emp.getQuantity());
						  System.out.println("Price:"+emp.getPrice());
					});
					 break;
				case 5:
					List<Product> list1 = controller.getStockList();
					Double inventory = list1.stream().mapToDouble(product->product.getPrice()*product.getQuantity()).reduce(0,(a,b)->a+b);
					System.out.println("Total Inventory::"+inventory);
					 break;
				case 6:
					System.exit(1);
				}
			}
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
