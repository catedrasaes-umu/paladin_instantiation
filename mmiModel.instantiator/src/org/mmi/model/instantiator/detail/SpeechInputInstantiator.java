package org.mmi.model.instantiator.detail;

import org.mmi.model.ParsingResultT;
import org.mmi.model.SpeechInput;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for speech input information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class SpeechInputInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public SpeechInputInstantiator(InstantiationContext c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	private SpeechInput _sinput(){
		return icontext_.uturn.getSpeechInput();
	}
	
	///
	///
	
	/**
	 * to set overall words
	 * @param n words
	 */
	public void setOverallWords(int n){
		_sinput().setOverallWords(n);
	}
	
	/**
	 * to set substituted words  
	 * @param n words
	 */
	public void setSubstitutedWords(int n){
		_sinput().setSubstitutedWords(n);
	}
	
	/**
	 * to set deleted words 
	 * @param n words
	 */
	public void setDeletedWords(int n){
		_sinput().setDeletedWords(n);
	}
	
	/**
	 * to set inserted words  
	 * @param n words
	 */
	public void setInsertedWords(int n){
		_sinput().setInsertedWords(n);
	}
	
	///
	///
	
	/**
	 * to set overall sentences
	 * @param n sentences
	 */
	public void setOverallSentences(int n){
		_sinput().setOverallSentences(n);
	}
	
	/**
	 * to set substituted sentences  
	 * @param n sentences
	 */
	public void setSubstitutedSentences(int n){
		_sinput().setSubstitutedSentences(n);
	}
	
	/**
	 * to set deleted sentences  
	 * @param n sentences
	 */
	public void setDeletedSentences(int n){
		_sinput().setDeletedSentences(n);
	}
	
	/**
	 * to set inserted sentences  
	 * @param n sentences
	 */
	public void setInsertedSentences(int n){
		_sinput().setInsertedSentences(n);
	}
	
	///
	///
	
	/**
	 * to set overall concepts
	 * @param n concepts
	 */
	public void setOverallConcepts(int n){
		_sinput().setOverallConcepts(n);
	}
	
	/**
	 * to set substituted concepts  
	 * @param n concepts
	 */
	public void setSubstitutedConcepts(int n){
		_sinput().setSubstitutedConcepts(n);
	}
	
	/**
	 * to set deleted concepts  
	 * @param n concepts
	 */
	public void setDeletedConcepts(int n){
		_sinput().setDeletedConcepts(n);
	}
	
	/**
	 * to set inserted concepts  
	 * @param n concepts
	 */
	public void setInsertedConcepts(int n){
		_sinput().setInsertedConcepts(n);
	}
	
	/**
	 * to set parsing results
	 * @param r parsing result
	 */
	public void setParsingResult(ParsingResultT r){
		_sinput().setParsingResult(r);
	}
}
