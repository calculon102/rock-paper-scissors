package de.tyntec.rockpaperscissors;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test the method holdAgainst for all common rules of Rock-Paper-Scissors
 * 
 * @author Frank Groﬂgasteiger
 */
public class GestureTest {
	@Test
	public void testRockTiesAgainstRock() {
		assertEquals(Gesture.ROCK.holdAgainst(Gesture.ROCK), Result.TIE);
	}

	@Test
	public void testRockLosesAgainstPaper() {
		assertEquals(Gesture.ROCK.holdAgainst(Gesture.PAPER), Result.LOSE);
	}

	@Test
	public void testRockWinsAgainstScissor() {
		assertEquals(Gesture.ROCK.holdAgainst(Gesture.SCISSOR), Result.WIN);
	}

	@Test
	public void testPaperWinsAgainstRock() {
		assertEquals(Gesture.PAPER.holdAgainst(Gesture.ROCK), Result.WIN);
	}

	@Test
	public void testPaperTiesAgainstPaper() {
		assertEquals(Gesture.PAPER.holdAgainst(Gesture.PAPER), Result.TIE);
	}

	@Test
	public void testPaperLosesAgainstScissor() {
		assertEquals(Gesture.PAPER.holdAgainst(Gesture.SCISSOR), Result.LOSE);
	}

	@Test
	public void testScissorLosesAgainstRock() {
		assertEquals(Gesture.SCISSOR.holdAgainst(Gesture.ROCK), Result.LOSE);
	}

	@Test
	public void testScissorWinsAgainstPaper() {
		assertEquals(Gesture.SCISSOR.holdAgainst(Gesture.PAPER), Result.WIN);
	}

	@Test
	public void testScissorTiesAgainstScissor() {
		assertEquals(Gesture.SCISSOR.holdAgainst(Gesture.SCISSOR), Result.TIE);
	}
	
	@Test(expected=NullPointerException.class)
	public void testThowsExceptionIfholdAgainstGestureIsNull() {
		Gesture.ROCK.holdAgainst(null);
	}
}
