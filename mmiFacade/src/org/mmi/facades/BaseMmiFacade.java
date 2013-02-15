package org.mmi.facades;

import org.mmi.model.PromptTypeT;

/**
 * Facade base interface to connect the Android Intrumentation Framework
 * with other projects.
 * 
 * @author mateo-navarro.pedro
 *
 */
public interface BaseMmiFacade {

	///
	/// ////////////////////////////////////////////
	///
	/// application timing methods
	///
	/// ////////////////////////////////////////////
	///

	///
	/// dialogue
	///

	/**
	 * Method called to notify interaction start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void interactionStarts(long ms);

	/**
	 * Method called to notify interaction end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void interactionEnds(long ms);

	///
	/// system turn
	///

	/**
	 * Method called to notify system turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void systemTurnStarts(long ms);

	/**
	 * Method called to notify system feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void systemFeedbackStarts(long ms);

	/**
	 * Method called to notify system action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void systemActionStarts(long ms);

	/**
	 * Method called to notify system action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void systemActionEnds(long ms);

	/**
	 * Method called to notify system turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void systemTurnEnds(long ms);

	///
	/// user turn
	///

	/**
	 * Method called to notify user turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void userTurnStarts(long ms);

	/**
	 * Method called to notify user feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void userFeedbackStarts(long ms);

	/**
	 * Method called to notify user action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void userActionStarts(long ms);

	/**
	 * Method called to notify user action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void userActionEnds(long ms);

	/**
	 * Method called to notify user turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public abstract void userTurnEnds(long ms);


	///
	/// ////////////////////////////////////////////
	///
	/// gui input methods
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * This method should be called on touch event
	 * @param ms timestamp
	 */
	public abstract void touch(long ms);

	/**
	 * This method should be called on click event
	 * @param ms timestamp
	 */
	public abstract void click(long ms);

	/**
	 * This method should be called on scroll event
	 * @param ms timestamp
	 */
	public abstract void scroll(long ms);

	/**
	 * This method should be called on key-text (e.g. the "a"
	 * character) event
	 * @param ms timestamp
	 */
	public abstract void keytext(long ms);

	/**
	 * This method should be called on key-command (e.g. the
	 * "return" key) event
	 * @param ms timestamp
	 */
	public abstract void keycommand(long ms);

	/**
	 * This method should be called on key-explore (e.g. down
	 * arrow) event
	 * @param ms timestamp
	 */
	public abstract void keyexplore(long ms);

	///
	/// ////////////////////////////////////////////
	///
	/// speech input methods
	///
	/// ////////////////////////////////////////////
	///


	/// words

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void overallWords(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void substitutedWords(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void deletedWords(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void insertedWords(long ms, int n);

	/// sentences

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void overallSentences(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void substitutedSentences(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void deletedSentences(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void insertedSentences(long ms, int n);

	/// concepts

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void overallConcepts(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void substitutedConcepts(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void deletedConcepts(long ms, int n);

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public abstract void insertedConcepts(long ms, int n);

	///
	/// parsing results
	///

	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public abstract void correctlyParsedUtterance(long ms);

	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public abstract void partiallyParsedUtterance(long ms);

	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public abstract void incorrectlyParsedUtterance(long ms);

	///
	/// ////////////////////////////////////////////
	///
	/// gui output
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newGuiElements(long ms, int n);

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newGuiFeedback(long ms, int n);

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newGuiNoise(long ms, int n);

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newGuiQuestions(long ms, int n);

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newGuiConcepts(long ms, int n);



	///
	/// ////////////////////////////////////////////
	///
	/// speech output
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newSpeechElements(long ms, int n);

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newSpeechFeedback(long ms, int n);

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newSpeechNoise(long ms, int n);

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newSpeechQuestions(long ms, int n);

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public abstract void newSpeechConcepts(long ms, int n);
	
	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param type Type of the prompt (classification of the spoken system utterance).
	 */
	public abstract void newSpeechPromptType(long ms, PromptTypeT type);

	///
	/// ////////////////////////////////////////////
	///
	/// metacomm
	///
	/// ////////////////////////////////////////////
	///

	///
	/// general
	///

	/**
	 * Method called when metacommunication data is
	 * collected. This one is called when a help turn.
	 * @param ms timestamp
	 */
	public abstract void isHelpTurn(long ms);

	/**
	 * Method called when metacommunication data is
	 * collected. This one is called when a correction turn.
	 * @param ms timestamp
	 */
	public abstract void isCorrectionTurn(long ms);

	///
	/// system
	///

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when an ASR rejection.
	 * @param ms timestamp
	 */
	public abstract void isASRRejection(long ms);

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a DIV rejection.
	 * @param ms timestamp
	 */
	public abstract void isDIVRejection(long ms);

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a GR rejection.
	 * @param ms timestamp
	 */
	public abstract void isGRRejection(long ms);

	///
	/// user
	///

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a timeout.
	 * @param ms timestamp
	 */
	public abstract void isTimeout(long ms);

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a cancel intent.
	 * @param ms timestamp
	 */
	public abstract void isCancel(long ms);

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a restart intent.
	 * @param ms timestamp
	 */
	public abstract void isRestart(long ms);

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a bargein.
	 * @param ms timestamp
	 * @param success result of bargein
	 */
	public abstract void isBargein(long ms, boolean success);
}
