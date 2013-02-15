package org.mmi.model.instantiator.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.mmi.model.DocumentRoot;
import org.mmi.model.ModelPackage;
import org.mmi.model.util.ModelResourceFactoryImpl;

/**
 * This class provides the tools needed to dump a Dialogue object
 * to an XML file, and also to obtain Dialogue objects from XML model
 * instances.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class XMLMarshal {

	/**
	 * Dumps the content of a model instance to a XML file.
	 * @param droot the document root containing the Dialogue object
	 * @param filename the name of the resulting file
	 */
	public static void SaveModelToFile(DocumentRoot droot, String filename){

		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new ModelResourceFactoryImpl());
		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(ModelPackage.eNS_URI,ModelPackage.eINSTANCE);

		try {
			//Create the output file
			File f = new File(filename);
			FileOutputStream fop = new FileOutputStream(f);

			//Write the resource into the file
			Resource resource = resourceSet.createResource(URI.createURI("www.mmiModel.org"));
			resource.getContents().add(droot);
			resource.save(fop,null);
			fop.flush();
			fop.close();

			//Print the resource
			//resource.save(System.out, null);
			//System.out.println();
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Gets the DocumentRoot object (including the Dialogue object) from
	 * a XML file.
	 * @param filename the name of the source file
	 * @return the resulting object
	 */
	public static DocumentRoot GetModelFromFile(String filename){

		//object to return
		DocumentRoot dr = null;
		
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new ModelResourceFactoryImpl());
		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put
		(ModelPackage.eNS_URI, 
				ModelPackage.eINSTANCE);
		
		/**
		 * get content from a file
		 */

		System.out.println("Getting content from a file.");

		File file = new File(filename);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filename);
		Resource resource = null;

		System.out.println("File opened.");

		try {
			// Demand load resource for this file.
			//
			resource = resourceSet.getResource(uri, true);
			System.out.println("Loaded " + uri);
			//FIXME remove comment to print content || resource.save(System.out, null);
			System.out.println("Resource loaded.");
		}
		catch (RuntimeException exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
			return null;
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}

		/**
		 * Validate the content of a file
		 */

		System.out.println("Validating the loaded resource...");

		if (resource != null){
			try {
				// Validate the contents of the loaded resource.
				//
				for (EObject eObject : resource.getContents()) {
					Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						//FIXME remove comment to print diasnogtic || printDiagnostic(diagnostic, "");
					}
				}

				System.out.println("Resource validated.");
			}
			catch (RuntimeException exception) {
				System.out.println("Problem loading " + uri);
				exception.printStackTrace();
				return null;
			}
		}
		else{
			System.out.println("Resource is null.");
		}

		/**
		 * get the Dialogue object from a Resource
		 */

		System.out.println("Extracting the Dialogue object...");

		if (resource != null){
			try {
				// Validate the contents of the loaded resource.
				//
				EObject eObject = resource.getContents().get(0);
				dr = (DocumentRoot)eObject;
				System.out.println("Resource content -> " + dr.toString());

				System.out.println("Resource extracted.");
			}
			catch (RuntimeException exception) {
				System.out.println("Problem extracting " + uri);
				exception.printStackTrace();
				return null;
			}
		}
		else{
			System.out.println("Resource is null.");
		}
		
		//return document root
		return dr;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Prints diagnostics with indentation.
	 * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
