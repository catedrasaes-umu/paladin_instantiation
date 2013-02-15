/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mmi.events.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mmi.events.EventsPackage
 * @generated
 */
public class EventsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsSwitch() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EventsPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.INPUT_EVENT: {
				InputEvent inputEvent = (InputEvent)theEObject;
				T result = caseInputEvent(inputEvent);
				if (result == null) result = caseEvent(inputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.OUTPUT_EVENT: {
				OutputEvent outputEvent = (OutputEvent)theEObject;
				T result = caseOutputEvent(outputEvent);
				if (result == null) result = caseEvent(outputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.DIALOGUE_CONTENT_EVENT: {
				DialogueContentEvent dialogueContentEvent = (DialogueContentEvent)theEObject;
				T result = caseDialogueContentEvent(dialogueContentEvent);
				if (result == null) result = caseEvent(dialogueContentEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.METACOMM_EVENT: {
				MetacommEvent metacommEvent = (MetacommEvent)theEObject;
				T result = caseMetacommEvent(metacommEvent);
				if (result == null) result = caseEvent(metacommEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TURN_CONTROL_EVENT: {
				TurnControlEvent turnControlEvent = (TurnControlEvent)theEObject;
				T result = caseTurnControlEvent(turnControlEvent);
				if (result == null) result = caseEvent(turnControlEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TURN_TIMING_EVENT: {
				TurnTimingEvent turnTimingEvent = (TurnTimingEvent)theEObject;
				T result = caseTurnTimingEvent(turnTimingEvent);
				if (result == null) result = caseEvent(turnTimingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NAVIGATION_EVENT: {
				NavigationEvent navigationEvent = (NavigationEvent)theEObject;
				T result = caseNavigationEvent(navigationEvent);
				if (result == null) result = caseInputEvent(navigationEvent);
				if (result == null) result = caseEvent(navigationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TEXT_EVENT: {
				TextEvent textEvent = (TextEvent)theEObject;
				T result = caseTextEvent(textEvent);
				if (result == null) result = caseInputEvent(textEvent);
				if (result == null) result = caseEvent(textEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_INPUT_EVENT: {
				SpeechInputEvent speechInputEvent = (SpeechInputEvent)theEObject;
				T result = caseSpeechInputEvent(speechInputEvent);
				if (result == null) result = caseInputEvent(speechInputEvent);
				if (result == null) result = caseEvent(speechInputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SCREEN_EVENT: {
				ScreenEvent screenEvent = (ScreenEvent)theEObject;
				T result = caseScreenEvent(screenEvent);
				if (result == null) result = caseOutputEvent(screenEvent);
				if (result == null) result = caseEvent(screenEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SCREEN_CONTENT_EVENT: {
				ScreenContentEvent screenContentEvent = (ScreenContentEvent)theEObject;
				T result = caseScreenContentEvent(screenContentEvent);
				if (result == null) result = caseScreenEvent(screenContentEvent);
				if (result == null) result = caseOutputEvent(screenContentEvent);
				if (result == null) result = caseEvent(screenContentEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_OUTPUT_EVENT: {
				SpeechOutputEvent speechOutputEvent = (SpeechOutputEvent)theEObject;
				T result = caseSpeechOutputEvent(speechOutputEvent);
				if (result == null) result = caseOutputEvent(speechOutputEvent);
				if (result == null) result = caseEvent(speechOutputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_OUTPUT_CONTENT_EVENT: {
				SpeechOutputContentEvent speechOutputContentEvent = (SpeechOutputContentEvent)theEObject;
				T result = caseSpeechOutputContentEvent(speechOutputContentEvent);
				if (result == null) result = caseSpeechOutputEvent(speechOutputContentEvent);
				if (result == null) result = caseOutputEvent(speechOutputContentEvent);
				if (result == null) result = caseEvent(speechOutputContentEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TOUCH_EVENT: {
				TouchEvent touchEvent = (TouchEvent)theEObject;
				T result = caseTouchEvent(touchEvent);
				if (result == null) result = caseNavigationEvent(touchEvent);
				if (result == null) result = caseInputEvent(touchEvent);
				if (result == null) result = caseEvent(touchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CLICK_EVENT: {
				ClickEvent clickEvent = (ClickEvent)theEObject;
				T result = caseClickEvent(clickEvent);
				if (result == null) result = caseNavigationEvent(clickEvent);
				if (result == null) result = caseInputEvent(clickEvent);
				if (result == null) result = caseEvent(clickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.LONG_CLICK_EVENT: {
				LongClickEvent longClickEvent = (LongClickEvent)theEObject;
				T result = caseLongClickEvent(longClickEvent);
				if (result == null) result = caseNavigationEvent(longClickEvent);
				if (result == null) result = caseInputEvent(longClickEvent);
				if (result == null) result = caseEvent(longClickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SCROLL_EVENT: {
				ScrollEvent scrollEvent = (ScrollEvent)theEObject;
				T result = caseScrollEvent(scrollEvent);
				if (result == null) result = caseNavigationEvent(scrollEvent);
				if (result == null) result = caseInputEvent(scrollEvent);
				if (result == null) result = caseEvent(scrollEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.MOVE_EVENT: {
				MoveEvent moveEvent = (MoveEvent)theEObject;
				T result = caseMoveEvent(moveEvent);
				if (result == null) result = caseNavigationEvent(moveEvent);
				if (result == null) result = caseInputEvent(moveEvent);
				if (result == null) result = caseEvent(moveEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NAVIGATION_MOVE_EVENT: {
				NavigationMoveEvent navigationMoveEvent = (NavigationMoveEvent)theEObject;
				T result = caseNavigationMoveEvent(navigationMoveEvent);
				if (result == null) result = caseNavigationEvent(navigationMoveEvent);
				if (result == null) result = caseInputEvent(navigationMoveEvent);
				if (result == null) result = caseEvent(navigationMoveEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NAVIGATION_ACTION_EVENT: {
				NavigationActionEvent navigationActionEvent = (NavigationActionEvent)theEObject;
				T result = caseNavigationActionEvent(navigationActionEvent);
				if (result == null) result = caseNavigationEvent(navigationActionEvent);
				if (result == null) result = caseInputEvent(navigationActionEvent);
				if (result == null) result = caseEvent(navigationActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NAVIGATION_EXPLORE_EVENT: {
				NavigationExploreEvent navigationExploreEvent = (NavigationExploreEvent)theEObject;
				T result = caseNavigationExploreEvent(navigationExploreEvent);
				if (result == null) result = caseNavigationEvent(navigationExploreEvent);
				if (result == null) result = caseInputEvent(navigationExploreEvent);
				if (result == null) result = caseEvent(navigationExploreEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.KEY_TEXT_EVENT: {
				KeyTextEvent keyTextEvent = (KeyTextEvent)theEObject;
				T result = caseKeyTextEvent(keyTextEvent);
				if (result == null) result = caseTextEvent(keyTextEvent);
				if (result == null) result = caseInputEvent(keyTextEvent);
				if (result == null) result = caseEvent(keyTextEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.KEY_EXPLORE_EVENT: {
				KeyExploreEvent keyExploreEvent = (KeyExploreEvent)theEObject;
				T result = caseKeyExploreEvent(keyExploreEvent);
				if (result == null) result = caseTextEvent(keyExploreEvent);
				if (result == null) result = caseInputEvent(keyExploreEvent);
				if (result == null) result = caseEvent(keyExploreEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.KEY_COMMAND_EVENT: {
				KeyCommandEvent keyCommandEvent = (KeyCommandEvent)theEObject;
				T result = caseKeyCommandEvent(keyCommandEvent);
				if (result == null) result = caseTextEvent(keyCommandEvent);
				if (result == null) result = caseInputEvent(keyCommandEvent);
				if (result == null) result = caseEvent(keyCommandEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TEXT_WORD_EVENT: {
				TextWordEvent textWordEvent = (TextWordEvent)theEObject;
				T result = caseTextWordEvent(textWordEvent);
				if (result == null) result = caseTextEvent(textWordEvent);
				if (result == null) result = caseInputEvent(textWordEvent);
				if (result == null) result = caseEvent(textWordEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TEXT_EXPLORE_EVENT: {
				TextExploreEvent textExploreEvent = (TextExploreEvent)theEObject;
				T result = caseTextExploreEvent(textExploreEvent);
				if (result == null) result = caseTextEvent(textExploreEvent);
				if (result == null) result = caseInputEvent(textExploreEvent);
				if (result == null) result = caseEvent(textExploreEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TEXT_COMMAND_EVENT: {
				TextCommandEvent textCommandEvent = (TextCommandEvent)theEObject;
				T result = caseTextCommandEvent(textCommandEvent);
				if (result == null) result = caseTextEvent(textCommandEvent);
				if (result == null) result = caseInputEvent(textCommandEvent);
				if (result == null) result = caseEvent(textCommandEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.GUI_ELEMENTS_EVENT: {
				GuiElementsEvent guiElementsEvent = (GuiElementsEvent)theEObject;
				T result = caseGuiElementsEvent(guiElementsEvent);
				if (result == null) result = caseScreenContentEvent(guiElementsEvent);
				if (result == null) result = caseScreenEvent(guiElementsEvent);
				if (result == null) result = caseOutputEvent(guiElementsEvent);
				if (result == null) result = caseEvent(guiElementsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.GUI_FEEDBACK_EVENT: {
				GuiFeedbackEvent guiFeedbackEvent = (GuiFeedbackEvent)theEObject;
				T result = caseGuiFeedbackEvent(guiFeedbackEvent);
				if (result == null) result = caseScreenContentEvent(guiFeedbackEvent);
				if (result == null) result = caseScreenEvent(guiFeedbackEvent);
				if (result == null) result = caseOutputEvent(guiFeedbackEvent);
				if (result == null) result = caseEvent(guiFeedbackEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.GUI_CONCEPTS_EVENT: {
				GuiConceptsEvent guiConceptsEvent = (GuiConceptsEvent)theEObject;
				T result = caseGuiConceptsEvent(guiConceptsEvent);
				if (result == null) result = caseScreenContentEvent(guiConceptsEvent);
				if (result == null) result = caseScreenEvent(guiConceptsEvent);
				if (result == null) result = caseOutputEvent(guiConceptsEvent);
				if (result == null) result = caseEvent(guiConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.GUI_NOISE_EVENT: {
				GuiNoiseEvent guiNoiseEvent = (GuiNoiseEvent)theEObject;
				T result = caseGuiNoiseEvent(guiNoiseEvent);
				if (result == null) result = caseScreenContentEvent(guiNoiseEvent);
				if (result == null) result = caseScreenEvent(guiNoiseEvent);
				if (result == null) result = caseOutputEvent(guiNoiseEvent);
				if (result == null) result = caseEvent(guiNoiseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.GUI_QUESTIONS_EVENT: {
				GuiQuestionsEvent guiQuestionsEvent = (GuiQuestionsEvent)theEObject;
				T result = caseGuiQuestionsEvent(guiQuestionsEvent);
				if (result == null) result = caseScreenContentEvent(guiQuestionsEvent);
				if (result == null) result = caseScreenEvent(guiQuestionsEvent);
				if (result == null) result = caseOutputEvent(guiQuestionsEvent);
				if (result == null) result = caseEvent(guiQuestionsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_ELEMENTS_EVENT: {
				SpeechElementsEvent speechElementsEvent = (SpeechElementsEvent)theEObject;
				T result = caseSpeechElementsEvent(speechElementsEvent);
				if (result == null) result = caseSpeechOutputContentEvent(speechElementsEvent);
				if (result == null) result = caseSpeechOutputEvent(speechElementsEvent);
				if (result == null) result = caseOutputEvent(speechElementsEvent);
				if (result == null) result = caseEvent(speechElementsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_FEEDBACK_EVENT: {
				SpeechFeedbackEvent speechFeedbackEvent = (SpeechFeedbackEvent)theEObject;
				T result = caseSpeechFeedbackEvent(speechFeedbackEvent);
				if (result == null) result = caseSpeechOutputContentEvent(speechFeedbackEvent);
				if (result == null) result = caseSpeechOutputEvent(speechFeedbackEvent);
				if (result == null) result = caseOutputEvent(speechFeedbackEvent);
				if (result == null) result = caseEvent(speechFeedbackEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_CONCEPTS_EVENT: {
				SpeechConceptsEvent speechConceptsEvent = (SpeechConceptsEvent)theEObject;
				T result = caseSpeechConceptsEvent(speechConceptsEvent);
				if (result == null) result = caseSpeechOutputContentEvent(speechConceptsEvent);
				if (result == null) result = caseSpeechOutputEvent(speechConceptsEvent);
				if (result == null) result = caseOutputEvent(speechConceptsEvent);
				if (result == null) result = caseEvent(speechConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_NOISE_EVENT: {
				SpeechNoiseEvent speechNoiseEvent = (SpeechNoiseEvent)theEObject;
				T result = caseSpeechNoiseEvent(speechNoiseEvent);
				if (result == null) result = caseSpeechOutputContentEvent(speechNoiseEvent);
				if (result == null) result = caseSpeechOutputEvent(speechNoiseEvent);
				if (result == null) result = caseOutputEvent(speechNoiseEvent);
				if (result == null) result = caseEvent(speechNoiseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SPEECH_QUESTIONS_EVENT: {
				SpeechQuestionsEvent speechQuestionsEvent = (SpeechQuestionsEvent)theEObject;
				T result = caseSpeechQuestionsEvent(speechQuestionsEvent);
				if (result == null) result = caseSpeechOutputContentEvent(speechQuestionsEvent);
				if (result == null) result = caseSpeechOutputEvent(speechQuestionsEvent);
				if (result == null) result = caseOutputEvent(speechQuestionsEvent);
				if (result == null) result = caseEvent(speechQuestionsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CORRECT_ANSWER_EVENT: {
				CorrectAnswerEvent correctAnswerEvent = (CorrectAnswerEvent)theEObject;
				T result = caseCorrectAnswerEvent(correctAnswerEvent);
				if (result == null) result = caseSpeechOutputEvent(correctAnswerEvent);
				if (result == null) result = caseOutputEvent(correctAnswerEvent);
				if (result == null) result = caseEvent(correctAnswerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.INCORRECT_ANSWER_EVENT: {
				IncorrectAnswerEvent incorrectAnswerEvent = (IncorrectAnswerEvent)theEObject;
				T result = caseIncorrectAnswerEvent(incorrectAnswerEvent);
				if (result == null) result = caseSpeechOutputEvent(incorrectAnswerEvent);
				if (result == null) result = caseOutputEvent(incorrectAnswerEvent);
				if (result == null) result = caseEvent(incorrectAnswerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.PARTIALLY_CORRECT_ANSWER_EVENT: {
				PartiallyCorrectAnswerEvent partiallyCorrectAnswerEvent = (PartiallyCorrectAnswerEvent)theEObject;
				T result = casePartiallyCorrectAnswerEvent(partiallyCorrectAnswerEvent);
				if (result == null) result = caseSpeechOutputEvent(partiallyCorrectAnswerEvent);
				if (result == null) result = caseOutputEvent(partiallyCorrectAnswerEvent);
				if (result == null) result = caseEvent(partiallyCorrectAnswerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NOT_ANSWER_EVENT: {
				NotAnswerEvent notAnswerEvent = (NotAnswerEvent)theEObject;
				T result = caseNotAnswerEvent(notAnswerEvent);
				if (result == null) result = caseSpeechOutputEvent(notAnswerEvent);
				if (result == null) result = caseOutputEvent(notAnswerEvent);
				if (result == null) result = caseEvent(notAnswerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.OPEN_PROMPT_EVENT: {
				OpenPromptEvent openPromptEvent = (OpenPromptEvent)theEObject;
				T result = caseOpenPromptEvent(openPromptEvent);
				if (result == null) result = caseSpeechOutputEvent(openPromptEvent);
				if (result == null) result = caseOutputEvent(openPromptEvent);
				if (result == null) result = caseEvent(openPromptEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.HALF_OPEN_PROMPT_EVENT: {
				HalfOpenPromptEvent halfOpenPromptEvent = (HalfOpenPromptEvent)theEObject;
				T result = caseHalfOpenPromptEvent(halfOpenPromptEvent);
				if (result == null) result = caseSpeechOutputEvent(halfOpenPromptEvent);
				if (result == null) result = caseOutputEvent(halfOpenPromptEvent);
				if (result == null) result = caseEvent(halfOpenPromptEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CLOSED_PROMPT_EVENT: {
				ClosedPromptEvent closedPromptEvent = (ClosedPromptEvent)theEObject;
				T result = caseClosedPromptEvent(closedPromptEvent);
				if (result == null) result = caseSpeechOutputEvent(closedPromptEvent);
				if (result == null) result = caseOutputEvent(closedPromptEvent);
				if (result == null) result = caseEvent(closedPromptEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NO_QUESTION_PROMPT_EVENT: {
				NoQuestionPromptEvent noQuestionPromptEvent = (NoQuestionPromptEvent)theEObject;
				T result = caseNoQuestionPromptEvent(noQuestionPromptEvent);
				if (result == null) result = caseSpeechOutputEvent(noQuestionPromptEvent);
				if (result == null) result = caseOutputEvent(noQuestionPromptEvent);
				if (result == null) result = caseEvent(noQuestionPromptEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.OVERALL_WORDS_EVENT: {
				OverallWordsEvent overallWordsEvent = (OverallWordsEvent)theEObject;
				T result = caseOverallWordsEvent(overallWordsEvent);
				if (result == null) result = caseSpeechInputEvent(overallWordsEvent);
				if (result == null) result = caseInputEvent(overallWordsEvent);
				if (result == null) result = caseEvent(overallWordsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SUBSTITUTED_WORDS_EVENT: {
				SubstitutedWordsEvent substitutedWordsEvent = (SubstitutedWordsEvent)theEObject;
				T result = caseSubstitutedWordsEvent(substitutedWordsEvent);
				if (result == null) result = caseSpeechInputEvent(substitutedWordsEvent);
				if (result == null) result = caseInputEvent(substitutedWordsEvent);
				if (result == null) result = caseEvent(substitutedWordsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.DELETED_WORDS_EVENT: {
				DeletedWordsEvent deletedWordsEvent = (DeletedWordsEvent)theEObject;
				T result = caseDeletedWordsEvent(deletedWordsEvent);
				if (result == null) result = caseSpeechInputEvent(deletedWordsEvent);
				if (result == null) result = caseInputEvent(deletedWordsEvent);
				if (result == null) result = caseEvent(deletedWordsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.INSERTED_WORDS_EVENT: {
				InsertedWordsEvent insertedWordsEvent = (InsertedWordsEvent)theEObject;
				T result = caseInsertedWordsEvent(insertedWordsEvent);
				if (result == null) result = caseSpeechInputEvent(insertedWordsEvent);
				if (result == null) result = caseInputEvent(insertedWordsEvent);
				if (result == null) result = caseEvent(insertedWordsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.OVERALL_SENTENCES_EVENT: {
				OverallSentencesEvent overallSentencesEvent = (OverallSentencesEvent)theEObject;
				T result = caseOverallSentencesEvent(overallSentencesEvent);
				if (result == null) result = caseSpeechInputEvent(overallSentencesEvent);
				if (result == null) result = caseInputEvent(overallSentencesEvent);
				if (result == null) result = caseEvent(overallSentencesEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SUBSTITUTED_SENTENCES_EVENT: {
				SubstitutedSentencesEvent substitutedSentencesEvent = (SubstitutedSentencesEvent)theEObject;
				T result = caseSubstitutedSentencesEvent(substitutedSentencesEvent);
				if (result == null) result = caseSpeechInputEvent(substitutedSentencesEvent);
				if (result == null) result = caseInputEvent(substitutedSentencesEvent);
				if (result == null) result = caseEvent(substitutedSentencesEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.DELETED_SENTENCES_EVENT: {
				DeletedSentencesEvent deletedSentencesEvent = (DeletedSentencesEvent)theEObject;
				T result = caseDeletedSentencesEvent(deletedSentencesEvent);
				if (result == null) result = caseSpeechInputEvent(deletedSentencesEvent);
				if (result == null) result = caseInputEvent(deletedSentencesEvent);
				if (result == null) result = caseEvent(deletedSentencesEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.INSERTED_SENTENCES_EVENT: {
				InsertedSentencesEvent insertedSentencesEvent = (InsertedSentencesEvent)theEObject;
				T result = caseInsertedSentencesEvent(insertedSentencesEvent);
				if (result == null) result = caseSpeechInputEvent(insertedSentencesEvent);
				if (result == null) result = caseInputEvent(insertedSentencesEvent);
				if (result == null) result = caseEvent(insertedSentencesEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.OVERALL_CONCEPTS_EVENT: {
				OverallConceptsEvent overallConceptsEvent = (OverallConceptsEvent)theEObject;
				T result = caseOverallConceptsEvent(overallConceptsEvent);
				if (result == null) result = caseSpeechInputEvent(overallConceptsEvent);
				if (result == null) result = caseInputEvent(overallConceptsEvent);
				if (result == null) result = caseEvent(overallConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SUBSTITUTED_CONCEPTS_EVENT: {
				SubstitutedConceptsEvent substitutedConceptsEvent = (SubstitutedConceptsEvent)theEObject;
				T result = caseSubstitutedConceptsEvent(substitutedConceptsEvent);
				if (result == null) result = caseSpeechInputEvent(substitutedConceptsEvent);
				if (result == null) result = caseInputEvent(substitutedConceptsEvent);
				if (result == null) result = caseEvent(substitutedConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.DELETED_CONCEPTS_EVENT: {
				DeletedConceptsEvent deletedConceptsEvent = (DeletedConceptsEvent)theEObject;
				T result = caseDeletedConceptsEvent(deletedConceptsEvent);
				if (result == null) result = caseSpeechInputEvent(deletedConceptsEvent);
				if (result == null) result = caseInputEvent(deletedConceptsEvent);
				if (result == null) result = caseEvent(deletedConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.INSERTED_CONCEPTS_EVENT: {
				InsertedConceptsEvent insertedConceptsEvent = (InsertedConceptsEvent)theEObject;
				T result = caseInsertedConceptsEvent(insertedConceptsEvent);
				if (result == null) result = caseSpeechInputEvent(insertedConceptsEvent);
				if (result == null) result = caseInputEvent(insertedConceptsEvent);
				if (result == null) result = caseEvent(insertedConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CORRECTLY_PARSED_UTTERANCE_EVENT: {
				CorrectlyParsedUtteranceEvent correctlyParsedUtteranceEvent = (CorrectlyParsedUtteranceEvent)theEObject;
				T result = caseCorrectlyParsedUtteranceEvent(correctlyParsedUtteranceEvent);
				if (result == null) result = caseSpeechInputEvent(correctlyParsedUtteranceEvent);
				if (result == null) result = caseInputEvent(correctlyParsedUtteranceEvent);
				if (result == null) result = caseEvent(correctlyParsedUtteranceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.PARTIALLY_PARSED_UTTERANCE_EVENT: {
				PartiallyParsedUtteranceEvent partiallyParsedUtteranceEvent = (PartiallyParsedUtteranceEvent)theEObject;
				T result = casePartiallyParsedUtteranceEvent(partiallyParsedUtteranceEvent);
				if (result == null) result = caseSpeechInputEvent(partiallyParsedUtteranceEvent);
				if (result == null) result = caseInputEvent(partiallyParsedUtteranceEvent);
				if (result == null) result = caseEvent(partiallyParsedUtteranceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.INCORRECTLY_PARSED_UTTERANCE_EVENT: {
				IncorrectlyParsedUtteranceEvent incorrectlyParsedUtteranceEvent = (IncorrectlyParsedUtteranceEvent)theEObject;
				T result = caseIncorrectlyParsedUtteranceEvent(incorrectlyParsedUtteranceEvent);
				if (result == null) result = caseSpeechInputEvent(incorrectlyParsedUtteranceEvent);
				if (result == null) result = caseInputEvent(incorrectlyParsedUtteranceEvent);
				if (result == null) result = caseEvent(incorrectlyParsedUtteranceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NEW_ELEMENTS_EVENT: {
				NewElementsEvent newElementsEvent = (NewElementsEvent)theEObject;
				T result = caseNewElementsEvent(newElementsEvent);
				if (result == null) result = caseDialogueContentEvent(newElementsEvent);
				if (result == null) result = caseEvent(newElementsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NEW_FEEDBACK_ELEMENTS_EVENT: {
				NewFeedbackElementsEvent newFeedbackElementsEvent = (NewFeedbackElementsEvent)theEObject;
				T result = caseNewFeedbackElementsEvent(newFeedbackElementsEvent);
				if (result == null) result = caseDialogueContentEvent(newFeedbackElementsEvent);
				if (result == null) result = caseEvent(newFeedbackElementsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NEW_CONCEPTS_EVENT: {
				NewConceptsEvent newConceptsEvent = (NewConceptsEvent)theEObject;
				T result = caseNewConceptsEvent(newConceptsEvent);
				if (result == null) result = caseDialogueContentEvent(newConceptsEvent);
				if (result == null) result = caseEvent(newConceptsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NEW_NOISE_EVENT: {
				NewNoiseEvent newNoiseEvent = (NewNoiseEvent)theEObject;
				T result = caseNewNoiseEvent(newNoiseEvent);
				if (result == null) result = caseDialogueContentEvent(newNoiseEvent);
				if (result == null) result = caseEvent(newNoiseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.NEW_QUESTIONS_EVENT: {
				NewQuestionsEvent newQuestionsEvent = (NewQuestionsEvent)theEObject;
				T result = caseNewQuestionsEvent(newQuestionsEvent);
				if (result == null) result = caseDialogueContentEvent(newQuestionsEvent);
				if (result == null) result = caseEvent(newQuestionsEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.HELP_TURN_EVENT: {
				HelpTurnEvent helpTurnEvent = (HelpTurnEvent)theEObject;
				T result = caseHelpTurnEvent(helpTurnEvent);
				if (result == null) result = caseMetacommEvent(helpTurnEvent);
				if (result == null) result = caseEvent(helpTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CORRECTION_TURN_EVENT: {
				CorrectionTurnEvent correctionTurnEvent = (CorrectionTurnEvent)theEObject;
				T result = caseCorrectionTurnEvent(correctionTurnEvent);
				if (result == null) result = caseMetacommEvent(correctionTurnEvent);
				if (result == null) result = caseEvent(correctionTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CANCEL_TURN_EVENT: {
				CancelTurnEvent cancelTurnEvent = (CancelTurnEvent)theEObject;
				T result = caseCancelTurnEvent(cancelTurnEvent);
				if (result == null) result = caseMetacommEvent(cancelTurnEvent);
				if (result == null) result = caseEvent(cancelTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.RESTART_TURN_EVENT: {
				RestartTurnEvent restartTurnEvent = (RestartTurnEvent)theEObject;
				T result = caseRestartTurnEvent(restartTurnEvent);
				if (result == null) result = caseMetacommEvent(restartTurnEvent);
				if (result == null) result = caseEvent(restartTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.BARGEIN_EVENT: {
				BargeinEvent bargeinEvent = (BargeinEvent)theEObject;
				T result = caseBargeinEvent(bargeinEvent);
				if (result == null) result = caseMetacommEvent(bargeinEvent);
				if (result == null) result = caseEvent(bargeinEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.DIV_REJECTION_EVENT: {
				DIVRejectionEvent divRejectionEvent = (DIVRejectionEvent)theEObject;
				T result = caseDIVRejectionEvent(divRejectionEvent);
				if (result == null) result = caseMetacommEvent(divRejectionEvent);
				if (result == null) result = caseEvent(divRejectionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.ASR_REJECTION_EVENT: {
				ASRRejectionEvent asrRejectionEvent = (ASRRejectionEvent)theEObject;
				T result = caseASRRejectionEvent(asrRejectionEvent);
				if (result == null) result = caseMetacommEvent(asrRejectionEvent);
				if (result == null) result = caseEvent(asrRejectionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.GR_REJECTION_EVENT: {
				GRRejectionEvent grRejectionEvent = (GRRejectionEvent)theEObject;
				T result = caseGRRejectionEvent(grRejectionEvent);
				if (result == null) result = caseMetacommEvent(grRejectionEvent);
				if (result == null) result = caseEvent(grRejectionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.TIMEOUT_EVENT: {
				TimeoutEvent timeoutEvent = (TimeoutEvent)theEObject;
				T result = caseTimeoutEvent(timeoutEvent);
				if (result == null) result = caseMetacommEvent(timeoutEvent);
				if (result == null) result = caseEvent(timeoutEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.APP_START_EVENT: {
				AppStartEvent appStartEvent = (AppStartEvent)theEObject;
				T result = caseAppStartEvent(appStartEvent);
				if (result == null) result = caseTurnControlEvent(appStartEvent);
				if (result == null) result = caseEvent(appStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.APP_END_EVENT: {
				AppEndEvent appEndEvent = (AppEndEvent)theEObject;
				T result = caseAppEndEvent(appEndEvent);
				if (result == null) result = caseTurnControlEvent(appEndEvent);
				if (result == null) result = caseEvent(appEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.START_DIALOGUE_EVENT: {
				StartDialogueEvent startDialogueEvent = (StartDialogueEvent)theEObject;
				T result = caseStartDialogueEvent(startDialogueEvent);
				if (result == null) result = caseTurnControlEvent(startDialogueEvent);
				if (result == null) result = caseEvent(startDialogueEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.END_DIALOGUE_EVENT: {
				EndDialogueEvent endDialogueEvent = (EndDialogueEvent)theEObject;
				T result = caseEndDialogueEvent(endDialogueEvent);
				if (result == null) result = caseTurnControlEvent(endDialogueEvent);
				if (result == null) result = caseEvent(endDialogueEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.START_SYSTEM_TURN_EVENT: {
				StartSystemTurnEvent startSystemTurnEvent = (StartSystemTurnEvent)theEObject;
				T result = caseStartSystemTurnEvent(startSystemTurnEvent);
				if (result == null) result = caseTurnControlEvent(startSystemTurnEvent);
				if (result == null) result = caseEvent(startSystemTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.END_SYSTEM_TURN_EVENT: {
				EndSystemTurnEvent endSystemTurnEvent = (EndSystemTurnEvent)theEObject;
				T result = caseEndSystemTurnEvent(endSystemTurnEvent);
				if (result == null) result = caseTurnControlEvent(endSystemTurnEvent);
				if (result == null) result = caseEvent(endSystemTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.START_USER_TURN_EVENT: {
				StartUserTurnEvent startUserTurnEvent = (StartUserTurnEvent)theEObject;
				T result = caseStartUserTurnEvent(startUserTurnEvent);
				if (result == null) result = caseTurnControlEvent(startUserTurnEvent);
				if (result == null) result = caseEvent(startUserTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.END_USER_TURN_EVENT: {
				EndUserTurnEvent endUserTurnEvent = (EndUserTurnEvent)theEObject;
				T result = caseEndUserTurnEvent(endUserTurnEvent);
				if (result == null) result = caseTurnControlEvent(endUserTurnEvent);
				if (result == null) result = caseEvent(endUserTurnEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SYSTEM_FEEDBACK_START_EVENT: {
				SystemFeedbackStartEvent systemFeedbackStartEvent = (SystemFeedbackStartEvent)theEObject;
				T result = caseSystemFeedbackStartEvent(systemFeedbackStartEvent);
				if (result == null) result = caseTurnTimingEvent(systemFeedbackStartEvent);
				if (result == null) result = caseEvent(systemFeedbackStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SYSTEM_ACTION_START_EVENT: {
				SystemActionStartEvent systemActionStartEvent = (SystemActionStartEvent)theEObject;
				T result = caseSystemActionStartEvent(systemActionStartEvent);
				if (result == null) result = caseTurnTimingEvent(systemActionStartEvent);
				if (result == null) result = caseEvent(systemActionStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.SYSTEM_ACTION_END_EVENT: {
				SystemActionEndEvent systemActionEndEvent = (SystemActionEndEvent)theEObject;
				T result = caseSystemActionEndEvent(systemActionEndEvent);
				if (result == null) result = caseTurnTimingEvent(systemActionEndEvent);
				if (result == null) result = caseEvent(systemActionEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.USER_FEEDBACK_START_EVENT: {
				UserFeedbackStartEvent userFeedbackStartEvent = (UserFeedbackStartEvent)theEObject;
				T result = caseUserFeedbackStartEvent(userFeedbackStartEvent);
				if (result == null) result = caseTurnTimingEvent(userFeedbackStartEvent);
				if (result == null) result = caseEvent(userFeedbackStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.USER_ACTION_START_EVENT: {
				UserActionStartEvent userActionStartEvent = (UserActionStartEvent)theEObject;
				T result = caseUserActionStartEvent(userActionStartEvent);
				if (result == null) result = caseTurnTimingEvent(userActionStartEvent);
				if (result == null) result = caseEvent(userActionStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.USER_ACTION_END_EVENT: {
				UserActionEndEvent userActionEndEvent = (UserActionEndEvent)theEObject;
				T result = caseUserActionEndEvent(userActionEndEvent);
				if (result == null) result = caseTurnTimingEvent(userActionEndEvent);
				if (result == null) result = caseEvent(userActionEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputEvent(InputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputEvent(OutputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue Content Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue Content Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogueContentEvent(DialogueContentEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metacomm Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metacomm Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetacommEvent(MetacommEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Control Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Control Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnControlEvent(TurnControlEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Timing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnTimingEvent(TurnTimingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationEvent(NavigationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextEvent(TextEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Input Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Input Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechInputEvent(SpeechInputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenEvent(ScreenEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Content Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Content Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenContentEvent(ScreenContentEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Output Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Output Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechOutputEvent(SpeechOutputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Output Content Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Output Content Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechOutputContentEvent(SpeechOutputContentEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchEvent(TouchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickEvent(ClickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Click Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongClickEvent(LongClickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollEvent(ScrollEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveEvent(MoveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Move Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationMoveEvent(NavigationMoveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationActionEvent(NavigationActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Explore Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Explore Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationExploreEvent(NavigationExploreEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Text Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Text Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyTextEvent(KeyTextEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Explore Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Explore Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyExploreEvent(KeyExploreEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Command Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyCommandEvent(KeyCommandEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Word Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Word Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextWordEvent(TextWordEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Explore Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Explore Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextExploreEvent(TextExploreEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Command Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextCommandEvent(TextCommandEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Elements Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiElementsEvent(GuiElementsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Feedback Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Feedback Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiFeedbackEvent(GuiFeedbackEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiConceptsEvent(GuiConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Noise Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Noise Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiNoiseEvent(GuiNoiseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Questions Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Questions Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiQuestionsEvent(GuiQuestionsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Elements Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechElementsEvent(SpeechElementsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Feedback Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Feedback Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechFeedbackEvent(SpeechFeedbackEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechConceptsEvent(SpeechConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Noise Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Noise Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechNoiseEvent(SpeechNoiseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Questions Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Questions Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechQuestionsEvent(SpeechQuestionsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correct Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correct Answer Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrectAnswerEvent(CorrectAnswerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incorrect Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incorrect Answer Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncorrectAnswerEvent(IncorrectAnswerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partially Correct Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partially Correct Answer Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartiallyCorrectAnswerEvent(PartiallyCorrectAnswerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Answer Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Answer Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotAnswerEvent(NotAnswerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Prompt Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenPromptEvent(OpenPromptEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Open Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Open Prompt Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfOpenPromptEvent(HalfOpenPromptEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Prompt Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedPromptEvent(ClosedPromptEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Question Prompt Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Question Prompt Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoQuestionPromptEvent(NoQuestionPromptEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overall Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overall Words Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverallWordsEvent(OverallWordsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substituted Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substituted Words Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutedWordsEvent(SubstitutedWordsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleted Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleted Words Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletedWordsEvent(DeletedWordsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inserted Words Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inserted Words Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertedWordsEvent(InsertedWordsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overall Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overall Sentences Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverallSentencesEvent(OverallSentencesEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substituted Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substituted Sentences Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutedSentencesEvent(SubstitutedSentencesEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleted Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleted Sentences Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletedSentencesEvent(DeletedSentencesEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inserted Sentences Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inserted Sentences Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertedSentencesEvent(InsertedSentencesEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overall Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overall Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverallConceptsEvent(OverallConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substituted Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substituted Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutedConceptsEvent(SubstitutedConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleted Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleted Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletedConceptsEvent(DeletedConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inserted Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inserted Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertedConceptsEvent(InsertedConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correctly Parsed Utterance Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correctly Parsed Utterance Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrectlyParsedUtteranceEvent(CorrectlyParsedUtteranceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partially Parsed Utterance Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partially Parsed Utterance Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartiallyParsedUtteranceEvent(PartiallyParsedUtteranceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incorrectly Parsed Utterance Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incorrectly Parsed Utterance Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncorrectlyParsedUtteranceEvent(IncorrectlyParsedUtteranceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Elements Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewElementsEvent(NewElementsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Feedback Elements Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Feedback Elements Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewFeedbackElementsEvent(NewFeedbackElementsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Concepts Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Concepts Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewConceptsEvent(NewConceptsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Noise Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Noise Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewNoiseEvent(NewNoiseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Questions Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Questions Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewQuestionsEvent(NewQuestionsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Help Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Help Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelpTurnEvent(HelpTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correction Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correction Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrectionTurnEvent(CorrectionTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelTurnEvent(CancelTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restart Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restart Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestartTurnEvent(RestartTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bargein Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bargein Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBargeinEvent(BargeinEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIV Rejection Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIV Rejection Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIVRejectionEvent(DIVRejectionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASR Rejection Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASR Rejection Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASRRejectionEvent(ASRRejectionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Rejection Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Rejection Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRRejectionEvent(GRRejectionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeoutEvent(TimeoutEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppStartEvent(AppStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppEndEvent(AppEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Dialogue Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Dialogue Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartDialogueEvent(StartDialogueEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Dialogue Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Dialogue Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDialogueEvent(EndDialogueEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start System Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start System Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartSystemTurnEvent(StartSystemTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End System Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End System Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndSystemTurnEvent(EndSystemTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start User Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start User Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartUserTurnEvent(StartUserTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End User Turn Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End User Turn Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndUserTurnEvent(EndUserTurnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Feedback Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Feedback Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemFeedbackStartEvent(SystemFeedbackStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Action Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Action Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemActionStartEvent(SystemActionStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Action End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Action End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemActionEndEvent(SystemActionEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Feedback Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Feedback Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserFeedbackStartEvent(UserFeedbackStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Action Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Action Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserActionStartEvent(UserActionStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Action End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Action End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserActionEndEvent(UserActionEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EventsSwitch
