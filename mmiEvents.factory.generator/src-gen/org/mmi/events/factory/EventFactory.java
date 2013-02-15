
/// generation start ////////////////////////////////////////////////////////////

//TODO fit package name
package org.mmi.events.factory;

//TODO fit import name
import org.mmi.events.*;

/**
 * This class implements a customized Event factory.
 * All the events are created with a concrete type value
 * and using a common timestamp in milliseconds.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class EventFactory {

	private long baseTimestamp;

	/**
	 * Constructor
	 */
	public EventFactory() {
		resetTimestamp();
	}

	///
	/// timestamp methods
	///

	public void resetTimestamp() {
		baseTimestamp = System.currentTimeMillis();
	}

	private long _currentTimestamp() {
		return System.currentTimeMillis() - baseTimestamp;
	}

	/**
	 * Methods to create events
	 * (not for abstract classes)
	 */

	public TouchEvent createTouchEvent() {
		TouchEvent e = EventsFactory.eINSTANCE.createTouchEvent();
		e.setType(event_t.TOUCH.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public ClickEvent createClickEvent() {
		ClickEvent e = EventsFactory.eINSTANCE.createClickEvent();
		e.setType(event_t.CLICK.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public LongClickEvent createLongClickEvent() {
		LongClickEvent e = EventsFactory.eINSTANCE.createLongClickEvent();
		e.setType(event_t.LONGCLICK.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public ScrollEvent createScrollEvent() {
		ScrollEvent e = EventsFactory.eINSTANCE.createScrollEvent();
		e.setType(event_t.SCROLL.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public MoveEvent createMoveEvent(int p_length) {
		MoveEvent e = EventsFactory.eINSTANCE.createMoveEvent();
		e.setType(event_t.MOVE.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setLength(p_length);
		return e;
	}

	public NavigationMoveEvent createNavigationMoveEvent(int p_length) {
		NavigationMoveEvent e = EventsFactory.eINSTANCE
				.createNavigationMoveEvent();
		e.setType(event_t.NAVIGATIONMOVE.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setLength(p_length);
		return e;
	}

	public NavigationActionEvent createNavigationActionEvent() {
		NavigationActionEvent e = EventsFactory.eINSTANCE
				.createNavigationActionEvent();
		e.setType(event_t.NAVIGATIONACTION.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public NavigationExploreEvent createNavigationExploreEvent() {
		NavigationExploreEvent e = EventsFactory.eINSTANCE
				.createNavigationExploreEvent();
		e.setType(event_t.NAVIGATIONEXPLORE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public KeyTextEvent createKeyTextEvent(int p_code) {
		KeyTextEvent e = EventsFactory.eINSTANCE.createKeyTextEvent();
		e.setType(event_t.KEYTEXT.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setCode(p_code);
		return e;
	}

	public KeyExploreEvent createKeyExploreEvent(int p_code) {
		KeyExploreEvent e = EventsFactory.eINSTANCE.createKeyExploreEvent();
		e.setType(event_t.KEYEXPLORE.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setCode(p_code);
		return e;
	}

	public KeyCommandEvent createKeyCommandEvent(int p_code) {
		KeyCommandEvent e = EventsFactory.eINSTANCE.createKeyCommandEvent();
		e.setType(event_t.KEYCOMMAND.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setCode(p_code);
		return e;
	}

	public TextWordEvent createTextWordEvent() {
		TextWordEvent e = EventsFactory.eINSTANCE.createTextWordEvent();
		e.setType(event_t.TEXTWORD.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public TextExploreEvent createTextExploreEvent() {
		TextExploreEvent e = EventsFactory.eINSTANCE.createTextExploreEvent();
		e.setType(event_t.TEXTEXPLORE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public TextCommandEvent createTextCommandEvent() {
		TextCommandEvent e = EventsFactory.eINSTANCE.createTextCommandEvent();
		e.setType(event_t.TEXTCOMMAND.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public GuiElementsEvent createGuiElementsEvent(int p_nitems) {
		GuiElementsEvent e = EventsFactory.eINSTANCE.createGuiElementsEvent();
		e.setType(event_t.GUIELEMENTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public GuiFeedbackEvent createGuiFeedbackEvent(int p_nitems) {
		GuiFeedbackEvent e = EventsFactory.eINSTANCE.createGuiFeedbackEvent();
		e.setType(event_t.GUIFEEDBACK.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public GuiConceptsEvent createGuiConceptsEvent(int p_nitems) {
		GuiConceptsEvent e = EventsFactory.eINSTANCE.createGuiConceptsEvent();
		e.setType(event_t.GUICONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public GuiNoiseEvent createGuiNoiseEvent(int p_nitems) {
		GuiNoiseEvent e = EventsFactory.eINSTANCE.createGuiNoiseEvent();
		e.setType(event_t.GUINOISE.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public GuiQuestionsEvent createGuiQuestionsEvent(int p_nitems) {
		GuiQuestionsEvent e = EventsFactory.eINSTANCE.createGuiQuestionsEvent();
		e.setType(event_t.GUIQUESTIONS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public SpeechElementsEvent createSpeechElementsEvent(int p_nitems) {
		SpeechElementsEvent e = EventsFactory.eINSTANCE
				.createSpeechElementsEvent();
		e.setType(event_t.SPEECHELEMENTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public SpeechFeedbackEvent createSpeechFeedbackEvent(int p_nitems) {
		SpeechFeedbackEvent e = EventsFactory.eINSTANCE
				.createSpeechFeedbackEvent();
		e.setType(event_t.SPEECHFEEDBACK.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public SpeechConceptsEvent createSpeechConceptsEvent(int p_nitems) {
		SpeechConceptsEvent e = EventsFactory.eINSTANCE
				.createSpeechConceptsEvent();
		e.setType(event_t.SPEECHCONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public SpeechNoiseEvent createSpeechNoiseEvent(int p_nitems) {
		SpeechNoiseEvent e = EventsFactory.eINSTANCE.createSpeechNoiseEvent();
		e.setType(event_t.SPEECHNOISE.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public SpeechQuestionsEvent createSpeechQuestionsEvent(int p_nitems) {
		SpeechQuestionsEvent e = EventsFactory.eINSTANCE
				.createSpeechQuestionsEvent();
		e.setType(event_t.SPEECHQUESTIONS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public CorrectAnswerEvent createCorrectAnswerEvent() {
		CorrectAnswerEvent e = EventsFactory.eINSTANCE
				.createCorrectAnswerEvent();
		e.setType(event_t.CORRECTANSWER.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public IncorrectAnswerEvent createIncorrectAnswerEvent() {
		IncorrectAnswerEvent e = EventsFactory.eINSTANCE
				.createIncorrectAnswerEvent();
		e.setType(event_t.INCORRECTANSWER.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public PartiallyCorrectAnswerEvent createPartiallyCorrectAnswerEvent() {
		PartiallyCorrectAnswerEvent e = EventsFactory.eINSTANCE
				.createPartiallyCorrectAnswerEvent();
		e.setType(event_t.PARTIALLYCORRECTANSWER.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public NotAnswerEvent createNotAnswerEvent() {
		NotAnswerEvent e = EventsFactory.eINSTANCE.createNotAnswerEvent();
		e.setType(event_t.NOTANSWER.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public OpenPromptEvent createOpenPromptEvent() {
		OpenPromptEvent e = EventsFactory.eINSTANCE.createOpenPromptEvent();
		e.setType(event_t.OPENPROMPT.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public HalfOpenPromptEvent createHalfOpenPromptEvent() {
		HalfOpenPromptEvent e = EventsFactory.eINSTANCE
				.createHalfOpenPromptEvent();
		e.setType(event_t.HALFOPENPROMPT.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public ClosedPromptEvent createClosedPromptEvent() {
		ClosedPromptEvent e = EventsFactory.eINSTANCE.createClosedPromptEvent();
		e.setType(event_t.CLOSEDPROMPT.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public NoQuestionPromptEvent createNoQuestionPromptEvent() {
		NoQuestionPromptEvent e = EventsFactory.eINSTANCE
				.createNoQuestionPromptEvent();
		e.setType(event_t.NOQUESTIONPROMPT.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public OverallWordsEvent createOverallWordsEvent(int p_nwords) {
		OverallWordsEvent e = EventsFactory.eINSTANCE.createOverallWordsEvent();
		e.setType(event_t.OVERALLWORDS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNwords(p_nwords);
		return e;
	}

	public SubstitutedWordsEvent createSubstitutedWordsEvent(int p_nwords) {
		SubstitutedWordsEvent e = EventsFactory.eINSTANCE
				.createSubstitutedWordsEvent();
		e.setType(event_t.SUBSTITUTEDWORDS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNwords(p_nwords);
		return e;
	}

	public DeletedWordsEvent createDeletedWordsEvent(int p_nwords) {
		DeletedWordsEvent e = EventsFactory.eINSTANCE.createDeletedWordsEvent();
		e.setType(event_t.DELETEDWORDS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNwords(p_nwords);
		return e;
	}

	public InsertedWordsEvent createInsertedWordsEvent(int p_nwords) {
		InsertedWordsEvent e = EventsFactory.eINSTANCE
				.createInsertedWordsEvent();
		e.setType(event_t.INSERTEDWORDS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNwords(p_nwords);
		return e;
	}

	public OverallSentencesEvent createOverallSentencesEvent(int p_nsentences) {
		OverallSentencesEvent e = EventsFactory.eINSTANCE
				.createOverallSentencesEvent();
		e.setType(event_t.OVERALLSENTENCES.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNsentences(p_nsentences);
		return e;
	}

	public SubstitutedSentencesEvent createSubstitutedSentencesEvent(
			int p_nsentences) {
		SubstitutedSentencesEvent e = EventsFactory.eINSTANCE
				.createSubstitutedSentencesEvent();
		e.setType(event_t.SUBSTITUTEDSENTENCES.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNsentences(p_nsentences);
		return e;
	}

	public DeletedSentencesEvent createDeletedSentencesEvent(int p_nsentences) {
		DeletedSentencesEvent e = EventsFactory.eINSTANCE
				.createDeletedSentencesEvent();
		e.setType(event_t.DELETEDSENTENCES.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNsentences(p_nsentences);
		return e;
	}

	public InsertedSentencesEvent createInsertedSentencesEvent(int p_nsentences) {
		InsertedSentencesEvent e = EventsFactory.eINSTANCE
				.createInsertedSentencesEvent();
		e.setType(event_t.INSERTEDSENTENCES.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNsentences(p_nsentences);
		return e;
	}

	public OverallConceptsEvent createOverallConceptsEvent(int p_nconcepts) {
		OverallConceptsEvent e = EventsFactory.eINSTANCE
				.createOverallConceptsEvent();
		e.setType(event_t.OVERALLCONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNconcepts(p_nconcepts);
		return e;
	}

	public SubstitutedConceptsEvent createSubstitutedConceptsEvent(
			int p_nconcepts) {
		SubstitutedConceptsEvent e = EventsFactory.eINSTANCE
				.createSubstitutedConceptsEvent();
		e.setType(event_t.SUBSTITUTEDCONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNconcepts(p_nconcepts);
		return e;
	}

	public DeletedConceptsEvent createDeletedConceptsEvent(int p_nconcepts) {
		DeletedConceptsEvent e = EventsFactory.eINSTANCE
				.createDeletedConceptsEvent();
		e.setType(event_t.DELETEDCONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNconcepts(p_nconcepts);
		return e;
	}

	public InsertedConceptsEvent createInsertedConceptsEvent(int p_nconcepts) {
		InsertedConceptsEvent e = EventsFactory.eINSTANCE
				.createInsertedConceptsEvent();
		e.setType(event_t.INSERTEDCONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNconcepts(p_nconcepts);
		return e;
	}

	public CorrectlyParsedUtteranceEvent createCorrectlyParsedUtteranceEvent() {
		CorrectlyParsedUtteranceEvent e = EventsFactory.eINSTANCE
				.createCorrectlyParsedUtteranceEvent();
		e.setType(event_t.CORRECTLYPARSEDUTTERANCE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public PartiallyParsedUtteranceEvent createPartiallyParsedUtteranceEvent() {
		PartiallyParsedUtteranceEvent e = EventsFactory.eINSTANCE
				.createPartiallyParsedUtteranceEvent();
		e.setType(event_t.PARTIALLYPARSEDUTTERANCE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public IncorrectlyParsedUtteranceEvent createIncorrectlyParsedUtteranceEvent() {
		IncorrectlyParsedUtteranceEvent e = EventsFactory.eINSTANCE
				.createIncorrectlyParsedUtteranceEvent();
		e.setType(event_t.INCORRECTLYPARSEDUTTERANCE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public NewElementsEvent createNewElementsEvent(int p_nitems) {
		NewElementsEvent e = EventsFactory.eINSTANCE.createNewElementsEvent();
		e.setType(event_t.NEWELEMENTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public NewFeedbackElementsEvent createNewFeedbackElementsEvent(int p_nitems) {
		NewFeedbackElementsEvent e = EventsFactory.eINSTANCE
				.createNewFeedbackElementsEvent();
		e.setType(event_t.NEWFEEDBACKELEMENTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public NewConceptsEvent createNewConceptsEvent(int p_nitems) {
		NewConceptsEvent e = EventsFactory.eINSTANCE.createNewConceptsEvent();
		e.setType(event_t.NEWCONCEPTS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public NewNoiseEvent createNewNoiseEvent(int p_nitems) {
		NewNoiseEvent e = EventsFactory.eINSTANCE.createNewNoiseEvent();
		e.setType(event_t.NEWNOISE.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public NewQuestionsEvent createNewQuestionsEvent(int p_nitems) {
		NewQuestionsEvent e = EventsFactory.eINSTANCE.createNewQuestionsEvent();
		e.setType(event_t.NEWQUESTIONS.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setNitems(p_nitems);
		return e;
	}

	public HelpTurnEvent createHelpTurnEvent() {
		HelpTurnEvent e = EventsFactory.eINSTANCE.createHelpTurnEvent();
		e.setType(event_t.HELPTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public CorrectionTurnEvent createCorrectionTurnEvent() {
		CorrectionTurnEvent e = EventsFactory.eINSTANCE
				.createCorrectionTurnEvent();
		e.setType(event_t.CORRECTIONTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public CancelTurnEvent createCancelTurnEvent() {
		CancelTurnEvent e = EventsFactory.eINSTANCE.createCancelTurnEvent();
		e.setType(event_t.CANCELTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public RestartTurnEvent createRestartTurnEvent() {
		RestartTurnEvent e = EventsFactory.eINSTANCE.createRestartTurnEvent();
		e.setType(event_t.RESTARTTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public BargeinEvent createBargeinEvent(boolean p_successful) {
		BargeinEvent e = EventsFactory.eINSTANCE.createBargeinEvent();
		e.setType(event_t.BARGEIN.getValue());
		e.setTimestamp(_currentTimestamp());

		e.setSuccessful(p_successful);
		return e;
	}

	public DIVRejectionEvent createDIVRejectionEvent() {
		DIVRejectionEvent e = EventsFactory.eINSTANCE.createDIVRejectionEvent();
		e.setType(event_t.DIVREJECTION.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public ASRRejectionEvent createASRRejectionEvent() {
		ASRRejectionEvent e = EventsFactory.eINSTANCE.createASRRejectionEvent();
		e.setType(event_t.ASRREJECTION.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public GRRejectionEvent createGRRejectionEvent() {
		GRRejectionEvent e = EventsFactory.eINSTANCE.createGRRejectionEvent();
		e.setType(event_t.GRREJECTION.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public TimeoutEvent createTimeoutEvent() {
		TimeoutEvent e = EventsFactory.eINSTANCE.createTimeoutEvent();
		e.setType(event_t.TIMEOUT.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public AppStartEvent createAppStartEvent() {
		AppStartEvent e = EventsFactory.eINSTANCE.createAppStartEvent();
		e.setType(event_t.APPSTART.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public AppEndEvent createAppEndEvent() {
		AppEndEvent e = EventsFactory.eINSTANCE.createAppEndEvent();
		e.setType(event_t.APPEND.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public StartDialogueEvent createStartDialogueEvent() {
		StartDialogueEvent e = EventsFactory.eINSTANCE
				.createStartDialogueEvent();
		e.setType(event_t.STARTDIALOGUE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public EndDialogueEvent createEndDialogueEvent() {
		EndDialogueEvent e = EventsFactory.eINSTANCE.createEndDialogueEvent();
		e.setType(event_t.ENDDIALOGUE.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public StartSystemTurnEvent createStartSystemTurnEvent() {
		StartSystemTurnEvent e = EventsFactory.eINSTANCE
				.createStartSystemTurnEvent();
		e.setType(event_t.STARTSYSTEMTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public EndSystemTurnEvent createEndSystemTurnEvent() {
		EndSystemTurnEvent e = EventsFactory.eINSTANCE
				.createEndSystemTurnEvent();
		e.setType(event_t.ENDSYSTEMTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public StartUserTurnEvent createStartUserTurnEvent() {
		StartUserTurnEvent e = EventsFactory.eINSTANCE
				.createStartUserTurnEvent();
		e.setType(event_t.STARTUSERTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public EndUserTurnEvent createEndUserTurnEvent() {
		EndUserTurnEvent e = EventsFactory.eINSTANCE.createEndUserTurnEvent();
		e.setType(event_t.ENDUSERTURN.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public SystemFeedbackStartEvent createSystemFeedbackStartEvent() {
		SystemFeedbackStartEvent e = EventsFactory.eINSTANCE
				.createSystemFeedbackStartEvent();
		e.setType(event_t.SYSTEMFEEDBACKSTART.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public SystemActionStartEvent createSystemActionStartEvent() {
		SystemActionStartEvent e = EventsFactory.eINSTANCE
				.createSystemActionStartEvent();
		e.setType(event_t.SYSTEMACTIONSTART.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public SystemActionEndEvent createSystemActionEndEvent() {
		SystemActionEndEvent e = EventsFactory.eINSTANCE
				.createSystemActionEndEvent();
		e.setType(event_t.SYSTEMACTIONEND.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public UserFeedbackStartEvent createUserFeedbackStartEvent() {
		UserFeedbackStartEvent e = EventsFactory.eINSTANCE
				.createUserFeedbackStartEvent();
		e.setType(event_t.USERFEEDBACKSTART.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public UserActionStartEvent createUserActionStartEvent() {
		UserActionStartEvent e = EventsFactory.eINSTANCE
				.createUserActionStartEvent();
		e.setType(event_t.USERACTIONSTART.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

	public UserActionEndEvent createUserActionEndEvent() {
		UserActionEndEvent e = EventsFactory.eINSTANCE
				.createUserActionEndEvent();
		e.setType(event_t.USERACTIONEND.getValue());
		e.setTimestamp(_currentTimestamp());
		return e;
	}

}

/// generation end ////////////////////////////////////////////////////////////
