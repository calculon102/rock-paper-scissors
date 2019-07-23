package de.tyntec.rockpaperscissors;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Tests the Rock-Paper-Scissor-Game for the following features:
 * - Results for both players must always be opposite
 * - First Player can win
 * - Second Player can win
 * - Both player can tie
 * - Throws NullPointerExceptions if a given player is null
 * 
 * @author Frank Großgasteiger
 */
public class GameTest {
	@Test
	public void testResultsForBothPlayersAreOpposite() {
		Player firstPlayer = new PlayerA();
		Player secondPlayer = new PlayerB();
		
		Game game = new Game(firstPlayer, secondPlayer);
		assertEquals(game.getResultOfFirstPlayer().getOpposite(), game.getResultOfSecondPlayer());
	}

	@Test
	public void testFirstPlayerCanWin() {
		Player firstPlayer = mock(Player.class);
		when(firstPlayer.nextGesture()).thenReturn(Gesture.ROCK);
		
		Player secondPlayer = mock(Player.class);
		when(secondPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);

		Game game = new Game(firstPlayer, secondPlayer);
		assertEquals(game.getResultOfFirstPlayer(), Result.WIN);
	}

	@Test
	public void testSecondPlayerCanWin() {
		Player firstPlayer = mock(Player.class);
		when(firstPlayer.nextGesture()).thenReturn(Gesture.PAPER);
		
		Player secondPlayer = mock(Player.class);
		when(secondPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);

		Game game = new Game(firstPlayer, secondPlayer);
		assertEquals(game.getResultOfSecondPlayer(), Result.WIN);
	}

	@Test
	public void testPlayersCanTie() {
		Player firstPlayer = mock(Player.class);
		when(firstPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);
		
		Player secondPlayer = mock(Player.class);
		when(secondPlayer.nextGesture()).thenReturn(Gesture.SCISSOR);

		Game game = new Game(firstPlayer, secondPlayer);
		assertEquals(game.getResultOfSecondPlayer(), Result.TIE);
	}
	
	@Test(expected=NullPointerException.class)
	public void testThrowsExceptionIfFirstPlayerIsNull() {
		Player firstPlayer = null;
		Player secondPlayer = new PlayerB();
		
		new Game(firstPlayer, secondPlayer);
	}

	@Test(expected=NullPointerException.class)
	public void testThrowsExceptionIfSecondPlayerIsNull() {
		Player firstPlayer = new PlayerA();
		Player secondPlayer = null;
		
		new Game(firstPlayer, secondPlayer);
	}
}
