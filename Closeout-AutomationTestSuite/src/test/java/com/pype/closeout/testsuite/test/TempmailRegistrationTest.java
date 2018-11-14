package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.TempmailregistrationBehaviour;
import com.pype.closeout.testsuite.core.WriteExcel;
import com.pype.closeout.testsuite.drivers.DriverManager;
import com.pype.closeout.testsuite.drivers.DriverManagerFactory;
import com.pype.closeout.testsuite.drivers.DriverType;

public class TempmailRegistrationTest

{
	protected WebDriver driver;
	protected DriverManager driverManager;
	protected WebDriverWait wait;
		
		
		@Test
		public void tempmail() throws Exception {
			
			driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
			
			driver = driverManager.getDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.mailinator.com/");
			
			Log log = LogFactory.getLog("TempmailRegistrationTest");

			log.info("navigating to mailinator  URL");

			

			log.info("mailinator has opened");

			TempmailregistrationBehaviour _tempmail = new TempmailregistrationBehaviour(driver);

			String email = _tempmail.TempReg();

			WriteExcel excel = new WriteExcel();

			Properties property = new Properties();

			property.load(new FileInputStream("config.properties"));

			String Excelpath = property.getProperty("WriteExcel");

			log.info("reading the data from temp mail");

			String[] datatowrite = { email };

			log.info("writting the data to excel");

			// WriteExcel writeexcel = writeexcel.WriteExcel(Excelpath, "TestData.xlsx",
			// "WriteData", 1, datatowrite);

			WriteExcel write = new WriteExcel();

			write.WriteExcel(Excelpath, "TestData.xlsx", "WriteData", 1, datatowrite);

			log.info("data has written in excel");

//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.open()");
//			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs.get(1));
			// driver.get("https://closeout-dev.pype.io");

		}
		
		@AfterTest
		  public void quitDriver()
		  {
			
			driverManager.quitDriver();
			
		  }

	}


