package de.tyntec.rockpaperscissors;

/**
 * Plays a series of games and is able to print the results to the console.
 * Computes the results during initialization and is immutable after that
 * (to the according pattern, to avoid state-checking hassle).
 * 
 * @author Frank Groﬂgasteiger
 */
final class SeriesOfGames {
	private final static String WIN_LINE = "%s wins %d of %d games";
	private final static String TIE_LINE = "Tie: %d of %d games";
	
	private final Player firstPlayer;
	private final Player secondPlayer;
	private final int countOfGames;
	
	private int winsOfFirstPlayer = 0;
	private int winsOfSecondPlayer = 0;
	private int ties = 0;
	
	/**
	 * Default-constructor. Immediatelly computes the results of the Rock-Paper-Scissors games
	 * with the given players and count of games.
	 * @param firstPlayer The first player of the Rock-Paper-Scissor-Games (must not be null!)
	 * @param secondPlayer The secomd player of the Rock-Paper-Scissor-Games (must not be null!)
	 * @param countOfGames The count of games to play Rock-Paper-Scissors (muste be greater than 0)
	 * @throws NullPointerException If one of the player-object is null
	 * @throws IllegalArgumentException If countOfGames is not greater than 0
	 */
	public SeriesOfGames(final Player firstPlayer, final Player secondPlayer, final int countOfGames) {
		if (firstPlayer == null || secondPlayer == null) {
			throw new NullPointerException("Both players must not be null!");
		}
		if (countOfGames < 1) {
			throw new IllegalArgumentException("Must play at least one game!");
		}
		
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		this.countOfGames = countOfGames;
		
		for (int gameIndex = 0; gameIndex < countOfGames; gameIndex++) {
			Game game = new Game(firstPlayer, secondPlayer);
			if (game.getResultOfFirstPlayer() == Result.WIN) {
				this.winsOfFirstPlayer += 1;
				continue;
			}
			if (game.getResultOfSecondPlayer() == Result.WIN) {
				this.winsOfSecondPlayer += 1;
				continue;
			}
			ties += 1;
		}
	}
	
	
	/**
	 * Print the results to the screen, according to the tyntec-task
	 */
	public void printResults() {
		System.out.println(String.format(WIN_LINE, firstPlayer, winsOfFirstPlayer, countOfGames));
		System.out.println(String.format(WIN_LINE, secondPlayer, winsOfSecondPlayer, countOfGames));
		System.out.println(String.format(TIE_LINE, ties, countOfGames));
	}
}
