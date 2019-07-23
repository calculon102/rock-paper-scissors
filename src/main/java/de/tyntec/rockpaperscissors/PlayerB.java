package de.tyntec.rockpaperscissors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The Rock-Paper-Scissors-Player type B.
 * According to the task: Choose a gesture randomly.
 * 
 * @author Frank Großgasteiger
 */
final class PlayerB implements Player {
	/**
	 * Cashes all possible enumeration-values of Gesture in a static List.
	 * This way, I avoid depending on the specific size and order of the {@link Gesture}.
	 * In the (unrealistic) case, the {@link Gesture} may be altered/expanded, I don't have
	 * to alter this Player-implementation anymore.
	 * May be over-engineered a bit. ;-)
	 */
	private static final List<Gesture> VALUES = Collections.unmodifiableList(Arrays.asList(Gesture.values()));
	private static final Random RANDOM = new Random();
	
	public Gesture nextGesture() {
		return VALUES.get(RANDOM.nextInt(VALUES.size()));
	}

	@Override
	public String toString() {
		return "Player B";
	}
}
