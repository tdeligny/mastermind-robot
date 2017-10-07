package com.mastermind;

public class ColorPegsLine {
	
		private int[] colors;

		public int[] getColors() {
			return colors;
		}

		public void setColors(int[] colors) {
			this.colors = colors;
		}
		
		public void setColorAtRange(int i, int color) {
			colors[i] = color;
		}
		
		public ColorPegsLine () {
			colors = new int[MasterMindGameConstants.NUMBER_OF_SLOTS];
		}
		
		public String getColorsAsString() {
			StringBuilder s = new StringBuilder();
			for (int slotIndex = 0; slotIndex < MasterMindGameConstants.NUMBER_OF_SLOTS ; slotIndex++) {
				s.append(getColorName(slotIndex));
				s.append(" ");
			}
			return s.toString();
		}
		
		// TODO Unit Test
		public String getColorName (int rank)  {
			return CodeColors.getName(getColors()[rank]);
		}
}