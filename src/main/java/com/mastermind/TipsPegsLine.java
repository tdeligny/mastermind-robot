package com.mastermind;

public class TipsPegsLine {
	
	static final int BLACK_TIPS = 1;
	static final int WHITE_TIPS = 2;
	static final int EMPTY_TIPS = 0;
	
	private int[] tipPegsLine ; 

	// Unit test ok
	public TipsPegsLine() {
		tipPegsLine = new int[MasterMindGameConstants.NUMBER_OF_SLOTS];
	}
	
	public int[] getTipPegsLine() {
		return tipPegsLine;
	}
	
	public boolean isBlackAtRank(int rank)  {
		return tipPegsLine[rank] == BLACK_TIPS;
	}

	public void setTipPegsLine(int[] tipPegsLine) {
		this.tipPegsLine = tipPegsLine;
	}

	// Unit test ok
	public boolean isAllBlack () {
		boolean isAllBlack = true;
		for (int i = 0; i < MasterMindGameConstants.NUMBER_OF_SLOTS; i++) {
			if (!isBlackAtRank(i)) {
				isAllBlack = false;	
			}
		}
		return isAllBlack;
	}

	// Unit test ok
	public void setBlackTipPegsLineAtRank(int rank) {
		tipPegsLine[rank] = BLACK_TIPS;
	}
	
	public boolean isWhiteAt(int slot) {
		return tipPegsLine[slot] == TipsPegsLine.WHITE_TIPS;
	}

	public boolean isBlackAt(int slot) {
		return tipPegsLine[slot] == TipsPegsLine.BLACK_TIPS;
	}
	
	public boolean isEmptyAt(int slot) {
		return tipPegsLine[slot] == TipsPegsLine.EMPTY_TIPS;
	}

}
