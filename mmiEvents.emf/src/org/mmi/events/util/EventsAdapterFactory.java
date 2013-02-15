/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mmi.events.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mmi.events.EventsPackage
 * @generated
 */
public class EventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsSwitch<Adapter> modelSwitch =
		new EventsSwitch<Adapter>() {
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseInputEvent(InputEvent object) {
				return createInputEventAdapter();
			}
			@Override
			public Adapter caseOutputEvent(OutputEvent object) {
				return createOutputEventAdapter();
			}
			@Override
			public Adapter caseDialogueContentEvent(DialogueContentEvent object) {
				return createDialogueContentEventAdapter();
			}
			@Override
			public Adapter caseMetacommEvent(MetacommEvent object) {
				return createMetacommEventAdapter();
			}
			@Override
			public Adapter caseTurnControlEvent(TurnControlEvent object) {
				return createTurnControlEventAdapter();
			}
			@Override
			public Adapter caseTurnTimingEvent(TurnTimingEvent object) {
				return createTurnTimingEventAdapter();
			}
			@Override
			public Adapter caseNavigationEvent(NavigationEvent object) {
				return createNavigationEventAdapter();
			}
			@Override
			public Adapter caseTextEvent(TextEvent object) {
				return createTextEventAdapter();
			}
			@Override
			public Adapter caseSpeechInputEvent(SpeechInputEvent object) {
				return createSpeechInputEventAdapter();
			}
			@Override
			public Adapter caseScreenEvent(ScreenEvent object) {
				return createScreenEventAdapter();
			}
			@Override
			public Adapter caseScreenContentEvent(ScreenContentEvent object) {
				return createScreenContentEventAdapter();
			}
			@Override
			public Adapter caseSpeechOutputEvent(SpeechOutputEvent object) {
				return createSpeechOutputEventAdapter();
			}
			@Override
			public Adapter caseSpeechOutputContentEvent(SpeechOutputContentEvent object) {
				return createSpeechOutputContentEventAdapter();
			}
			@Override
			public Adapter caseTouchEvent(TouchEvent object) {
				return createTouchEventAdapter();
			}
			@Override
			public Adapter caseClickEvent(ClickEvent object) {
				return createClickEventAdapter();
			}
			@Override
			public Adapter caseLongClickEvent(LongClickEvent object) {
				return createLongClickEventAdapter();
			}
			@Override
			public Adapter caseScrollEvent(ScrollEvent object) {
				return createScrollEventAdapter();
			}
			@Override
			public Adapter caseMoveEvent(MoveEvent object) {
				return createMoveEventAdapter();
			}
			@Override
			public Adapter caseNavigationMoveEvent(NavigationMoveEvent object) {
				return createNavigationMoveEventAdapter();
			}
			@Override
			public Adapter caseNavigationActionEvent(NavigationActionEvent object) {
				return createNavigationActionEventAdapter();
			}
			@Override
			public Adapter caseNavigationExploreEvent(NavigationExploreEvent object) {
				return createNavigationExploreEventAdapter();
			}
			@Override
			public Adapter caseKeyTextEvent(KeyTextEvent object) {
				return createKeyTextEventAdapter();
			}
			@Override
			public Adapter caseKeyExploreEvent(KeyExploreEvent object) {
				return createKeyExploreEventAdapter();
			}
			@Override
			public Adapter caseKeyCommandEvent(KeyCommandEvent object) {
				return createKeyCommandEventAdapter();
			}
			@Override
			public Adapter caseTextWordEvent(TextWordEvent object) {
				return createTextWordEventAdapter();
			}
			@Override
			public Adapter caseTextExploreEvent(TextExploreEvent object) {
				return createTextExploreEventAdapter();
			}
			@Override
			public Adapter caseTextCommandEvent(TextCommandEvent object) {
				return createTextCommandEventAdapter();
			}
			@Override
			public Adapter caseGuiElementsEvent(GuiElementsEvent object) {
				return createGuiElementsEventAdapter();
			}
			@Override
			public Adapter caseGuiFeedbackEvent(GuiFeedbackEvent object) {
				return createGuiFeedbackEventAdapter();
			}
			@Override
			public Adapter caseGuiConceptsEvent(GuiConceptsEvent object) {
				return createGuiConceptsEventAdapter();
			}
			@Override
			public Adapter caseGuiNoiseEvent(GuiNoiseEvent object) {
				return createGuiNoiseEventAdapter();
			}
			@Override
			public Adapter caseGuiQuestionsEvent(GuiQuestionsEvent object) {
				return createGuiQuestionsEventAdapter();
			}
			@Override
			public Adapter caseSpeechElementsEvent(SpeechElementsEvent object) {
				return createSpeechElementsEventAdapter();
			}
			@Override
			public Adapter caseSpeechFeedbackEvent(SpeechFeedbackEvent object) {
				return createSpeechFeedbackEventAdapter();
			}
			@Override
			public Adapter caseSpeechConceptsEvent(SpeechConceptsEvent object) {
				return createSpeechConceptsEventAdapter();
			}
			@Override
			public Adapter caseSpeechNoiseEvent(SpeechNoiseEvent object) {
				return createSpeechNoiseEventAdapter();
			}
			@Override
			public Adapter caseSpeechQuestionsEvent(SpeechQuestionsEvent object) {
				return createSpeechQuestionsEventAdapter();
			}
			@Override
			public Adapter caseCorrectAnswerEvent(CorrectAnswerEvent object) {
				return createCorrectAnswerEventAdapter();
			}
			@Override
			public Adapter caseIncorrectAnswerEvent(IncorrectAnswerEvent object) {
				return createIncorrectAnswerEventAdapter();
			}
			@Override
			public Adapter casePartiallyCorrectAnswerEvent(PartiallyCorrectAnswerEvent object) {
				return createPartiallyCorrectAnswerEventAdapter();
			}
			@Override
			public Adapter caseNotAnswerEvent(NotAnswerEvent object) {
				return createNotAnswerEventAdapter();
			}
			@Override
			public Adapter caseOpenPromptEvent(OpenPromptEvent object) {
				return createOpenPromptEventAdapter();
			}
			@Override
			public Adapter caseHalfOpenPromptEvent(HalfOpenPromptEvent object) {
				return createHalfOpenPromptEventAdapter();
			}
			@Override
			public Adapter caseClosedPromptEvent(ClosedPromptEvent object) {
				return createClosedPromptEventAdapter();
			}
			@Override
			public Adapter caseNoQuestionPromptEvent(NoQuestionPromptEvent object) {
				return createNoQuestionPromptEventAdapter();
			}
			@Override
			public Adapter caseOverallWordsEvent(OverallWordsEvent object) {
				return createOverallWordsEventAdapter();
			}
			@Override
			public Adapter caseSubstitutedWordsEvent(SubstitutedWordsEvent object) {
				return createSubstitutedWordsEventAdapter();
			}
			@Override
			public Adapter caseDeletedWordsEvent(DeletedWordsEvent object) {
				return createDeletedWordsEventAdapter();
			}
			@Override
			public Adapter caseInsertedWordsEvent(InsertedWordsEvent object) {
				return createInsertedWordsEventAdapter();
			}
			@Override
			public Adapter caseOverallSentencesEvent(OverallSentencesEvent object) {
				return createOverallSentencesEventAdapter();
			}
			@Override
			public Adapter caseSubstitutedSentencesEvent(SubstitutedSentencesEvent object) {
				return createSubstitutedSentencesEventAdapter();
			}
			@Override
			public Adapter caseDeletedSentencesEvent(DeletedSentencesEvent object) {
				return createDeletedSentencesEventAdapter();
			}
			@Override
			public Adapter caseInsertedSentencesEvent(InsertedSentencesEvent object) {
				return createInsertedSentencesEventAdapter();
			}
			@Override
			public Adapter caseOverallConceptsEvent(OverallConceptsEvent object) {
				return createOverallConceptsEventAdapter();
			}
			@Override
			public Adapter caseSubstitutedConceptsEvent(SubstitutedConceptsEvent object) {
				return createSubstitutedConceptsEventAdapter();
			}
			@Override
			public Adapter caseDeletedConceptsEvent(DeletedConceptsEvent object) {
				return createDeletedConceptsEventAdapter();
			}
			@Override
			public Adapter caseInsertedConceptsEvent(InsertedConceptsEvent object) {
				return createInsertedConceptsEventAdapter();
			}
			@Override
			public Adapter caseCorrectlyParsedUtteranceEvent(CorrectlyParsedUtteranceEvent object) {
				return createCorrectlyParsedUtteranceEventAdapter();
			}
			@Override
			public Adapter casePartiallyParsedUtteranceEvent(PartiallyParsedUtteranceEvent object) {
				return createPartiallyParsedUtteranceEventAdapter();
			}
			@Override
			public Adapter caseIncorrectlyParsedUtteranceEvent(IncorrectlyParsedUtteranceEvent object) {
				return createIncorrectlyParsedUtteranceEventAdapter();
			}
			@Override
			public Adapter caseNewElementsEvent(NewElementsEvent object) {
				return createNewElementsEventAdapter();
			}
			@Override
			public Adapter caseNewFeedbackElementsEvent(NewFeedbackElementsEvent object) {
				return createNewFeedbackElementsEventAdapter();
			}
			@Override
			public Adapter caseNewConceptsEvent(NewConceptsEvent object) {
				return createNewConceptsEventAdapter();
			}
			@Override
			public Adapter caseNewNoiseEvent(NewNoiseEvent object) {
				return createNewNoiseEventAdapter();
			}
			@Override
			public Adapter caseNewQuestionsEvent(NewQuestionsEvent object) {
				return createNewQuestionsEventAdapter();
			}
			@Override
			public Adapter caseHelpTurnEvent(HelpTurnEvent object) {
				return createHelpTurnEventAdapter();
			}
			@Override
			public Adapter caseCorrectionTurnEvent(CorrectionTurnEvent object) {
				return createCorrectionTurnEventAdapter();
			}
			@Override
			public Adapter caseCancelTurnEvent(CancelTurnEvent object) {
				return createCancelTurnEventAdapter();
			}
			@Override
			public Adapter caseRestartTurnEvent(RestartTurnEvent object) {
				return createRestartTurnEventAdapter();
			}
			@Override
			public Adapter caseBargeinEvent(BargeinEvent object) {
				return createBargeinEventAdapter();
			}
			@Override
			public Adapter caseDIVRejectionEvent(DIVRejectionEvent object) {
				return createDIVRejectionEventAdapter();
			}
			@Override
			public Adapter caseASRRejectionEvent(ASRRejectionEvent object) {
				return createASRRejectionEventAdapter();
			}
			@Override
			public Adapter caseGRRejectionEvent(GRRejectionEvent object) {
				return createGRRejectionEventAdapter();
			}
			@Override
			public Adapter caseTimeoutEvent(TimeoutEvent object) {
				return createTimeoutEventAdapter();
			}
			@Override
			public Adapter caseAppStartEvent(AppStartEvent object) {
				return createAppStartEventAdapter();
			}
			@Override
			public Adapter caseAppEndEvent(AppEndEvent object) {
				return createAppEndEventAdapter();
			}
			@Override
			public Adapter caseStartDialogueEvent(StartDialogueEvent object) {
				return createStartDialogueEventAdapter();
			}
			@Override
			public Adapter caseEndDialogueEvent(EndDialogueEvent object) {
				return createEndDialogueEventAdapter();
			}
			@Override
			public Adapter caseStartSystemTurnEvent(StartSystemTurnEvent object) {
				return createStartSystemTurnEventAdapter();
			}
			@Override
			public Adapter caseEndSystemTurnEvent(EndSystemTurnEvent object) {
				return createEndSystemTurnEventAdapter();
			}
			@Override
			public Adapter caseStartUserTurnEvent(StartUserTurnEvent object) {
				return createStartUserTurnEventAdapter();
			}
			@Override
			public Adapter caseEndUserTurnEvent(EndUserTurnEvent object) {
				return createEndUserTurnEventAdapter();
			}
			@Override
			public Adapter caseSystemFeedbackStartEvent(SystemFeedbackStartEvent object) {
				return createSystemFeedbackStartEventAdapter();
			}
			@Override
			public Adapter caseSystemActionStartEvent(SystemActionStartEvent object) {
				return createSystemActionStartEventAdapter();
			}
			@Override
			public Adapter caseSystemActionEndEvent(SystemActionEndEvent object) {
				return createSystemActionEndEventAdapter();
			}
			@Override
			public Adapter caseUserFeedbackStartEvent(UserFeedbackStartEvent object) {
				return createUserFeedbackStartEventAdapter();
			}
			@Override
			public Adapter caseUserActionStartEvent(UserActionStartEvent object) {
				return createUserActionStartEventAdapter();
			}
			@Override
			public Adapter caseUserActionEndEvent(UserActionEndEvent object) {
				return createUserActionEndEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.InputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.InputEvent
	 * @generated
	 */
	public Adapter createInputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.OutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.OutputEvent
	 * @generated
	 */
	public Adapter createOutputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.DialogueContentEvent <em>Dialogue Content Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.DialogueContentEvent
	 * @generated
	 */
	public Adapter createDialogueContentEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.MetacommEvent <em>Metacomm Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.MetacommEvent
	 * @generated
	 */
	public Adapter createMetacommEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TurnControlEvent <em>Turn Control Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TurnControlEvent
	 * @generated
	 */
	public Adapter createTurnControlEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TurnTimingEvent <em>Turn Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TurnTimingEvent
	 * @generated
	 */
	public Adapter createTurnTimingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NavigationEvent <em>Navigation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NavigationEvent
	 * @generated
	 */
	public Adapter createNavigationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TextEvent <em>Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TextEvent
	 * @generated
	 */
	public Adapter createTextEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechInputEvent <em>Speech Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechInputEvent
	 * @generated
	 */
	public Adapter createSpeechInputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.ScreenEvent <em>Screen Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.ScreenEvent
	 * @generated
	 */
	public Adapter createScreenEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.ScreenContentEvent <em>Screen Content Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.ScreenContentEvent
	 * @generated
	 */
	public Adapter createScreenContentEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechOutputEvent <em>Speech Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechOutputEvent
	 * @generated
	 */
	public Adapter createSpeechOutputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechOutputContentEvent <em>Speech Output Content Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechOutputContentEvent
	 * @generated
	 */
	public Adapter createSpeechOutputContentEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TouchEvent <em>Touch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TouchEvent
	 * @generated
	 */
	public Adapter createTouchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.ClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.ClickEvent
	 * @generated
	 */
	public Adapter createClickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.LongClickEvent <em>Long Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.LongClickEvent
	 * @generated
	 */
	public Adapter createLongClickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.ScrollEvent <em>Scroll Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.ScrollEvent
	 * @generated
	 */
	public Adapter createScrollEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.MoveEvent <em>Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.MoveEvent
	 * @generated
	 */
	public Adapter createMoveEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NavigationMoveEvent <em>Navigation Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NavigationMoveEvent
	 * @generated
	 */
	public Adapter createNavigationMoveEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NavigationActionEvent <em>Navigation Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NavigationActionEvent
	 * @generated
	 */
	public Adapter createNavigationActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NavigationExploreEvent <em>Navigation Explore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NavigationExploreEvent
	 * @generated
	 */
	public Adapter createNavigationExploreEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.KeyTextEvent <em>Key Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.KeyTextEvent
	 * @generated
	 */
	public Adapter createKeyTextEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.KeyExploreEvent <em>Key Explore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.KeyExploreEvent
	 * @generated
	 */
	public Adapter createKeyExploreEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.KeyCommandEvent <em>Key Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.KeyCommandEvent
	 * @generated
	 */
	public Adapter createKeyCommandEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TextWordEvent <em>Text Word Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TextWordEvent
	 * @generated
	 */
	public Adapter createTextWordEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TextExploreEvent <em>Text Explore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TextExploreEvent
	 * @generated
	 */
	public Adapter createTextExploreEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TextCommandEvent <em>Text Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TextCommandEvent
	 * @generated
	 */
	public Adapter createTextCommandEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.GuiElementsEvent <em>Gui Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.GuiElementsEvent
	 * @generated
	 */
	public Adapter createGuiElementsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.GuiFeedbackEvent <em>Gui Feedback Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.GuiFeedbackEvent
	 * @generated
	 */
	public Adapter createGuiFeedbackEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.GuiConceptsEvent <em>Gui Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.GuiConceptsEvent
	 * @generated
	 */
	public Adapter createGuiConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.GuiNoiseEvent <em>Gui Noise Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.GuiNoiseEvent
	 * @generated
	 */
	public Adapter createGuiNoiseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.GuiQuestionsEvent <em>Gui Questions Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.GuiQuestionsEvent
	 * @generated
	 */
	public Adapter createGuiQuestionsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechElementsEvent <em>Speech Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechElementsEvent
	 * @generated
	 */
	public Adapter createSpeechElementsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechFeedbackEvent <em>Speech Feedback Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechFeedbackEvent
	 * @generated
	 */
	public Adapter createSpeechFeedbackEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechConceptsEvent <em>Speech Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechConceptsEvent
	 * @generated
	 */
	public Adapter createSpeechConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechNoiseEvent <em>Speech Noise Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechNoiseEvent
	 * @generated
	 */
	public Adapter createSpeechNoiseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SpeechQuestionsEvent <em>Speech Questions Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SpeechQuestionsEvent
	 * @generated
	 */
	public Adapter createSpeechQuestionsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.CorrectAnswerEvent <em>Correct Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.CorrectAnswerEvent
	 * @generated
	 */
	public Adapter createCorrectAnswerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.IncorrectAnswerEvent <em>Incorrect Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.IncorrectAnswerEvent
	 * @generated
	 */
	public Adapter createIncorrectAnswerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.PartiallyCorrectAnswerEvent <em>Partially Correct Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.PartiallyCorrectAnswerEvent
	 * @generated
	 */
	public Adapter createPartiallyCorrectAnswerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NotAnswerEvent <em>Not Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NotAnswerEvent
	 * @generated
	 */
	public Adapter createNotAnswerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.OpenPromptEvent <em>Open Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.OpenPromptEvent
	 * @generated
	 */
	public Adapter createOpenPromptEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.HalfOpenPromptEvent <em>Half Open Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.HalfOpenPromptEvent
	 * @generated
	 */
	public Adapter createHalfOpenPromptEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.ClosedPromptEvent <em>Closed Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.ClosedPromptEvent
	 * @generated
	 */
	public Adapter createClosedPromptEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NoQuestionPromptEvent <em>No Question Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NoQuestionPromptEvent
	 * @generated
	 */
	public Adapter createNoQuestionPromptEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.OverallWordsEvent <em>Overall Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.OverallWordsEvent
	 * @generated
	 */
	public Adapter createOverallWordsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SubstitutedWordsEvent <em>Substituted Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SubstitutedWordsEvent
	 * @generated
	 */
	public Adapter createSubstitutedWordsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.DeletedWordsEvent <em>Deleted Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.DeletedWordsEvent
	 * @generated
	 */
	public Adapter createDeletedWordsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.InsertedWordsEvent <em>Inserted Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.InsertedWordsEvent
	 * @generated
	 */
	public Adapter createInsertedWordsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.OverallSentencesEvent <em>Overall Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.OverallSentencesEvent
	 * @generated
	 */
	public Adapter createOverallSentencesEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SubstitutedSentencesEvent <em>Substituted Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SubstitutedSentencesEvent
	 * @generated
	 */
	public Adapter createSubstitutedSentencesEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.DeletedSentencesEvent <em>Deleted Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.DeletedSentencesEvent
	 * @generated
	 */
	public Adapter createDeletedSentencesEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.InsertedSentencesEvent <em>Inserted Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.InsertedSentencesEvent
	 * @generated
	 */
	public Adapter createInsertedSentencesEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.OverallConceptsEvent <em>Overall Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.OverallConceptsEvent
	 * @generated
	 */
	public Adapter createOverallConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SubstitutedConceptsEvent <em>Substituted Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SubstitutedConceptsEvent
	 * @generated
	 */
	public Adapter createSubstitutedConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.DeletedConceptsEvent <em>Deleted Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.DeletedConceptsEvent
	 * @generated
	 */
	public Adapter createDeletedConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.InsertedConceptsEvent <em>Inserted Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.InsertedConceptsEvent
	 * @generated
	 */
	public Adapter createInsertedConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.CorrectlyParsedUtteranceEvent <em>Correctly Parsed Utterance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.CorrectlyParsedUtteranceEvent
	 * @generated
	 */
	public Adapter createCorrectlyParsedUtteranceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.PartiallyParsedUtteranceEvent <em>Partially Parsed Utterance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.PartiallyParsedUtteranceEvent
	 * @generated
	 */
	public Adapter createPartiallyParsedUtteranceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.IncorrectlyParsedUtteranceEvent <em>Incorrectly Parsed Utterance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.IncorrectlyParsedUtteranceEvent
	 * @generated
	 */
	public Adapter createIncorrectlyParsedUtteranceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NewElementsEvent <em>New Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NewElementsEvent
	 * @generated
	 */
	public Adapter createNewElementsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NewFeedbackElementsEvent <em>New Feedback Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NewFeedbackElementsEvent
	 * @generated
	 */
	public Adapter createNewFeedbackElementsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NewConceptsEvent <em>New Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NewConceptsEvent
	 * @generated
	 */
	public Adapter createNewConceptsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NewNoiseEvent <em>New Noise Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NewNoiseEvent
	 * @generated
	 */
	public Adapter createNewNoiseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.NewQuestionsEvent <em>New Questions Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.NewQuestionsEvent
	 * @generated
	 */
	public Adapter createNewQuestionsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.HelpTurnEvent <em>Help Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.HelpTurnEvent
	 * @generated
	 */
	public Adapter createHelpTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.CorrectionTurnEvent <em>Correction Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.CorrectionTurnEvent
	 * @generated
	 */
	public Adapter createCorrectionTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.CancelTurnEvent <em>Cancel Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.CancelTurnEvent
	 * @generated
	 */
	public Adapter createCancelTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.RestartTurnEvent <em>Restart Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.RestartTurnEvent
	 * @generated
	 */
	public Adapter createRestartTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.BargeinEvent <em>Bargein Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.BargeinEvent
	 * @generated
	 */
	public Adapter createBargeinEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.DIVRejectionEvent <em>DIV Rejection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.DIVRejectionEvent
	 * @generated
	 */
	public Adapter createDIVRejectionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.ASRRejectionEvent <em>ASR Rejection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.ASRRejectionEvent
	 * @generated
	 */
	public Adapter createASRRejectionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.GRRejectionEvent <em>GR Rejection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.GRRejectionEvent
	 * @generated
	 */
	public Adapter createGRRejectionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.TimeoutEvent <em>Timeout Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.TimeoutEvent
	 * @generated
	 */
	public Adapter createTimeoutEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.AppStartEvent <em>App Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.AppStartEvent
	 * @generated
	 */
	public Adapter createAppStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.AppEndEvent <em>App End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.AppEndEvent
	 * @generated
	 */
	public Adapter createAppEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.StartDialogueEvent <em>Start Dialogue Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.StartDialogueEvent
	 * @generated
	 */
	public Adapter createStartDialogueEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.EndDialogueEvent <em>End Dialogue Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.EndDialogueEvent
	 * @generated
	 */
	public Adapter createEndDialogueEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.StartSystemTurnEvent <em>Start System Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.StartSystemTurnEvent
	 * @generated
	 */
	public Adapter createStartSystemTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.EndSystemTurnEvent <em>End System Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.EndSystemTurnEvent
	 * @generated
	 */
	public Adapter createEndSystemTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.StartUserTurnEvent <em>Start User Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.StartUserTurnEvent
	 * @generated
	 */
	public Adapter createStartUserTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.EndUserTurnEvent <em>End User Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.EndUserTurnEvent
	 * @generated
	 */
	public Adapter createEndUserTurnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SystemFeedbackStartEvent <em>System Feedback Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SystemFeedbackStartEvent
	 * @generated
	 */
	public Adapter createSystemFeedbackStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SystemActionStartEvent <em>System Action Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SystemActionStartEvent
	 * @generated
	 */
	public Adapter createSystemActionStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.SystemActionEndEvent <em>System Action End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.SystemActionEndEvent
	 * @generated
	 */
	public Adapter createSystemActionEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.UserFeedbackStartEvent <em>User Feedback Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.UserFeedbackStartEvent
	 * @generated
	 */
	public Adapter createUserFeedbackStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.UserActionStartEvent <em>User Action Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.UserActionStartEvent
	 * @generated
	 */
	public Adapter createUserActionStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.events.UserActionEndEvent <em>User Action End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.events.UserActionEndEvent
	 * @generated
	 */
	public Adapter createUserActionEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EventsAdapterFactory
