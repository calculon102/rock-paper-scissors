package de.tyntec.rockpaperscissors;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The random behaviour lets us only test, if the result is always a valid enum value.
 * 
 * @author Frank Groﬂgasteiger
 */
public class PlayerBTest {
	@Test
	public void testAlwaysHoldsAValidGesture() {
		Player player = new PlayerB();
	
		// Should fail at some point, if the Player decides not to hold a valid gesture
		for (int i = 0; i < 1000; i++) {
			Gesture currentGesture = player.nextGesture();
			assertTrue((currentGesture == Gesture.ROCK) || (currentGesture == Gesture.PAPER) || (currentGesture == Gesture.SCISSOR));
		}
	}
}
