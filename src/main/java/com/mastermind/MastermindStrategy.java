package com.mastermind;

public abstract class MastermindStrategy {

	protected int colorsFound[];
	
	protected DecodingBoard decodingBoard; 
	
	public MastermindStrategy () {
		colorsFound = new int[MasterMindGameConstants.NUMBER_OF_COLORS_TO_GUESS];
	}

	public DecodingBoard getDecodingBoard() {
		return decodingBoard;
	}


	public void setDecodingBoard(DecodingBoard decodingBoard) {
		this.decodingBoard = decodingBoard;
	}

	public int[] getColorsFound() {
		return colorsFound;
	}

	public void setColorsFound(int[] colorsFound) {
		this.colorsFound = colorsFound;
	}
	
	public void updateStrategy(TipsPegsLine aTipsPegsLine) {
		// Do nothing
	}

	public abstract ColorPegsLine getNextPegsLine() ;

}
