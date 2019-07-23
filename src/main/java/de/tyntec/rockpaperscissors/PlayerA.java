package de.tyntec.rockpaperscissors;

/**
 * The Rock-Paper-Scissors-Player type A.
 * According to the task: Always choose paper.
 * 
 * @author Frank Großgasteiger
 */
final class PlayerA implements Player {
	public Gesture nextGesture() {
		return Gesture.PAPER;
	}

	@Override
	public String toString() {
		return "Player A";
	}
}
