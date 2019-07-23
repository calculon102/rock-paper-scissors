package de.tyntec.rockpaperscissors;

/**
 * Interface for a Rock-Paper-Scissors-Player. Must be able to hold a gesture (at least ;-)).
 * 
 * @author Frank Großgasteiger
 */
interface Player {
	
	/**
	 * Hold a gesture according to the strategy of the implementator
	 * @return A Rock-Paper-Scissors-Gesture (Gesture-type)
	 */
	public Gesture nextGesture();
}
