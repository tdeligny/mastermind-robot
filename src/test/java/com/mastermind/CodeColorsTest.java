package com.mastermind;

import junit.framework.TestCase;

public class CodeColorsTest extends TestCase {

	public void test_colorExist() {
		// Test that -1 is always refused
		assertFalse(CodeColors.colorExist(-1));
		// Test that 0 is always accepted 
		assertTrue(CodeColors.colorExist(0));
		
		assertNotNull(CodeColors.getExistingColors());
		assertTrue(CodeColors.getExistingColors().length >= 1);
		
		assertTrue(CodeColors.colorExist(new Integer(CodeColors.getExistingColors().length-1).intValue()));
	}

	// Exemple de test qui ne sert � rien, � part augmenter le Code Coverage !
	public void test_getName() {		
		assertTrue(CodeColors.getName(CodeColors.BLACK).equals(CodeColors.getExistingColorNames()[CodeColors.BLACK]));
		assertTrue(CodeColors.getName(CodeColors.WHITE).equals(CodeColors.getExistingColorNames()[CodeColors.WHITE]));
		assertTrue(CodeColors.getName(CodeColors.YELLOW).equals(CodeColors.getExistingColorNames()[CodeColors.YELLOW]));
		assertTrue(CodeColors.getName(CodeColors.PURPLE).equals(CodeColors.getExistingColorNames()[CodeColors.PURPLE]));
		assertTrue(CodeColors.getName(CodeColors.RED).equals(CodeColors.getExistingColorNames()[CodeColors.RED]));
		assertTrue(CodeColors.getName(CodeColors.CYAN).equals(CodeColors.getExistingColorNames()[CodeColors.CYAN]));
		assertTrue(CodeColors.getName(CodeColors.GREEN).equals(CodeColors.getExistingColorNames()[CodeColors.GREEN]));
	}

}
