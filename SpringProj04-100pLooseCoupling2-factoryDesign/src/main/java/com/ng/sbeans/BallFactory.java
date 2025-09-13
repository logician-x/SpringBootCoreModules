package com.ng.sbeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ballFactory")
public class BallFactory implements FactoryBean<ICricketBall>{

	@Value("${cktr.ball}")
	private String ball;
	
	@Override
	public ICricketBall getObject() throws Exception {
			switch(ball) {	
			case "ox":return new OXBridgeBall(); 
			case "duke":return new Duke();
			case "ss":return new SSBall(); 
			default:throw new IllegalArgumentException();
			}
	}

	@Override
	public Class<?> getObjectType() {
		return ICricketBall.class;
	}

			
		
}
