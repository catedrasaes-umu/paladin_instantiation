package org.mmi.model.instantiator.detail;

import org.mmi.model.PromptTypeT;
import org.mmi.model.SpeechOutput;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for speech output information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class SpeechOutputInstantiator extends InstantiatorBase {

	/**
	 * constructor
	 * @param c instantiation context
	 */
	public SpeechOutputInstantiator(InstantiationContext c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	private SpeechOutput _soutput(){
		return icontext_.sturn.getSpeechOutput();
	}
	
	///
	///

	/**
	 * to set correct answers number
	 * @param n number of answers
	 */
	public void setCorrectAnswers(int n){
		_soutput().setANCO(n);
	}

	/**
	 * to add new correct answers
	 * @param n
	 */
	public void addCorrectAnswers(int n){
		_soutput().setANCO(_soutput().getANCO() + n);
	}

	/**
	 * to set correct answers number
	 * @param n number of answers
	 */
	public void setIncorrectAnswers(int n){
		_soutput().setANIN(n);
	}

	/**
	 * to add new correct answers
	 * @param n number of answers
	 */
	public void addIncorrectAnswers(int n){
		_soutput().setANIN(_soutput().getANIN() + n);
	}

	/**
	 * to set partially correct answers number
	 * @param n number of answers
	 */
	public void setPartiallyCorrectAnswers(int n){
		_soutput().setANPA(n);
	}

	/**
	 * to add new partially correct answers
	 * @param n number of answers
	 */
	public void addPartiallyCorrectAnswers(int n){
		_soutput().setANPA(_soutput().getANPA() + n);
	}

	/**
	 * to set no-answers number
	 * @param n number of answers
	 */
	public void setNoAnswers(int n){
		_soutput().setANFA(n);
	}

	/**
	 * to add new no_answers
	 * @param n number of answers
	 */
	public void addNoAnswers(int n){
		_soutput().setANFA(_soutput().getANFA() + n);
	}

	/**
	 * to set the type of the prompt
	 * @param t prompt type
	 */
	public void setPromptType(PromptTypeT t){
		_soutput().setPromptType(t);
	}
}
