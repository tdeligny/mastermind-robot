package com.mastermind;

import junit.framework.TestCase;

public class GamePlayTest  extends TestCase {
	
	public void test_start() {
		GamePlay gamePlay = new GamePlay ();
		assertNotNull(gamePlay.getSecretColors());
		assertFalse(!gamePlay.isCombinationNotFound());
	}

	public void test_play() {
		GamePlay gamePlay = new GamePlay ();
		gamePlay.play(null);
		assertTrue(gamePlay.getNumberOfTry() == 1);
		gamePlay.play(new ColorPegsLine());
		assertTrue(gamePlay.getNumberOfTry() == 2);
	}
}
