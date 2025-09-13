package com.ng.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hindiGreet")
public class HindiGreetingService implements GreetingService {

	@Value("${greet.hindi}")
	private String greet;
	
	@Override
	public String greet(String name) {
		return greet+","+name;
	}

}
