package com.ng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ng.dao.ProductDAO;
import com.ng.model.Product;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public String addStock(int quantity, String product) throws Exception {

		return dao.addStock(quantity, product) > 0 ? "Successfully added stock" : "Does not added";

	}

	@Override
	public String reduceStock(int quantity,String product)throws Exception  {
		
		 return dao.reduceStock(quantity, product)>0?"Successfully reduced stock":"not available";			
	}
	
	@Override
	public int checkAvailaibility(String product)throws Exception  {
		
		 return dao.checkAvailability(product);				
	}

	@Override
	public List<Product> getProductList() throws Exception {
		 return dao.getStockList();
	}

	@Override
	public Double getInventory() throws Exception {
		return dao.calculateInventory();
		
	}
}
