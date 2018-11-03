package com.pype.closeout.testsuite.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

	public static String getFileContent(String path) {
		String content = "";
	    try {
	        BufferedReader in = new BufferedReader(new FileReader(path));
	        String str;
	        while ((str = in.readLine()) != null) {
	            content +=str;
	        }
	        in.close();
	    } catch (IOException e) {
	    }
	    return content;
	}
}
