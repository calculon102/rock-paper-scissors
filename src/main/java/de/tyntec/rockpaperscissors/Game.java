package de.tyntec.rockpaperscissors;

/**
 * Plays a game of Rock-Paper-Scissors and stores the result. 
 * The result of the game is immediately determined, when the object
 * is created with the two players as parameters. After that, the object becomes
 * immutable, according to same-called pattern.
 * 
 * The players themselves are not stored, but only the result of the comparison
 * of their next gestures.
 * 
 * @author Frank Großgasteiger
 */
final class Game {
	private final Result resultOfFirstPlayer;
	
	/**
	 * Initialises (and plays) the game immediately.
	 * @param firstPlayer The first Rock-Paper-Scissors-Player
	 * @param secondPlayer The second Rock-Paper-Scissors-Player
	 * @throws NullPointerException if one of the parameters is null. This must not be!
	 */
	public Game(final Player firstPlayer, final Player secondPlayer) {
		if (firstPlayer == null || secondPlayer == null) {
			throw new NullPointerException("Parameters must not be null!");
		}
		this.resultOfFirstPlayer = firstPlayer.nextGesture().holdAgainst(secondPlayer.nextGesture());
	}
	
	/**
	 * Returns the result of the game for the first player.
	 * @return The Result (Result-type) of the first player in this game.
	 */
	public Result getResultOfFirstPlayer() {
		return this.resultOfFirstPlayer;
	}
	
	/**
	 * Returns the result of the game for the second player.
	 * Usually the opposite of the first ones result.
	 * @return The Result (Result-type) of the second player in this game.
	 */
	public Result getResultOfSecondPlayer() {
		return this.resultOfFirstPlayer.getOpposite();
	}
}
