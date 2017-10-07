package com.mastermind;

public class DecodingBoard {
	
		private TipsPegsLine [] tipsPegsLines ;
		
		private ColorPegsLine [] colorPegsLines;

		public DecodingBoard() {
			colorPegsLines = new ColorPegsLine [MasterMindGameConstants.NUMBER_OF_TRY_MAX] ;
			tipsPegsLines = new TipsPegsLine [MasterMindGameConstants.NUMBER_OF_TRY_MAX] ;
		}
		public TipsPegsLine[] getKeyPegsLines() {
			return tipsPegsLines;
		}

		public void setKeyPegsLinesAt(int turnNumber, TipsPegsLine keyPegsLine) {
			if (this.getKeyPegsLines() != null) {
				this.getKeyPegsLines()[turnNumber] = keyPegsLine;
			}
		}
		
		public void setKeyPegsLines(TipsPegsLine[] keyPegsLines) {
			this.tipsPegsLines = keyPegsLines;
		}
		
		public TipsPegsLine getKeyPegsLines (int rank) {
			return getKeyPegsLines()[rank];
		}

		public ColorPegsLine[] getColorPegsLines() {
			return colorPegsLines;
		}

		public void setColorPegsLines(ColorPegsLine[] colorPegsLines) {
			this.colorPegsLines = colorPegsLines;
		}
		
		public ColorPegsLine getColors(int rank) {
			return getColorPegsLines()[rank];
		}
		
		// Return the color
		public boolean isWhiteAt(int line, int slot) {
			return getKeyPegsLines()[line].isWhiteAt(slot);
		}
}