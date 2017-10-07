package com.mastermind;

public class CodeColors {
	public static final int YELLOW = 0;
	public static final int RED = 1;
	public static final int GREEN = 2;
	public static final int BLUE = 3;
	public static final int CYAN = 4;
	public static final int WHITE = 5;	
	public static final int BLACK = 6;	
	public static final int PURPLE = 7;

	private static int [] existingColors ;
	private static String [] existingColorNames;
	
	public static int [] getExistingColors ()  {
		if (existingColors == null) {
		existingColors = new int[] {YELLOW, RED, GREEN, BLUE, CYAN, WHITE, BLACK, PURPLE};
		}
		return existingColors;
	}
	
	public static String [] getExistingColorNames(){
		if (existingColorNames == null) {
			existingColorNames = new String[] {"YELLOW", "RED", "GREEN", "BLUE", "CYAN", "WHITE", "BLACK", "PURPLE"};
		}
		return existingColorNames; 
	}
	
	public static boolean colorExist (int colorCode) {
		return (colorCode >= 0) && (colorCode < getExistingColors().length);
	}
	
	public static String getName(int codeColor) {
		return getExistingColorNames()[codeColor];
	}
}
 