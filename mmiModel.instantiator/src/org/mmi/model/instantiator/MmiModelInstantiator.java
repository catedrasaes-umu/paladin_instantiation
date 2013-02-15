package org.mmi.model.instantiator;


import org.apache.log4j.Logger;
import org.mmi.model.ModelFactory;
import org.mmi.model.impl.ModelPackageImpl;
import org.mmi.model.instantiator.detail.GuiInputInstantiator;
import org.mmi.model.instantiator.detail.MetacommInstantiator;
import org.mmi.model.instantiator.detail.ModalityInstantiator;
import org.mmi.model.instantiator.detail.SpeechInputInstantiator;
import org.mmi.model.instantiator.detail.SpeechOutputInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;
import org.mmi.model.instantiator.detail.TurnTimingInstantiator;
import org.mmi.model.instantiator.utils.XMLMarshal;
import org.mmi.utils.GenericFSM.FSMIntegrityException;


/**
 * Class used to create mmi model instances. This class includes
 * other instantiation classes
 * 
 * @author mateo-navarro.pedro
 *
 */
public class MmiModelInstantiator {
	
	private static final Logger LOG = Logger.getLogger(MmiModelInstantiator.class);
	
	/**
	 * Instantiation context
	 */
	public InstantiationContext icontext_;

	///
	/// sub-instantiators
	///
	
	/**
	 * turn timing instantiator
	 */
	public TurnTimingInstantiator turnControl;
	
	/**
	 * turn content instantiator
	 */
	public TurnContentInstantiator turnContent;
	
	/**
	 * gui input instantiator
	 */
	public GuiInputInstantiator guiInput;
	
	/**
	 * speech input instantiator
	 */
	public SpeechInputInstantiator speechInput;
	
	/**
	 * speech output instantiator
	 */
	public SpeechOutputInstantiator speechOutput;
	
	/**
	 * metacommunication instantiator
	 */
	public MetacommInstantiator metaComm;
	
	/**
	 * modality usage instantiator
	 */
	public ModalityInstantiator modality;
	

	/**
	 * Constructor
	 */
	public MmiModelInstantiator(){
		//initialize package
		ModelPackageImpl.init();

		//create and initialize context
		icontext_ = new InstantiationContext();
		icontext_.mfact = ModelFactory.eINSTANCE;
		icontext_.droot = icontext_.mfact.createDocumentRoot();

		icontext_.dialogue = null;
		icontext_.dstep = null;
		icontext_.cturn = null;
		icontext_.sturn = null;
		icontext_.uturn = null;

		try {
			icontext_.state = new InstantiationFSM();
		} catch (FSMIntegrityException e) {
			LOG.error(e);
		}

		//create and initialize sub-Instantiators
		turnControl = new TurnTimingInstantiator(icontext_);
		turnContent = new TurnContentInstantiator(icontext_);
		guiInput = new GuiInputInstantiator(icontext_);
		metaComm = new MetacommInstantiator(icontext_);
		speechOutput = new SpeechOutputInstantiator(icontext_);
		speechInput = new SpeechInputInstantiator(icontext_);
		modality = new ModalityInstantiator(icontext_);

		System.out.println("MmiModelInstantiator initialized.");
	}

	/**
	 * Dialogue managing methods
	 */
	public void saveDialogue(String URI){
		if (icontext_ != null && icontext_.droot != null)
			XMLMarshal.SaveModelToFile(icontext_.droot, URI);
	}
	
}
