package com.ng.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("oxBall")
public final class OXBridgeBall implements ICricketBall {

	public OXBridgeBall() {
		System.out.println("OxBall 0-param constructor");
	}

	@Override
	public String bowling() {
		System.out.println("OxBridgeBall.bowling()");
		return new Random().nextInt(10) + "="+new Random().nextInt(5)+"="+new Random().nextInt(11);
	}

}
