package org.mmi.facades;

import org.mmi.model.PromptTypeT;


/**
 * Empty multimodal interaction facade.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class YourFacade implements BaseMmiFacade {

	/**
	 * Constructor
	 */
	public YourFacade() {
		//TODO
	}


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
	public void interactionStarts(long ms){
		//TODO
		System.out.println("interactionStarts");
	}

	/**
	 * Method called to notify interaction end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void interactionEnds(long ms){
		//TODO
		System.out.println("interactionEnds");
	}
	
	///
	/// system turn
	///
	
	/**
	 * Method called to notify system turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemTurnStarts(long ms){
		//TODO
		System.out.println("systemTurnStarts");
	}
	
	/**
	 * Method called to notify system feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemFeedbackStarts(long ms){
		//TODO
		System.out.println("systemFeedbackStarts");
	}
	
	/**
	 * Method called to notify system action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemActionStarts(long ms){
		//TODO
		System.out.println("systemActionStarts");
	}
	
	/**
	 * Method called to notify system action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemActionEnds(long ms){
		//TODO
		System.out.println("systemActionEnds");
	}
	
	/**
	 * Method called to notify system turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemTurnEnds(long ms){
		//TODO
		System.out.println("systemTurnEnds");
	}
	
	///
	/// user turn
	///
	
	/**
	 * Method called to notify user turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userTurnStarts(long ms){
		//TODO
		System.out.println("userTurnStarts");
	}
	
	/**
	 * Method called to notify user feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userFeedbackStarts(long ms){
		//TODO
		System.out.println("userFeedbackStarts");
	}
	
	/**
	 * Method called to notify user action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userActionStarts(long ms){
		//TODO
		System.out.println("userActionStarts");
	}
	
	/**
	 * Method called to notify user action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userActionEnds(long ms){
		//TODO
		System.out.println("userActionEnds");
	}
	
	/**
	 * Method called to notify user turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userTurnEnds(long ms){
		//TODO
		System.out.println("userTurnEnds");
	}
	

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
	public void touch(long ms){
		//TODO
		System.out.println("touch");
	}

	/**
	 * This method should be called on click event
	 * @param ms timestamp
	 */
	public void click(long ms){
		//TODO
		System.out.println("click");
	}

	/**
	 * This method should be called on scroll event
	 * @param ms timestamp
	 */
	public void scroll(long ms){
		//TODO
		System.out.println("scroll");
	}

	/**
	 * This method should be called on key-text (e.g. the "a"
	 * character) event
	 * @param ms timestamp
	 */
	public void keytext(long ms){
		//TODO
		System.out.println("keytext");
	}

	/**
	 * This method should be called on key-command (e.g. the
	 * "return" key) event
	 * @param ms timestamp
	 */
	public void keycommand(long ms){
		//TODO
		System.out.println("keycommand");
	}

	/**
	 * This method should be called on key-explore (e.g. down
	 * arrow) event
	 * @param ms timestamp
	 */
	public void keyexplore(long ms){
		//TODO
		System.out.println("keyexplore");
	}

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
	public void overallWords(long ms, int n){
		//TODO
		System.out.println("overallWords");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedWords(long ms, int n){
		//TODO
		System.out.println("substitutedWords");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedWords(long ms, int n){
		//TODO
		System.out.println("deletedWords");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedWords(long ms, int n){
		//TODO
		System.out.println("insertedWords");
	}

	/// sentences

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallSentences(long ms, int n){
		//TODO
		System.out.println("overallSentences");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedSentences(long ms, int n){
		//TODO
		System.out.println("substitutedSentences");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedSentences(long ms, int n){
		//TODO
		System.out.println("deletedSentences");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedSentences(long ms, int n){
		//TODO
		System.out.println("insertedSentences");
	}

	/// concepts

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallConcepts(long ms, int n){
		//TODO
		System.out.println("overallConcepts");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedConcepts(long ms, int n){
		//TODO
		System.out.println("substitutedConcepts");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedConcepts(long ms, int n){
		//TODO
		System.out.println("deletedConcepts");
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedConcepts(long ms, int n){
		//TODO
		System.out.println("insertedConcepts");
	}
	
	///
	/// parsing results
	///
	
	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void correctlyParsedUtterance(long ms){
		//TODO
		System.out.println("correctlyParsedUtterance");
	}
	
	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void partiallyParsedUtterance(long ms){
		//TODO
		System.out.println("partiallyParsedUtterance");
	}
	
	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void incorrectlyParsedUtterance(long ms){
		//TODO
		System.out.println("incorrectlyParsedUtterance");
	}

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
	public void newGuiElements(long ms, int n){
		//TODO
		System.out.println("newGuiElements");
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiFeedback(long ms, int n){
		//TODO
		System.out.println("newGuiFeedback");
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiNoise(long ms, int n){
		//TODO
		System.out.println("newGuiNoise");
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiQuestions(long ms, int n){
		//TODO
		System.out.println("newGuiQuestions");
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiConcepts(long ms, int n){
		//TODO
		System.out.println("newGuiConcepts");
	}

	
	
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
	public void newSpeechElements(long ms, int n){
		//TODO
		System.out.println("newSpeechElements");
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechFeedback(long ms, int n){
		//TODO
		System.out.println("newSpeechFeedback");
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechNoise(long ms, int n){
		//TODO
		System.out.println("newSpeechNoise");
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechQuestions(long ms, int n){
		//TODO
		System.out.println("newSpeechQuestions");
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechConcepts(long ms, int n){
		//TODO
		System.out.println("newSpeechConcepts");
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.mmi.facades.BaseMmiFacade#newSpeechPromptType(long, org.mmi.model.PromptTypeT)
	 */
	@Override
	public void newSpeechPromptType(long ms, PromptTypeT type) {
		
		//TODO
		System.out.println("newSpeechPromptType");
	}

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
	public void isHelpTurn(long ms){
		//TODO
		System.out.println("isHelpTurn");
	}

	/**
	 * Method called when metacommunication data is
	 * collected. This one is called when a correction turn.
	 * @param ms timestamp
	 */
	public void isCorrectionTurn(long ms){
		//TODO
		System.out.println("isCorrectionTurn");
	}

	///
	/// system
	///

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when an ASR rejection.
	 * @param ms timestamp
	 */
	public void isASRRejection(long ms){
		//TODO
		System.out.println("isASRRejection");
	}

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a DIV rejection.
	 * @param ms timestamp
	 */
	public void isDIVRejection(long ms){
		//TODO
		System.out.println("isDIVRejection");
	}

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a GR rejection.
	 * @param ms timestamp
	 */
	public void isGRRejection(long ms){
		//TODO
		System.out.println("isGRRejection");
	}

	///
	/// user
	///

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a timeout.
	 * @param ms timestamp
	 */
	public void isTimeout(long ms){
		//TODO
		System.out.println("isTimeout");
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a cancel intent.
	 * @param ms timestamp
	 */
	public void isCancel(long ms){
		//TODO
		System.out.println("isCancel");
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a restart intent.
	 * @param ms timestamp
	 */
	public void isRestart(long ms){
		//TODO
		System.out.println("isRestart");
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a bargein.
	 * @param ms timestamp
	 * @param success result of bargein
	 */
	public void isBargein(long ms, boolean success){
		//TODO
		System.out.println("isBargein");
	}
}

