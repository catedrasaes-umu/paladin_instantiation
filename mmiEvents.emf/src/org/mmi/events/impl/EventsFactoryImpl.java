/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mmi.events.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsFactoryImpl extends EFactoryImpl implements EventsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventsFactory init() {
		try {
			EventsFactory theEventsFactory = (EventsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/mmiEventsModel"); 
			if (theEventsFactory != null) {
				return theEventsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EventsPackage.TOUCH_EVENT: return createTouchEvent();
			case EventsPackage.CLICK_EVENT: return createClickEvent();
			case EventsPackage.LONG_CLICK_EVENT: return createLongClickEvent();
			case EventsPackage.SCROLL_EVENT: return createScrollEvent();
			case EventsPackage.MOVE_EVENT: return createMoveEvent();
			case EventsPackage.NAVIGATION_MOVE_EVENT: return createNavigationMoveEvent();
			case EventsPackage.NAVIGATION_ACTION_EVENT: return createNavigationActionEvent();
			case EventsPackage.NAVIGATION_EXPLORE_EVENT: return createNavigationExploreEvent();
			case EventsPackage.KEY_TEXT_EVENT: return createKeyTextEvent();
			case EventsPackage.KEY_EXPLORE_EVENT: return createKeyExploreEvent();
			case EventsPackage.KEY_COMMAND_EVENT: return createKeyCommandEvent();
			case EventsPackage.TEXT_WORD_EVENT: return createTextWordEvent();
			case EventsPackage.TEXT_EXPLORE_EVENT: return createTextExploreEvent();
			case EventsPackage.TEXT_COMMAND_EVENT: return createTextCommandEvent();
			case EventsPackage.GUI_ELEMENTS_EVENT: return createGuiElementsEvent();
			case EventsPackage.GUI_FEEDBACK_EVENT: return createGuiFeedbackEvent();
			case EventsPackage.GUI_CONCEPTS_EVENT: return createGuiConceptsEvent();
			case EventsPackage.GUI_NOISE_EVENT: return createGuiNoiseEvent();
			case EventsPackage.GUI_QUESTIONS_EVENT: return createGuiQuestionsEvent();
			case EventsPackage.SPEECH_ELEMENTS_EVENT: return createSpeechElementsEvent();
			case EventsPackage.SPEECH_FEEDBACK_EVENT: return createSpeechFeedbackEvent();
			case EventsPackage.SPEECH_CONCEPTS_EVENT: return createSpeechConceptsEvent();
			case EventsPackage.SPEECH_NOISE_EVENT: return createSpeechNoiseEvent();
			case EventsPackage.SPEECH_QUESTIONS_EVENT: return createSpeechQuestionsEvent();
			case EventsPackage.CORRECT_ANSWER_EVENT: return createCorrectAnswerEvent();
			case EventsPackage.INCORRECT_ANSWER_EVENT: return createIncorrectAnswerEvent();
			case EventsPackage.PARTIALLY_CORRECT_ANSWER_EVENT: return createPartiallyCorrectAnswerEvent();
			case EventsPackage.NOT_ANSWER_EVENT: return createNotAnswerEvent();
			case EventsPackage.OPEN_PROMPT_EVENT: return createOpenPromptEvent();
			case EventsPackage.HALF_OPEN_PROMPT_EVENT: return createHalfOpenPromptEvent();
			case EventsPackage.CLOSED_PROMPT_EVENT: return createClosedPromptEvent();
			case EventsPackage.NO_QUESTION_PROMPT_EVENT: return createNoQuestionPromptEvent();
			case EventsPackage.OVERALL_WORDS_EVENT: return createOverallWordsEvent();
			case EventsPackage.SUBSTITUTED_WORDS_EVENT: return createSubstitutedWordsEvent();
			case EventsPackage.DELETED_WORDS_EVENT: return createDeletedWordsEvent();
			case EventsPackage.INSERTED_WORDS_EVENT: return createInsertedWordsEvent();
			case EventsPackage.OVERALL_SENTENCES_EVENT: return createOverallSentencesEvent();
			case EventsPackage.SUBSTITUTED_SENTENCES_EVENT: return createSubstitutedSentencesEvent();
			case EventsPackage.DELETED_SENTENCES_EVENT: return createDeletedSentencesEvent();
			case EventsPackage.INSERTED_SENTENCES_EVENT: return createInsertedSentencesEvent();
			case EventsPackage.OVERALL_CONCEPTS_EVENT: return createOverallConceptsEvent();
			case EventsPackage.SUBSTITUTED_CONCEPTS_EVENT: return createSubstitutedConceptsEvent();
			case EventsPackage.DELETED_CONCEPTS_EVENT: return createDeletedConceptsEvent();
			case EventsPackage.INSERTED_CONCEPTS_EVENT: return createInsertedConceptsEvent();
			case EventsPackage.CORRECTLY_PARSED_UTTERANCE_EVENT: return createCorrectlyParsedUtteranceEvent();
			case EventsPackage.PARTIALLY_PARSED_UTTERANCE_EVENT: return createPartiallyParsedUtteranceEvent();
			case EventsPackage.INCORRECTLY_PARSED_UTTERANCE_EVENT: return createIncorrectlyParsedUtteranceEvent();
			case EventsPackage.NEW_ELEMENTS_EVENT: return createNewElementsEvent();
			case EventsPackage.NEW_FEEDBACK_ELEMENTS_EVENT: return createNewFeedbackElementsEvent();
			case EventsPackage.NEW_CONCEPTS_EVENT: return createNewConceptsEvent();
			case EventsPackage.NEW_NOISE_EVENT: return createNewNoiseEvent();
			case EventsPackage.NEW_QUESTIONS_EVENT: return createNewQuestionsEvent();
			case EventsPackage.HELP_TURN_EVENT: return createHelpTurnEvent();
			case EventsPackage.CORRECTION_TURN_EVENT: return createCorrectionTurnEvent();
			case EventsPackage.CANCEL_TURN_EVENT: return createCancelTurnEvent();
			case EventsPackage.RESTART_TURN_EVENT: return createRestartTurnEvent();
			case EventsPackage.BARGEIN_EVENT: return createBargeinEvent();
			case EventsPackage.DIV_REJECTION_EVENT: return createDIVRejectionEvent();
			case EventsPackage.ASR_REJECTION_EVENT: return createASRRejectionEvent();
			case EventsPackage.GR_REJECTION_EVENT: return createGRRejectionEvent();
			case EventsPackage.TIMEOUT_EVENT: return createTimeoutEvent();
			case EventsPackage.APP_START_EVENT: return createAppStartEvent();
			case EventsPackage.APP_END_EVENT: return createAppEndEvent();
			case EventsPackage.START_DIALOGUE_EVENT: return createStartDialogueEvent();
			case EventsPackage.END_DIALOGUE_EVENT: return createEndDialogueEvent();
			case EventsPackage.START_SYSTEM_TURN_EVENT: return createStartSystemTurnEvent();
			case EventsPackage.END_SYSTEM_TURN_EVENT: return createEndSystemTurnEvent();
			case EventsPackage.START_USER_TURN_EVENT: return createStartUserTurnEvent();
			case EventsPackage.END_USER_TURN_EVENT: return createEndUserTurnEvent();
			case EventsPackage.SYSTEM_FEEDBACK_START_EVENT: return createSystemFeedbackStartEvent();
			case EventsPackage.SYSTEM_ACTION_START_EVENT: return createSystemActionStartEvent();
			case EventsPackage.SYSTEM_ACTION_END_EVENT: return createSystemActionEndEvent();
			case EventsPackage.USER_FEEDBACK_START_EVENT: return createUserFeedbackStartEvent();
			case EventsPackage.USER_ACTION_START_EVENT: return createUserActionStartEvent();
			case EventsPackage.USER_ACTION_END_EVENT: return createUserActionEndEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EventsPackage.EVENT_T:
				return createevent_tFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EventsPackage.EVENT_T:
				return convertevent_tToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchEvent createTouchEvent() {
		TouchEventImpl touchEvent = new TouchEventImpl();
		return touchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickEvent createClickEvent() {
		ClickEventImpl clickEvent = new ClickEventImpl();
		return clickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongClickEvent createLongClickEvent() {
		LongClickEventImpl longClickEvent = new LongClickEventImpl();
		return longClickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollEvent createScrollEvent() {
		ScrollEventImpl scrollEvent = new ScrollEventImpl();
		return scrollEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveEvent createMoveEvent() {
		MoveEventImpl moveEvent = new MoveEventImpl();
		return moveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationMoveEvent createNavigationMoveEvent() {
		NavigationMoveEventImpl navigationMoveEvent = new NavigationMoveEventImpl();
		return navigationMoveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationActionEvent createNavigationActionEvent() {
		NavigationActionEventImpl navigationActionEvent = new NavigationActionEventImpl();
		return navigationActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationExploreEvent createNavigationExploreEvent() {
		NavigationExploreEventImpl navigationExploreEvent = new NavigationExploreEventImpl();
		return navigationExploreEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTextEvent createKeyTextEvent() {
		KeyTextEventImpl keyTextEvent = new KeyTextEventImpl();
		return keyTextEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyExploreEvent createKeyExploreEvent() {
		KeyExploreEventImpl keyExploreEvent = new KeyExploreEventImpl();
		return keyExploreEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCommandEvent createKeyCommandEvent() {
		KeyCommandEventImpl keyCommandEvent = new KeyCommandEventImpl();
		return keyCommandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextWordEvent createTextWordEvent() {
		TextWordEventImpl textWordEvent = new TextWordEventImpl();
		return textWordEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextExploreEvent createTextExploreEvent() {
		TextExploreEventImpl textExploreEvent = new TextExploreEventImpl();
		return textExploreEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCommandEvent createTextCommandEvent() {
		TextCommandEventImpl textCommandEvent = new TextCommandEventImpl();
		return textCommandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiElementsEvent createGuiElementsEvent() {
		GuiElementsEventImpl guiElementsEvent = new GuiElementsEventImpl();
		return guiElementsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiFeedbackEvent createGuiFeedbackEvent() {
		GuiFeedbackEventImpl guiFeedbackEvent = new GuiFeedbackEventImpl();
		return guiFeedbackEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiConceptsEvent createGuiConceptsEvent() {
		GuiConceptsEventImpl guiConceptsEvent = new GuiConceptsEventImpl();
		return guiConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiNoiseEvent createGuiNoiseEvent() {
		GuiNoiseEventImpl guiNoiseEvent = new GuiNoiseEventImpl();
		return guiNoiseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiQuestionsEvent createGuiQuestionsEvent() {
		GuiQuestionsEventImpl guiQuestionsEvent = new GuiQuestionsEventImpl();
		return guiQuestionsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechElementsEvent createSpeechElementsEvent() {
		SpeechElementsEventImpl speechElementsEvent = new SpeechElementsEventImpl();
		return speechElementsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechFeedbackEvent createSpeechFeedbackEvent() {
		SpeechFeedbackEventImpl speechFeedbackEvent = new SpeechFeedbackEventImpl();
		return speechFeedbackEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechConceptsEvent createSpeechConceptsEvent() {
		SpeechConceptsEventImpl speechConceptsEvent = new SpeechConceptsEventImpl();
		return speechConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechNoiseEvent createSpeechNoiseEvent() {
		SpeechNoiseEventImpl speechNoiseEvent = new SpeechNoiseEventImpl();
		return speechNoiseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechQuestionsEvent createSpeechQuestionsEvent() {
		SpeechQuestionsEventImpl speechQuestionsEvent = new SpeechQuestionsEventImpl();
		return speechQuestionsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectAnswerEvent createCorrectAnswerEvent() {
		CorrectAnswerEventImpl correctAnswerEvent = new CorrectAnswerEventImpl();
		return correctAnswerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncorrectAnswerEvent createIncorrectAnswerEvent() {
		IncorrectAnswerEventImpl incorrectAnswerEvent = new IncorrectAnswerEventImpl();
		return incorrectAnswerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartiallyCorrectAnswerEvent createPartiallyCorrectAnswerEvent() {
		PartiallyCorrectAnswerEventImpl partiallyCorrectAnswerEvent = new PartiallyCorrectAnswerEventImpl();
		return partiallyCorrectAnswerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotAnswerEvent createNotAnswerEvent() {
		NotAnswerEventImpl notAnswerEvent = new NotAnswerEventImpl();
		return notAnswerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenPromptEvent createOpenPromptEvent() {
		OpenPromptEventImpl openPromptEvent = new OpenPromptEventImpl();
		return openPromptEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfOpenPromptEvent createHalfOpenPromptEvent() {
		HalfOpenPromptEventImpl halfOpenPromptEvent = new HalfOpenPromptEventImpl();
		return halfOpenPromptEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedPromptEvent createClosedPromptEvent() {
		ClosedPromptEventImpl closedPromptEvent = new ClosedPromptEventImpl();
		return closedPromptEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoQuestionPromptEvent createNoQuestionPromptEvent() {
		NoQuestionPromptEventImpl noQuestionPromptEvent = new NoQuestionPromptEventImpl();
		return noQuestionPromptEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverallWordsEvent createOverallWordsEvent() {
		OverallWordsEventImpl overallWordsEvent = new OverallWordsEventImpl();
		return overallWordsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutedWordsEvent createSubstitutedWordsEvent() {
		SubstitutedWordsEventImpl substitutedWordsEvent = new SubstitutedWordsEventImpl();
		return substitutedWordsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletedWordsEvent createDeletedWordsEvent() {
		DeletedWordsEventImpl deletedWordsEvent = new DeletedWordsEventImpl();
		return deletedWordsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertedWordsEvent createInsertedWordsEvent() {
		InsertedWordsEventImpl insertedWordsEvent = new InsertedWordsEventImpl();
		return insertedWordsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverallSentencesEvent createOverallSentencesEvent() {
		OverallSentencesEventImpl overallSentencesEvent = new OverallSentencesEventImpl();
		return overallSentencesEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutedSentencesEvent createSubstitutedSentencesEvent() {
		SubstitutedSentencesEventImpl substitutedSentencesEvent = new SubstitutedSentencesEventImpl();
		return substitutedSentencesEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletedSentencesEvent createDeletedSentencesEvent() {
		DeletedSentencesEventImpl deletedSentencesEvent = new DeletedSentencesEventImpl();
		return deletedSentencesEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertedSentencesEvent createInsertedSentencesEvent() {
		InsertedSentencesEventImpl insertedSentencesEvent = new InsertedSentencesEventImpl();
		return insertedSentencesEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverallConceptsEvent createOverallConceptsEvent() {
		OverallConceptsEventImpl overallConceptsEvent = new OverallConceptsEventImpl();
		return overallConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutedConceptsEvent createSubstitutedConceptsEvent() {
		SubstitutedConceptsEventImpl substitutedConceptsEvent = new SubstitutedConceptsEventImpl();
		return substitutedConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletedConceptsEvent createDeletedConceptsEvent() {
		DeletedConceptsEventImpl deletedConceptsEvent = new DeletedConceptsEventImpl();
		return deletedConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertedConceptsEvent createInsertedConceptsEvent() {
		InsertedConceptsEventImpl insertedConceptsEvent = new InsertedConceptsEventImpl();
		return insertedConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectlyParsedUtteranceEvent createCorrectlyParsedUtteranceEvent() {
		CorrectlyParsedUtteranceEventImpl correctlyParsedUtteranceEvent = new CorrectlyParsedUtteranceEventImpl();
		return correctlyParsedUtteranceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartiallyParsedUtteranceEvent createPartiallyParsedUtteranceEvent() {
		PartiallyParsedUtteranceEventImpl partiallyParsedUtteranceEvent = new PartiallyParsedUtteranceEventImpl();
		return partiallyParsedUtteranceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncorrectlyParsedUtteranceEvent createIncorrectlyParsedUtteranceEvent() {
		IncorrectlyParsedUtteranceEventImpl incorrectlyParsedUtteranceEvent = new IncorrectlyParsedUtteranceEventImpl();
		return incorrectlyParsedUtteranceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewElementsEvent createNewElementsEvent() {
		NewElementsEventImpl newElementsEvent = new NewElementsEventImpl();
		return newElementsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeedbackElementsEvent createNewFeedbackElementsEvent() {
		NewFeedbackElementsEventImpl newFeedbackElementsEvent = new NewFeedbackElementsEventImpl();
		return newFeedbackElementsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewConceptsEvent createNewConceptsEvent() {
		NewConceptsEventImpl newConceptsEvent = new NewConceptsEventImpl();
		return newConceptsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewNoiseEvent createNewNoiseEvent() {
		NewNoiseEventImpl newNoiseEvent = new NewNoiseEventImpl();
		return newNoiseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewQuestionsEvent createNewQuestionsEvent() {
		NewQuestionsEventImpl newQuestionsEvent = new NewQuestionsEventImpl();
		return newQuestionsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpTurnEvent createHelpTurnEvent() {
		HelpTurnEventImpl helpTurnEvent = new HelpTurnEventImpl();
		return helpTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectionTurnEvent createCorrectionTurnEvent() {
		CorrectionTurnEventImpl correctionTurnEvent = new CorrectionTurnEventImpl();
		return correctionTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelTurnEvent createCancelTurnEvent() {
		CancelTurnEventImpl cancelTurnEvent = new CancelTurnEventImpl();
		return cancelTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartTurnEvent createRestartTurnEvent() {
		RestartTurnEventImpl restartTurnEvent = new RestartTurnEventImpl();
		return restartTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BargeinEvent createBargeinEvent() {
		BargeinEventImpl bargeinEvent = new BargeinEventImpl();
		return bargeinEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIVRejectionEvent createDIVRejectionEvent() {
		DIVRejectionEventImpl divRejectionEvent = new DIVRejectionEventImpl();
		return divRejectionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASRRejectionEvent createASRRejectionEvent() {
		ASRRejectionEventImpl asrRejectionEvent = new ASRRejectionEventImpl();
		return asrRejectionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRRejectionEvent createGRRejectionEvent() {
		GRRejectionEventImpl grRejectionEvent = new GRRejectionEventImpl();
		return grRejectionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutEvent createTimeoutEvent() {
		TimeoutEventImpl timeoutEvent = new TimeoutEventImpl();
		return timeoutEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppStartEvent createAppStartEvent() {
		AppStartEventImpl appStartEvent = new AppStartEventImpl();
		return appStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppEndEvent createAppEndEvent() {
		AppEndEventImpl appEndEvent = new AppEndEventImpl();
		return appEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartDialogueEvent createStartDialogueEvent() {
		StartDialogueEventImpl startDialogueEvent = new StartDialogueEventImpl();
		return startDialogueEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDialogueEvent createEndDialogueEvent() {
		EndDialogueEventImpl endDialogueEvent = new EndDialogueEventImpl();
		return endDialogueEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartSystemTurnEvent createStartSystemTurnEvent() {
		StartSystemTurnEventImpl startSystemTurnEvent = new StartSystemTurnEventImpl();
		return startSystemTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSystemTurnEvent createEndSystemTurnEvent() {
		EndSystemTurnEventImpl endSystemTurnEvent = new EndSystemTurnEventImpl();
		return endSystemTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUserTurnEvent createStartUserTurnEvent() {
		StartUserTurnEventImpl startUserTurnEvent = new StartUserTurnEventImpl();
		return startUserTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndUserTurnEvent createEndUserTurnEvent() {
		EndUserTurnEventImpl endUserTurnEvent = new EndUserTurnEventImpl();
		return endUserTurnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFeedbackStartEvent createSystemFeedbackStartEvent() {
		SystemFeedbackStartEventImpl systemFeedbackStartEvent = new SystemFeedbackStartEventImpl();
		return systemFeedbackStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionStartEvent createSystemActionStartEvent() {
		SystemActionStartEventImpl systemActionStartEvent = new SystemActionStartEventImpl();
		return systemActionStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionEndEvent createSystemActionEndEvent() {
		SystemActionEndEventImpl systemActionEndEvent = new SystemActionEndEventImpl();
		return systemActionEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFeedbackStartEvent createUserFeedbackStartEvent() {
		UserFeedbackStartEventImpl userFeedbackStartEvent = new UserFeedbackStartEventImpl();
		return userFeedbackStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionStartEvent createUserActionStartEvent() {
		UserActionStartEventImpl userActionStartEvent = new UserActionStartEventImpl();
		return userActionStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionEndEvent createUserActionEndEvent() {
		UserActionEndEventImpl userActionEndEvent = new UserActionEndEventImpl();
		return userActionEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public event_t createevent_tFromString(EDataType eDataType, String initialValue) {
		event_t result = event_t.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertevent_tToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsPackage getEventsPackage() {
		return (EventsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EventsPackage getPackage() {
		return EventsPackage.eINSTANCE;
	}

} //EventsFactoryImpl
