package com.mastermind;

import java.util.logging.Logger;

public class MainStarter {
	
	public static void main(String[] args) {

		Logger logger = MastermindLogger.getInstance();
	    
		logger.info("Mastermind Robot is starting...");
	
		// Choose a Strategy
//		MasterMindStrategy strategy = new HumanStrategy();
		MastermindStrategy strategy = new RandomDumbStrategy();

		GamePlay gamePlay = new GamePlay ();
		
		gamePlay.start(strategy);
		
		ColorPegsLine aPegsLine = new ColorPegsLine();
		
		while (gamePlay.isCombinationNotFound() && gamePlay.getNumberOfTry() <MasterMindGameConstants.NUMBER_OF_TRY_MAX) {
		    aPegsLine = strategy.getNextPegsLine();
			gamePlay.play(aPegsLine);
			logger.info("Number of try :" + gamePlay.getNumberOfTry());
		}
		if (gamePlay.isCombinationNotFound()) {
			logger.info("Combination NOT found!");		
		} else {
			logger.info("Combination FOUND !");		
			logger.info(aPegsLine.getColorsAsString());
		}
		
		logger.info("Mastermind Robot is stopping.");
		
	}

}
