package com.mastermind;

public class HumanStrategy extends MastermindStrategy {
	
	/**
	 * 
	 * @return a ColorPegsLine corresponding to the best human strategy taking advantages of previous plays
	 *   
	 * Algorithm:
	 * Set colors previously found
	 * try new ones excluding the bad ones  
	 */
	public ColorPegsLine getaNextPegsLine() {
		
		// Build the resulting object
		ColorPegsLine aColorPegsLine = new ColorPegsLine();
		
		// set the number of slots for each colors
		aColorPegsLine.setColors(new int[MasterMindGameConstants.NUMBER_OF_SLOTS]);

		this.setColorsFound(aColorPegsLine);
		
		this.tryNewColors(aColorPegsLine);
		
		return aColorPegsLine;
	}

	
	/**
	 * 
	 * Copy the color already found in previous plays
	 */
	protected void setColorsFound(ColorPegsLine aColorPegsLine) {

		for (int slotIndex = 0; slotIndex < MasterMindGameConstants.NUMBER_OF_SLOTS; slotIndex++) {
			aColorPegsLine.setColorAtRange(slotIndex, getColorsFound()[slotIndex]);
		}
	}
	
	
	/*
	 *  Analyse previous whites, to 
	 */
	protected void tryNewColors(ColorPegsLine aColorPegsLine) {

		for (int lines = 0; lines < MasterMindGameConstants.NUMBER_OF_SLOTS; lines ++) {
			for (int slots = 0 ; slots < MasterMindGameConstants.NUMBER_OF_SLOTS; slots++) {
				// I find a white
				if (getDecodingBoard().isWhiteAt(lines, slots)) {
					
				}
/*				if (une couleur est tips = blanche)
					alors rechercher dans les lignes suivantes:
						est ce que cette couleur est encore blanche 
							garder la position et relancer la recherche
						est ce que cette couleur est noire = Terminer
	*/					
						
			}
		}

	}
}
