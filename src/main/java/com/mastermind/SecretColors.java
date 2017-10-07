package com.mastermind;

import java.util.Random;

public class SecretColors extends ColorPegsLine {
	
	/**
	 * Set random different colors for this ColorsChooser 
	 */
	// Unit Test OK
	public void chooseRandomColors() {
		
		this.setColors(new int[MasterMindGameConstants.NUMBER_OF_SLOTS]);

		Random rand = new Random();

		for (int i = 0 ; i < MasterMindGameConstants.NUMBER_OF_SLOTS; i++) {
			setColorAtRange(i, rand.nextInt(MasterMindGameConstants.NUMBER_OF_COLORS_TO_GUESS));
		}
	}
	

}
