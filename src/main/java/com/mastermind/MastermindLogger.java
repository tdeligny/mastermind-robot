package com.mastermind;

import java.util.logging.Logger;

public class MastermindLogger {
	
	private static Logger currentLogger ;
	
	/** return Singleton instance of Logger for the whole application */
	
	public static synchronized Logger getInstance() {
		if (currentLogger == null) {
			currentLogger = Logger.getLogger("MASTERMIND-ROBOT");
		}
		return currentLogger;
	}
}
