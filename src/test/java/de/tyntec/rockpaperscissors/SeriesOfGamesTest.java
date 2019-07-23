package de.tyntec.rockpaperscissors;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Tests mainly the exceptions for the class.
 * 
 * @author Frank Groﬂgasteiger
 */
public class SeriesOfGamesTest {
	@Test(expected=NullPointerException.class)
	public void testThrowsExceptionIfFirstPlayerIsNull() {
		Player firstPlayer = null;
		
		Player secondPlayer = mock(Player.class);
		when(secondPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);
		
		new SeriesOfGames(firstPlayer, secondPlayer, 100);
	}

	@Test(expected=NullPointerException.class)
	public void testThrowsExceptionIfSecondPlayerIsNull() {
		Player firstPlayer = mock(Player.class);
		when(firstPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);
		
		Player secondPlayer = null;
		
		new SeriesOfGames(firstPlayer, secondPlayer, 100);
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowsExceptionIfCountOfGamesIsNotGreaterThanZero() {
		Player firstPlayer = mock(Player.class);
		when(firstPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);

		Player secondPlayer = mock(Player.class);
		when(secondPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);
		
		new SeriesOfGames(firstPlayer, secondPlayer, 0);
	}
}
