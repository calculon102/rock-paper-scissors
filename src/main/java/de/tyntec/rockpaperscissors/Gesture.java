package de.tyntec.rockpaperscissors;

/**
 * The gestures of Rock-Paper-Scissors as an enumeration-type. Already featuring the relations between the gestures.
 * This guarantees type-safety and a meaningful code.
 * E.g. The use of integer-constants wouldn't be so nice. 
 * 
 * @author Frank Großgasteiger
 */
enum Gesture {
	ROCK(Result.TIE, Result.LOSE, Result.WIN),
	PAPER(Result.WIN, Result.TIE, Result.LOSE),
	SCISSOR(Result.LOSE, Result.WIN, Result.TIE);
	
	private final Result againstRock;
	private final Result againstPaper;
	private final Result againstScissor;
	
	/**
	 * Default-constructor for this enumeration-type
	 * @param againstRock The result if this gesture is held against Gesture.ROCK
	 * @param againstPaper The result if this gesture is held against Gesture.PAPER
	 * @param againstScissor The result if this gesture is held against Gesture.SCISSOR
	 */
	private Gesture(final Result againstRock, final Result againstPaper, final Result againstScissor) {
		this.againstRock = againstRock;
		this.againstPaper = againstPaper;
		this.againstScissor = againstScissor;
	}
	
	/**
	 * Hold this gesture against another one and get the result of the corresponding Rock-Paper-Scissors-logic.
	 * @param otherGesture A Gesture-type (must not be null!)
	 * @return The Result (as a Result-type)
	 * @throws NullPointerException If the given Gesture is not ROCK, PAPER or SCISSOR
	 * @throws IllegalArgumentException If the given Gesture is not ROCK, PAPER or SCISSOR
	 */
	public Result holdAgainst(final Gesture otherGesture) {
		if (otherGesture == null) {
			throw new NullPointerException("otherGesture must not be null!");
		}
		
		switch (otherGesture) {
			case ROCK:
				return this.againstRock;
				
			case PAPER:
				return this.againstPaper;
				
			case SCISSOR:
				return this.againstScissor;
			
			default:
				// Should be untestable (compilation error)
				throw new IllegalArgumentException("Not ROCK, nor PAPER, nor SCISSOR? Hwo did you make it this far?");
		}
	}
}
