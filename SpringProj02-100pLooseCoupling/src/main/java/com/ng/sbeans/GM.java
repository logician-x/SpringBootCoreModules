package com.ng.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("gmBat")
public final class GM implements ICricketBat {

	public GM() {
		System.out.println("GMBAT::0-param constructor");
	}
	@Override
	public int scoreRuns() {
		return new Random().nextInt(250);
	}

}
