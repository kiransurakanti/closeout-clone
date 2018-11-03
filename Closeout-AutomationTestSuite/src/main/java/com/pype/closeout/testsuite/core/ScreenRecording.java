package com.pype.closeout.testsuite.core;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class ScreenRecording 
{
	static ATUTestRecorder recorder;
    public static void Recorder(String RecordName) throws ATUTestRecorderException
    {    	 
    	 recorder = new ATUTestRecorder("C:\\Automation\\Closeout-AutomationTestSuite\\test-output\\recordings", RecordName, false);
    	 
    }

	public static void start() throws ATUTestRecorderException {
		recorder.start();
		
	}

	public static void stop() throws ATUTestRecorderException {
		recorder.stop();
		
	}
}
