package org.mmi.facades;


import org.mmi.events.Event;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.metacomm.MetacommListener;
import org.mmi.events.listeners.modalitycontrol.ModalityUsageListener;
import org.mmi.events.listeners.systemoutput.OutputContentListener;
import org.mmi.events.listeners.systemoutput.SpeechOutputListener;
import org.mmi.events.listeners.timing.PreTurnTimingListener;
import org.mmi.events.listeners.timing.TurnTimingListener;
import org.mmi.events.listeners.userinput.ExploringTransferringListener;
import org.mmi.events.listeners.userinput.GuiNavigationAbstractorListener;
import org.mmi.events.listeners.userinput.GuiTextAbstractorListener;
import org.mmi.events.listeners.userinput.NavigationTextMetricsListener;
import org.mmi.events.listeners.userinput.SpeechInputListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.Dialogue;
import org.mmi.model.DocumentRoot;
import org.mmi.model.PromptTypeT;
import org.mmi.model.instantiator.MmiModelInstantiator;


/**
 * Facade class to ease the use of the Multimodal Interaction Model
 * and the integration framework.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class MmiFacade implements BaseMmiFacade {
	
	/**
	 * The model instantiator
	 */
	MmiModelInstantiator minst_;
	
	/**
	 * The event factory
	 */
	EventFactory efact_;
	
	/**
	 * The event pool
	 */
	EventPool epool_;

	/**
	 * Constructor
	 * @param mi the model instantiator
	 * @param ef the event factory
	 * @param ep the event pool
	 */
	public MmiFacade(MmiModelInstantiator mi, EventFactory ef, EventPool ep) {
		minst_ = mi;
		efact_ = ef;
		epool_ = ep;
	}

	/**
	 * Creates a default facade object. It configures the log, creates
	 * the needed classes and creates a default configuration of
	 * interaction listeners for the pool.
	 * 
	 * @return the facade object
	 */
	public static MmiFacade createMmiFacade() {
		
		///create main classes
		MmiModelInstantiator instantiator = new MmiModelInstantiator();
		EventFactory factory = new EventFactory();
		EventPool pool = new EventPool();

		///timing
		//L1
		PreTurnTimingListener gttl = new PreTurnTimingListener(pool, factory, instantiator);
		pool.addListener(gttl.registerTypes(), gttl);
		//L2
		TurnTimingListener turnl = new TurnTimingListener(pool, factory, instantiator);
		pool.addListener(turnl.registerTypes(), turnl);

		///metacomm
		//L1
		MetacommListener mcl = new MetacommListener(pool, factory, instantiator);
		pool.addListener(mcl.registerTypes(), mcl);
		
		///modality
		//L1
		ModalityUsageListener mul = new ModalityUsageListener(pool, factory, instantiator);
		pool.addListener(mul.registerTypes(), mul);

		///GUI input
		//L0
		GuiNavigationAbstractorListener gnavl = new GuiNavigationAbstractorListener(pool, factory, instantiator);
		pool.addListener(gnavl.registerTypes(), gnavl);
		GuiTextAbstractorListener gtextl = new GuiTextAbstractorListener(pool, factory, instantiator);
		pool.addListener(gtextl.registerTypes(), gtextl);
		//L1
		NavigationTextMetricsListener ntml = new NavigationTextMetricsListener(pool, factory, instantiator);
		pool.addListener(ntml.registerTypes(), ntml);
		ExploringTransferringListener extl = new ExploringTransferringListener(pool, factory, instantiator);
		pool.addListener(extl.registerTypes(), extl);

		///Speech input
		//L1
		SpeechInputListener sinl = new SpeechInputListener(pool, factory, instantiator);
		pool.addListener(sinl.registerTypes(), sinl);

		///Speech output
		//L1
		SpeechOutputListener soutl = new SpeechOutputListener(pool, factory, instantiator);
		pool.addListener(soutl.registerTypes(), soutl);

		///System output
		//L2
		OutputContentListener tcl = new OutputContentListener(pool, factory, instantiator);
		pool.addListener(tcl.registerTypes(), tcl);

		return new MmiFacade(instantiator, factory, pool);
	}

	/**
	 * Dumps the current dialogue to a XML file.
	 * @param filename the file name
	 */
	public void saveDialogue(String filename){
		minst_.saveDialogue(filename);
	}
	
	/**
	 * Returns the current --or already recorded-- dialogue instance.
	 * @return the dialogue object
	 */
	public Dialogue getCurrentDialogue(){
		return minst_.icontext_.dialogue;
	}
	
	/**
	 * Returns the current --or already recorded-- document-root
	 * object useful to manage XML features.
	 * @return the document-root object
	 */
	public DocumentRoot getCurrentDocumentRoot(){
		return minst_.icontext_.droot;
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
	public void interactionStarts(long ms) {
		//initialize framework
		efact_.resetTimestamp();

		//create appStart event
		epool_.postEvent(efact_.createAppStartEvent(), ms);
	}

	/**
	 * Method called to notify interaction end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void interactionEnds(long ms) {
		epool_.postEvent(efact_.createAppEndEvent(), ms);
	}
	
	///
	/// system turn
	///
	
	/**
	 * Method called to notify system turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemTurnStarts(long ms){
		epool_.postEvent(efact_.createStartSystemTurnEvent(), ms);
	}
	
	/**
	 * Method called to notify system feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemFeedbackStarts(long ms){
		epool_.postEvent(efact_.createSystemFeedbackStartEvent(), ms);
	}
	
	/**
	 * Method called to notify system action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemActionStarts(long ms){
		epool_.postEvent(efact_.createSystemActionStartEvent(), ms);
	}
	
	/**
	 * Method called to notify system action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemActionEnds(long ms){
		epool_.postEvent(efact_.createSystemActionEndEvent(), ms);
	}
	
	/**
	 * Method called to notify system turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemTurnEnds(long ms){
		epool_.postEvent(efact_.createEndSystemTurnEvent(), ms);
	}
	
	///
	/// user turn
	///
	
	/**
	 * Method called to notify user turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userTurnStarts(long ms){
		epool_.postEvent(efact_.createStartUserTurnEvent(), ms);
	}
	
	/**
	 * Method called to notify user feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userFeedbackStarts(long ms){
		epool_.postEvent(efact_.createUserFeedbackStartEvent(), ms);
	}
	
	/**
	 * Method called to notify user action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userActionStarts(long ms){
		epool_.postEvent(efact_.createUserActionStartEvent(), ms);
	}
	
	/**
	 * Method called to notify user action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userActionEnds(long ms){
		epool_.postEvent(efact_.createUserActionEndEvent(), ms);
	}
	
	/**
	 * Method called to notify user turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userTurnEnds(long ms){
		epool_.postEvent(efact_.createEndUserTurnEvent(), ms);
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
	public void touch(long ms) {
		epool_.postEvent(efact_.createTouchEvent(), ms);
	}

	/**
	 * This method should be called on click event
	 * @param ms timestamp
	 */
	public void click(long ms) {
		epool_.postEvent(efact_.createClickEvent(), ms);
	}

	/**
	 * This method should be called on scroll event
	 * @param ms timestamp
	 */
	public void scroll(long ms) {
		epool_.postEvent(efact_.createScrollEvent(), ms);
	}

	/**
	 * This method should be called on key-text (e.g. the "a"
	 * character) event
	 * @param ms timestamp
	 */
	public void keytext(long ms) {
		epool_.postEvent(efact_.createKeyTextEvent(0), ms);
	}

	/**
	 * This method should be called on key-command (e.g. the
	 * "return" key) event
	 * @param ms timestamp
	 */
	public void keycommand(long ms) {
		epool_.postEvent(efact_.createKeyCommandEvent(0), ms);
	}

	/**
	 * This method should be called on key-explore (e.g. down
	 * arrow) event
	 * @param ms timestamp
	 */
	public void keyexplore(long ms) {
		epool_.postEvent(efact_.createKeyExploreEvent(0), ms);
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
	public void overallWords(long ms, int n) {
		epool_.postEvent(efact_.createOverallWordsEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedWords(long ms, int n) {
		epool_.postEvent(efact_.createSubstitutedWordsEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedWords(long ms, int n) {
		epool_.postEvent(efact_.createDeletedWordsEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedWords(long ms, int n) {
		epool_.postEvent(efact_.createInsertedWordsEvent(n), ms);
	}

	/// sentences

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallSentences(long ms, int n) {
		epool_.postEvent(efact_.createOverallSentencesEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedSentences(long ms, int n) {
		epool_.postEvent(efact_.createSubstitutedSentencesEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedSentences(long ms, int n) {
		epool_.postEvent(efact_.createDeletedSentencesEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedSentences(long ms, int n) {
		epool_.postEvent(efact_.createInsertedSentencesEvent(n), ms);
	}

	/// concepts

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallConcepts(long ms, int n) {
		epool_.postEvent(efact_.createOverallConceptsEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedConcepts(long ms, int n) {
		epool_.postEvent(efact_.createSubstitutedConceptsEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedConcepts(long ms, int n) {
		epool_.postEvent(efact_.createDeletedConceptsEvent(n), ms);
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedConcepts(long ms, int n) {
		epool_.postEvent(efact_.createInsertedConceptsEvent(n), ms);
	}
	
	///
	/// parsing results
	///
	
	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void correctlyParsedUtterance(long ms) {
		epool_.postEvent(efact_.createCorrectlyParsedUtteranceEvent(), ms);
	}
	
	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void partiallyParsedUtterance(long ms) {
		epool_.postEvent(efact_.createPartiallyParsedUtteranceEvent(), ms);
	}
	
	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void incorrectlyParsedUtterance(long ms) {
		epool_.postEvent(efact_.createIncorrectlyParsedUtteranceEvent(), ms);
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
	public void newGuiElements(long ms, int n)  {
		epool_.postEvent(efact_.createGuiElementsEvent(n), ms);
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiFeedback(long ms, int n)  {
		epool_.postEvent(efact_.createGuiFeedbackEvent(n), ms);
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiNoise(long ms, int n)  {
		epool_.postEvent(efact_.createGuiNoiseEvent(n), ms);
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiQuestions(long ms, int n)  {
		epool_.postEvent(efact_.createGuiQuestionsEvent(n), ms);
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiConcepts(long ms, int n)  {
		epool_.postEvent(efact_.createGuiConceptsEvent(n), ms);
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
	public void newSpeechElements(long ms, int n)  {
		epool_.postEvent(efact_.createSpeechElementsEvent(n), ms);
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechFeedback(long ms, int n)  {
		epool_.postEvent(efact_.createSpeechFeedbackEvent(n), ms);
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechNoise(long ms, int n)  {
		epool_.postEvent(efact_.createSpeechNoiseEvent(n), ms);
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechQuestions(long ms, int n)  {
		epool_.postEvent(efact_.createSpeechQuestionsEvent(n), ms);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.mmi.facades.BaseMmiFacade#newSpeechPromptType(long, org.mmi.model.PromptTypeT)
	 */
	@Override
	public void newSpeechPromptType(long ms, PromptTypeT type) {
		
		Event promptEvent = null;
		switch(type) {
			case CLOSED:
				promptEvent = efact_.createClosedPromptEvent();
				break;
			case HALFOPEN:
				promptEvent = efact_.createHalfOpenPromptEvent();
				break;
			case NOQUESTION:
				promptEvent = efact_.createNoQuestionPromptEvent();
				break;
			case OPEN:
				promptEvent = efact_.createOpenPromptEvent();
				break;
			default:
				//do nothing, leave promptEvent null because there is no default type for prompt
				break;
		}
		
		epool_.postEvent(promptEvent, ms);
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechConcepts(long ms, int n)  {
		epool_.postEvent(efact_.createSpeechConceptsEvent(n), ms);
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
	public void isHelpTurn(long ms)  {
		epool_.postEvent(efact_.createHelpTurnEvent(), ms);
	}

	/**
	 * Method called when metacommunication data is
	 * collected. This one is called when a correction turn.
	 * @param ms timestamp
	 */
	public void isCorrectionTurn(long ms)  {
		epool_.postEvent(efact_.createCorrectionTurnEvent(), ms);
	}

	///
	/// system
	///

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when an ASR rejection.
	 * @param ms timestamp
	 */
	public void isASRRejection(long ms)  {
		epool_.postEvent(efact_.createASRRejectionEvent(), ms);
	}

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a DIV rejection.
	 * @param ms timestamp
	 */
	public void isDIVRejection(long ms)  {
		epool_.postEvent(efact_.createDIVRejectionEvent(), ms);
	}

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a GR rejection.
	 * @param ms timestamp
	 */
	public void isGRRejection(long ms)  {
		epool_.postEvent(efact_.createGRRejectionEvent(), ms);
	}

	///
	/// user
	///

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a timeout.
	 * @param ms timestamp
	 */
	public void isTimeout(long ms)  {
		epool_.postEvent(efact_.createTimeoutEvent(), ms);
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a cancel intent.
	 * @param ms timestamp
	 */
	public void isCancel(long ms)  {
		epool_.postEvent(efact_.createCancelTurnEvent(), ms);
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a restart intent.
	 * @param ms timestamp
	 */
	public void isRestart(long ms)  {
		epool_.postEvent(efact_.createRestartTurnEvent(), ms);
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a bargein.
	 * @param ms timestamp
	 * @param success result of bargein
	 */
	public void isBargein(long ms, boolean success)  {
		epool_.postEvent(efact_.createBargeinEvent(success), ms);
	}
	
}

