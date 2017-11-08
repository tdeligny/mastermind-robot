package com.mastermind;

import java.util.Random;

public class RandomDumbStrategy extends MastermindStrategy {


	/**
	 * 
	 * @return a ColorPegsLine corresponding to a random "stupid" strategy without taking in account previous plays
	 * 
	 * Algorithm:
	 * Set colors randomly
	 */
	public ColorPegsLine getNextPegsLine() {
		ColorPegsLine aColorPegsLine = new ColorPegsLine();
		aColorPegsLine.setColors(new int[MasterMindGameConstants.NUMBER_OF_SLOTS]);

		Random rand = new Random();

		for (int slotIndex = 0 ; slotIndex < MasterMindGameConstants.NUMBER_OF_SLOTS; slotIndex++) {
			aColorPegsLine.setColorAtRange(slotIndex, rand.nextInt(MasterMindGameConstants.NUMBER_OF_COLORS_TO_GUESS));
		}
		return aColorPegsLine;
	}
}
