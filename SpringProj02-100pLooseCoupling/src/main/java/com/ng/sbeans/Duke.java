package com.ng.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("dukeBall")
public final class Duke implements ICricketBall {

	public Duke() {
		System.out.println("DukeBall 0-param constructor");
	}

	@Override
	public String bowling() {
		System.out.println("DukeBall.bowling()");
		return new Random().nextInt(10) + "="+new Random().nextInt(5)+"="+new Random().nextInt(11);
	}

}
