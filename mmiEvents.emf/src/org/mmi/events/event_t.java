/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>event t</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.events.EventsPackage#getevent_t()
 * @model
 * @generated
 */
public enum event_t implements Enumerator {
	/**
	 * The '<em><b>TOUCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH(101, "TOUCH", "TOUCH"),

	/**
	 * The '<em><b>CLICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICK_VALUE
	 * @generated
	 * @ordered
	 */
	CLICK(102, "CLICK", "CLICK"),

	/**
	 * The '<em><b>LONGCLICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONGCLICK_VALUE
	 * @generated
	 * @ordered
	 */
	LONGCLICK(103, "LONGCLICK", "LONGCLICK"),

	/**
	 * The '<em><b>ITEMCLICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEMCLICK_VALUE
	 * @generated
	 * @ordered
	 */
	ITEMCLICK(104, "ITEMCLICK", "ITEMCLICK"),

	/**
	 * The '<em><b>ITEMLONGCLICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEMLONGCLICK_VALUE
	 * @generated
	 * @ordered
	 */
	ITEMLONGCLICK(105, "ITEMLONGCLICK", "ITEMLONGCLICK"),

	/**
	 * The '<em><b>SCROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL(106, "SCROLL", "SCROLL"),

	/**
	 * The '<em><b>MOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE(107, "MOVE", "MOVE"),

	/**
	 * The '<em><b>NAVIGATIONMOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONMOVE(1001, "NAVIGATIONMOVE", "NAVIGATIONMOVE"),

	/**
	 * The '<em><b>NAVIGATIONLENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONLENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONLENGTH(1002, "NAVIGATIONLENGTH", "NAVIGATIONLENGTH"),

	/**
	 * The '<em><b>NAVIGATIONACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONACTION(1003, "NAVIGATIONACTION", "NAVIGATIONACTION"),

	/**
	 * The '<em><b>NAVIGATIONEXPLORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONEXPLORE_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONEXPLORE(1004, "NAVIGATIONEXPLORE", "NAVIGATIONEXPLORE"),

	/**
	 * The '<em><b>KEYTEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	KEYTEXT(201, "KEYTEXT", "KEYTEXT"),

	/**
	 * The '<em><b>KEYEXPLORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYEXPLORE_VALUE
	 * @generated
	 * @ordered
	 */
	KEYEXPLORE(202, "KEYEXPLORE", "KEYEXPLORE"),

	/**
	 * The '<em><b>KEYCOMMAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYCOMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	KEYCOMMAND(203, "KEYCOMMAND", "KEYCOMMAND"),

	/**
	 * The '<em><b>TEXTWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTWORD_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTWORD(2001, "TEXTWORD", "TEXTWORD"),

	/**
	 * The '<em><b>TEXTEXPLORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTEXPLORE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTEXPLORE(2002, "TEXTEXPLORE", "TEXTEXPLORE"),

	/**
	 * The '<em><b>TEXTCOMMAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTCOMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTCOMMAND(2003, "TEXTCOMMAND", "TEXTCOMMAND"),

	/**
	 * The '<em><b>OVERALLWORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERALLWORDS_VALUE
	 * @generated
	 * @ordered
	 */
	OVERALLWORDS(7001, "OVERALLWORDS", "OVERALLWORDS"),

	/**
	 * The '<em><b>SUBSTITUTEDWORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTEDWORDS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTEDWORDS(7002, "SUBSTITUTEDWORDS", "SUBSTITUTEDWORDS"),

	/**
	 * The '<em><b>DELETEDWORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETEDWORDS_VALUE
	 * @generated
	 * @ordered
	 */
	DELETEDWORDS(7003, "DELETEDWORDS", "DELETEDWORDS"),

	/**
	 * The '<em><b>INSERTEDWORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTEDWORDS_VALUE
	 * @generated
	 * @ordered
	 */
	INSERTEDWORDS(7004, "INSERTEDWORDS", "INSERTEDWORDS"),

	/**
	 * The '<em><b>OVERALLSENTENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERALLSENTENCES_VALUE
	 * @generated
	 * @ordered
	 */
	OVERALLSENTENCES(7005, "OVERALLSENTENCES", "OVERALLSENTENCES"),

	/**
	 * The '<em><b>SUBSTITUTEDSENTENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTEDSENTENCES_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTEDSENTENCES(7006, "SUBSTITUTEDSENTENCES", "SUBSTITUTEDSENTENCES"),

	/**
	 * The '<em><b>DELETEDSENTENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETEDSENTENCES_VALUE
	 * @generated
	 * @ordered
	 */
	DELETEDSENTENCES(7007, "DELETEDSENTENCES", "DELETEDSENTENCES"),

	/**
	 * The '<em><b>INSERTEDSENTENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTEDSENTENCES_VALUE
	 * @generated
	 * @ordered
	 */
	INSERTEDSENTENCES(7008, "INSERTEDSENTENCES", "INSERTEDSENTENCES"),

	/**
	 * The '<em><b>OVERALLCONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERALLCONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	OVERALLCONCEPTS(7009, "OVERALLCONCEPTS", "OVERALLCONCEPTS"),

	/**
	 * The '<em><b>SUBSTITUTEDCONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTEDCONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTEDCONCEPTS(7010, "SUBSTITUTEDCONCEPTS", "SUBSTITUTEDCONCEPTS"),

	/**
	 * The '<em><b>DELETEDCONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETEDCONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	DELETEDCONCEPTS(7011, "DELETEDCONCEPTS", "DELETEDCONCEPTS"),

	/**
	 * The '<em><b>INSERTEDCONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTEDCONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	INSERTEDCONCEPTS(7012, "INSERTEDCONCEPTS", "INSERTEDCONCEPTS"),

	/**
	 * The '<em><b>CORRECTLYPARSEDUTTERANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTLYPARSEDUTTERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTLYPARSEDUTTERANCE(7013, "CORRECTLYPARSEDUTTERANCE", "CORRECTLYPARSEDUTTERANCE"),

	/**
	 * The '<em><b>PARTIALLYPARSEDUTTERANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYPARSEDUTTERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLYPARSEDUTTERANCE(7014, "PARTIALLYPARSEDUTTERANCE", "PARTIALLYPARSEDUTTERANCE"),

	/**
	 * The '<em><b>INCORRECTLYPARSEDUTTERANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCORRECTLYPARSEDUTTERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INCORRECTLYPARSEDUTTERANCE(7015, "INCORRECTLYPARSEDUTTERANCE", "INCORRECTLYPARSEDUTTERANCE"),

	/**
	 * The '<em><b>GUIELEMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUIELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	GUIELEMENTS(401, "GUIELEMENTS", "GUIELEMENTS"),

	/**
	 * The '<em><b>GUIFEEDBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUIFEEDBACK_VALUE
	 * @generated
	 * @ordered
	 */
	GUIFEEDBACK(402, "GUIFEEDBACK", "GUIFEEDBACK"),

	/**
	 * The '<em><b>GUICONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUICONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	GUICONCEPTS(403, "GUICONCEPTS", "GUICONCEPTS"),

	/**
	 * The '<em><b>GUINOISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUINOISE_VALUE
	 * @generated
	 * @ordered
	 */
	GUINOISE(404, "GUINOISE", "GUINOISE"),

	/**
	 * The '<em><b>GUIQUESTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUIQUESTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	GUIQUESTIONS(405, "GUIQUESTIONS", "GUIQUESTIONS"),

	/**
	 * The '<em><b>SPEECHELEMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECHELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECHELEMENTS(411, "SPEECHELEMENTS", "SPEECHELEMENTS"),

	/**
	 * The '<em><b>SPEECHFEEDBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECHFEEDBACK_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECHFEEDBACK(412, "SPEECHFEEDBACK", "SPEECHFEEDBACK"),

	/**
	 * The '<em><b>SPEECHCONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECHCONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECHCONCEPTS(413, "SPEECHCONCEPTS", "SPEECHCONCEPTS"),

	/**
	 * The '<em><b>SPEECHNOISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECHNOISE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECHNOISE(414, "SPEECHNOISE", "SPEECHNOISE"),

	/**
	 * The '<em><b>SPEECHQUESTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECHQUESTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECHQUESTIONS(414, "SPEECHQUESTIONS", "SPEECHQUESTIONS"),

	/**
	 * The '<em><b>NEWELEMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	NEWELEMENTS(4001, "NEWELEMENTS", "NEWELEMENTS"),

	/**
	 * The '<em><b>NEWFEEDBACKELEMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWFEEDBACKELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	NEWFEEDBACKELEMENTS(4002, "NEWFEEDBACKELEMENTS", "NEWFEEDBACKELEMENTS"),

	/**
	 * The '<em><b>NEWCONCEPTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWCONCEPTS_VALUE
	 * @generated
	 * @ordered
	 */
	NEWCONCEPTS(4003, "NEWCONCEPTS", "NEWCONCEPTS"),

	/**
	 * The '<em><b>NEWNOISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWNOISE_VALUE
	 * @generated
	 * @ordered
	 */
	NEWNOISE(4004, "NEWNOISE", "NEWNOISE"),

	/**
	 * The '<em><b>NEWQUESTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWQUESTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NEWQUESTIONS(4005, "NEWQUESTIONS", "NEWQUESTIONS"),

	/**
	 * The '<em><b>HELPTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELPTURN_VALUE
	 * @generated
	 * @ordered
	 */
	HELPTURN(5002, "HELPTURN", "HELPTURN"),

	/**
	 * The '<em><b>CORRECTIONTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTIONTURN_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTIONTURN(5003, "CORRECTIONTURN", "CORRECTIONTURN"),

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEOUT(5004, "TIMEOUT", "TIMEOUT"),

	/**
	 * The '<em><b>CANCELTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELTURN_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELTURN(5005, "CANCELTURN", "CANCELTURN"),

	/**
	 * The '<em><b>RESTARTTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTARTTURN_VALUE
	 * @generated
	 * @ordered
	 */
	RESTARTTURN(5006, "RESTARTTURN", "RESTARTTURN"),

	/**
	 * The '<em><b>BARGEIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARGEIN_VALUE
	 * @generated
	 * @ordered
	 */
	BARGEIN(5007, "BARGEIN", "BARGEIN"),

	/**
	 * The '<em><b>DIVREJECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVREJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DIVREJECTION(5008, "DIVREJECTION", "DIVREJECTION"),

	/**
	 * The '<em><b>ASRREJECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASRREJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ASRREJECTION(5009, "ASRREJECTION", "ASRREJECTION"),

	/**
	 * The '<em><b>GRREJECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRREJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	GRREJECTION(5010, "GRREJECTION", "GRREJECTION"),

	/**
	 * The '<em><b>CORRECTANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTANSWER(6001, "CORRECTANSWER", "CORRECTANSWER"),

	/**
	 * The '<em><b>INCORRECTANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCORRECTANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	INCORRECTANSWER(6002, "INCORRECTANSWER", "INCORRECTANSWER"),

	/**
	 * The '<em><b>PARTIALLYCORRECTANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYCORRECTANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLYCORRECTANSWER(6003, "PARTIALLYCORRECTANSWER", "PARTIALLYCORRECTANSWER"),

	/**
	 * The '<em><b>NOTANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	NOTANSWER(6004, "NOTANSWER", "NOTANSWER"),

	/**
	 * The '<em><b>OPENPROMPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENPROMPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPENPROMPT(6005, "OPENPROMPT", "OPENPROMPT"),

	/**
	 * The '<em><b>HALFOPENPROMPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFOPENPROMPT_VALUE
	 * @generated
	 * @ordered
	 */
	HALFOPENPROMPT(6006, "HALFOPENPROMPT", "HALFOPENPROMPT"),

	/**
	 * The '<em><b>CLOSEDPROMPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEDPROMPT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEDPROMPT(6007, "CLOSEDPROMPT", "CLOSEDPROMPT"),

	/**
	 * The '<em><b>NOQUESTIONPROMPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOQUESTIONPROMPT_VALUE
	 * @generated
	 * @ordered
	 */
	NOQUESTIONPROMPT(6008, "NOQUESTIONPROMPT", "NOQUESTIONPROMPT"),

	/**
	 * The '<em><b>APPSTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPSTART_VALUE
	 * @generated
	 * @ordered
	 */
	APPSTART(901, "APPSTART", "APPSTART"),

	/**
	 * The '<em><b>APPEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND_VALUE
	 * @generated
	 * @ordered
	 */
	APPEND(902, "APPEND", "APPEND"),

	/**
	 * The '<em><b>STARTDIALOGUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTDIALOGUE_VALUE
	 * @generated
	 * @ordered
	 */
	STARTDIALOGUE(9001, "STARTDIALOGUE", "STARTDIALOGUE"),

	/**
	 * The '<em><b>ENDDIALOGUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDDIALOGUE_VALUE
	 * @generated
	 * @ordered
	 */
	ENDDIALOGUE(9002, "ENDDIALOGUE", "ENDDIALOGUE"),

	/**
	 * The '<em><b>STARTSYSTEMTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTSYSTEMTURN_VALUE
	 * @generated
	 * @ordered
	 */
	STARTSYSTEMTURN(9003, "STARTSYSTEMTURN", "STARTSYSTEMTURN"),

	/**
	 * The '<em><b>SYSTEMFEEDBACKSTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEMFEEDBACKSTART_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEMFEEDBACKSTART(9004, "SYSTEMFEEDBACKSTART", "SYSTEMFEEDBACKSTART"),

	/**
	 * The '<em><b>SYSTEMACTIONSTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEMACTIONSTART_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEMACTIONSTART(9005, "SYSTEMACTIONSTART", "SYSTEMACTIONSTART"),

	/**
	 * The '<em><b>SYSTEMACTIONEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEMACTIONEND_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEMACTIONEND(9006, "SYSTEMACTIONEND", "SYSTEMACTIONEND"),

	/**
	 * The '<em><b>ENDSYSTEMTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDSYSTEMTURN_VALUE
	 * @generated
	 * @ordered
	 */
	ENDSYSTEMTURN(9007, "ENDSYSTEMTURN", "ENDSYSTEMTURN"),

	/**
	 * The '<em><b>STARTUSERTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTUSERTURN_VALUE
	 * @generated
	 * @ordered
	 */
	STARTUSERTURN(9008, "STARTUSERTURN", "STARTUSERTURN"),

	/**
	 * The '<em><b>USERFEEDBACKSTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERFEEDBACKSTART_VALUE
	 * @generated
	 * @ordered
	 */
	USERFEEDBACKSTART(9009, "USERFEEDBACKSTART", "USERFEEDBACKSTART"),

	/**
	 * The '<em><b>USERACTIONSTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERACTIONSTART_VALUE
	 * @generated
	 * @ordered
	 */
	USERACTIONSTART(9010, "USERACTIONSTART", "USERACTIONSTART"),

	/**
	 * The '<em><b>USERACTIONEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERACTIONEND_VALUE
	 * @generated
	 * @ordered
	 */
	USERACTIONEND(9011, "USERACTIONEND", "USERACTIONEND"),

	/**
	 * The '<em><b>ENDUSERTURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDUSERTURN_VALUE
	 * @generated
	 * @ordered
	 */
	ENDUSERTURN(9012, "ENDUSERTURN", "ENDUSERTURN");

	/**
	 * The '<em><b>TOUCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOUCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_VALUE = 101;

	/**
	 * The '<em><b>CLICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLICK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLICK_VALUE = 102;

	/**
	 * The '<em><b>LONGCLICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONGCLICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONGCLICK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONGCLICK_VALUE = 103;

	/**
	 * The '<em><b>ITEMCLICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEMCLICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEMCLICK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEMCLICK_VALUE = 104;

	/**
	 * The '<em><b>ITEMLONGCLICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEMLONGCLICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEMLONGCLICK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEMLONGCLICK_VALUE = 105;

	/**
	 * The '<em><b>SCROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_VALUE = 106;

	/**
	 * The '<em><b>MOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_VALUE = 107;

	/**
	 * The '<em><b>NAVIGATIONMOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAVIGATIONMOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONMOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONMOVE_VALUE = 1001;

	/**
	 * The '<em><b>NAVIGATIONLENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAVIGATIONLENGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONLENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONLENGTH_VALUE = 1002;

	/**
	 * The '<em><b>NAVIGATIONACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAVIGATIONACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONACTION_VALUE = 1003;

	/**
	 * The '<em><b>NAVIGATIONEXPLORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAVIGATIONEXPLORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONEXPLORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONEXPLORE_VALUE = 1004;

	/**
	 * The '<em><b>KEYTEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYTEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYTEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYTEXT_VALUE = 201;

	/**
	 * The '<em><b>KEYEXPLORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYEXPLORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYEXPLORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYEXPLORE_VALUE = 202;

	/**
	 * The '<em><b>KEYCOMMAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYCOMMAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYCOMMAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYCOMMAND_VALUE = 203;

	/**
	 * The '<em><b>TEXTWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTWORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTWORD_VALUE = 2001;

	/**
	 * The '<em><b>TEXTEXPLORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTEXPLORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTEXPLORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTEXPLORE_VALUE = 2002;

	/**
	 * The '<em><b>TEXTCOMMAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTCOMMAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTCOMMAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTCOMMAND_VALUE = 2003;

	/**
	 * The '<em><b>OVERALLWORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERALLWORDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERALLWORDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERALLWORDS_VALUE = 7001;

	/**
	 * The '<em><b>SUBSTITUTEDWORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBSTITUTEDWORDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTEDWORDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTEDWORDS_VALUE = 7002;

	/**
	 * The '<em><b>DELETEDWORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETEDWORDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETEDWORDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETEDWORDS_VALUE = 7003;

	/**
	 * The '<em><b>INSERTEDWORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSERTEDWORDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERTEDWORDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERTEDWORDS_VALUE = 7004;

	/**
	 * The '<em><b>OVERALLSENTENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERALLSENTENCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERALLSENTENCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERALLSENTENCES_VALUE = 7005;

	/**
	 * The '<em><b>SUBSTITUTEDSENTENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBSTITUTEDSENTENCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTEDSENTENCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTEDSENTENCES_VALUE = 7006;

	/**
	 * The '<em><b>DELETEDSENTENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETEDSENTENCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETEDSENTENCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETEDSENTENCES_VALUE = 7007;

	/**
	 * The '<em><b>INSERTEDSENTENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSERTEDSENTENCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERTEDSENTENCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERTEDSENTENCES_VALUE = 7008;

	/**
	 * The '<em><b>OVERALLCONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERALLCONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERALLCONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERALLCONCEPTS_VALUE = 7009;

	/**
	 * The '<em><b>SUBSTITUTEDCONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBSTITUTEDCONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTEDCONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTEDCONCEPTS_VALUE = 7010;

	/**
	 * The '<em><b>DELETEDCONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETEDCONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETEDCONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETEDCONCEPTS_VALUE = 7011;

	/**
	 * The '<em><b>INSERTEDCONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSERTEDCONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERTEDCONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERTEDCONCEPTS_VALUE = 7012;

	/**
	 * The '<em><b>CORRECTLYPARSEDUTTERANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORRECTLYPARSEDUTTERANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRECTLYPARSEDUTTERANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTLYPARSEDUTTERANCE_VALUE = 7013;

	/**
	 * The '<em><b>PARTIALLYPARSEDUTTERANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIALLYPARSEDUTTERANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYPARSEDUTTERANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLYPARSEDUTTERANCE_VALUE = 7014;

	/**
	 * The '<em><b>INCORRECTLYPARSEDUTTERANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCORRECTLYPARSEDUTTERANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCORRECTLYPARSEDUTTERANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCORRECTLYPARSEDUTTERANCE_VALUE = 7015;

	/**
	 * The '<em><b>GUIELEMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUIELEMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUIELEMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUIELEMENTS_VALUE = 401;

	/**
	 * The '<em><b>GUIFEEDBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUIFEEDBACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUIFEEDBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUIFEEDBACK_VALUE = 402;

	/**
	 * The '<em><b>GUICONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUICONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUICONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUICONCEPTS_VALUE = 403;

	/**
	 * The '<em><b>GUINOISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUINOISE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUINOISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUINOISE_VALUE = 404;

	/**
	 * The '<em><b>GUIQUESTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUIQUESTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUIQUESTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUIQUESTIONS_VALUE = 405;

	/**
	 * The '<em><b>SPEECHELEMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEECHELEMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECHELEMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEECHELEMENTS_VALUE = 411;

	/**
	 * The '<em><b>SPEECHFEEDBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEECHFEEDBACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECHFEEDBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEECHFEEDBACK_VALUE = 412;

	/**
	 * The '<em><b>SPEECHCONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEECHCONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECHCONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEECHCONCEPTS_VALUE = 413;

	/**
	 * The '<em><b>SPEECHNOISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEECHNOISE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECHNOISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEECHNOISE_VALUE = 414;

	/**
	 * The '<em><b>SPEECHQUESTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEECHQUESTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECHQUESTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEECHQUESTIONS_VALUE = 414;

	/**
	 * The '<em><b>NEWELEMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEWELEMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEWELEMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEWELEMENTS_VALUE = 4001;

	/**
	 * The '<em><b>NEWFEEDBACKELEMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEWFEEDBACKELEMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEWFEEDBACKELEMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEWFEEDBACKELEMENTS_VALUE = 4002;

	/**
	 * The '<em><b>NEWCONCEPTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEWCONCEPTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEWCONCEPTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEWCONCEPTS_VALUE = 4003;

	/**
	 * The '<em><b>NEWNOISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEWNOISE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEWNOISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEWNOISE_VALUE = 4004;

	/**
	 * The '<em><b>NEWQUESTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEWQUESTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEWQUESTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEWQUESTIONS_VALUE = 4005;

	/**
	 * The '<em><b>HELPTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HELPTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELPTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HELPTURN_VALUE = 5002;

	/**
	 * The '<em><b>CORRECTIONTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORRECTIONTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRECTIONTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTIONTURN_VALUE = 5003;

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEOUT_VALUE = 5004;

	/**
	 * The '<em><b>CANCELTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCELTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCELTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCELTURN_VALUE = 5005;

	/**
	 * The '<em><b>RESTARTTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTARTTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTARTTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTARTTURN_VALUE = 5006;

	/**
	 * The '<em><b>BARGEIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BARGEIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARGEIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BARGEIN_VALUE = 5007;

	/**
	 * The '<em><b>DIVREJECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIVREJECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVREJECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVREJECTION_VALUE = 5008;

	/**
	 * The '<em><b>ASRREJECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASRREJECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASRREJECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASRREJECTION_VALUE = 5009;

	/**
	 * The '<em><b>GRREJECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRREJECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRREJECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRREJECTION_VALUE = 5010;

	/**
	 * The '<em><b>CORRECTANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORRECTANSWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRECTANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTANSWER_VALUE = 6001;

	/**
	 * The '<em><b>INCORRECTANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCORRECTANSWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCORRECTANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCORRECTANSWER_VALUE = 6002;

	/**
	 * The '<em><b>PARTIALLYCORRECTANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIALLYCORRECTANSWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYCORRECTANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLYCORRECTANSWER_VALUE = 6003;

	/**
	 * The '<em><b>NOTANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTANSWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTANSWER_VALUE = 6004;

	/**
	 * The '<em><b>OPENPROMPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPENPROMPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENPROMPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENPROMPT_VALUE = 6005;

	/**
	 * The '<em><b>HALFOPENPROMPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALFOPENPROMPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALFOPENPROMPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFOPENPROMPT_VALUE = 6006;

	/**
	 * The '<em><b>CLOSEDPROMPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSEDPROMPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSEDPROMPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEDPROMPT_VALUE = 6007;

	/**
	 * The '<em><b>NOQUESTIONPROMPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOQUESTIONPROMPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOQUESTIONPROMPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOQUESTIONPROMPT_VALUE = 6008;

	/**
	 * The '<em><b>APPSTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPSTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPSTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPSTART_VALUE = 901;

	/**
	 * The '<em><b>APPEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPEND_VALUE = 902;

	/**
	 * The '<em><b>STARTDIALOGUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTDIALOGUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTDIALOGUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTDIALOGUE_VALUE = 9001;

	/**
	 * The '<em><b>ENDDIALOGUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENDDIALOGUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDDIALOGUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDDIALOGUE_VALUE = 9002;

	/**
	 * The '<em><b>STARTSYSTEMTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTSYSTEMTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTSYSTEMTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTSYSTEMTURN_VALUE = 9003;

	/**
	 * The '<em><b>SYSTEMFEEDBACKSTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEMFEEDBACKSTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEMFEEDBACKSTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEMFEEDBACKSTART_VALUE = 9004;

	/**
	 * The '<em><b>SYSTEMACTIONSTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEMACTIONSTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEMACTIONSTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEMACTIONSTART_VALUE = 9005;

	/**
	 * The '<em><b>SYSTEMACTIONEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEMACTIONEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEMACTIONEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEMACTIONEND_VALUE = 9006;

	/**
	 * The '<em><b>ENDSYSTEMTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENDSYSTEMTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDSYSTEMTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDSYSTEMTURN_VALUE = 9007;

	/**
	 * The '<em><b>STARTUSERTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTUSERTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTUSERTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTUSERTURN_VALUE = 9008;

	/**
	 * The '<em><b>USERFEEDBACKSTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERFEEDBACKSTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERFEEDBACKSTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERFEEDBACKSTART_VALUE = 9009;

	/**
	 * The '<em><b>USERACTIONSTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERACTIONSTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERACTIONSTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERACTIONSTART_VALUE = 9010;

	/**
	 * The '<em><b>USERACTIONEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERACTIONEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERACTIONEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERACTIONEND_VALUE = 9011;

	/**
	 * The '<em><b>ENDUSERTURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENDUSERTURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDUSERTURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDUSERTURN_VALUE = 9012;

	/**
	 * An array of all the '<em><b>event t</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final event_t[] VALUES_ARRAY =
		new event_t[] {
			TOUCH,
			CLICK,
			LONGCLICK,
			ITEMCLICK,
			ITEMLONGCLICK,
			SCROLL,
			MOVE,
			NAVIGATIONMOVE,
			NAVIGATIONLENGTH,
			NAVIGATIONACTION,
			NAVIGATIONEXPLORE,
			KEYTEXT,
			KEYEXPLORE,
			KEYCOMMAND,
			TEXTWORD,
			TEXTEXPLORE,
			TEXTCOMMAND,
			OVERALLWORDS,
			SUBSTITUTEDWORDS,
			DELETEDWORDS,
			INSERTEDWORDS,
			OVERALLSENTENCES,
			SUBSTITUTEDSENTENCES,
			DELETEDSENTENCES,
			INSERTEDSENTENCES,
			OVERALLCONCEPTS,
			SUBSTITUTEDCONCEPTS,
			DELETEDCONCEPTS,
			INSERTEDCONCEPTS,
			CORRECTLYPARSEDUTTERANCE,
			PARTIALLYPARSEDUTTERANCE,
			INCORRECTLYPARSEDUTTERANCE,
			GUIELEMENTS,
			GUIFEEDBACK,
			GUICONCEPTS,
			GUINOISE,
			GUIQUESTIONS,
			SPEECHELEMENTS,
			SPEECHFEEDBACK,
			SPEECHCONCEPTS,
			SPEECHNOISE,
			SPEECHQUESTIONS,
			NEWELEMENTS,
			NEWFEEDBACKELEMENTS,
			NEWCONCEPTS,
			NEWNOISE,
			NEWQUESTIONS,
			HELPTURN,
			CORRECTIONTURN,
			TIMEOUT,
			CANCELTURN,
			RESTARTTURN,
			BARGEIN,
			DIVREJECTION,
			ASRREJECTION,
			GRREJECTION,
			CORRECTANSWER,
			INCORRECTANSWER,
			PARTIALLYCORRECTANSWER,
			NOTANSWER,
			OPENPROMPT,
			HALFOPENPROMPT,
			CLOSEDPROMPT,
			NOQUESTIONPROMPT,
			APPSTART,
			APPEND,
			STARTDIALOGUE,
			ENDDIALOGUE,
			STARTSYSTEMTURN,
			SYSTEMFEEDBACKSTART,
			SYSTEMACTIONSTART,
			SYSTEMACTIONEND,
			ENDSYSTEMTURN,
			STARTUSERTURN,
			USERFEEDBACKSTART,
			USERACTIONSTART,
			USERACTIONEND,
			ENDUSERTURN,
		};

	/**
	 * A public read-only list of all the '<em><b>event t</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<event_t> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>event t</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static event_t get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			event_t result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>event t</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static event_t getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			event_t result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>event t</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static event_t get(int value) {
		switch (value) {
			case TOUCH_VALUE: return TOUCH;
			case CLICK_VALUE: return CLICK;
			case LONGCLICK_VALUE: return LONGCLICK;
			case ITEMCLICK_VALUE: return ITEMCLICK;
			case ITEMLONGCLICK_VALUE: return ITEMLONGCLICK;
			case SCROLL_VALUE: return SCROLL;
			case MOVE_VALUE: return MOVE;
			case NAVIGATIONMOVE_VALUE: return NAVIGATIONMOVE;
			case NAVIGATIONLENGTH_VALUE: return NAVIGATIONLENGTH;
			case NAVIGATIONACTION_VALUE: return NAVIGATIONACTION;
			case NAVIGATIONEXPLORE_VALUE: return NAVIGATIONEXPLORE;
			case KEYTEXT_VALUE: return KEYTEXT;
			case KEYEXPLORE_VALUE: return KEYEXPLORE;
			case KEYCOMMAND_VALUE: return KEYCOMMAND;
			case TEXTWORD_VALUE: return TEXTWORD;
			case TEXTEXPLORE_VALUE: return TEXTEXPLORE;
			case TEXTCOMMAND_VALUE: return TEXTCOMMAND;
			case OVERALLWORDS_VALUE: return OVERALLWORDS;
			case SUBSTITUTEDWORDS_VALUE: return SUBSTITUTEDWORDS;
			case DELETEDWORDS_VALUE: return DELETEDWORDS;
			case INSERTEDWORDS_VALUE: return INSERTEDWORDS;
			case OVERALLSENTENCES_VALUE: return OVERALLSENTENCES;
			case SUBSTITUTEDSENTENCES_VALUE: return SUBSTITUTEDSENTENCES;
			case DELETEDSENTENCES_VALUE: return DELETEDSENTENCES;
			case INSERTEDSENTENCES_VALUE: return INSERTEDSENTENCES;
			case OVERALLCONCEPTS_VALUE: return OVERALLCONCEPTS;
			case SUBSTITUTEDCONCEPTS_VALUE: return SUBSTITUTEDCONCEPTS;
			case DELETEDCONCEPTS_VALUE: return DELETEDCONCEPTS;
			case INSERTEDCONCEPTS_VALUE: return INSERTEDCONCEPTS;
			case CORRECTLYPARSEDUTTERANCE_VALUE: return CORRECTLYPARSEDUTTERANCE;
			case PARTIALLYPARSEDUTTERANCE_VALUE: return PARTIALLYPARSEDUTTERANCE;
			case INCORRECTLYPARSEDUTTERANCE_VALUE: return INCORRECTLYPARSEDUTTERANCE;
			case GUIELEMENTS_VALUE: return GUIELEMENTS;
			case GUIFEEDBACK_VALUE: return GUIFEEDBACK;
			case GUICONCEPTS_VALUE: return GUICONCEPTS;
			case GUINOISE_VALUE: return GUINOISE;
			case GUIQUESTIONS_VALUE: return GUIQUESTIONS;
			case SPEECHELEMENTS_VALUE: return SPEECHELEMENTS;
			case SPEECHFEEDBACK_VALUE: return SPEECHFEEDBACK;
			case SPEECHCONCEPTS_VALUE: return SPEECHCONCEPTS;
			case SPEECHNOISE_VALUE: return SPEECHNOISE;
			case NEWELEMENTS_VALUE: return NEWELEMENTS;
			case NEWFEEDBACKELEMENTS_VALUE: return NEWFEEDBACKELEMENTS;
			case NEWCONCEPTS_VALUE: return NEWCONCEPTS;
			case NEWNOISE_VALUE: return NEWNOISE;
			case NEWQUESTIONS_VALUE: return NEWQUESTIONS;
			case HELPTURN_VALUE: return HELPTURN;
			case CORRECTIONTURN_VALUE: return CORRECTIONTURN;
			case TIMEOUT_VALUE: return TIMEOUT;
			case CANCELTURN_VALUE: return CANCELTURN;
			case RESTARTTURN_VALUE: return RESTARTTURN;
			case BARGEIN_VALUE: return BARGEIN;
			case DIVREJECTION_VALUE: return DIVREJECTION;
			case ASRREJECTION_VALUE: return ASRREJECTION;
			case GRREJECTION_VALUE: return GRREJECTION;
			case CORRECTANSWER_VALUE: return CORRECTANSWER;
			case INCORRECTANSWER_VALUE: return INCORRECTANSWER;
			case PARTIALLYCORRECTANSWER_VALUE: return PARTIALLYCORRECTANSWER;
			case NOTANSWER_VALUE: return NOTANSWER;
			case OPENPROMPT_VALUE: return OPENPROMPT;
			case HALFOPENPROMPT_VALUE: return HALFOPENPROMPT;
			case CLOSEDPROMPT_VALUE: return CLOSEDPROMPT;
			case NOQUESTIONPROMPT_VALUE: return NOQUESTIONPROMPT;
			case APPSTART_VALUE: return APPSTART;
			case APPEND_VALUE: return APPEND;
			case STARTDIALOGUE_VALUE: return STARTDIALOGUE;
			case ENDDIALOGUE_VALUE: return ENDDIALOGUE;
			case STARTSYSTEMTURN_VALUE: return STARTSYSTEMTURN;
			case SYSTEMFEEDBACKSTART_VALUE: return SYSTEMFEEDBACKSTART;
			case SYSTEMACTIONSTART_VALUE: return SYSTEMACTIONSTART;
			case SYSTEMACTIONEND_VALUE: return SYSTEMACTIONEND;
			case ENDSYSTEMTURN_VALUE: return ENDSYSTEMTURN;
			case STARTUSERTURN_VALUE: return STARTUSERTURN;
			case USERFEEDBACKSTART_VALUE: return USERFEEDBACKSTART;
			case USERACTIONSTART_VALUE: return USERACTIONSTART;
			case USERACTIONEND_VALUE: return USERACTIONEND;
			case ENDUSERTURN_VALUE: return ENDUSERTURN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private event_t(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //event_t
