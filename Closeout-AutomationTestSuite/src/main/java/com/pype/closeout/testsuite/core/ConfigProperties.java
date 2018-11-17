package com.pype.closeout.testsuite.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConfigProperties 
{

	private static Logger logger = LogManager.getLogger(ConfigProperties.class);
	
	public static final String CHROME_DRIVER_PATH = "chrome.driver.path";
	public static final String READ_EXCEL_PATH = "readexcel";
	public static final String SCREENSHOTS_PATH = "Screenshots";
	public static final String SCREENRECORDING_PATH = "screenrecording";
	public static final String WRITE_EXCEL_PATH = "WriteExcel";
	
	private static Properties prop;
	
	public static String getConfigPath() 
	{
		return Optional.ofNullable(System.getenv("CONFIGURATION_PATH")).orElse("");
	}
	
	public static String get(String key) 
	{
		return prop.getProperty(key);
	}
	static {
		logger.info("CONFIGURATION_PATH: " + getConfigPath());
		prop = new Properties();
		
		InputStream input = null;
		try {

			input = new FileInputStream(getConfigPath() + "\\config.properties");

			// load a properties file
			prop.load(input);		
			logger.info("Properties loaded");
		} 
		
		catch (IOException ex) 
		{
			logger.error("Exception occurred while loading properties: " + ex);
		} 
		finally 
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				
				catch (IOException ex) 
				{
					logger.error("Exception occurred while file close: " + ex);
				}
			}
		}

       }
}
