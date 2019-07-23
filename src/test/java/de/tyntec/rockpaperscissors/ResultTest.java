package de.tyntec.rockpaperscissors;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the result-opposites.
 * 
 * @author Frank Groﬂgasteiger
 */
public class ResultTest {
	@Test
	public void testOppositeOfWinIsLose() {
		assertEquals(Result.WIN.getOpposite(), Result.LOSE);
	}
	
	@Test
	public void testOppositeOfLoseIsWin() {
		assertEquals(Result.LOSE.getOpposite(), Result.WIN);
	}
	
	@Test
	public void testOppositeOfTieIsTie() {
		assertEquals(Result.TIE.getOpposite(), Result.TIE);
	}
}
