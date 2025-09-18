package com.ng.service;

import java.util.List;

import com.ng.model.Product;

public interface IProductService {
	
		
			public String addStock(int quantity,String name)throws Exception;			
			public String reduceStock(int quantity,String product)throws Exception;
			public int checkAvailaibility(String product)throws Exception  ;
			public List<Product> getProductList()throws Exception  ;
			public Double getInventory() throws Exception ;
}
