package com.mastermind;

import junit.framework.TestCase;

public class ColorPegsLineTest extends TestCase {

	private static ColorPegsLine aColorPegsLine ;
	
	public static void runThisBeforeTests (){
		aColorPegsLine = new ColorPegsLine();
	}

	public void testGetColorsAsString() {
		runThisBeforeTests();
		assertNotNull(aColorPegsLine.getColorsAsString());
	}

	public void testGetColorName() {
		runThisBeforeTests();
		assertNotNull(aColorPegsLine.getColors());
		int length = aColorPegsLine.getColors().length;
		for (int i = 0 ; i < length ; i++) {
			assertNotNull(aColorPegsLine.getColorName(i));
		}
	}

}
