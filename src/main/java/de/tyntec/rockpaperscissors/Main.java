package de.tyntec.rockpaperscissors;

/**
 * Holder of the main-method. Just there to finally complete the task.
 * 
 * @author Frank Großgasteiger
 */
public final class Main {
	/**
	 * @param args Console-Arguments
	 */
	public static void main(String[] args) {
		SeriesOfGames seriesOfRockPaperScissors = new SeriesOfGames(new PlayerA(), new PlayerB(), 100);
		seriesOfRockPaperScissors.printResults();
	}
}
