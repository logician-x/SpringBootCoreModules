package com.ng.sbeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("carFactory")
public class CarFactory implements FactoryBean<Car>{
	
	@Override
	public Car getObject() throws Exception {
			Car car = new Car("Maruti","101");
			return car;
	}
	
	@Override
	public Class<Car> getObjectType() {
		 return Car.class;
	}

		
		
}
