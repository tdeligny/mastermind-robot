package com.mastermind;

import junit.framework.TestCase;

public class RandomDumbStrategyTest extends TestCase {

	public void test_RandomDumbStrategy() {
		RandomDumbStrategy aStrategy = new RandomDumbStrategy();
		assertNotNull(aStrategy);
	}
	
	public void test_getNextPegsLine() {
		RandomDumbStrategy aStrategy = new RandomDumbStrategy();
		assertNotNull(aStrategy);
		assertNotNull(aStrategy.getNextPegsLine());
		assertNotNull(aStrategy.getNextPegsLine().getColors());
	}
}
