package com.ng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ng.model.Product;
import com.ng.service.IProductService;

@Controller
public class ProductController {

				@Autowired
				private IProductService service;
				
				public String addStock(int quantity,String name)throws Exception  {
					return service.addStock(quantity, name);
				}
			
				public String reduceStock(int quantity,String product)throws Exception  {
					
					 return service.reduceStock(quantity, product);
							
				}
				
				
				public int checkAvailaibility(String product)throws Exception  {
					 return service.checkAvailaibility(product);		
				}
				
				public List<Product> getStockList()throws Exception{
						return service.getProductList();
				}
}
