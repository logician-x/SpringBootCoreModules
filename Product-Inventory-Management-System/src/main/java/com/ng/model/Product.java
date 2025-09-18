package com.ng.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
		
	private Long id;
	private String name;
	private Double price;
    private int quantity;
     
			
		
}
