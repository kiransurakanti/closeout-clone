package com.pype.closeout.testsuite.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ScreenShots 
{
   public ScreenShots()
   {
	   super();
   }
   
   public static void takeScreenshots(WebDriver driver,String foldername,  String SSName ) throws Exception
   {
	   //String timeStamp;
	   File screenShotName;
	   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //The below method will save the screen shot in d drive with name "screenshot.png"
	   //timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	   Properties property = new Properties();
	   property.load(new FileInputStream("config.properties"));
	   String SSpath = property.getProperty("screenshotpath");
	   screenShotName = new File(SSpath+foldername+SSName +".png");
	   FileUtils.copyFile(scrFile, screenShotName);
	    
	   String filePath = screenShotName.toString();
	   String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
	   Reporter.log(path);
   }
}
