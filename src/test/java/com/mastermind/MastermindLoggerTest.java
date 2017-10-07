package com.mastermind;

import junit.framework.TestCase;

public class MastermindLoggerTest extends TestCase {

	public void test_getInstance() {
		assertNotNull(MastermindLogger.getInstance());
	}

}
