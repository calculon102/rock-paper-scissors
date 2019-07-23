package de.tyntec.rockpaperscissors;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Only tests the behaviour of Player A: He always holds the paper.
 * 
 * @author Frank Großgasteiger
 */
public class PlayerATest {
	@Test
	public void testAlwaysHoldsPaper() {
		Player player = new PlayerA();
	
		// Should fail at some point, if the Player decides not to hold Paper
		for (int i = 0; i < 1000; i++) {
			assertEquals(player.nextGesture(), Gesture.PAPER);
		}
	}
}
