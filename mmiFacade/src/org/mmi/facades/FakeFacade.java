package org.mmi.facades;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;


public class FakeFacade extends MmiFacade {

	private static final String TAG = "FakeFacade";

	public FakeFacade(){
		super(null,null,null);

		//text file
		try {
			//create new file
			file_ = new File(TEMP_DIR + TEMP_FILE);
			file_.createNewFile();
			//we have to bind the new file with a FileOutputStream
			os_ = new FileOutputStream(file_);
			//and the output stream to a print writer
			out_ = new PrintWriter(os_);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//timestamp
		resetTimestamp();
	}

	///
	/// ////////////////////////////////////////////
	///
	/// application timing methods
	///
	/// ////////////////////////////////////////////
	///

	public void interactionStarts(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}

	public void interactionEnds(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}

	///
	/// ////////////////////////////////////////////
	///
	/// gui input methods
	///
	/// ////////////////////////////////////////////
	///
	
	public void touch(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void click(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void scroll(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void keytext(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void keycommand(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void keyexplore(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}


	///
	/// ////////////////////////////////////////////
	///
	/// gui & speech & gesture output
	///
	/// ////////////////////////////////////////////
	///

	public void newElements(long ts, int n) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";" + n + ";");
	}
	
	public void newFeedbackElements(long ts, int n) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";" + n + ";");
	}
	
	public void newNoiseElements(long ts, int n) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";" + n + ";");
	}
	
	public void newConcepts(long ts, int n) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";" + n + ";");
	}
	
	
	public void isQuestionTurn(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void isHelpTurn(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void isCorrectionTurn(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void wasASRRejection(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	
	public void wasDIVRejection(long ts) {
		if (ts == 0) ts = _currentTimestamp();
		_createLogLine(_methodName() + ";" + ts + ";");
	}
	

	///
	/// ////////////////////////////////////////////
	///
	///
	///
	/// ////////////////////////////////////////////
	///


	///
	/// ////////////////////////////////////////////
	///
	///
	///
	/// ////////////////////////////////////////////
	///


	///
	/// ////////////////////////////////////////////
	///
	/// simulation file stuff
	///
	/// ////////////////////////////////////////////
	///

	private File file_;
	private FileOutputStream os_;
	private PrintWriter out_;
	private final String TEMP_DIR = "/mnt/sdcard";
	private final String TEMP_FILE = "/tmp.log";

	public void saveSimulation(String filename){
		out_.close();
		_copyFile(TEMP_DIR + TEMP_FILE,filename);
	}

	private void _copyFile(String orig, String dest){
		InputStream in;
		try {
			in = new FileInputStream(orig);
			OutputStream out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	///
	/// ////////////////////////////////////////////
	///
	/// util methods
	///
	/// ////////////////////////////////////////////
	///
	
	///
	/// log line
	///
	
	private String _methodName(){
		return Thread.currentThread().getStackTrace()[3].getMethodName();
	}
	
	@SuppressWarnings("unused")
	private String _methodName(int level){
		return Thread.currentThread().getStackTrace()[3 + level].getMethodName();
	}
	
	private void _createLogLine(String s){
		out_.println(s);
		System.out.println(TAG + " :: " + s);
	}
	
	///
	/// timestamp
	///
	
	public void resetTimestamp() {
		baseTimestamp = System.nanoTime() / 1000000;
	}

	private long _currentTimestamp() {
		return System.nanoTime() / 1000000 - baseTimestamp;
	}

	private long baseTimestamp;
}
