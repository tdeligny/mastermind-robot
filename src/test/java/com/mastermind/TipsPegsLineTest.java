package com.mastermind;

import junit.framework.TestCase;

public class TipsPegsLineTest extends TestCase {


	public void test_isAllBlack () {
	
		TipsPegsLine aTipsPegsLine = new TipsPegsLine();
		for (int i = 0; i < MasterMindGameConstants.NUMBER_OF_SLOTS;i++) {
			aTipsPegsLine.setBlackTipPegsLineAtRank(i);
			assertTrue(aTipsPegsLine.isBlackAtRank(i));
		}
		assertTrue(aTipsPegsLine.isAllBlack());
	}

	public void test_setTipPegsLine() {
		TipsPegsLine aTipsPegsLine = new TipsPegsLine();
		for (int i = 0; i < MasterMindGameConstants.NUMBER_OF_SLOTS;i++) {
			aTipsPegsLine.setBlackTipPegsLineAtRank(i);
			assertTrue(aTipsPegsLine.isBlackAtRank(i));
		}
	}
	
	public void test_TipsPegsLine() {
		TipsPegsLine aTipsPegsLine = new TipsPegsLine();
		assertNotNull(aTipsPegsLine.getTipPegsLine());
		assertEquals(MasterMindGameConstants.NUMBER_OF_SLOTS, aTipsPegsLine.getTipPegsLine().length);
	}
}
