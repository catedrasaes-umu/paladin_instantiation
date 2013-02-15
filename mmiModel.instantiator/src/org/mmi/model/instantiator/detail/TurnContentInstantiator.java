package org.mmi.model.instantiator.detail;

import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for turn content information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class TurnContentInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public TurnContentInstantiator(InstantiationContext c) {
		super(c);
	}

	/**
	 * to set elements
	 * @param n elements
	 */
	public void setElements(int n){
		icontext_.cturn.setElements(n);
	}

	/**
	 * to add new elements
	 * @param n elements
	 */
	public void addElements(int n){
		icontext_.cturn.setElements(icontext_.cturn.getElements() + n);
	}

	/**
	 * to set feedback elements
	 * @param n elements
	 */
	public void setFeedbacks(int n){
		icontext_.cturn.setFeedback(n);
	}

	/**
	 * to add new feedback elements
	 * @param n elements
	 */
	public void addFeedback(int n){
		icontext_.cturn.setFeedback(icontext_.cturn.getFeedback() + n);
	}

	/**
	 * to set concepts
	 * @param n concepts
	 */
	public void setConcepts(int n){
		icontext_.cturn.setConcepts(n);
	}

	/**
	 * to add new concepts
	 * @param n concepts
	 */
	public void addConcepts(int n){
		icontext_.cturn.setConcepts(icontext_.cturn.getConcepts() + n);
	}

	/**
	 * to set noise elements
	 * @param n elements
	 */
	public void setNoise(int n){
		icontext_.cturn.setNoise(n);
	}

	/**
	 * to add new noise elements
	 * @param n elements
	 */
	public void addNoise(int n){
		icontext_.cturn.setNoise(icontext_.cturn.getNoise() + n);
	}

	/**
	 * to set number of questions
	 * @param n questions
	 */
	public void setQuestions(int n){
		icontext_.cturn.setQuestions(n);
	}

	/**
	 * to add new questions
	 * @param n questions
	 */
	public void addQuestions(int n){
		icontext_.cturn.setQuestions(icontext_.cturn.getQuestions() + n);
	}

}
