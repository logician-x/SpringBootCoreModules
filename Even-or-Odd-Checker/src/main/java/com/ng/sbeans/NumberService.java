package com.ng.sbeans;

import org.springframework.stereotype.Component;

@Component("nservice")
public class NumberService {

	public String checkEvenOdd(int number) {
		
			if(number==0) {
				 throw new IllegalArgumentException("Invalid argument");
			}
			else if(number%2==0) {
				return "Even";
			}else{
				return "Odd";
			}
		
	}
		
}
