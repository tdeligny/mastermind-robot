package com.mastermind;

public class GamePlay {

	private SecretColors secretColors ;
	
	private boolean isCombinationFound;

	private DecodingBoard decodingBoard ;
	
	private TipsPegsLine tipsPegsLine;
	
	private ColorPegsLine colorPegsLine ;
	
	private int numberOfTry;
	
	public GamePlay () {
		this.setSecretColors(new SecretColors ());
		this.setDecodingBoard(new DecodingBoard());
		this.setNumberOfTry(0);
	}
	
	public int getNumberOfTry() {
		return numberOfTry;
	}

	public void setNumberOfTry(int numberOfTry) {
		this.numberOfTry = numberOfTry;
	}

	public SecretColors getSecretColors() {
		return secretColors;
	}

	public void setSecretColors(SecretColors secretColors) {
		this.secretColors = secretColors;
	}

	public DecodingBoard getDecodingBoard() {
		return decodingBoard;
	}

	public void setDecodingBoard(DecodingBoard decodingBoard) {
		this.decodingBoard = decodingBoard;
	}

	public TipsPegsLine getTipsPegsLine() {
		return tipsPegsLine;
	}

	public void setTipsPegsLine(TipsPegsLine tipsPegsLine) {
		this.tipsPegsLine = tipsPegsLine;
	}

	public ColorPegsLine getColorPegsLine() {
		return colorPegsLine;
	}

	public void setColorPegsLine(ColorPegsLine colorPegsLine) {
		this.colorPegsLine = colorPegsLine;
	}

	/** Start the game, initialize the secret colors */
	public void start(MastermindStrategy aStrategy) {
		MastermindLogger.getInstance().info("Number of colors:"+ MasterMindGameConstants.NUMBER_OF_COLORS_TO_GUESS);
		MastermindLogger.getInstance().info("Number of slots:" + MasterMindGameConstants.NUMBER_OF_SLOTS);
		this.getSecretColors().chooseRandomColors();
		MastermindLogger.getInstance().info("Secret colors are:");
		isCombinationFound = false;
		aStrategy.setDecodingBoard(getDecodingBoard());
		MastermindLogger.getInstance().info(getSecretColors().getColorsAsString());
	}	
	
	public boolean isCombinationNotFound() {
		return !isCombinationFound;
	}
	
	public void play(ColorPegsLine aColorPegsLine) {
		
		// Analyze the colors and store the results : Black / White / Empty in a TipsPegs Line
		TipsPegsLine aTipsPegsLine = this.analyseColors(aColorPegsLine);
		
		// Check if all tips are black ?
		isCombinationFound = aTipsPegsLine.isAllBlack();
		
		// Store the tips pegs line in the board for next play
		if (this.getDecodingBoard() != null) {
			this.getDecodingBoard().setKeyPegsLinesAt(getNumberOfTry(), aTipsPegsLine);
		}
		
		this.setNumberOfTry(getNumberOfTry()+1);
	}
	
	private TipsPegsLine analyseColors(ColorPegsLine aColorPegsLine) {
		TipsPegsLine aTipsPegsLine = new TipsPegsLine();
		
		for (int slotIndex = 0; slotIndex < MasterMindGameConstants.NUMBER_OF_SLOTS;slotIndex++) {
			if (this.getSecretColors() != null 
					&& this.getSecretColors().getColors() != null  
					  && aColorPegsLine != null 
							&& aColorPegsLine.getColors() != null
								&& (this.getSecretColors().getColors()[slotIndex] == (aColorPegsLine.getColors()[slotIndex]))) {
				aTipsPegsLine.setBlackTipPegsLineAtRank(slotIndex);
			}
		}
		return aTipsPegsLine;
	}
}
