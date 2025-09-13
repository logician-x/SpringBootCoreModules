package com.ng.sbeans;

import org.springframework.stereotype.Component;

@Component("dis")
public class DiscountService {
	
	public double applyDiscount(double price, double discountPercentage)
	{
		 return price-(price*discountPercentage)/100;
	}
		
}
