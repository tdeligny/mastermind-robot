package com.mastermind;

import junit.framework.TestCase;

public class SecretColorsTest extends TestCase {
	
	private static SecretColors secretColors ;
	
	public static void runThisBeforeTests (){
		secretColors = new SecretColors ();
		secretColors.chooseRandomColors();
	}
	
	public void test_chooseRandomColors_notNull() {
		runThisBeforeTests();
		assertNotNull(secretColors);
		assertNotNull(secretColors.getColors());
	}

	
	public void test_chooseRandomColors_notEmpy() {
		runThisBeforeTests();
		for (int i = 0; i < MasterMindGameConstants.NUMBER_OF_COLORS_TO_GUESS; i++) {
			assertTrue(CodeColors.colorExist(secretColors.getColors()[i]));
		}
	}
	
	public void test_getColorsAsString() {
		runThisBeforeTests();
		assertNotNull(secretColors.getColorsAsString());
		int length = secretColors.getColorsAsString().length();
		int minimalLength = MasterMindGameConstants.NUMBER_OF_SLOTS * 3; // 3 is the length of "RED", the shortest word for a color;
		boolean isMinimalLengthCorrect = (length >= minimalLength);
		assertTrue(isMinimalLengthCorrect);
	}
}