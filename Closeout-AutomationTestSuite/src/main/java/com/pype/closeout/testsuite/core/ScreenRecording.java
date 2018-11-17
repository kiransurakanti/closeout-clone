package com.pype.closeout.testsuite.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class ScreenRecording 
{
	static ATUTestRecorder recorder;
    public static void Recorder(String RecordName) throws ATUTestRecorderException, FileNotFoundException, IOException
    {    
    	
//    	Properties property = new Properties();
//    	property.load(new FileInputStream("config.properties"));

    	String Recordingpath = ConfigProperties.get(ConfigProperties.SCREENRECORDING_PATH);
    	
    	 recorder = new ATUTestRecorder(Recordingpath, RecordName, false);
    	 
    }

	public static void start() throws ATUTestRecorderException {
		recorder.start();
		
	}

	public static void stop() throws ATUTestRecorderException {
		recorder.stop();
		
	}
}
