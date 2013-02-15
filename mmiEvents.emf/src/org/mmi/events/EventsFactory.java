/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mmi.events.EventsPackage
 * @generated
 */
public interface EventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsFactory eINSTANCE = org.mmi.events.impl.EventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Touch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touch Event</em>'.
	 * @generated
	 */
	TouchEvent createTouchEvent();

	/**
	 * Returns a new object of class '<em>Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click Event</em>'.
	 * @generated
	 */
	ClickEvent createClickEvent();

	/**
	 * Returns a new object of class '<em>Long Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Click Event</em>'.
	 * @generated
	 */
	LongClickEvent createLongClickEvent();

	/**
	 * Returns a new object of class '<em>Scroll Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scroll Event</em>'.
	 * @generated
	 */
	ScrollEvent createScrollEvent();

	/**
	 * Returns a new object of class '<em>Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Event</em>'.
	 * @generated
	 */
	MoveEvent createMoveEvent();

	/**
	 * Returns a new object of class '<em>Navigation Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Move Event</em>'.
	 * @generated
	 */
	NavigationMoveEvent createNavigationMoveEvent();

	/**
	 * Returns a new object of class '<em>Navigation Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Action Event</em>'.
	 * @generated
	 */
	NavigationActionEvent createNavigationActionEvent();

	/**
	 * Returns a new object of class '<em>Navigation Explore Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Explore Event</em>'.
	 * @generated
	 */
	NavigationExploreEvent createNavigationExploreEvent();

	/**
	 * Returns a new object of class '<em>Key Text Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Text Event</em>'.
	 * @generated
	 */
	KeyTextEvent createKeyTextEvent();

	/**
	 * Returns a new object of class '<em>Key Explore Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Explore Event</em>'.
	 * @generated
	 */
	KeyExploreEvent createKeyExploreEvent();

	/**
	 * Returns a new object of class '<em>Key Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Command Event</em>'.
	 * @generated
	 */
	KeyCommandEvent createKeyCommandEvent();

	/**
	 * Returns a new object of class '<em>Text Word Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Word Event</em>'.
	 * @generated
	 */
	TextWordEvent createTextWordEvent();

	/**
	 * Returns a new object of class '<em>Text Explore Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Explore Event</em>'.
	 * @generated
	 */
	TextExploreEvent createTextExploreEvent();

	/**
	 * Returns a new object of class '<em>Text Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Command Event</em>'.
	 * @generated
	 */
	TextCommandEvent createTextCommandEvent();

	/**
	 * Returns a new object of class '<em>Gui Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Elements Event</em>'.
	 * @generated
	 */
	GuiElementsEvent createGuiElementsEvent();

	/**
	 * Returns a new object of class '<em>Gui Feedback Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Feedback Event</em>'.
	 * @generated
	 */
	GuiFeedbackEvent createGuiFeedbackEvent();

	/**
	 * Returns a new object of class '<em>Gui Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Concepts Event</em>'.
	 * @generated
	 */
	GuiConceptsEvent createGuiConceptsEvent();

	/**
	 * Returns a new object of class '<em>Gui Noise Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Noise Event</em>'.
	 * @generated
	 */
	GuiNoiseEvent createGuiNoiseEvent();

	/**
	 * Returns a new object of class '<em>Gui Questions Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Questions Event</em>'.
	 * @generated
	 */
	GuiQuestionsEvent createGuiQuestionsEvent();

	/**
	 * Returns a new object of class '<em>Speech Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Elements Event</em>'.
	 * @generated
	 */
	SpeechElementsEvent createSpeechElementsEvent();

	/**
	 * Returns a new object of class '<em>Speech Feedback Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Feedback Event</em>'.
	 * @generated
	 */
	SpeechFeedbackEvent createSpeechFeedbackEvent();

	/**
	 * Returns a new object of class '<em>Speech Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Concepts Event</em>'.
	 * @generated
	 */
	SpeechConceptsEvent createSpeechConceptsEvent();

	/**
	 * Returns a new object of class '<em>Speech Noise Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Noise Event</em>'.
	 * @generated
	 */
	SpeechNoiseEvent createSpeechNoiseEvent();

	/**
	 * Returns a new object of class '<em>Speech Questions Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Questions Event</em>'.
	 * @generated
	 */
	SpeechQuestionsEvent createSpeechQuestionsEvent();

	/**
	 * Returns a new object of class '<em>Correct Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correct Answer Event</em>'.
	 * @generated
	 */
	CorrectAnswerEvent createCorrectAnswerEvent();

	/**
	 * Returns a new object of class '<em>Incorrect Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incorrect Answer Event</em>'.
	 * @generated
	 */
	IncorrectAnswerEvent createIncorrectAnswerEvent();

	/**
	 * Returns a new object of class '<em>Partially Correct Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partially Correct Answer Event</em>'.
	 * @generated
	 */
	PartiallyCorrectAnswerEvent createPartiallyCorrectAnswerEvent();

	/**
	 * Returns a new object of class '<em>Not Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Answer Event</em>'.
	 * @generated
	 */
	NotAnswerEvent createNotAnswerEvent();

	/**
	 * Returns a new object of class '<em>Open Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Prompt Event</em>'.
	 * @generated
	 */
	OpenPromptEvent createOpenPromptEvent();

	/**
	 * Returns a new object of class '<em>Half Open Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Half Open Prompt Event</em>'.
	 * @generated
	 */
	HalfOpenPromptEvent createHalfOpenPromptEvent();

	/**
	 * Returns a new object of class '<em>Closed Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Prompt Event</em>'.
	 * @generated
	 */
	ClosedPromptEvent createClosedPromptEvent();

	/**
	 * Returns a new object of class '<em>No Question Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Question Prompt Event</em>'.
	 * @generated
	 */
	NoQuestionPromptEvent createNoQuestionPromptEvent();

	/**
	 * Returns a new object of class '<em>Overall Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overall Words Event</em>'.
	 * @generated
	 */
	OverallWordsEvent createOverallWordsEvent();

	/**
	 * Returns a new object of class '<em>Substituted Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substituted Words Event</em>'.
	 * @generated
	 */
	SubstitutedWordsEvent createSubstitutedWordsEvent();

	/**
	 * Returns a new object of class '<em>Deleted Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleted Words Event</em>'.
	 * @generated
	 */
	DeletedWordsEvent createDeletedWordsEvent();

	/**
	 * Returns a new object of class '<em>Inserted Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserted Words Event</em>'.
	 * @generated
	 */
	InsertedWordsEvent createInsertedWordsEvent();

	/**
	 * Returns a new object of class '<em>Overall Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overall Sentences Event</em>'.
	 * @generated
	 */
	OverallSentencesEvent createOverallSentencesEvent();

	/**
	 * Returns a new object of class '<em>Substituted Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substituted Sentences Event</em>'.
	 * @generated
	 */
	SubstitutedSentencesEvent createSubstitutedSentencesEvent();

	/**
	 * Returns a new object of class '<em>Deleted Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleted Sentences Event</em>'.
	 * @generated
	 */
	DeletedSentencesEvent createDeletedSentencesEvent();

	/**
	 * Returns a new object of class '<em>Inserted Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserted Sentences Event</em>'.
	 * @generated
	 */
	InsertedSentencesEvent createInsertedSentencesEvent();

	/**
	 * Returns a new object of class '<em>Overall Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overall Concepts Event</em>'.
	 * @generated
	 */
	OverallConceptsEvent createOverallConceptsEvent();

	/**
	 * Returns a new object of class '<em>Substituted Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substituted Concepts Event</em>'.
	 * @generated
	 */
	SubstitutedConceptsEvent createSubstitutedConceptsEvent();

	/**
	 * Returns a new object of class '<em>Deleted Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleted Concepts Event</em>'.
	 * @generated
	 */
	DeletedConceptsEvent createDeletedConceptsEvent();

	/**
	 * Returns a new object of class '<em>Inserted Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserted Concepts Event</em>'.
	 * @generated
	 */
	InsertedConceptsEvent createInsertedConceptsEvent();

	/**
	 * Returns a new object of class '<em>Correctly Parsed Utterance Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correctly Parsed Utterance Event</em>'.
	 * @generated
	 */
	CorrectlyParsedUtteranceEvent createCorrectlyParsedUtteranceEvent();

	/**
	 * Returns a new object of class '<em>Partially Parsed Utterance Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partially Parsed Utterance Event</em>'.
	 * @generated
	 */
	PartiallyParsedUtteranceEvent createPartiallyParsedUtteranceEvent();

	/**
	 * Returns a new object of class '<em>Incorrectly Parsed Utterance Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incorrectly Parsed Utterance Event</em>'.
	 * @generated
	 */
	IncorrectlyParsedUtteranceEvent createIncorrectlyParsedUtteranceEvent();

	/**
	 * Returns a new object of class '<em>New Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Elements Event</em>'.
	 * @generated
	 */
	NewElementsEvent createNewElementsEvent();

	/**
	 * Returns a new object of class '<em>New Feedback Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Feedback Elements Event</em>'.
	 * @generated
	 */
	NewFeedbackElementsEvent createNewFeedbackElementsEvent();

	/**
	 * Returns a new object of class '<em>New Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Concepts Event</em>'.
	 * @generated
	 */
	NewConceptsEvent createNewConceptsEvent();

	/**
	 * Returns a new object of class '<em>New Noise Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Noise Event</em>'.
	 * @generated
	 */
	NewNoiseEvent createNewNoiseEvent();

	/**
	 * Returns a new object of class '<em>New Questions Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Questions Event</em>'.
	 * @generated
	 */
	NewQuestionsEvent createNewQuestionsEvent();

	/**
	 * Returns a new object of class '<em>Help Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Help Turn Event</em>'.
	 * @generated
	 */
	HelpTurnEvent createHelpTurnEvent();

	/**
	 * Returns a new object of class '<em>Correction Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correction Turn Event</em>'.
	 * @generated
	 */
	CorrectionTurnEvent createCorrectionTurnEvent();

	/**
	 * Returns a new object of class '<em>Cancel Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel Turn Event</em>'.
	 * @generated
	 */
	CancelTurnEvent createCancelTurnEvent();

	/**
	 * Returns a new object of class '<em>Restart Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restart Turn Event</em>'.
	 * @generated
	 */
	RestartTurnEvent createRestartTurnEvent();

	/**
	 * Returns a new object of class '<em>Bargein Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bargein Event</em>'.
	 * @generated
	 */
	BargeinEvent createBargeinEvent();

	/**
	 * Returns a new object of class '<em>DIV Rejection Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DIV Rejection Event</em>'.
	 * @generated
	 */
	DIVRejectionEvent createDIVRejectionEvent();

	/**
	 * Returns a new object of class '<em>ASR Rejection Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASR Rejection Event</em>'.
	 * @generated
	 */
	ASRRejectionEvent createASRRejectionEvent();

	/**
	 * Returns a new object of class '<em>GR Rejection Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GR Rejection Event</em>'.
	 * @generated
	 */
	GRRejectionEvent createGRRejectionEvent();

	/**
	 * Returns a new object of class '<em>Timeout Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout Event</em>'.
	 * @generated
	 */
	TimeoutEvent createTimeoutEvent();

	/**
	 * Returns a new object of class '<em>App Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Start Event</em>'.
	 * @generated
	 */
	AppStartEvent createAppStartEvent();

	/**
	 * Returns a new object of class '<em>App End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App End Event</em>'.
	 * @generated
	 */
	AppEndEvent createAppEndEvent();

	/**
	 * Returns a new object of class '<em>Start Dialogue Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Dialogue Event</em>'.
	 * @generated
	 */
	StartDialogueEvent createStartDialogueEvent();

	/**
	 * Returns a new object of class '<em>End Dialogue Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Dialogue Event</em>'.
	 * @generated
	 */
	EndDialogueEvent createEndDialogueEvent();

	/**
	 * Returns a new object of class '<em>Start System Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start System Turn Event</em>'.
	 * @generated
	 */
	StartSystemTurnEvent createStartSystemTurnEvent();

	/**
	 * Returns a new object of class '<em>End System Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End System Turn Event</em>'.
	 * @generated
	 */
	EndSystemTurnEvent createEndSystemTurnEvent();

	/**
	 * Returns a new object of class '<em>Start User Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start User Turn Event</em>'.
	 * @generated
	 */
	StartUserTurnEvent createStartUserTurnEvent();

	/**
	 * Returns a new object of class '<em>End User Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End User Turn Event</em>'.
	 * @generated
	 */
	EndUserTurnEvent createEndUserTurnEvent();

	/**
	 * Returns a new object of class '<em>System Feedback Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Feedback Start Event</em>'.
	 * @generated
	 */
	SystemFeedbackStartEvent createSystemFeedbackStartEvent();

	/**
	 * Returns a new object of class '<em>System Action Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Action Start Event</em>'.
	 * @generated
	 */
	SystemActionStartEvent createSystemActionStartEvent();

	/**
	 * Returns a new object of class '<em>System Action End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Action End Event</em>'.
	 * @generated
	 */
	SystemActionEndEvent createSystemActionEndEvent();

	/**
	 * Returns a new object of class '<em>User Feedback Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Feedback Start Event</em>'.
	 * @generated
	 */
	UserFeedbackStartEvent createUserFeedbackStartEvent();

	/**
	 * Returns a new object of class '<em>User Action Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Action Start Event</em>'.
	 * @generated
	 */
	UserActionStartEvent createUserActionStartEvent();

	/**
	 * Returns a new object of class '<em>User Action End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Action End Event</em>'.
	 * @generated
	 */
	UserActionEndEvent createUserActionEndEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EventsPackage getEventsPackage();

} //EventsFactory
