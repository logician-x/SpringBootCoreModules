package com.ng.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("frenchGreet")
public class FrenchGreetingService implements GreetingService{

	@Value("${greet.french}")
	private String greet;
	
	@Override
	public String greet(String name) {
		return greet+","+name;
	}
}
