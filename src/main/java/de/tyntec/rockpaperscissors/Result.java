package de.tyntec.rockpaperscissors;

/**
 * Most simple enum for our Rock-Paper-Scissor-Games
 * 
 * @author Frank Großgasteiger
 */
enum Result {
	WIN, TIE, LOSE;
	
	/**
	 * Returns the opposite of this result for convinience
	 * @return The opposite of the Result (WIN => LOSE, LOSE => WIN, TIE => TIE)
	 */
	public Result getOpposite() {
		if (this == WIN) {
			return LOSE;
		}
		if (this == LOSE) {
			return WIN;
		}
		
		return TIE;
	}
}
